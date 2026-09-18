/**
 * Template for converting from another language to Java. 
 * 
 * @author Ian Ludden
 */
public class ConvertToJava {

    public static void main(String[] args) {
        // Create myFunction as a static function in this same class, adding/modifying parameters/arguments as needed. 
        // Example: 
         celsiusToFahrenheit(25.0); // Modify this to test your function.
//
//         or, if you want to return and print some value:
//         [datatype] result = myFunction([arguments]);
//         System.out.println(result);
    }

    // DONE: Add your converted function here.
    public static void celsiusToFahrenheit(double celsius) {
        double fahr = celsius * 9.0 / 5 + 32;
        System.out.printf("%.1f C = %.1f F%n", celsius, fahr);
    }

    // === EXAMPLE ===
    // Python version: 
    // def celsiusToFahrenheit(celsius: float) -> None:
    //   fahr = celsius * 9.0 / 5 + 32
    //   print("{0:.1f} C = {1:.1f} F".format(celsius, fahr))
    // 
    // Java version: 
    // /**
    //  * Convert Celsius to Fahrenheit and print result
    //  * @param celsius - temperature in Celsius
    //  */
    // public static void myFunction(double celsius) {
    //     double fahr; // temp in fahrenheit
    //     String str;
    //     fahr = celsius * 9.0 / 5 + 32;
    //     str = String.format("%.1f C = %.1f F\n", celsius, fahr);
    //     System.out.println(str);
    // } 
}
