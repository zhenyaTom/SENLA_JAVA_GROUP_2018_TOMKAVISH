package HomeWork_2.Task_3;

public class Test {
    public static void main(String[] args) {
        LineStepBody lineFirstStep = new LineStepBody();
        LineStepLens lineSecondStep = new LineStepLens();
        LineStepShackle lineThirdStep = new LineStepShackle();
        AssemblyLine assemblyLine = new AssemblyLine(lineFirstStep, lineSecondStep, lineThirdStep);
        Product product = new Product();
        assemblyLine.assembleProduct(product);
    }
}
