package HomeWork_2.Task_3;

public class AssemblyLine implements IAssemblyLine {

    private LineStepBody lineStepBody;
    private LineStepLens lineStepLens;
    private LineStepShackle lineStepShackle;

    AssemblyLine(LineStepBody lineStepBody,LineStepLens lineStepLens,LineStepShackle lineStepShackle){
        this.lineStepBody= lineStepBody;
        this.lineStepLens = lineStepLens;
        this.lineStepShackle = lineStepShackle;
        System.out.println("Assembly line created");
    }
    public IProduct assembleProduct(IProduct iProduct) {
        IProductPart body = lineStepBody.buildProductPart();
        IProductPart lens =lineStepLens.buildProductPart();
        IProductPart shackle = lineStepShackle.buildProductPart();

        iProduct.installFirstPart(body);
        iProduct.installSecondPart(lens);
        iProduct.installThirdPart(shackle);

        System.out.println("The glasses are made");
        return iProduct;
    }
}