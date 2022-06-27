package _04HotelReservation;

public enum Type {
    VIP(20),
    SecondVisit(10),
    None(0);

    private String type;
    private int percent;

    Type( int percent) {

        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }
}
