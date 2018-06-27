package HomeWork_2.Task_3;

public class LineStepBody implements ILineStep {
    public IProductPart buildProductPart (){
        return new BodyPart();
    }
}
