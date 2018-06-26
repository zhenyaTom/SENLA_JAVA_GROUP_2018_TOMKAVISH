package Task_2;

import java.util.Scanner;

public class JobSeeker extends Man {
    static String position;
    static String skils;
    static String aboutYorself;
    static String motivation;
    Education education = new Education();
    PastPosition pastPosition = new PastPosition();

    JobSeeker (){
        System.out.println("JobSeeker");
        setPosition();
        setSkils();
        setAboutYorself();
        setMotivation();
    }

    public void setPosition (){
        Scanner input = new Scanner(System.in);
        System.out.println("    Введите должность на которую вы претендуете:");
        position = input.nextLine();
    }

    public void setSkils (){
        Scanner input = new Scanner(System.in);
        System.out.println("    Какими навыками Вы владеете:");
        skils = input.nextLine();
    }

    public void setAboutYorself (){
        Scanner input = new Scanner(System.in);
        System.out.println("   Расскажите немного о себе:");
        aboutYorself = input.nextLine();
    }

    public void setMotivation (){
        Scanner input = new Scanner(System.in);
        System.out.println("    Ваша мотивация:");
        motivation = input.nextLine();
    }


    public static void getPosition (){
        System.out.println("Претендует на должность: " + position);
    }

    public static void getSkils (){
        System.out.println("Владеет навыками: " + skils);
    }

    public static void getAboutYorself (){
        System.out.println("О себе: " + aboutYorself);
    }

    public static void getMotivation (){
        System.out.println("Мотивация: " + motivation);
    }
}