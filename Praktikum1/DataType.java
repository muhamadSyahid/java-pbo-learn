
import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();

        String s;

        for (int i = 0; i < t; i++) {
            s = scanner.nextLine();
            boolean isLong = isItLong(s);
            
            if (!isLong) {
                System.out.println(s + " can't be fitted anywhere.");
                continue;
            }

            boolean isInt = isItInt(s);
            boolean isShort = isItShort(s);
            boolean isByte = isItByte(s);


            System.out.println(s + " can be fitted in:");
            if (isByte) System.out.println(" * byte");
            if (isShort) System.out.println(" * short");
            if (isInt) System.out.println(" * int");
            if (isLong) System.out.println(" * long");
        }
    }
    
    private static boolean isItLong(String s) {
        try {
            Long.parseLong(s);
            return true;
        } catch (Exception _) {
            return false;
        }
    }
    
    private static boolean isItInt(String s) {
        return Math.abs(Long.parseLong(s)) > Integer.MAX_VALUE ? false : true;
    }
    private static boolean isItShort(String s) {
        return Math.abs(Long.parseLong(s)) > Short.MAX_VALUE ? false : true;
    }
    private static boolean isItByte(String s) {
        return Math.abs(Long.parseLong(s)) > Byte.MAX_VALUE ? false : true;
    }
}