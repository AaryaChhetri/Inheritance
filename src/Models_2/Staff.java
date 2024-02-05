package Models_2;

public class Staff extends Member {
    int specialization;

    public Staff(String name, int age, double salary, int contact, int leaves, int specialization) {
        super(name, age, salary, contact, leaves);
        this.specialization = specialization;
    }

    public int getSpecialization() {
        return specialization;
    }

    public void setSpecialization(int specialization) {
        this.specialization = specialization;
    }

    public double getSalary2(int leaves) {
        double newSalary = this.specialization * super.getSalary(leaves);
        return newSalary;
    }
}
