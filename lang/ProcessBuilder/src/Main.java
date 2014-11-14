import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

   public static void main(String[] args) {

      // create a new list of arguments for our process
      List<String> list = new ArrayList<String>();
      list.add("gedit");

      // create a new list that contains a file to open with notepad
      List<String> list2 = new ArrayList<String>();
      list.add("text.txt");

      // create the process builder
      ProcessBuilder pb = new ProcessBuilder(list);

      // set the command list
      pb.command(list);

      // print the new command list
      System.out.println("" + pb.command());
ProcessBuilder processBuilder = new ProcessBuilder("ls");
   }
}

// http://www.tutorialspoint.com/java/lang/processbuilder_command_list.htm
