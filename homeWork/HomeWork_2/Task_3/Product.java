import java.util.SortedMap;

public class Product implements IAssemblyLine, IProduct {

    BodyPart bodyPart = new BodyPart();
    LensPart lensPart = new LensPart();
    ShacklePart shacklePart=new ShacklePart();

    Product (){
        assembleProduct();
    }

    public void assembleProduct(){
        System.out.println("Сейчас будет выполнена сборка очков");
        installFirstPart();
        installSecondPart();
        installThirdPart();
        System.out.println("Очки собраны!!!");
        System.out.println("");

    }

    public void installFirstPart(){
        System.out.println("    Устанавливается корпус");
    }

    public void installSecondPart(){
        System.out.println("    Устанавливаются линзы");
    }

    public void installThirdPart(){
        System.out.println("    Устанавливаются дужки");
    }

    public static void getProductCharacteristics(){
        System.out.println("Готовые очки имеют следующие характеристики:");
        System.out.println("    Материал корпуса: " + BodyPart.material);
        System.out.println("    Модель корпуса: " + BodyPart.model);
        System.out.println("    Диоптрии линз: " + LensPart.diopter);
        System.out.println("    Длина дужек: " + ShacklePart.length + " мм");
    }
}
