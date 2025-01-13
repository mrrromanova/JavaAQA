package Lesson8;

public class Employee {
    private String name;
    private String surname;
    private String profession;
    private String email;
    private int number;
    private int salary;
    private int age;

    public Employee() {
    }

    public Employee(String name, String surname, int age, String email, int number, String profession, int salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.number = number;
        this.profession = profession;
        this.salary = salary;
    }

    public void getInfo() {
        System.out.println("Name: " + this.name + ", Surname: " + this.surname + ", Age: " + this.age + ", Phone number: " + this.number + ", Email: " + this.email + ", Job: " + this.profession + ", Salary: " + this.salary);
    }

    public int getAge() {
        return this.age;
    }
}