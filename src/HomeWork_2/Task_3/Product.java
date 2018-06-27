package HomeWork_2.Task_3;

public class Product implements IProduct {
    private IProductPart bodyPart;
    private IProductPart lensPart;
    private IProductPart shacklePart;

    public void installFirstPart(IProductPart iProductPart) {
        this.bodyPart = iProductPart;
        System.out.println("Body installed");
    }

    public void installSecondPart(IProductPart iProductPart) {
        this.lensPart = iProductPart;
        System.out.println("Lens installed");
    }

    public void installThirdPart(IProductPart iProductPart) {
        this.shacklePart = iProductPart;
        System.out.println("Shackle installed");
    }
}
