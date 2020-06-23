   import org.apache.logging.log4j.LogManager;
   import org.apache.logging.log4j.Logger;

   import javax.tools.JavaFileManager;
   import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Visitor {
    public static String full_name;
    public static int age;
    public static LocalDate visit_date;
    public static LocalDateTime visit_time;
    public static String comments;
    public static String person_visited;
    static Logger logger = LogManager.getLogger(Visitor.class);

    public Visitor(String full_name, int age, LocalDate visit_date, LocalDateTime visit_time, String comments, String person_visited) {
        Visitor.full_name =full_name;
        Visitor.age =age;
        Visitor.visit_date =visit_date;
        Visitor.visit_time =visit_time;
        Visitor.comments =comments;
        Visitor.person_visited =person_visited;
}
    public static String Save(String Visitor) {
        try {
            FileWriter myWriter = new FileWriter
                    ("this.full_name+\"+this.age+\"+this.visit_date\"+this.visit_time+\"this.comment\"+this.person_visited ");
                myWriter.write("this is a bit tricky, but we learn!");
                myWriter.close();

            logger.debug("Successfully wrote to the file.");
            return "success";
        } catch (IOException e) {
            logger.error("An error occurred");
            e.printStackTrace();
        }
        return null;
    }
    public static String load(String full_name) throws IOException {
       File file = new File("visitor_"+full_name.toLowerCase()+".txt") ;
    try {
        File myObj = new File("visitor_{MC}.txt");
        if (myObj.createNewFile()) {
            logger.error("File created: " + myObj.getName());
        } else{
            logger.error("File already exists.");
        }
        JavaFileManager myReader = null;
        myReader.close();
        return "Success";

    } catch (IOException e) {
        logger.error("An error occurred");
        e.printStackTrace();
    }
        return full_name;
    }
    }

