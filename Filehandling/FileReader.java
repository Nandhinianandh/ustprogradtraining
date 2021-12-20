import java.io.*;
public class filereader {
    public static void main(String[]args)throws IOException {
       FileReader reader=new FileReader("./out/a.txt");
       //System.out.println(reader.read());
//        BufferedReader Readfile =new BufferedReader(reader);
//        System.out.println(Readfile.readLine());
//        int file=reader.read();
//        while(file!=-1){
//            System.out.println((char)file);
//            file=reader.read();
//        }
        reader.close();

        //imputstreamreader
        InputStream inputStream       = new FileInputStream("./out/a.txt");
        Reader      inputStreamReader = new InputStreamReader(inputStream);

        int file = inputStreamReader.read();
        while(file!= -1){
            System.out.println((char)file);
            file = inputStreamReader.read();
        }

//        inputStreamReader.close();
    }
}


import java.io.*;
import java.util.*;
public class filestringreader {
    public static void main(String[] args) throws IOException {
       // BufferedReader BufferedWriter->As file reader and writer
        File file=new File("./out/a.txt");
        Scanner scan=new Scanner(file);
       // System.out.println(scan.nextLine());
        while(scan.hasNextLine()){
            System.out.println((scan.nextLine()));
        }


    }
}




//FileReader is used to read a file from a disk drive whereas BufferedReader is not bound to only reading files.
// It can be used to read data from any character stream.

//The Java InputStreamReader is often used to read characters from files
// (or network connections) where the bytes represents text.

//BufferedReader is much more efficient than FileReader in terms of performance.
// FileReader directly reads the data from the character stream that originates from a file.

//BufferedReader reads a couple of characters from the Input Stream and stores them in a buffer.
// InputStreamReader reads only one character from the input stream and the remaining characters still remain in the streams hence
// There is no buffer in this case.
//BufferedReader reads a couple of characters from the Input Stream and stores them in a buffer.
// InputStreamReader reads only one character from the input stream and the remaining characters still remain in
// the streams hence There is no buffer in this case.

