
public class Age {
    private int age;

    Age() {
        System.out.println("Age");
    }

    public void setAge(int inputAge) {
        this.age = inputAge;
    }

    public void getAge() {
        System.out.println("Возраст: " + this.age);
    }
}