import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class MainFile {
 public static void main (String [] args) throws Exception {
     Visitor MC = new Visitor("MC", 22, LocalDate.now(), LocalDateTime.now(), "here we are", "Relow");

     MC.Save();

     MC.load("relow_malepa");
 }
}
