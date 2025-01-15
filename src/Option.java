import java.util.Scanner;
// THIS PAGE WILL HANDLE INPUTS AND CALLING CONVERTER.
public class Option extends Convert {
//    Collecting Input and converting it.

    static String[] conversions = {"Peso", "Euro", "Yen", "Pound"};

    public static String getOption() {
        Convert convert = new Convert();
        double result = 0;



        System.out.println("Enter option (by number): ");

        for(String conversion : conversions) {
            int counter = 0;
            counter += 1;
            System.out.println(counter + ". " + conversion);
        }
        Scanner scannerOption = new Scanner(System.in);
        String option = scannerOption.nextLine();

        if(option.equals("Peso")) {

            System.out.println("Enter amount (USD): ");
            Scanner scannerDollar = new Scanner(System.in);
            int dollar = scannerDollar.nextInt();
            conversionNumber = convert.usd2Peso(dollar);
            String finalOutput = "Your conversion is $" + conversionNumber + " peso's!";


        } else if(option.equals("Euro")) {

            System.out.println("Enter amount (USD): ");
            Scanner scannerDollar = new Scanner(System.in);
            int dollar = scannerDollar.nextInt();
            conversionNumber = convert.usd2Euro(dollar);
            String finalOutput = "Your conversion is $" + convesionNumber + " euro's";

        } else if (option.equals("Yen")) {

            System.out.println("Enter amount (USD): ");
            Scanner scannerDollar = new Scanner(System.in);
            int dollar = scannerDollar.nextInt();
            conversionNumber = convert.usd2Yen(dollar);

        }
        return finalOutput;
    }
}
