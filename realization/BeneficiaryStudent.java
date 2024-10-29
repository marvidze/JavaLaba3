package realization;

public class BeneficiaryStudent extends Student {
    private String _preferentialGroup;

    /**
     * Конструктор класса BeneficiaryStudent
     * 
     * @param firstName         имя
     * @param lastName          фамилия
     * @param patronymic        отчество
     * @param attendance        посещаемость
     * @param averageScore      средний балл
     * @param preferentialGroup группа льготников
     */
    public BeneficiaryStudent(String lastName, String firstName, String patronymic, int attendance,
            int averageScore, String preferentialGroup) {
        super(lastName, firstName, patronymic, attendance, averageScore);
        _preferentialGroup = preferentialGroup;
    }

    /**
     * Конструктор по умолчанию класса BeneficiaryStudent
     * Имя - Иван |
     * Фамилия - Иванов |
     * Отчество - Иванович |
     * Посещаемость - 0 |
     * Средний балл - 0 |
     * Группа льготников - СВО
     */

    public BeneficiaryStudent() {
        super("Ivanov", "Ivan", "Ivanovich", 0, 0);
        _preferentialGroup = "СВО";
    }

    @Override
    public String getInfoString() {
        return super.getInfoString() + " | Группа льготы: " + this._preferentialGroup + "\n";
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

    public void set_preferentialGroup(String _preferentialGroup) {
        this._preferentialGroup = _preferentialGroup;
    }
}
