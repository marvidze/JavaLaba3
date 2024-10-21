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

    public Student(String lastName, String firstName, String patronymic, int attendance, double averageScore) {
        _countID++;
        _ID = _countID;
        _firstName = firstName;
        _lastName = lastName;
        _patronymic = patronymic;
        _attendance = attendance;
        _averageScore = averageScore;
    }

    public Student() {
        _firstName = "Иван";
        _lastName = "Иванов";
        _patronymic = "Иванович";
        _attendance = 1;
        _averageScore = 2.1;
    };

    public String getFIO() {
        return _lastName + " " + _firstName + " " + _patronymic;
    }

    public static Student findStudent(String FIO) {
        final String[] arrayFIO = FIO.split(" ");
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
