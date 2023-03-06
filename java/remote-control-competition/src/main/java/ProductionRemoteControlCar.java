class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    
    int distanceTravelled = 0;
    int victories = 0;
    public void drive() {
        distanceTravelled += 10;
    }
    public int getDistanceTravelled() {
        return distanceTravelled;
    }
    public int getNumberOfVictories() {
        return victories;
    }
    public void setNumberOfVictories(int numberofVictories) {
        victories = numberofVictories;
    }
    public int compareTo(ProductionRemoteControlCar other){    
        if (victories == other.victories) {
            return 0;    
        }
        else if (victories > other.victories) {
            return 1;
        }  
        else {
            return -1;
        }      
    }    
}
