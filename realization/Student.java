package realization;

import java.util.ArrayList;
import java.util.List;

public class Student {

    static private int _countID = 0;
    private int _ID;
    private String _firstName;
    private String _lastName;
    private String _patronymic;
    private int _attendance;
    private double _averageScore;
    private static ArrayList<Student> _studentList = new ArrayList<>(List.of(
            new Student("Ипатов", "Владислав", "Михайлович", 4, 4.5),
            new Student("Аюпов", "Марат", "Рашитович", 4, 4.7),
            new Student("Клипиков", "Никита", "Валерьевич", 2, 2)));

    /**
     * Конструктор класса Student
     * 
     * @param lastName     имя
     * @param firstName    фамилия
     * @param patronymic   отчество
     * @param attendance   посещаемость
     * @param averageScore средний балл
     */
    public Student(String lastName, String firstName, String patronymic, int attendance, double averageScore) {
        _countID++;
        _ID = _countID;
        _firstName = firstName;
        _lastName = lastName;
        _patronymic = patronymic;
        _attendance = attendance;
        _averageScore = averageScore;
    }

    /**
     * Конструктор по умолчанию класса Student |
     * Имя - Иван |
     * Фамилия - Иванов |
     * Отчество - Иванович |
     * Посещаемость - 1 |
     * Средний балл - 2.1
     */
    public Student() {
        _firstName = "Иван";
        _lastName = "Иванов";
        _patronymic = "Иванович";
        _attendance = 1;
        _averageScore = 2.1;
    };

    /**
     * 
     * @return Строка фамилия_имя_отчество
     */
    public String getFIO() {
        return _lastName + " " + _firstName + " " + _patronymic;
    }

    public static ArrayList<Student> findHightScoreStudent() {
        double maxScore = 0;
        ArrayList<Student> studentsWithMaxScore = new ArrayList<>();

        for (Student student : _studentList) {
            if (student._averageScore > maxScore) {
                maxScore = student._averageScore;
                studentsWithMaxScore.add(student);
            }
        }

        return studentsWithMaxScore;
    }

    public static double countStudentWithLowAttendance() {
        if (_studentList.size() == 0) {
            throw new ArithmeticException("Студенты не найдены в списке, количество студентов - 0");
        }

        int countStudentWithLowAttendance = 0;
        double averageAttendance = 0;

        for (Student student : _studentList) {
            averageAttendance += student._attendance;
        }

        averageAttendance /= _studentList.size();

        for (Student student : _studentList) {
            if (student._attendance < averageAttendance) {
                countStudentWithLowAttendance += 1;
            }
        }

        return countStudentWithLowAttendance;
    }

    public static int addToStudentList(Student student) {
        try {
            _studentList.add(student);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "ID Студента: " + this._ID +
                " | Имя: " + this._firstName +
                " | Фамилия: " + this._lastName +
                " | Отчество: " + this._patronymic +
                " | Успеваемость: " + this._attendance +
                " | Средний балл: " + this._averageScore + "\n";
    }

    /**
     * 
     * @param FIO принимает строку ФИО. Пример: "Иванов Иван Иванович".
     * @return возращает найденного студента(объект).
     */
    public static Student findStudent(String FIO) {
        final String[] arrayFIO = FIO.split(" ");
        return arrayFIO;
    }

    public static Student findStudent(int id) {

        for (Student student : _studentList) {
            if (student._firstName.equals(arrayFIO[1])
                    && student._lastName.equals(arrayFIO[0])
                    && student._patronymic.equals(arrayFIO[2])) {
                return student;
            }
        }
        return new Student();
    }
}
