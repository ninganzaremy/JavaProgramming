package date;
//Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WriteTime {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
