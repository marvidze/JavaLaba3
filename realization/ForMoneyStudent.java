package realization;

public class ForMoneyStudent extends Student {
    private int _priceStudy;

    /**
     * Конструктор класса Student
     * 
     * @param lastName     имя
     * @param firstName    фамилия
     * @param patronymic   отчество
     * @param attendance   посещаемость
     * @param averageScore средний балл
     * @param priceStudy   цена обучения
     */
    public ForMoneyStudent(String lastName, String firstName, String patronymic, int attendance, double averageScore,
            int priceStudy) {
        super(lastName, firstName, patronymic, attendance, averageScore);
        _priceStudy = priceStudy;
    }

    /**
     * Конструктор по умолчанию класса BeneficiaryStudent
     * Имя - Иван |
     * Фамилия - Иванов |
     * Отчество - Иванович |
     * Посещаемость -0 |
     * Средний балл - 0 |
     * Цена обучения - 0
     */
    public ForMoneyStudent() {
        super("Ivanov", "Ivan", "Ivanovich", 0, 0);
        _priceStudy = 0;
    }

    @Override
    public String getInfoString() {
        return super.getInfoString() + " | Цена обучения: " + this._priceStudy + "\n";
    }

    public void set_firstName(String _firstName) {
        this._firstName = _firstName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }

    public void set_patronymic(String _patronymic) {
        this._patronymic = _patronymic;
    }

    public void set_attendance(int _attendance) {
        this._attendance = _attendance;
    }

    public void set_averageScore(double _averageScore) {
        this._averageScore = _averageScore;
    }

    public void set_priceStudy(int _priceStudy) {
        this._priceStudy = _priceStudy;
    }

    public int get_priceStudy() {
        return this._priceStudy;
    }

}
