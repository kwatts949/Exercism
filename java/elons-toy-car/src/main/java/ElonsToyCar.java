public class ElonsToyCar {
    int meters = 0;

    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + meters + " meters";
    }

    public String batteryDisplay() {
       return "Battery at 100%";
    }

    public void drive() {
        meters += 20;
    }
}
