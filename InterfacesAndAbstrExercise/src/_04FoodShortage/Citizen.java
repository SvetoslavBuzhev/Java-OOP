package _04FoodShortage;



public class Citizen implements  Person, Identifiable,Buyer {
    private String name;
    private int age;
    private final String birthDate;
    private final String id;
    private int food = 0;

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
    public String getId() {
        return id;
    }


    @Override
    public void buyFood() {
        this.food+=10;
    }

    @Override
    public int getFood() {
        return food;
    }
}
