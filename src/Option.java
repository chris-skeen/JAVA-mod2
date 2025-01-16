import java.util.ArrayList;
import java.util.Scanner;

// THIS PAGE WILL HANDLE INPUTS AND CALLING CONVERTER.
public class Option extends Convert {
//    Collecting Input and converting it.

    static ArrayList<String> conversions = new ArrayList<String>();

    public static void addOptions(){
        conversions.add("Peso");
        conversions.add("Euro");
        conversions.add("Yen");
        conversions.add("Pound");
        conversions.add("Won");
        conversions.add("Custom");
    }

    public static void addNewOption(String newOption){
        conversions.add(newOption);
    }


    public static String getOption() {
        double result = 0;


        System.out.println("Enter option (by number): ");

        for(int i = 0; i < conversions.size(); i++) {
            int counter = i + 1;
            System.out.println(counter + ". " + conversions.get(i));
        }
        Scanner scannerOption = new Scanner(System.in);
        String option = scannerOption.nextLine();

        switch (option) {
            case "1" -> {
                try {
                    System.out.println("Enter amount (USD): ");
                    Scanner scannerDollar = new Scanner(System.in);
                    int dollar = scannerDollar.nextInt();
                    double conversionNumber = usd2Peso(dollar);
                    return "Your conversion is ₱" + conversionNumber + " peso's!";
                } catch (Exception e) {
                    return "Invalid Conversion!";
                }


            }
            case "2" -> {
                try {
                    System.out.println("Enter amount (USD): ");
                    Scanner scannerDollar = new Scanner(System.in);
                    int dollar = scannerDollar.nextInt();
                    double conversionNumber = usd2Euro(dollar);
                    return "Your conversion is €" + conversionNumber + " euro's!";
                } catch (Exception e) {
                    return "Invalid Conversion!";
                }


            }
            case "3" -> {
                try {
                    System.out.println("Enter amount (USD): ");
                    Scanner scannerDollar = new Scanner(System.in);
                    int dollar = scannerDollar.nextInt();
                    double conversionNumber = usd2Yen(dollar);
                    return "Your conversion is ¥" + conversionNumber + " yen!";
                } catch (Exception e) {
                    return "Invalid Conversion!";
                }
            }
            case "4" -> {
                try {
                    System.out.println("Enter amount (USD): ");
                    Scanner scannerDollar = new Scanner(System.in);
                    int dollar = scannerDollar.nextInt();
                    double conversionNumber = usd2Pound(dollar);
                    return "Your conversion is £" + conversionNumber + " pounds!";
                } catch (Exception e) {
                    return "Invalid Conversion!";
                }
            }
            case "5" -> {

                try {
                    System.out.println("Enter amount (USD): ");
                    Scanner scannerDollar = new Scanner(System.in);
                    int dollar = scannerDollar.nextInt();
                    double conversionNumber = usd2Won(dollar);
                    return "Your conversion is ₩" + conversionNumber + " won!";
                } catch (Exception e) {
                    return "Invalid Conversion!";
                }
            }
            case "6" -> {
                try {
                    System.out.println("New Conversion Method?");
                    Scanner scannerNewOption = new Scanner(System.in);
                    String newOption = scannerNewOption.nextLine();
                    addNewOption(newOption);

                    System.out.println("What is the conversion multiplier (from USD)?");
                    Scanner scannerMultiplier = new Scanner(System.in);
                    double multiplier = scannerMultiplier.nextDouble();

                    System.out.println("Enter amount (USD): ");
                    Scanner scannerDollar = new Scanner(System.in);
                    int dollar = scannerDollar.nextInt();
                    return "Your conversion is ¤" + dollar * multiplier + " " + newOption + "!";
                } catch (Exception e) {
                    return "Invalid Conversion!";
                }

            }
            default -> {
                return "Invalid Conversion!";
            }
        }
    }
}
