package com.company;
import java.io.*;
import java.util.Scanner;
public class CurrencyConvertor
{
    public static void main(String args[]) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        FileWriter writer=new FileWriter("./out/log.txt",true);
        System.out.println("Type 1 for Rupee to Dollar conversion ");
        System.out.println("Type 2 for Dollar to Rupee conversion ");
        System.out.println("Type 3 for Rupee to Euro conversion");
        System.out.println("Type 4 for Dollar to Euro conversion ");
        System.out.println("Type 5 for Euro to Rupee conversion ");
        writer.write("Program Started\n");
        writer.write("Type 1 for Rupee to Dollar conversion: \n");
        writer.write("Type 2 for Dollar to Rupee conversion: \n");
        writer.write("Type 3 for Rupee to Euro conversion: \n");
        writer.write("Type 4 for Dollar to Euro conversion: \n");
        writer.write("Type 5 for Euro to Rupee conversion: \n");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();
        writer.write("User Selected Choice :"+ String.valueOf(choice) + "\n");
        if(choice<=0) {
            throw new ArithmeticException("Please Enter Greater Than Zero");
        }
        else {
            switch (choice) {
                case 1:
                    System.out.print("Enter rupee amount: ");
                    double rupee = in.nextDouble();
                    if(rupee<=0) {
                        throw new ArithmeticException("Please Enter Greater Than Zero");
                    }
                    writer.write("user Given Inr :" +String.valueOf(rupee) + "\n");
                    double dollar = rupee / 76.05;
                    double dollarRoundOff = Math.round(dollar * 100.0) / 100.0;
                    writer.write("dollar Output :" +String.valueOf(dollarRoundOff) + "\n");
                    System.out.println(rupee + " rupees => " + dollarRoundOff + " dollars");
                    System.out.println("Do you wish to continue(y/n)?");
                    s = br.readLine();
                    if (s.equals("n")) {
                        writer.write("Do you wish to continue : n ->Break\n");
                        break;
                    }
                    writer.write("Do you wish to continue : y ->Continue\n");
                case 2:
                    System.out.print("Enter dollar amount: ");
                    double dollar1 = in.nextDouble();
                    if(dollar1<=0) {
                        throw new ArithmeticException("Please Enter Greater Than Zero");
                    }
                    writer.write("user Given Dollar: " +String.valueOf(dollar1) + "\n");
                    double rupee1 = dollar1 * 76.05;
                    double rupeeRoundOff = Math.round(rupee1 * 100.0) / 100.0;
                    writer.write("rupee Output:" +String.valueOf(rupeeRoundOff) + "\n");
                    System.out.println(dollar1 + " dollars => " + rupeeRoundOff + " rupees");
                    System.out.println("Do you wish to continue(y/n)?");
                    s = br.readLine();
                    if (s.equals("n")) {
                        writer.write("Do you wish to continue : N -> Break\n");
                        break;
                    }
                    writer.write("Do you wish to continue : y -> Continue\n");
                case 3:
                    System.out.print("Enter rupee amount: ");
                    double rupee2 = in.nextDouble();
                    if(rupee2<=0) {
                        throw new ArithmeticException("Please Enter Greater Than Zero");
                    }
                    writer.write("user Given Inr: " +String.valueOf(rupee2) + "\n");
                    double euro = rupee2 / 80;
                    double euroRoundOff = Math.round(euro * 100.0) / 100.0;
                    writer.write("euro Output :"+ String.valueOf(euroRoundOff) + "\n");
                    System.out.println(rupee2 + " rupees => " + euroRoundOff + " euros");
                    System.out.println("Do you wish to continue(y/n)?");
                    s = br.readLine();
                    if (s.equals("n")) {
                        writer.write("Do you wish to continue : N ->Break\n");
                        break;
                    }
                    writer.write("Do you wish to continue : y ->Continue\n");
                case 4:
                    System.out.print("Enter dollar amount: ");
                    double dollar3 = in.nextDouble();
                    if(dollar3<=0) {
                        throw new ArithmeticException("Please Enter Greater Than Zero");
                    }
                    writer.write("user Given Dollar: " +String.valueOf(dollar3) + "\n");
                    double euro2 = dollar3 / 200;
                    double euro2RoundOff = Math.round(euro2 * 100.0) / 100.0;
                    writer.write("euro Output:"+ String.valueOf(euro2RoundOff) + "\n");
                    System.out.println(dollar3 + " dollars => " + euro2RoundOff + " euros");
                    System.out.println("Do you wish to continue(y/n)?");
                    s = br.readLine();
                    if (s.equals("n")) {
                        writer.write("Do you wish to continue : N ->Break\n");
                        break;
                    }
                    writer.write("Do you wish to continue : y ->Continue\n");
                case 5:
                    System.out.print("Enter euro amount: ");
                    double euro1 = in.nextDouble();
                    if(euro1<=0) {
                        throw new ArithmeticException("Please Enter Greater Than Zero");
                    }
                    writer.write("user Selected Euro: " +String.valueOf(euro1) + "\n");
                    double rupee3 = euro1 * 80;
                    double rupee3RoundOff = Math.round(rupee3 * 100.0) / 100.0;
                    writer.write("rupee Output:"+ String.valueOf(rupee3RoundOff) + "\n");
                    System.out.println(euro1 + " euros => " + rupee3RoundOff + " rupees");
                    writer.write("Break\n");
                    break;

                default:
                    System.out.println("Incorrect Choice");
            }
        }
        writer.write("End of the implementation\n");
        writer.write("=======================================================================================\n");
        writer.close();


    }
}