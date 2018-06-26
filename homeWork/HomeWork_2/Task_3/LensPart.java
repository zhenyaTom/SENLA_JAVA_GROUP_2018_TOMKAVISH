import java.util.Scanner;

public class LensPart implements ILineStep {
    static Double diopter;

    LensPart (){
        buildProductPart();
    }

    public void buildProductPart (){
        Scanner input = new Scanner(System.in);
        System.out.println("Сейчас будут изготовлены линзы очков");

        System.out.println("Укажите нужные диоптрии: ");
        diopter = input.nextDouble();

        System.out.println("Идет изготовление линз очков...");
        System.out.println("   Диоптрии: " + diopter);
        System.out.println("Линзы очков готовы!!!");
        System.out.println("");
    }
}