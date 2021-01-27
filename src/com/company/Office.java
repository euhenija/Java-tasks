package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Office {

    public static void main(String[] args) {

        Students[] listOfStudents = new Students[16];
        listOfStudents[0] = new Students("Экономический", 2, 221, 223, "Иванов", "Иван", "Иванович", 2001, "ул.Никольская, 43/14", 343344);
        listOfStudents[1] = new Students("Исторический", 1, 131, 335, "Петров", "Иван", "Петрович", 1999, "ул.Сдовая, 32/4", 3853445);
        listOfStudents[2] = new Students("Экономический", 2, 221, 432, "Снег", "Ирина", "Павловна", 2000, "ул.Аэродромная, 16/54", 2133444);
        listOfStudents[3] = new Students("Экономический", 1, 121, 465, "Кружка", "Олег", "Васильевч", 1998, "ул.Новая 1/43", 7842321);
        listOfStudents[4] = new Students("Исторический", 2, 231, 132, "Гул", "Анна", "Сергеевна", 2001, "п-т Победителей 156/1", 3543245);
        listOfStudents[5] = new Students("Исторический", 1, 132, 132, "Середа", "Игорь", "Игоревич", 2002, "п-т Правды 156/1", 4324245);
        listOfStudents[6] = new Students("Исторический", 2, 231, 2465, "Крик", "Елена", "Анатольевна", 2001, "ул. Красная 5/81", 3559335);
        listOfStudents[7] = new Students("Исторический", 2, 232, 532, "Лебедь", "Семен", "Янович", 1999, "ул. Парковая 17/25", 1443245);
        listOfStudents[8] = new Students("Экономический", 1, 122, 232, "Рак", "Анастасия", "Ивановна", 2001, "ул. Садовая 32/1", 104324544);
        listOfStudents[9] = new Students("Экономический", 1, 121, 411, "Климов", "Андрей", "Александрович", 2003, "ул. Конечная 43", 4912304);
        listOfStudents[10] = new Students("Экономический", 2, 222, 341, "Ой", "Екатерина", "Ивановна", 2000, "ул. Первая 43", 4532304);
        listOfStudents[11] = new Students("Исторический", 1, 131, 541, "Жук", "Артем", "Александрович", 2001, "ул. Ленина 50/41", 7332304);
        listOfStudents[12] = new Students("Исторический", 1, 132, 397, "Заяц", "Ольга", "Николаевна", 1999, "ул. Маркса 19/17", 8442304);
        listOfStudents[13] = new Students("Исторический", 2, 132, 241, "Олень", "Жанна", "Андреевна", 2001, "ул. Зеленая 1/1", 6732304);
        listOfStudents[14] = new Students("Экономический", 1, 122, 541, "Кольцов", "Артем", "Александрович", 2000, "ул. Ленина 19/5", 7947304);
        listOfStudents[15] = new Students("Экономический", 2, 222, 235, "Русак", "Ирина", "Владимировна", 2002, "ул. Вторая 19/43", 2227304);



        //Select action with lists of Students

        Scanner scanner = new Scanner(System.in);
        System.out.println("What kind of list do you want to get:\n 1 - list of Students of selected Faculty, \n 2 - list of students of every Faculty and Course, \n 3 - list of Students with year of birth after selected, \n 4 - list of Students of selected Group \n  ");
        int selectAction = scanner.nextInt();
        switch (selectAction) {
            //Output list of Students of selected Faculty
            case 1: {
                System.out.println("Write Faculty name");
                String facultyName = scanner.next();
                System.out.println("List of students of " + facultyName + " faculty \n" + getListStudentsOfFaculty(listOfStudents, facultyName));
                break;
            }
            //Output list of Students with year of birth after selected
            case 3: {
                System.out.println("Select a year of birth:");
                int selectedYearOfBirth = scanner.nextInt();
                System.out.println("List of students of faculty \n" + getListOfStudentsYoungerThenSelectedYear(listOfStudents, selectedYearOfBirth));
                break;
            }

            //Output list of Students of selected Group
            case 4: {
                System.out.println("Select a Group number:");
                int selectedGroupNumber = scanner.nextInt();
                System.out.println("List of students of faculty \n" + getListStudentsOfGroup(listOfStudents, selectedGroupNumber));
                break;
            }
            default:
                System.out.println("Selected option doesn't exist. Restart");

        }


    }
    //Getting list of Students of selected Faculty
    public static ArrayList<String> getListStudentsOfFaculty(Students[] listOfStudents, String facultyName) {
        ArrayList<String> listOfFacultyStudents = new ArrayList<>();
        for (Students listOfStudent : listOfStudents) {
            if (listOfStudent.getFaculty().equals(facultyName)) {
                listOfFacultyStudents.add(listOfStudent.getStudentsSurname() + " " + listOfStudent.getStudentsName() + " " + listOfStudent.getStudentsFatherName());
            }
        }
        return listOfFacultyStudents;
    }

    //Getting list of Students with year of birth after selected
    public static ArrayList<String> getListOfStudentsYoungerThenSelectedYear(Students[] listOfStudents, int selectedYearOfBirth) {
        ArrayList<String> listOfStudentsOfSelectedYear = new ArrayList<>();
        for (Students listOfStudent : listOfStudents) {
            if (listOfStudent.getYearOfBirth() > selectedYearOfBirth) {
                listOfStudentsOfSelectedYear.add(listOfStudent.getStudentsSurname() + " " + listOfStudent.getStudentsName() + " " + listOfStudent.getStudentsFatherName() + " " + listOfStudent.getYearOfBirth());
            }
        }
        return listOfStudentsOfSelectedYear;
    }


    //Getting list of Students of selected Group
    public static ArrayList<String> getListStudentsOfGroup(Students[] listOfStudents, int selectedGroupNumber) {
        ArrayList<String> listStudentsOfGroup = new ArrayList<>();
        for (Students listOfStudent : listOfStudents) {
            if (listOfStudent.getGroupNumber() == selectedGroupNumber) {
                listStudentsOfGroup.add(listOfStudent.getStudentsSurname() + " " + listOfStudent.getStudentsName() + " " + listOfStudent.getStudentsFatherName());
            }
        }
        return listStudentsOfGroup;
    }
}
