package Task_2;

import java.util.Scanner;

public class Education {

    static String university;
    static String faculty;
    static String specialty;
    static int yearOfEnding;


    Education() {
        System.out.println("Education");
        setUniversity();
        setFaculty();
        setSpecialty();
        setYearOfEnding();
    }


    public void setUniversity (){
        Scanner input = new Scanner(System.in);
        System.out.println("    Какой учебное заведение Вы окончили:");
        university = input.nextLine();
    }

    public void setFaculty (){
        Scanner input = new Scanner(System.in);
        System.out.println("    На каком факультете Вы учились:");
        faculty = input.nextLine();
    }

    public void setSpecialty(){
        Scanner input = new Scanner(System.in);
        System.out.println("    Какую специальность Вы получили:");
        specialty = input.nextLine();
    }

    public void setYearOfEnding(){
        Scanner input = new Scanner(System.in);
        System.out.println("    В каком году вы закончили учебу:");
        yearOfEnding = input.nextInt();
    }

    public static void getUniversity (){
        System.out.println("Окончил: " + university);
    }

    public static void getFaculty (){
        System.out.println("Факультет: " + faculty);
    }

    public static void getSpecialty(){
        System.out.println("Получил специальность: " + specialty);
    }

    public static void getYearOfEnding(){
        System.out.println("Учебу закончил в " + yearOfEnding + " году");
    }
}