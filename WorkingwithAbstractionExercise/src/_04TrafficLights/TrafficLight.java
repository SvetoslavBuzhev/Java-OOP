package _04TrafficLights;

public class TrafficLight {
    private Lights light ;

    public Lights getLight() {
        return light;
    }

    public void setLight(Lights light) {
        this.light = light;
    }

    public TrafficLight(Lights light){
        this.light = light;
    }
    public void changeColor(){
        if (this.light == Lights.RED){
            this.light = Lights.GREEN;
        } else if (this.light == Lights.YELLOW) {
            this.light=Lights.RED;
        }else {
            this.light = Lights.YELLOW;
        }
    }
}
