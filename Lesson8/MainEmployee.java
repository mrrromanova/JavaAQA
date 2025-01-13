package Lesson8;

public class MainEmployee {
    public MainEmployee() {
    }

    public static void main(String[] args) {
        Employee[] persArray = new Employee[]{new Employee("Mark", "Zuckerberg", 30, "markzuckerberg@email.com", 1111111, "Facebook", 19841984), new Employee("Bill", "Gates", 59, "billgates@email.com", 2222222, "Microsoft", 19551955), new Employee("Linus ", "Torvalds ", 45, "linustorvalds@email.com", 3333333, "Linux", 19691969), new Employee("James", "Gosling ", 59, "jamesgosling@email.com", 4444444, "Java", 19551955), new Employee("Larry ", "Page", 47, "larrypage@email.com", 5555555, "Google", 19731973)};

        for(Employee person : persArray) {
            if (person.getAge() < 40) {
                person.getInfo();
            }
        }

    }
}