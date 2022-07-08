package _04ExtendedSayHello;

public class Chinese extends BasePerson implements Person {
    private String name;
    public Chinese(String name){
        super(name);
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
