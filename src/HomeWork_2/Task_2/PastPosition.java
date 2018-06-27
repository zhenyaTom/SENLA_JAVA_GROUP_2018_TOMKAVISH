
public class PastPosition {
    private String pastPosition;
    private String company;
    private String startOfWork;
    private String endOfWork;

    PastPosition () {
        System.out.println("PastPosition");
    }

    public void setPastPosition (String inputPastPosition){
        this.pastPosition = inputPastPosition;
    }

    public void getPastPosition (){
        System.out.println("Роботал ранее на должности: " + pastPosition);
    }

    public void setCompany (String inputCompany) {
        this.company = inputCompany;
    }

    public void getCompany (){
        System.out.println("В компании: " + company);
    }

    public void setStartOfWork (String inputStartOfWork) {
        this.startOfWork = inputStartOfWork;
    }

    public void getStartOfWork (){
        System.out.println("Начало работы в компании: " + startOfWork);
    }

    public void setEndOfWork (String inputEndOfWork) {
        this.endOfWork = inputEndOfWork;
    }

    public void getEndOfWork (){
        System.out.println("Окончание работы в компании: " + endOfWork);
    }
}