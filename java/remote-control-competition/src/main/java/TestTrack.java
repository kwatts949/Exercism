import java.util.*;

public class TestTrack {
    public static void race(RemoteControlCar car) {
        car.drive();
    }
    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> ranking = new ArrayList<ProductionRemoteControlCar>();
        ranking.add(prc1);
        ranking.add(prc2);
        Collections.sort(ranking);
        return ranking;
    }
}
