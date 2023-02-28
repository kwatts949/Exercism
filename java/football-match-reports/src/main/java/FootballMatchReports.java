public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        switch(shirtNum) {
            case 1:
                return "goalie";
            default:
                return "none";
        }
    }
}
