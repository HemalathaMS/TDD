import java.io.*;

public class LeapYear {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("negativeCases.txt");   
        BufferedReader bufferedReader = new BufferedReader(fileReader);    
        String fileContent = "";
        int year = 0;
        while(!(fileContent = bufferedReader.readLine()).equals("STOP")) {
            System.out.println(fileContent);
            year = Integer.parseInt(fileContent);
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && year % 4000 != 0)) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not Leap Year");
            }
        }
        bufferedReader.close();
        fileReader.close();
    }
}
