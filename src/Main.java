import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 Task ---------------------------------------------------------------------

        String light = new Scanner(System.in).nextLine();


        switch (light) {
            case "red" -> System.out.println("Dayanin");
            case "yellow" -> System.out.println("Hazirlasin");
            case "green" -> System.out.println("Hereket edin");
        }

        // 2 Task ---------------------------------------------------------------------

        System.out.println("Using this keyword : AZN, USD, EUR ");

        System.out.print("Hazirki pul vahidini daxil edin : ");
        String currency = new Scanner(System.in).nextLine();

        System.out.print("Cevirmek istediyiniz valyutani daxil edin : ");
        String targetCurrency = new Scanner(System.in).nextLine();


        System.out.print("Ne qeder pul deyismek cevirmek isteyirsiniz : ");
        double amount = scanner.nextDouble();

        double oneAznToUsd = 0.5882;
        double oneAznToEuro = 0.5425;
        double oneUSDToAZN = 1.70;
        double oneEuroToAzn = 1.85;
        double oneUsdToEuro = 0.92;
        double oneEuroToUsd = 1.09;

        switch (currency) {
            case "AZN":
                switch (targetCurrency) {
                    case "USD":
                        System.out.println(amount * oneAznToUsd);
                        break;
                    case "EUR":
                        System.out.println(amount * oneAznToEuro);
                        break;

                }
                break;

            case "USD":
                switch (targetCurrency) {
                    case "EUR":
                        System.out.println(amount * oneUsdToEuro);
                        break;
                    case "AZN":
                        System.out.println(amount * oneUSDToAZN);
                        break;

                }
                break;

            case "EUR":
                switch (targetCurrency) {
                    case "USD":
                        System.out.println(amount * oneEuroToUsd);
                        break;
                    case "AZN":
                        System.out.println(amount * oneEuroToAzn);
                        break;

                }
                break;

        }
    }
}