import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class MainFile {
    static Logger logger = LogManager.getLogger(Visitor.class);
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        logger.debug("Successfully wrote to the file");
        String file = scanner.nextLine();
        try {
            logger.error(Visitor.Save(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.error(Visitor.load(file));
    }

}
