public class ElonsToyCar {
    int meters = 0;
    int battery = 100;

    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + meters + " meters";
    }

    public String batteryDisplay() {
        if(battery < 1) {
            return "Battery empty";
        } else {
            return "Battery at " + battery + "%";
        }
    }

    public void drive() {
        if (battery < 1) {
            battery = 0;
        } else {
            battery -= 1;
            meters += 20;
        }
    }
}
