package realization;

import java.util.ArrayList;
import java.util.List;

import realization.Interfaces.IStudent;

public class Student implements IStudent, Comparable<Student>{

    protected String _firstName;
    protected String _lastName;
    protected String _patronymic;
    protected int _attendance;
    protected double _averageScore;
    protected static ArrayList<Student> _studentList = new ArrayList<>(List.of(
            new ForMoneyStudent("Ipatov", "Vladislav", "Mihailovich", 4, 4.5, 100000),
            new Student("Ayupov", "Marat", "Rashitovich", 4, 4.7),
            new BeneficiaryStudent("Klipikov", "Nikita", "Valerievich", 2, 2, "СВО")));

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
        _attendance = 0;
        _averageScore = 0;
    };

    /**
     * Метод возвращает ФИО студента
     * 
     * @return Строка "фамилия имя отчество"
     */
    public String get_FIO() {
        return _lastName + " " + _firstName + " " + _patronymic;
    }

    /**
     * Метод возвращает список студентов с максимальным средним баллом
     * 
     * @return ArrayList<Student> studentsWithMaxScore - Список студентов с
     *         максимальным средним баллом
     */
    public static ArrayList<Student> findHightScoreStudent() {
        double hightScore = getHightScoreStudent();
        ArrayList<Student> studentsWithMaxScore = new ArrayList<>();

        for (Student student : _studentList) {
            if (student._averageScore == hightScore) {
                studentsWithMaxScore.add(student);
            }
        }

        return studentsWithMaxScore;
    }

    private static double getHightScoreStudent() {
        double hightScore = 0;
        for (Student student : _studentList) {
            if (student._averageScore > hightScore) {
                hightScore = student._averageScore;
            }
        }
        return hightScore;
    }

    /**
     * Метод возвращает количество студентов с посещаемостью меньше среднего
     * 
     * @return int countStudentWithLowAttendance - Количество студентов с
     *         посещаемостью меньше среднего
     */
    public static int countStudentWithLowAttendance() {
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

    /**
     * Метод предназначен для добавления в список студентов
     * 
     * @param student Объект класса Student
     * @return int - возвращет 1 в случае ошибки и 0 если метод отработал успешно
     */
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
        return " | Имя: " + this._firstName + "\n" +
                " | Фамилия: " + this._lastName + "\n" +
                " | Отчество: " + this._patronymic + "\n" +
                " | Успеваемость: " + this._attendance + "\n" +
                " | Средний балл: " + this._averageScore + "\n";
    }

    /**
     * Ищет студента в списке студентов по ФИО
     * 
     * @param FIO принимает строку ФИО. Пример: "Иванов Иван Иванович".
     * @return возращает найденного студента(объект) или null если студент не
     *         найден.
     */
    public static Student findStudent(String FIO) {
        final String[] arrayFIO = FIO.split(" ");
        if (arrayFIO.length == 3) {
            for (int i = 0; i < _studentList.size(); i++) {
                if (_studentList.get(i)._firstName.equals(arrayFIO[1])
                        && _studentList.get(i)._lastName.equals(arrayFIO[0])
                        && _studentList.get(i)._patronymic.equals(arrayFIO[2])) {
                    return _studentList.get(i);
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public int compareTo(Student o) {
        return _lastName.compareTo(o._lastName);
    }

    /**
     * Сортирует массив студентов по фамилиям.
     */
    public static void sortArrayStudents() {
        java.util.Collections.sort(_studentList);
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

    @Override
    public int get_priceStudy() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get_priceStudy'");
    }

    public String get_firstName() {
        return _firstName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public String get_patronymic() {
        return _patronymic;
    }

    public int get_attendance() {
        return _attendance;
    }

    public double get_averageScore() {
        return _averageScore;
    }

    public static ArrayList<Student> get_studentList() {
        return _studentList;
    }
}
