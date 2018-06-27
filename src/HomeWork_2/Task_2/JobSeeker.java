
public class JobSeeker extends Man {
    private String position;
    private String skil;
    private String aboutYorself;
    private String motivation;
    Education education = new Education();
    PastPosition pastPosition = new PastPosition();

    JobSeeker (){
        System.out.println("JobSeeker");
    }

    public void setPosition (String inputPosition){
        this.position = inputPosition;
    }

    public void getPosition (){
        System.out.println("Претендует на должность: " + position);
    }

    public void setSkil (String inputSkil){
        this.skil = inputSkil;
    }

    public void getSkil (){
        System.out.println("Владеет навыками: " + skil);
    }

    public void setAboutYorself (String inputAboutYorself){
        this.aboutYorself = inputAboutYorself;
    }

    public void getAboutYorself (){
        System.out.println("О себе: " + aboutYorself);
    }

    public void setMotivation (String inputMotivation){
        this.motivation = inputMotivation;
    }

    public void getMotivation (){
        System.out.println("Мотивация: " + motivation);
    }
}