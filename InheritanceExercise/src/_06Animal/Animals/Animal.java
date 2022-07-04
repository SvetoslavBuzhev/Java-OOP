package _06Animal.Animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void setName(String name) {
        if (name.trim().equals("")) {
            throw new IllegalArgumentException("Invalid output!");
        }
        this.name = name;
    }

    public void setGender(String gender) {
        if (gender.trim().equals("")) {
            throw new IllegalArgumentException("Invalid output!");
        }
        this.gender = gender;
    }

    private boolean rightGender(String gender) {
        return !gender.equals("Female")&&!gender.equals("Male");
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid output!");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String produceSound() {
        return null;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + System.lineSeparator() +
                name + " " + age + " " +
                gender + System.lineSeparator() +
                produceSound();    }
}
