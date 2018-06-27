
public class Man {
   private String name;
   private String surname;
   Age age;

    Man (){
        System.out.println("Man");
        this.age = new Age();
    }

    public void setName (String inputName) {
        this.name = inputName;
    }

    public void getName (){
        System.out.println("Имя: " + this.name);
    }

    public void setSurname (String inputSurname) {
        this.surname = inputSurname;
    }

    public void getSurname (){
        System.out.println("Фамилия: " + this.surname);
    }
}