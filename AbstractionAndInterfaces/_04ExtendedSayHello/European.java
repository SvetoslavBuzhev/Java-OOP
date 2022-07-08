package _04ExtendedSayHello;

public class European extends BasePerson implements Person {
    private String name;

    public European(String name){
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
