
public class Constants {
public static void main(String[] args) {
    // final double CM_PER_INCH = 2.54;
Constants2 cons = new Constants2();
double paperWidth = 8.5;
double paperHeight = 11;
System.out.println("Paper size in centimeters: " +
paperWidth * cons.CM_PER_INCH + " by " + paperHeight *
cons.CM_PER_INCH);
}
}