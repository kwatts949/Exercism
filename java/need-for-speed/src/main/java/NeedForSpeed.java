class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int battery = 100;
    private int distance;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery < 1;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (this.battery > 0) {
            this.distance += this.speed;
            this.battery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getBatteryDrain() {
        return this.batteryDrain;
    }
}

class RaceTrack {
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        double distanceSpeed = (double)distance / (double)car.getSpeed();

        return  distanceSpeed * car.getBatteryDrain() <= 100;
    }
}
