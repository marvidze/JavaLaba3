package realization;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String _firstName;
    private String _lastName;
    private String _patronymic;
    private int _attendance;
    private double _averageScore;
    private ArrayList<Student> _studentList = new ArrayList<>(List.of(
            new Student("Ипатов", "Владислав", "Михайлович", 4, 4.5),
            new Student("Аюпов", "Марат", "Рашитович", 4, 4.7),
            new Student("Клипиков", "Никита", "Валерьевич", 2, 2)));

    public Student(String lastName, String firstName, String patronymic, int attendance, double averageScore) {
        _firstName = firstName;
        _lastName = lastName;
        _patronymic = patronymic;
        _attendance = attendance;
        _averageScore = averageScore;
    }
}
