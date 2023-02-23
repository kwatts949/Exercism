public class LogLevels {
    
    public static String message(String logLine) {
        String[] newArray = logLine.split(":");
        return newArray[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] newArray = logLine.replace("[", "").replace("]", "").split(":");
        return newArray[0].toLowerCase().trim();
    }

    public static String reformat(String logLine) {
       return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}