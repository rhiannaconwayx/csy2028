import java.io.*;
import java.util.Scanner;
/**
 This program reads a series of numbers from a file and
 accumulates their sum.
*/
public class PrintFullTime
{
 public static void main(String[] args) throws IOException
{
 File file = new File("FTLecturers.txt");
 Scanner inputFile = new Scanner(file);
 while (inputFile.hasNext())
 inputFile.close();
 System.out.println("");
}
}
