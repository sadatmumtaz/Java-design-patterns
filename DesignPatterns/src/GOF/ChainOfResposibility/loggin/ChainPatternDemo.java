package GOF.ChainOfResposibility.loggin;

/**
 *
 * @author fa20-bse-011
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    private static AbstractLogger getChainOfDBLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger DatabaseLogger = new DatabaseLogger(AbstractLogger.WARNING);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(DatabaseLogger);
        DatabaseLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
//        AbstractLogger loggerChain = getChainOfLoggers();
//
//        loggerChain.logMessage(AbstractLogger.INFO,
//                "This is an information.");
//
//        loggerChain.logMessage(AbstractLogger.DEBUG,
//                "This is an debug level information.");
//
//        loggerChain.logMessage(AbstractLogger.ERROR,
//                "This is an error information.");
//        
        

        AbstractLogger loggerChain2 = getChainOfDBLoggers();        

        loggerChain2.logOnceMessage(AbstractLogger.ERROR,
                "This is an error information.");
        
        loggerChain2.logMessage(AbstractLogger.WARNING,
                "This is an WARNING level information.");
        
         loggerChain2.logMessage(AbstractLogger.INFO,
                "This is an information.");


    }
}
