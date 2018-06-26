package Task_2;

import java.util.Scanner;

public class PastPosition {
    static String pastPosition;
    static String company;
    static String startOfWork;
    static String endOfWork;

    PastPosition () {
        System.out.println("PastPosition");
        setPastPosition();
        setCompany();
        setStartOfWork();
        setEndOfWork();
    }

    public void setPastPosition (){
        Scanner input = new Scanner(System.in);
        System.out.println("    На какой должности вы роботали ранее:");
        pastPosition = input.nextLine();
    }

    public void setCompany () {
        Scanner input = new Scanner(System.in);
        System.out.println("    В кокой компании Вы работали:");
        company = input.nextLine();
    }

    public void setStartOfWork () {
        Scanner input = new Scanner(System.in);
        System.out.println("    Дата начала работы в компании:");
        startOfWork = input.nextLine();
    }

    public void setEndOfWork () {
        Scanner input = new Scanner(System.in);
        System.out.println("    Дата окончания работы в компании:");
        endOfWork = input.nextLine();
    }

    public static void getPastPosition (){
        System.out.println("Роботал ранее на должности: " + pastPosition);
    }

    public static void getCompany (){
        System.out.println("В компании: " + company);
    }

    public static void getStartOfWork (){
        System.out.println("Начало работы в компании: " + startOfWork);
    }

    public static void getEndOfWork (){
        System.out.println("Окончание работы в компании: " + endOfWork);
    }
}