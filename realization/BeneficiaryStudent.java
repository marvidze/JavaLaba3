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
        _firstName = firstName;
        _lastName = lastName;
        _patronymic = patronymic;
        _attendance = attendance;
        _averageScore = averageScore;
        _preferentialGroup = preferentialGroup;
    }

    /**
     * Конструктор по умолчанию класса BeneficiaryStudent
     * Имя - Иван |
     * Фамилия - Иванов |
     * Отчество - Иванович |
     * Посещаемость - 1 |
     * Средний балл - 2.1 |
     * Группа льготников - СВО
     */

    public BeneficiaryStudent() {
        _firstName = "Иван";
        _lastName = "Иванов";
        _patronymic = "Иванович";
        _attendance = 1;
        _averageScore = 2.1;
        _preferentialGroup = "СВО";
    }

    @Override
    public String toString() {
        return " | Имя: " + this._firstName + "\n" +
                " | Фамилия: " + this._lastName + "\n" +
                " | Отчество: " + this._patronymic + "\n" +
                " | Успеваемость: " + this._attendance + "\n" +
                " | Средний балл: " + this._averageScore + "\n" +
                " | Группа льготы: " + this._preferentialGroup + "\n";
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
