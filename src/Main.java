import java.util.*;

            public class Main {

                public static void main(String[] args) {
                    boolean runMachine = true;

                    Scanner scan = new Scanner(System.in);
                    String input;

                    //strings voor de vragen
                    String[] commandos0 = {"ja","nee","sans"}; //Wil je iets eten/drinken?
                    String[] commandos1 = {"gezond","ongezond"}; //gezond of ongezond?
                    String[] commandosWarmKoud = {"warm","koud"}; //Warm of koud?


                    String[] commandosGezondWarm = {"vlees","groente"};
                    String[] commandosGezondKoud = {"fruit","salade"};
                    String[] commandosOngezondWarm = {"gebak","frituur"};
                    String[] commandosOngezondKoud = {"koek","snoep","ijs"};


                    String[] commandosGezondWarmVlees = {"biefstuk","varkensvlees","kip"};
                    String[] commandosGezondWarmGroente = {"wortels","doprerten","slabonen","snijbonen"};
                    String[] commandosGezondKoudFruit = {"appel","peer","druiven","sinasappel"};
                    String[] commandosGezondKoudSalade = {"1","2","3","4","5","6"};

                    String[] commandosOngezondWarmGebak = {"appeltaart","slagroomtaart","kwarktaart","glazuurtaart"};
                    String[] commandosOngezondWarmFrituur = {"frikandelbroodje","patat","kroket"};
                    String[] commandosOngezondKoudKoek = {"chocoladereep","speculaaskoek","gevulde koek","stroopwafel"};
                    String[] commandosOngezondKoudSnoep = {"lolly","zaksnoep","dropveter"};
                    String[] commandosOngezondKoudIjs = {"softijs1","softijs2","softijs5","softijs40"};


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

                    }
                    else if(input.equals(commandos1[1]))
                    {
                        System.out.println("Warm of koud ?");
                        commando1 = false;
                        commandoOngezond = true;

                    }
                }
            }
            while (commandoGezond)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(commandosWarmKoud[0]))
                    {
                        System.out.println("Vlees of Groente?");
                        commandoGezond = false;
                        commandoGezondWarm = true;

                    }
                    else if (input.equals(commandosWarmKoud[1]))
                    {
                        System.out.println("Fruit of Salade?");
                        commandoGezond = false;
                        commandoGezondKoud = true;

                    }
                }
            }
            while (commandoOngezond)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(commandosWarmKoud[0]))
                    {
                        System.out.println("Gebak of Frituur?");
                        commandoOngezond = false;
                        commandoOngezondWarm = true;

                    }
                    else if (input.equals(commandosWarmKoud[1]))
                    {
                        System.out.println("Koek, Snoep of ijs?");
                        commandoOngezond = false;
                        commandoOngezondKoud = true;

                    }
                }
            }
            while (commandoGezondWarm)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(commandosGezondWarm[0]))
                    {
                        System.out.println("$5.00 Biefstuk\n" +
                                "$5.50 Varkensvlees\n" +
                                "$4.00 Kip");
                        commandoGezondWarm = false;
                        commandoGezondWarmVlees = true;
                    }
                    else if (input.equals(commandosGezondWarm[1]))
                    {
                        System.out.println("$3.00 Wortels\n" +
                                "$2.00 Dopwerten\n" +
                                "$2.50 Slabonen\n" +
                                "$2.50 Snijbonen");
                        commandoGezondWarm = false;
                        commandoGezondWarmGroente = true;
                    }
                }
            }
            while (commandoGezondKoud)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(commandosGezondKoud[0]))
                    {
                        System.out.println("$1.50 Appel\n" +
                                "$2.00 Peer\n" +
                                "$9.00 Tros druiven\n" +
                                "$2.50 sinasappel");
                        commandoGezondKoud = false;
                        commandoGezondKoudFruit = true;
                    }
                    else if (input.equals(commandosGezondKoud[1]))
                    {
                        System.out.println("Voer een nummer in:\n" +
                                "$6.00 (1) Zoete aardappel salade met avocado\n" +
                                "$5.00 (2) Mediterrane salade\n" +
                                "$8.50 (3) Zalm salade met peultjes en avocado\n" +
                                "$4.50 (4) Watermeloen salade met feta\n" +
                                "$7.50 (5) Boekweitsalade");
                        commandoGezondKoud = false;
                        commandoGezondKoudSalade = true;
                    }
                }
            }
            while (commandoOngezondWarm)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(commandosOngezondWarm[0]))
                    {
                        System.out.println("$12.00 Appeltaart\n" +
                                "$8.00 Slagroomtaart\n" +
                                "$4.50 Kwarktaart\n" +
                                "$20.00 Glazuurtaart");
                        commandoOngezondWarm = false;
                        commandoOngezondWarmGebak = true;
                    }
                    else if (input.equals(commandosOngezondWarm[1]))
                    {
                        System.out.println("$1.00 F R I K A N D E L B R O O D J E\n" +
                                "$3.00 Patat\n" +
                                "$1.50 Kroket");
                        commandoOngezondWarm = false;
                        commandoOngezondWarmFrituur = true;
                    }
                }
            }
            while (commandoOngezondKoud)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(commandosOngezondKoud[0]))
                    {
                        System.out.println("$2.50 Chocoladereep\n" +
                                "$5.00 Speculaaskoek\n" +
                                "$2.50 Gevulde koek\n" +
                                "$2.00 Stroopwafel");
                        commandoOngezondKoud = false;
                        commandoOngezondKoudKoek = true;
                    }
                    else if (input.equals(commandosOngezondKoud[1]))
                    {
                        System.out.println("$0.50 Lolly\n" +
                                "$15.00 (Zaksnoep) Zak vol met willekeurig snoep\n" +
                                "$0.50 Dropveter");
                        commandoOngezondKoud = false;
                        commandoOngezondKoudSnoep = true;
                    }
                    else if (input.equals(commandosOngezondKoud[2]))
                    {
                        System.out.println("$1.00 Waterijsje\n" +
                                "$3.00 (Softijs1) Softijsje met 1 bolletje\n" +
                                "$5.00 (Softijs2) Softijsje met 2 bolletjes\n" +
                                "$10.00 (Softijs5) Softijsje met 5 bolletjes\n" +
                                "$50.00 (Softijs40) Softijsbak met 40 bolletjes");
                        commandoOngezondKoud = false;
                        commandoOngezondKoudIjs = true;
                    }
                }
            }
            while (commandoGezondWarmVlees)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(1commandos[0]))
                    {
                        System.out.println("");
                    }
                }
            }
            while (commandoGezondWarmGroente)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(2commandos[0]))
                    {
                        System.out.println("");
                    }
                }
            }
            while (commandoGezondKoudFruit)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(3commandos[0]))
                    {
                        System.out.println("");
                    }
                }
            }
            while (commandoGezondKoudSalade)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(4commandos[0]))
                    {
                        System.out.println("");
                    }
                }
            }
            while (commandoOngezondWarmGebak)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(5commandos[0]))
                    {
                        System.out.println("");
                    }
                }
            }
            while (commandoOngezondWarmFrituur)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(6commandos[0]))
                    {
                        System.out.println("");
                    }
                }
            }
            while (commandoOngezondKoudKoek)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(7commandos[0]))
                    {
                        System.out.println("");
                    }
                }
            }
            while (commandoOngezondKoudSnoep)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(8commandos[0]))
                    {
                        System.out.println("");
                    }
                }
            }
            while (commandoOngezondKoudIjs)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(9commandos[0]))
                    {
                        System.out.println("");
                    }
                }
            }
        }
        }
}