package UI;

import java.util.ArrayList;
import java.util.Scanner;
import realization.BeneficiaryStudent;
import realization.ForMoneyStudent;
import realization.Student;

public class UI {

    public UI() {
    };

    /**
     * Считывает строку, введённную пользователем
     * 
     * @return String str – строка, введённая пользователем
     */
    static private String input() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        return str;
    }

    /**
     * Выводит на консоль студента(ов) с наивысшим средним баллом
     */
    private void printHigthScoreStudent() {
        ArrayList<Student> studentlist = Student.findHightScoreStudent();
        for (Student student : studentlist) {
            System.out.println(student.getInfoString());
        }
    }

    /**
     * Выводит на консоль студента(ов) с посещаемостью ниже среднего
     */
    private void printCoutStudentWithLowAttendence() {
        System.out.println("Студентов с посещаемостью ниже среднего -> " +
                Student.countStudentWithLowAttendance() + "\n");
    }

    /**
     * Выводит на консоль список студентов
     */
    private void printStudentList() {
        System.out.println("Список студентов");
        ArrayList<Student> studentlist = Student.get_studentList();
        for (Student student : studentlist) {
            System.out.println(student.getInfoString());
        }
    }

    private void printSortedStudentList() {
        System.out.println("Отсортированный список студентов : ");
        Student.sortArrayStudents();
        printStudentList();
    }

    /**
     * Выводит на консоль меню где можно изменить данные студента и вызывает
     * определенные методы в зависимости от того что вводит пользователь
     */
    private void searchStudent() {
        boolean flag = true;
        System.out.println("Введите фио студента");
        String FIO = input();
        Student student = Student.findStudent(FIO);
        if (Student.findStudent(FIO) instanceof Student) {
            ;
        } else if (Student.findStudent(FIO) instanceof ForMoneyStudent) {
            student = (ForMoneyStudent) Student.findStudent(FIO);
        } else if (Student.findStudent(FIO) instanceof BeneficiaryStudent) {
            student = (BeneficiaryStudent) Student.findStudent(FIO);
        } else {
            System.out.println("Студент не найден \n");
            flag = false;
        }
        while (flag) {
            System.out.println(
                    "Что вы хотите сделать? (введите номер варианта) \n" +
                            "1. Изменить фамилию \n" +
                            "2. Изменить имя \n" +
                            "3. Изменить отчество \n" +
                            "4. Изменить успеваемость \n" +
                            "5. Изменить посещаемость \n");
            if (student instanceof ForMoneyStudent) {
                System.out.println(
                        "6. Изменить цену обучения \n" +
                                "7. Выход <-- \n");
            } else if (student instanceof BeneficiaryStudent) {
                System.out.println(
                        "6. Изменить группу льготы \n" +
                                "7. Выход <-- \n");
            } else {
                System.out.println("7. Выход <-- \n");
            }
            String number = input();
            switch (number) {
                case "1":
                    System.out.println("Введите фамилию");
                    String lastName = input();
                    student.set_lastName(lastName);
                    System.out.println("Студент после изменений -> \n" + student.getInfoString());
                    break;
                case "2":
                    System.out.println("Введите имя");
                    String firstName = input();
                    student.set_firstName(firstName);
                    System.out.println("Студент после изменений -> \n" + student.getInfoString());
                    break;
                case "3":
                    System.out.println("Введите отчество");
                    String patronymic = input();
                    student.set_patronymic(patronymic);
                    System.out.println("Студент после изменений -> \n" + student.getInfoString());
                    break;
                case "4":
                    System.out.println("Введите значение успеваемости");
                    int averageScore = Integer.parseInt(input());
                    student.set_averageScore(averageScore);
                    System.out.println("Студент после изменений -> \n" + student.getInfoString());
                    break;
                case "5":
                    System.out.println("Введите значение посещения");
                    int attendance = Integer.parseInt(input());
                    student.set_attendance(attendance);
                    System.out.println("Студент после изменений -> \n" + student.getInfoString());
                    break;
                case "6":
                    if (student instanceof ForMoneyStudent) {
                        System.out.println("Введите значение цены");
                        int priceStudy = Integer.parseInt(input());
                        ((ForMoneyStudent) student).set_priceStudy(priceStudy);
                        System.out.println("Студент после изменений -> \n" + student.getInfoString());
                        break;
                    } else if (student instanceof BeneficiaryStudent) {
                        System.out.println("Введите тип льготы");
                        String preferentialGroup = input();
                        ((BeneficiaryStudent) student).set_preferentialGroup(preferentialGroup);
                        System.out.println("Студент после изменений -> \n" + student.getInfoString());
                        break;
                    } else {
                        System.out.println("Введите НОМЕР пункта меню \n");
                        break;
                    }
                case "7":
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
                    "6. ВЫХОД");
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
