package HomeWork_2.Task_3;

public class LineStepShackle implements ILineStep {
    public IProductPart buildProductPart (){
        return new ShacklePart();
    }
}
