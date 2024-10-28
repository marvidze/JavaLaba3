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
        _countID++;
        _ID = _countID;
        _firstName = firstName;
        _lastName = lastName;
        _patronymic = patronymic;
        _attendance = attendance;
        _averageScore = averageScore;
        _priceStudy = priceStudy;
    }

    /**
     * Конструктор по умолчанию класса BeneficiaryStudent
     * Имя - Иван |
     * Фамилия - Иванов |
     * Отчество - Иванович |
     * Посещаемость - 1 |
     * Средний балл - 2.1 |
     * Цена обучения - 0
     */
    public ForMoneyStudent() {
        _firstName = "Иван";
        _lastName = "Иванов";
        _patronymic = "Иванович";
        _attendance = 1;
        _averageScore = 2.1;
        _priceStudy = 0;
    }

}
