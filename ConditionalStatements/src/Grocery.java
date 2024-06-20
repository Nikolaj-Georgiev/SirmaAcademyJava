import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        String city = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());
        double price = 0.0;

        switch (product) {
            case "tea": {
                switch (city) {
                    case "Sofia": {
                        price = quantity * 0.50;
                        break;
                    }
                    case "Plovdiv": {
                        price = quantity * 0.40;
                        break;
                    }
                    case "Varna": {
                        price = quantity * 0.45;
                        break;
                    }
                }
                break;
            }
            case "water": {
                switch (city) {
                    case "Sofia": {
                        price = quantity * 0.80;
                        break;
                    }
                    case "Plovdiv":
                    case "Varna": {
                        price = quantity * 0.70;
                        break;
                    }
                }
                break;
            }
            case "juice": {
                switch (city) {
                    case "Sofia": {
                        price = quantity * 1.20;
                        break;
                    }
                    case "Plovdiv": {
                        price = quantity * 1.15;
                        break;
                    }
                    case "Varna": {
                        price = quantity * 1.10;
                        break;
                    }
                }
                break;
            }
            case "sweets": {
                switch (city) {
                    case "Sofia": {
                        price = quantity * 1.45;
                        break;
                    }
                    case "Plovdiv": {
                        price = quantity * 1.30;
                        break;
                    }
                    case "Varna": {
                        price = quantity * 1.35;
                        break;
                    }
                }
                break;
            }
            case "chips": {
                switch (city) {
                    case "Sofia": {
                        price = quantity * 1.60;
                        break;
                    }
                    case "Plovdiv": {
                        price = quantity * 1.50;
                        break;
                    }
                    case "Varna": {
                        price = quantity * 1.55;
                        break;
                    }
                }

            }
        }
        System.out.printf("%.2f", price);
        sc.close();
    }
}
