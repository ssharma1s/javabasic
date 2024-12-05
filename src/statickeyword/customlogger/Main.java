package statickeyword.customlogger;

public class Main {
    public static void main(String[] args) {

        CustomLogger.logger.log(1);
        CustomLogger.logger.log("Welcome");
        CustomLogger.logger.log(2.5d);
    }
}
