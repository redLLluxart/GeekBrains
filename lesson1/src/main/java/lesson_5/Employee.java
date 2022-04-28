package lesson_5;
import java.util.Random;

public class Employee {

    private String name;
    private String lastname;
    private String surname;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(){
       /* String[] mas_name = {"Pavel", "Egor", "Slava", "Vlad", "Alexander"};
        String[] mas_lastname = {"Petrovich","Andreevich","Alekseevich","Romanovich","Georgievich"};
        String[] mas_surname = {"Eroxin","Pavlov","Sin","Lutak","Kondakov"};
        String[] mas_position = {"junior","middle","senior","trainee","team lead"};
        String[] mas_email = {"axd@gmail.com","jgh@yandex.com","jld@mail.ru","sdf@yahoo.ru","sfdg@protonmail.com"};
        String[] mas_phoneNumber = {"8985451321","89538912961","89930123954","89537910278","89537963094"};*/
        name = "Pavel";
        lastname = "Kulyamin";
        surname = "Andreevich";
        position = "Java Developer";
        email = "pavel.kulyamin@open.ru";
        phoneNumber = "89057630065";
        salary = 150000;
        age = 24;
    }

    public Employee(String name, String lastname, String surname, String position, String email,String phoneNumber, int salary, int age){
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void showData(){
        System.out.println(lastname + " " + name + " " + surname);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
