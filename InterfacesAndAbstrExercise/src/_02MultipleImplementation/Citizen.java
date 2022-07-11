package _02MultipleImplementation;

public class Citizen implements Birthable,Person,Identifiable {
    private String name;
    private int age;
    private final String birthDate;
    private final String id;

    public Citizen(String name,int age,String id,String birthDate){
        setName(name);
        setAge(age);
        this.id = id;
        this.birthDate = birthDate;
    }

    private  void setName(String name) {
        this.name = name;
    }

    private  void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String getId() {
        return id;
    }
    @Override
    public String toString(){
        return String.format("%s%n%d%n%s%n%s",getName(),getAge(),getId(),getBirthDate());
    }
}
