public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        switch(shirtNum) {
            case 1:
                return "goalie";
            case 2:
                return "left back";
            case 3:
                return "center back";
            case 4:
                return "center back";
            default:
                return "none";
        }
    }
}
