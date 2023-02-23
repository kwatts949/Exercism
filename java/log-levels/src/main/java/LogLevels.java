public class LogLevels {
    
    public static String message(String logLine) {
        
        String[] newArray = logLine.split(":");
        return newArray[1].trim();
    }

    public static String logLevel(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
    }

    public static String reformat(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
    }
}
