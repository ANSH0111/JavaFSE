public class Logger {
    // Private static instance of class Logger
    private static Logger instance;

    // Private constructor
    private Logger() {
        System.out.println("Initialized");
    }

    // Public static method to get the singleton instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
