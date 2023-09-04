package box_10;

import java.util.ArrayList;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();

        int count = 0;
        if (!message.isEmpty()){
            count++;
            for(int i = 0; i < message.length(); i++){
                if (message.charAt(i) != ' '){
                    count++;
                } else if ((message.charAt(i) == ' ') && message.charAt(i - 1) != ' ') {

                }
            }
        }

        System.out.println(count);
    }
}
