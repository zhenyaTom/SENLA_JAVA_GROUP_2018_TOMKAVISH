package Task_2;

import java.util.Scanner;

public class Age {
    static int age;

    Age() {
        System.out.println("Age");
        setAge();
    }

    public void setAge() {
        Scanner input = new Scanner(System.in);
        System.out.println("    Сколько Вам лет:");
        age = input.nextInt();
    }

    public static void getAge() {
        System.out.println("Возраст: " + age);
    }
}