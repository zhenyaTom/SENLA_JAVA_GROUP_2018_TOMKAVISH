package Task_2;

import java.util.Scanner;

public class Man {
   static String name;
   static String surname;
   Age age = new Age();

    Man (){
        System.out.println("Man");
        setName();
        setSurname();
    }

    public void setName () {
        System.out.println("    Введите имя:");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
    }

    public void setSurname () {
        System.out.println("    Введите фамилию:");
        Scanner input = new Scanner(System.in);
        surname = input.nextLine();
    }

    public static void getName (){
        System.out.println("Имя: " + name);
    }

    public static void getSurname (){
        System.out.println("Фамилия: " + surname);
    }
}