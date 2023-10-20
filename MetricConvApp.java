import java.util.*;
public class MetricConvApp {

    static void welcome() {
        System.out.println("\n  Hello and thank you for choosing my app for your metric conversions!\nBelow you'll find rules to this app.\nAn example would be when to exit input or what is not considered an input.\n ");

        System.out.println("\nRules:\n-No special Characters\n-Input can be a decimal number\n-To exit type EXIT at any time");
    }

    public static void main(String[] args) {
        welcome();

        Scanner scanner = new Scanner(System.in);
        String start;

        do {
            System.out.println("To start please type 'Start'.\n");
            start = scanner.nextLine();

            if (start.equals("START")) {
                String letter;

                do {
                    System.out.println("\nWhich conversion do you want to perform? (Type letter for the choice of conversion)\nA. Celsius to Fahrenheit\nB. Fahrenheit to Celsius\nC. Kilograms to Pounds\nD. Pounds to Kilograms\n");
                    letter = scanner.nextLine();

                    switch (letter.toUpperCase()) {
                        case "A":
                            Scanner newscanner1 = new Scanner(System.in);

                            System.out.println("\nEnter Degree(s) in Celsius:\n");

                            float cel = newscanner1.nextFloat();

                            float farh = cel * 9 / 5 + 32;

                            System.out.println("Conversion is " + farh + "Fahrenheit\n");

                            break;

                        case "B":
                            Scanner newscanner2 = new Scanner(System.in);
                            System.out.println("\nEnter Degres(s) in Fahrenheit:\n");

                            float farh2 = newscanner2.nextFloat();


                            float cel2 = ((farh2 - 32) * 5) / 9;

                            System.out.println("Conversion is " + cel2 + "Celsius\n");
                            break;

                        case "C":
                            Scanner newscanner3 = new Scanner(System.in);
                            System.out.println("\nEnter Kilogram(s):\n");

                            float kilo = newscanner3.nextFloat();
                            float pou = kilo * (float) 2.205;

                            System.out.println("Conversion is " + pou + "Pounds\n");
                            break;

                        case "D":
                            Scanner newscanner4 = new Scanner(System.in);
                            System.out.println("\nEnter Pounds(s)):\n");

                            float pou2 = newscanner4.nextFloat();


                            float kilo2 = pou2 / (float) 2.205;

                            System.out.println("Conversion is " + kilo2 + "Kilograms\n");

                            break;  

                        case "EXIT":
                            
                             break;
                        
                        default:
                            System.out.println(letter + " is not a valid entry! Entry needs to be a A,B,C, D or EXIT!");

                            break;


                    }

                } while (!letter.equalsIgnoreCase("EXIT"));
                scanner.close();


            }
            if(start.equals("EXIT")){
                break;
            }
            
            else {
                break;
            }

        } while (!start.equalsIgnoreCase("EXIT"));
         System.out.println("Thanks for trying my app, have a nice day!");
        scanner.close();
    }
}


    

    

