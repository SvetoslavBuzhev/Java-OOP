package SalaryIncrease;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private double bonuses;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonuses) {
        if (this.getAge() < 30) {
            salary = salary + (salary*bonuses)/200;
        } else {
            salary = salary + (salary*bonuses)/100;
        }

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(firstName).append(" ").append(lastName);
        stringBuilder.append(" gets ").append(salary).append("leva");
        return stringBuilder.toString();
    }
}
