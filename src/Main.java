import java.util.*;

public class Main {

    public static void main(String[] args) {
        boolean runMachine = true;

        Scanner scan = new Scanner(System.in);
        String input = "";

        String[] commandos0 = {"ja","nee","sans"}; //Wil je iets eten/drinken?
        String[] commandos1 = {"gezond","ongezond"}; //gezond of ongezond?

        while (runMachine) //als de machine aanstaat
        {
            System.out.println("Wil je iets eten?");
            //opgeslagen commando dingen nummers staan voor opties
            boolean commando0 = false; //commando 01 is niet nodig omdat het de eerste optie is
            //als het nee is eindigt het programma dus ja is de enigste optie

            //ja/gezond of ongezond
            boolean commando1 = false;

            //ja/gezond/warm of koud
            boolean commando100 = false;
            boolean commando101 = false;

            //ja/ongezond/warm of koud
            boolean commando110 = false;
            boolean commando111 = false;

            //ja/gezond/warm/groente of vlees
            boolean commando1000 = false;
            boolean commando1001 = false;

            //ja/gezond/koud/fruit of salade
            boolean commando1010 = false;
            boolean commando1011 = false;

            //ja/ongezond/warm/gebak of frituur
            boolean commando1100 = false;
            boolean commando1101 = false;

            //ja/ongezond/koud/koek of snoep
            boolean commando1110 = false;
            boolean commando1111 = false;

            while (commando0 == false)
            {
                input = scan.nextLine();
                input = input.toLowerCase();

                {
                    if (input.equals(commandos0[0]))
                    {
                        System.out.println("Gezond of Ongezond?");
                        commando0 = true;
                        commando1 = true;
                        break;
                    }
                    else if (input.equals(commandos0[1]))
                    {
                        System.out.println("oke makker dan niet");
                        runMachine = false;
                        break;  //de break moet hier zodat als ik eerst "nee" doe dan lijkt hij niet veel te doen maar dat zet hij
                                //constant runMachine op false en kan het pas uitvoren als er een ander stuk code met een break; komt
                    }
                    else if (input.equals(commandos0[2])) //woo! het werkt!!! (0 = ja 1 = nee 3 = sans easter egg)
                    {
                        System.out.println("░░░░░░░░██████████████████\n" +
                                "░░░░████░░░░░░░░░░░░░░░░░░████\n" +
                                "░░██░░░░░░░░░░░░░░░░░░░░░░░░░░██\n" +
                                "░░██░░░░░░░░░░░░░░░░░░░░░░░░░░██\n" +
                                "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\n" +
                                "██░░░░░░░░░░░░░░░░░░░░██████░░░░██\n" +
                                "██░░░░░░░░░░░░░░░░░░░░██████░░░░██\n" +
                                "██░░░░██████░░░░██░░░░██████░░░░██\n" +
                                "░░██░░░░░░░░░░██████░░░░░░░░░░██\n" +
                                "████░░██░░░░░░░░░░░░░░░░░░██░░████\n" +
                                "██░░░░██████████████████████░░░░██\n" +
                                "██░░░░░░██░░██░░██░░██░░██░░░░░░██\n" +
                                "░░████░░░░██████████████░░░░████\n" +
                                "░░░░░░████░░░░░░░░░░░░░░████\n" +
                                "░░░░░░░░░░██████████████");
                        commando0 = true;
                        break;
                    }
                }

            }
        }
        }
}