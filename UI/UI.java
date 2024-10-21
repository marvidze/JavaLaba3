package UI;

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
        // ArrayList<Student> studentlist = Student.findHightScoreStudent();
        // for (Student student : studentlist) {
        // System.out.println(student);
        // }
    }

    /**
     * Выводит на консоль студента(ов) с посещаемостью ниже среднего
     */
    public void printCoutStudentWithLowAttendence() {
        // System.out.println("Студентов с посещаемостью ниже среднего -> " +
        // Student.coutStudentWithLowAttendence() + "\n");
    }

    /**
     * Выводит на консоль список студентов
     */
    public void printStudentList() {
        System.out.println("Список студентов");
    }

    /**
     * Выводит на консоль меню управления программой
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
                    "5. Поиск по ФИО студента \n");
            String number = input();
            switch (number) {
                case "1":
                    printHigthScoreStudent();
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;

                default:
                    System.out.println("Введите НОМЕР пункта меню");
                    break;
            }
        }
    }
}
