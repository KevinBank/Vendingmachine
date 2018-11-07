import java.util.*;

public class Main {

    public static void main(String[] args) {
        boolean runMachine = true;

        Scanner scan = new Scanner(System.in);
        String input;

        //strings voor de vragen
        String[] commandos0 = {"ja","nee","sans"}; //Wil je iets eten/drinken?
        String[] commandos1 = {"gezond","ongezond"}; //gezond of ongezond?

        while (runMachine) //als de machine aanstaat
        {
            System.out.println("Wil je iets eten?");
            //opgeslagen commando dingen nummers staan voor opties
            boolean commando0 = false; //commando 01 is niet nodig omdat het de eerste optie is
            //als het nee is eindigt het programma dus ja is de enigste optie

            //ja/gezond of ongezond?
            boolean commando1 = false;


            //Gezond of ongezond?

            boolean commandoGezond = false;
            boolean commandoOngezond = false;


            //warm of koud

            boolean commandoGezondWarm = false;
            boolean commandoGezondKoud = false;

            boolean commandoOngezondWarm = false;
            boolean commandoOngezondKoud = false;


            //GEZOND
            //groente of vlees
            boolean commandoGezondWarmGroente = false;
            boolean commandoGezondWarmVlees = false;

            //fruit of salade
            boolean commandoGezondKoudFruit = false;
            boolean commandoGezondKoudSalade = false;

            //gebak of frituur
            boolean commandoOngezondWarmGebak = false;
            boolean commandoOngezondWarmFrituur = false;

            //Koek Snoep of Ijs?
            boolean commandoOngezondKoudKoek = false;
            boolean commandoOngezondKoudSnoep = false;
            boolean commandoOngezondKoudIjs = false;


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
            while (commando1)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(commandos1[0]))
                    {
                        System.out.println("Warm of koud?");
                        commando1 = false;
                        commandoGezond = true;
                        break;
                    }
                    else if(input.equals(commandos1[1]))
                    {
                        System.out.println("Warm of koud 2?");
                        commando1 = false;
                        commandoOngezond = true;
                        break;
                    }
                }
            }
            //..........
        }
        }
}