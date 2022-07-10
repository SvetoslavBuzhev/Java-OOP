package _06Ferrari;

public class Ferrari implements Car{
    private String driverName;
    private String model;

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Ferrari(String driverName){
        setDriverName(driverName);
        setModel("488-Spider");
    }

    public String getDriverName() {
        return driverName;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String gas(){
        return "brum-brum-brum-brrrrr";
    }
    @Override
    public String brakes(){
        return "Brakes!";
    }
    @Override
    public String toString(){
        return String.format("%s/%s/%s/%s",getModel(),brakes(),gas(),getDriverName());
    }
}
