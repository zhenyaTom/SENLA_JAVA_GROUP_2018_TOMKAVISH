package HomeWork_2.Task_3;

public class LineStepLens implements ILineStep {
    public IProductPart buildProductPart (){
        return new LensPart();
    }
}
