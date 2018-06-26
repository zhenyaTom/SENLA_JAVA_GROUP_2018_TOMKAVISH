import java.util.Scanner;

public class BodyPart implements ILineStep {

    static String material;
    static String model;

    BodyPart (){
        buildProductPart();
    }

    public void buildProductPart (){
        Scanner input = new Scanner(System.in);
        System.out.println("Сейчас будет изготовлен корпус очков");

        System.out.println("Укажите материал корпуса: ");
        material = input.nextLine();

        System.out.println("Укажите модель корпуса: ");
        model = input.nextLine();

        System.out.println("Идет изготовление корпуса очков...");
        System.out.println("    Материал: " + material);
        System.out.println("    Модель: " + model);
        System.out.println("Корпус очков готов!!!");
        System.out.println("");
    }
}