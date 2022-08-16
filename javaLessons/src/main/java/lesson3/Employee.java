package lesson3;

public class Employee {
    private final String name;
    private final String post;
    private final String email;
    private final String phoneNumber;
    private final int salary;
    private final int age;

    public Employee(String name, String post, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("FIO: " + name + "\t" +
                "position: " + post + "\t" +
                "email: " + email + "\t" +
                "phone_number: " + phoneNumber + "\t" +
                "salary: " + salary + "\t" +
                "age: " + age);
    }
}
