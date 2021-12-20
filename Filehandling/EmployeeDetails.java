import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class employeedetails {
    public static void main(String[]args)throws IOException {
        FileWriter writer=new FileWriter("./out/b.txt",true);
        writer.write("Name\tsalary\tjobtitle\n");
        writer.append("Nandhini\t50000\tdeveloper\n");
        writer.append("Shalini\t60000\tjr\n");
        writer.append("Sowmiya\t20000\ttester\n");
        writer.close();
        File file=new File("./out/b.txt");
        Scanner scan=new Scanner(file);
        while(scan.hasNextLine()){
            System.out.println((scan.nextLine()));
        }

    }
}
