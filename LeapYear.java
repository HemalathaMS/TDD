import java.io.*;

public class LeapYear {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("negativeCases.txt");   
        BufferedReader bufferedReader = new BufferedReader(fileReader);    
        String fileContent = "";
        int year = 0;
        boolean isLeapYear = true;
        while(!(fileContent = bufferedReader.readLine()).equals("STOP")) {
            System.out.println(fileContent);
            year = Integer.parseInt(fileContent);
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeapYear = true;
                    } else {
                        isLeapYear = false;
                    }
                } else {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = false;
            }
            if (isLeapYear) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not Leap Year");
            }
        }
        bufferedReader.close();
        fileReader.close();
    }
}
