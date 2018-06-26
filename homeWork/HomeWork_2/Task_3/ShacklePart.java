import java.util.Scanner;

public class ShacklePart implements ILineStep {
    static int length;

    ShacklePart (){
        buildProductPart();
    }

    public void buildProductPart (){
        Scanner input = new Scanner(System.in);
        System.out.println("Сейчас будут изготовлены дужки очков");

        System.out.println("Укажите нужную длину в мм: ");
        length = input.nextInt();

        System.out.println("Идет изготовление дужек очков...");
        System.out.println("    Длина: " + length);
        System.out.println("Дужки очков готовы!!!");
        System.out.println("");
    }
}