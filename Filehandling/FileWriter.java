import java.io.*;


public class filewriter {
    public static void main(String[]args)throws IOException {
      FileWriter writer=new FileWriter("./out/a.txt",true);
//              writer.write("Hi welcome to the java\n");
//       writer.append("intellij IDE");
//       writer.close();
        BufferedWriter Writefile =new BufferedWriter(writer);
        Writefile.write("Hi welcome to the java\n");
        Writefile.write("intellij IDE");
        Writefile.close();
////output stream writer
//        try {
//            OutputStream outputStream = new FileOutputStream("./out/a.txt");
//            Writer outputStreamWriter = new OutputStreamWriter(outputStream);
//
//            outputStreamWriter.write("Hello World");
//
//            outputStreamWriter.close();
//        }
//        catch (Exception e) {
//            e.getMessage();
//        }
    }

}



//FileWriter writes directly into Files and should be used only when the number of writes is less.
// BufferedWriter: BufferedWriter is almost similar to FileWriter but it uses internal buffer to write data into File.
// So if the number of write operations is more, the actual IO operations are less and performance is better
