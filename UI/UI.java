package UI;

import java.net.Socket;
import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.Scanner;

import realization.Student;

public class UI {

    public UI() {
    };

    /**
     * Считывает строку, введённную пользователем
     * 
     * @return String str – строка, введённая пользователем
     */
    static public String input() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        return str;
    }

    /**
     * Выводит на консоль студента(ов) с наивысшим средним баллом
     */
    public void printHigthScoreStudent() {
        ArrayList<Student> studentlist = Student.findHightScoreStudent();
        for (Student student : studentlist) {
            System.out.println(student);
        }
    }

    /**
     * Выводит на консоль студента(ов) с посещаемостью ниже среднего
     */
    public void printCoutStudentWithLowAttendence() {
        System.out.println("Студентов с посещаемостью ниже среднего -> " +
                Student.countStudentWithLowAttendance() + "\n");
    }

    /**
     * Выводит на консоль список студентов
     */
    public void printStudentList() {
        System.out.println("Список студентов");
        // Student.getStudentList
    }

    public void printSortedStudentList() {
        System.out.println("Отсортированный список студентов : ");
        // Student.sortStudentList
        // printStudentList()
    }

    /**
     * Выводит на консоль меню где можно изменить данные студента и вызывает
     * определенные методы в зависимости от того что вводит пользователь
     */
    public void searchStudent() {
        System.out.println("Введите фио студента");
        String FIO = input();
        Student student = Student.findStudent(FIO);
        boolean flag = true;
        while (flag) {
            System.out.println(
                    "Что вы хотите сделать? (введите номер варианта) \n" +
                            "1. Изменить фамилию \n" +
                            "2. Изменить имя \n" +
                            "3. Изменить отчество \n" +
                            "5. Вернуться назад <- \n");
            String number = input();
            switch (number) {
                case "1":
                    System.out.println("Введите фамилию");
                    String lastName = input();
                    student.set_lastName(lastName);
                    System.out.println("Студент после изменений -> " + student);
                    break;
                case "2":
                    System.out.println("Введите имя");
                    String firstName = input();
                    student.set_firstName(firstName);
                    System.out.println("Студент после изменений -> " + student);
                    break;
                case "3":
                    System.out.println("Введите отчество");
                    String patronymic = input();
                    student.set_patronymic(patronymic);
                    System.out.println("Студент после изменений -> " + student);
                    break;
                case "5":
                    flag = false;
                    break;

                default:
                    System.out.println("Введите НОМЕР пункта меню \n");
                    break;
            }
        }
    }

    /**
     * Выводит на консоль меню управления программой и вызывает
     * определённые методы в зависимости от выбора пункта меню пользователем
     */
    public void run() {
        boolean flag = true;
        while (flag == true) {
            System.out.println("Программа Студенты \n" +
                    "что вы хотите сделать? (введите номер варианта) \n" +
                    "1. Определить студента с максиамльным средним баллом \n" +
                    "2. Посчитать кол-во студентов с посещаемостью меньше среднего \n" +
                    "3. Вывести список студентов \n" +
                    "4. Упорядочить список по именам \n" +
                    "5. Поиск по ФИО студента \n" +
                    "6. ВЫХОД \n");
            String number = input();
            switch (number) {
                case "1":
                    printHigthScoreStudent();
                    break;
                case "2":
                    printCoutStudentWithLowAttendence();
                    break;
                case "3":
                    printStudentList();
                    break;
                case "4":
                    printSortedStudentList();
                    break;
                case "5":
                    searchStudent();
                    break;
                case "6":
                    flag = false;
                    break;

                default:
                    System.out.println("Введите НОМЕР пункта меню \n");
                    break;
            }
        }
    }
}
