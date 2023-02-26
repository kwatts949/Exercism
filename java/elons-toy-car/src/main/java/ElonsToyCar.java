public class ElonsToyCar {
    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven 0 meters";
    }

    public String batteryDisplay() {
       return "Battery at 100%";
    }

    public void drive() {
        throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.drive()  method");
    }
}
