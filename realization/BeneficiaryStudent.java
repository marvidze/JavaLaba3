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
    public BeneficiaryStudent(String firstName, String lastName, String patronymic, int attendance,
            int averageScore, String preferentialGroup) {
        _countID++;
        _ID = _countID;
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
}
