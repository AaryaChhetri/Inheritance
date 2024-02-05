package Models_2;

public class Member {

    String name;
    int age;
    double salary;
    int contact;
    int leaves;

    public Member(String name, int age, double salary, int contact, int leaves) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.contact = contact;
        this.leaves = leaves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public int getLeaves() {
        return leaves;
    }

    public void setLeaves(int leaves) {
        this.leaves = leaves;
    }

    public double getSalary(int leaves) {
        double salary = (24 - leaves) * this.salary;
        return salary;
    }
}
