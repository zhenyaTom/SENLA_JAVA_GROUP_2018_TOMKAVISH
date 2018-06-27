
public class Education {

    private String university;
    private String faculty;
    private String specialty;
    private int yearOfEnding;


    Education() {
        System.out.println("Education");
    }

    public void setUniversity (String inputUniversity){
        this.university = inputUniversity;
    }

    public void getUniversity (){
        System.out.println("Окончил: " + university);
    }

    public void setFaculty (String inputFaculty){
        this.faculty = inputFaculty;
    }

    public void getFaculty (){
        System.out.println("Факультет: " + faculty);
    }

    public void setSpecialty(String inputSpecialty){
        this.specialty = inputSpecialty;
    }

    public void getSpecialty(){
        System.out.println("Получил специальность: " + specialty);
    }

    public void setYearOfEnding(int inputYearOfEnding){
        yearOfEnding = inputYearOfEnding;
    }

    public void getYearOfEnding(){
        System.out.println("Учебу закончил в " + yearOfEnding + " году");
    }
}