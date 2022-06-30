package SortByNameAndAge;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName,String lastName,int age){
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }
    @Override
    public String toString(){
        return String.format("%s %s is %d years old.",firstName,lastName,age);
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}