public class Main {

    public static void main(String[] args) {
        Option option = new Option();
        option.addOptions();
        while (true) {

            String result = option.getOption();
            if (result.equals("Invalid Conversion!")) {
                ;
            } else {
                System.out.println(result);
                break;
            }
        }
    }
}
