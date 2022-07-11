package _03BirthdayCelebrations;

public class Pet implements Recognizable,Birthable{
    private final String name;
    private final String birthDate;

    public Pet(String name,String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }
}
