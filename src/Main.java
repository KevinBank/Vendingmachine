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

                    //strings voor de items bij Gezond
                    String[] commandosGezondWarmVlees = {"biefstuk","varkensvlees","kip"};
                    String[] commandosGezondWarmGroente = {"wortels","doprerten","slabonen","snijbonen"};
                    String[] commandosGezondKoudFruit = {"appel","peer","druiven","sinasappel"};
                    String[] commandosGezondKoudSalade = {"1","2","3","4","5","6"};
                    //strings voor de items bij Ongezond
                    String[] commandosOngezondWarmGebak = {"appeltaart","slagroomtaart","kwarktaart","glazuurtaart"};
                    String[] commandosOngezondWarmFrituur = {"frikandelbroodje","patat","kroket"};
                    String[] commandosOngezondKoudKoek = {"chocoladekoek","speculaaskoek","gevulde koek","stroopwafel"};
                    String[] commandosOngezondKoudSnoep = {"lolly","zaksnoep","dropveter"};
                    String[] commandosOngezondKoudIjs = {"waterijsje","softijs1","softijs2","softijs5","softijs40"};

                    double money;
                    money = 80;

                    while (runMachine) //als de machine aanstaat
                    {
                        if (money <= 0)
                        {
                            System.out.println("Game over je bent blut!");
                            runMachine = false;
                            break;
                        }
                        System.out.println("\n" +
                                "WELKOM bij deze futuristische vending machine\n" +
                                "We noemen het Futuristisch omdat deze vending machine warm en koude dingen kan bewaren!\n" +
                                "Maar, hoe dan ook. Wil je iets eten?");
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

                        // for (int bla = 0; bla < commandosGezondKoud.length; bla++)
                        // {
                        //     if (input.equals(commandosGezondKoud[bla]))
                        //     {
                        //
                        //     }
                        // }

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
                                "$9.00 (Tros) druiven\n" +
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
                        System.out.println("$2.50 Chocoladekoek\n" +
                                "$5.00 Speculaaskoek\n" +
                                "$2.50 Gevulde koek\n" +
                                "$2.00 Stroopwafel");
                        commandoOngezondKoud = false;
                        commandoOngezondKoudKoek = true;
                    }
                    else if (input.equals(commandosOngezondKoud[1]))
                    {
                        System.out.println("$0.25 Lolly\n" +
                                "$15.00 ('Zaksnoep') Zak vol met willekeurig snoep\n" +
                                "$0.25 Dropveter");
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
            }//From here all ascii is used from http://patorjk.com/software/taag/#p=display&f=Calvin%20S&t=
            while (commandoGezondWarmVlees)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(commandosGezondWarmVlees[0])) //0 biefstuk 5 | 1 varkensvlees 5.5 | 2 kip 4
                    {
                        money = money - 5;
                        System.out.println("\n" +
                                "╔╗ ╦╔═╗╔═╗╔═╗╔╦╗╦ ╦╦╔═\n" +
                                "╠╩╗║║╣ ╠╣ ╚═╗ ║ ║ ║╠╩╗\n" +
                                "╚═╝╩╚═╝╚  ╚═╝ ╩ ╚═╝╩ ╩\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoGezondWarmVlees = false;
                    }
                    else if (input.equals(commandosGezondWarmVlees[1])) //0 biefstuk 5 | 1 varkensvlees 5.5 | 2 kip 4
                    {
                        money = money - 5.5;
                        System.out.println("\n" +
                                "╦  ╦╔═╗╦═╗╦╔═╔═╗╔╗╔╔═╗╦  ╦╦  ╔═╗╔═╗╔═╗\n" +
                                "╚╗╔╝╠═╣╠╦╝╠╩╗║╣ ║║║╚═╗╚╗╔╝║  ║╣ ║╣ ╚═╗\n" +
                                " ╚╝ ╩ ╩╩╚═╩ ╩╚═╝╝╚╝╚═╝ ╚╝ ╩═╝╚═╝╚═╝╚═╝\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoGezondWarmVlees = false;
                    }
                    else if (input.equals(commandosGezondWarmVlees[2])) //0 biefstuk 5 | 1 varkensvlees 5.5 | 2 kip 4
                    {
                        System.out.println("\n" +
                                "╦╔═╦╔═╗\n" +
                                "╠╩╗║╠═╝\n" +
                                "╩ ╩╩╩  \n" +
                                "Je hebt nog "+money+" credits over");
                        commandoGezondWarmVlees = false;
                    }
                }
            }
            while (commandoGezondWarmGroente)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(commandosGezondWarmGroente[0])) //0 wortels 3 | 1 dopwerten 2 | 2 slabonen 2.5 | 3 snijbonen 2.5
                    {
                        money = money - 3;
                        System.out.println("\n" +
                                "╦ ╦╔═╗╦═╗╔╦╗╔═╗╦  ╔═╗\n" +
                                "║║║║ ║╠╦╝ ║ ║╣ ║  ╚═╗\n" +
                                "╚╩╝╚═╝╩╚═ ╩ ╚═╝╩═╝╚═╝\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoGezondWarmGroente = false;
                    }
                    else if (input.equals(commandosGezondWarmGroente[1])) //0 wortels 3 | 1 dopwerten 2 | 2 slabonen 2.5 | 3 snijbonen 2.5
                    {
                        money = money - 2;
                        System.out.println("\n" +
                                "╔╦╗╔═╗╔═╗╦ ╦╔═╗╦═╗╔╦╗╔═╗╔╗╔\n" +
                                " ║║║ ║╠═╝║║║║╣ ╠╦╝ ║ ║╣ ║║║\n" +
                                "═╩╝╚═╝╩  ╚╩╝╚═╝╩╚═ ╩ ╚═╝╝╚╝\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoGezondWarmGroente = false;
                    }
                    else if (input.equals(commandosGezondWarmGroente[2])) //0 wortels 3 | 1 dopwerten 2 | 2 slabonen 2.5 | 3 snijbonen 2.5
                    {
                        money = money - 2.5;
                        System.out.println("\n" +
                                "╔═╗╦  ╔═╗╔╗ ╔═╗╔╗╔╔═╗╔╗╔\n" +
                                "╚═╗║  ╠═╣╠╩╗║ ║║║║║╣ ║║║\n" +
                                "╚═╝╩═╝╩ ╩╚═╝╚═╝╝╚╝╚═╝╝╚╝\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoGezondWarmGroente = false;
                    }
                    else if (input.equals(commandosGezondWarmGroente[3])) //0 wortels 3 | 1 dopwerten 2 | 2 slabonen 2.5 | 3 snijbonen 2.5
                    {
                        money = money - 2.5;
                        System.out.println("\n" +
                                "╔═╗╔╗╔╦ ╦╔╗ ╔═╗╔╗╔╔═╗╔╗╔\n" +
                                "╚═╗║║║║ ║╠╩╗║ ║║║║║╣ ║║║\n" +
                                "╚═╝╝╚╝╩╚╝╚═╝╚═╝╝╚╝╚═╝╝╚╝\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoGezondWarmGroente = false;
                    }
                }
            }
            while (commandoGezondKoudFruit)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(commandosGezondKoudFruit[0])) //0 appel 1.5 | 1 peer 2 | 2 druiven 9 | 3 sinasappel 2.5
                    {
                        money = money - 1.5;
                        System.out.println("\n" +
                                "╔═╗╔═╗╔═╗╔═╗╦  \n" +
                                "╠═╣╠═╝╠═╝║╣ ║  \n" +
                                "╩ ╩╩  ╩  ╚═╝╩═╝\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoGezondKoudFruit = false;
                    }
                    else if (input.equals(commandosGezondKoudFruit[1])) //0 appel 1.5 | 1 peer 2 | 2 druiven 9 | 3 sinasappel 2.5
                    {
                        money = money - 2;
                        System.out.println("\n" +
                                "╔═╗╔═╗╔═╗╦═╗\n" +
                                "╠═╝║╣ ║╣ ╠╦╝\n" +
                                "╩  ╚═╝╚═╝╩╚═\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoGezondKoudFruit = false;
                    }
                    else if (input.equals(commandosGezondKoudFruit[2])) //0 appel 1.5 | 1 peer 2 | 2 druiven 9 | 3 sinasappel 2.5
                    {
                        money = money - 9;
                        System.out.println("\n" +
                                "╔╦╗╦═╗╦ ╦╦╦  ╦╔═╗╔╗╔\n" +
                                " ║║╠╦╝║ ║║╚╗╔╝║╣ ║║║\n" +
                                "═╩╝╩╚═╚═╝╩ ╚╝ ╚═╝╝╚╝\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoGezondKoudFruit = false;
                    }
                    else if (input.equals(commandosGezondKoudFruit[3])) //0 appel 1.5 | 1 peer 2 | 2 druiven 9 | 3 sinasappel 2.5
                    {
                        money = money - 2.5;
                        System.out.println("\n" +
                                "╔═╗╦╔╗╔╔═╗╔═╗╔═╗╔═╗╔═╗╔═╗╦  \n" +
                                "╚═╗║║║║╠═╣╚═╗╠═╣╠═╝╠═╝║╣ ║  \n" +
                                "╚═╝╩╝╚╝╩ ╩╚═╝╩ ╩╩  ╩  ╚═╝╩═╝\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoGezondKoudFruit = false;
                    }
                }
            }
            while (commandoGezondKoudSalade)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(commandosGezondKoudSalade[0])) //0 (1) 6 | 1 (2) 5 | 2 (3) 8.5 | 3 (4) 4.5 | 4 (5) 7.5
                    {
                        money = money -6;
                        System.out.println("\n" +
                                "╔═╗╔═╗╔═╗╔╦╗╔═╗  ╔═╗╔═╗╦═╗╔╦╗╔═╗╔═╗╔═╗╔═╗╦    ╔═╗╔═╗╦  ╔═╗╔╦╗╔═╗  ╔╦╗╔═╗╔╦╗  ╔═╗╦  ╦╔═╗╔═╗╔═╗╔╦╗╔═╗\n" +
                                "╔═╝║ ║║╣  ║ ║╣   ╠═╣╠═╣╠╦╝ ║║╠═╣╠═╝╠═╝║╣ ║    ╚═╗╠═╣║  ╠═╣ ║║║╣   ║║║║╣  ║   ╠═╣╚╗╔╝║ ║║  ╠═╣ ║║║ ║\n" +
                                "╚═╝╚═╝╚═╝ ╩ ╚═╝  ╩ ╩╩ ╩╩╚══╩╝╩ ╩╩  ╩  ╚═╝╩═╝  ╚═╝╩ ╩╩═╝╩ ╩═╩╝╚═╝  ╩ ╩╚═╝ ╩   ╩ ╩ ╚╝ ╚═╝╚═╝╩ ╩═╩╝╚═╝\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoGezondKoudSalade = false;
                    }
                    else if (input.equals(commandosGezondKoudSalade[1])) //0 (1) 6 | 1 (2) 5 | 2 (3) 8.5 | 3 (4) 4.5 | 4 (5) 7.5
                    {
                        money = money -5;
                        System.out.println("\n" +
                                "╔╦╗╔═╗╔╦╗╦╔╦╗╔═╗╦═╗╦═╗╔═╗╔╗╔╔═╗  ╔═╗╔═╗╦  ╔═╗╔╦╗╔═╗\n" +
                                "║║║║╣  ║║║ ║ ║╣ ╠╦╝╠╦╝╠═╣║║║║╣   ╚═╗╠═╣║  ╠═╣ ║║║╣ \n" +
                                "╩ ╩╚═╝═╩╝╩ ╩ ╚═╝╩╚═╩╚═╩ ╩╝╚╝╚═╝  ╚═╝╩ ╩╩═╝╩ ╩═╩╝╚═╝\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoGezondKoudSalade = false;
                    }
                    else if (input.equals(commandosGezondKoudSalade[2])) //0 (1) 6 | 1 (2) 5 | 2 (3) 8.5 | 3 (4) 4.5 | 4 (5) 7.5
                    {
                        money = money -8.5;
                        System.out.println("\n" +
                                "╔═╗╔═╗╦  ╔╦╗  ╔═╗╔═╗╦  ╔═╗╔╦╗╔═╗  ╔╦╗╔═╗╔╦╗  ╔═╗╔═╗╦ ╦╦ ╔╦╗╦╔═╗╔═╗  ╔═╗╔╗╔  ╔═╗╦  ╦╔═╗╔═╗╔═╗╔╦╗╔═╗\n" +
                                "╔═╝╠═╣║  ║║║  ╚═╗╠═╣║  ╠═╣ ║║║╣   ║║║║╣  ║   ╠═╝║╣ ║ ║║  ║ ║║╣ ╚═╗  ║╣ ║║║  ╠═╣╚╗╔╝║ ║║  ╠═╣ ║║║ ║\n" +
                                "╚═╝╩ ╩╩═╝╩ ╩  ╚═╝╩ ╩╩═╝╩ ╩═╩╝╚═╝  ╩ ╩╚═╝ ╩   ╩  ╚═╝╚═╝╩═╝╩╚╝╚═╝╚═╝  ╚═╝╝╚╝  ╩ ╩ ╚╝ ╚═╝╚═╝╩ ╩═╩╝╚═╝\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoGezondKoudSalade = false;
                    }
                    else if (input.equals(commandosGezondKoudSalade[3])) //0 (1) 6 | 1 (2) 5 | 2 (3) 8.5 | 3 (4) 4.5 | 4 (5) 7.5
                    {
                        money = money -4.5;
                        System.out.println("\n" +
                                "╦ ╦╔═╗╔╦╗╔═╗╦═╗╔╦╗╔═╗╦  ╔═╗╔═╗╔╗╔  ╔═╗╔═╗╦  ╔═╗╔╦╗╔═╗  ╔╦╗╔═╗╔╦╗  ╔═╗╔═╗╔╦╗╔═╗\n" +
                                "║║║╠═╣ ║ ║╣ ╠╦╝║║║║╣ ║  ║ ║║╣ ║║║  ╚═╗╠═╣║  ╠═╣ ║║║╣   ║║║║╣  ║   ╠╣ ║╣  ║ ╠═╣\n" +
                                "╚╩╝╩ ╩ ╩ ╚═╝╩╚═╩ ╩╚═╝╩═╝╚═╝╚═╝╝╚╝  ╚═╝╩ ╩╩═╝╩ ╩═╩╝╚═╝  ╩ ╩╚═╝ ╩   ╚  ╚═╝ ╩ ╩ ╩\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoGezondKoudSalade = false;
                    }
                    else if (input.equals(commandosGezondKoudSalade[4])) //0 (1) 6 | 1 (2) 5 | 2 (3) 8.5 | 3 (4) 4.5 | 4 (5) 7.5
                    {
                        money = money -7.5;
                        System.out.println("\n" +
                                "╔╗ ╔═╗╔═╗╦╔═╦ ╦╔═╗╦╔╦╗╔═╗╔═╗╦  ╔═╗╔╦╗╔═╗\n" +
                                "╠╩╗║ ║║╣ ╠╩╗║║║║╣ ║ ║ ╚═╗╠═╣║  ╠═╣ ║║║╣ \n" +
                                "╚═╝╚═╝╚═╝╩ ╩╚╩╝╚═╝╩ ╩ ╚═╝╩ ╩╩═╝╩ ╩═╩╝╚═╝\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoGezondKoudSalade = false;
                    }
                }
            }
            while (commandoOngezondWarmGebak)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(commandosOngezondWarmGebak[0])) //0 appeltaart 12 | 1 slagroomtaart 8 | 2 kwarktaart 4.5 | 3 glazuurtaart 20
                    {
                        money = money - 12;
                        System.out.println("\n" +
                                "╔═╗╔═╗╔═╗╔═╗╦ ╔╦╗╔═╗╔═╗╦═╗╔╦╗\n" +
                                "╠═╣╠═╝╠═╝║╣ ║  ║ ╠═╣╠═╣╠╦╝ ║ \n" +
                                "╩ ╩╩  ╩  ╚═╝╩═╝╩ ╩ ╩╩ ╩╩╚═ ╩ \n" +
                                "Je hebt nog "+money+" credits over");
                        commandoOngezondWarmGebak = false;
                    }
                    else if (input.equals(commandosOngezondWarmGebak[1])) //0 appeltaart 12 | 1 slagroomtaart 8 | 2 kwarktaart 4.5 | 3 glazuurtaart 20
                    {
                        money = money - 8;
                        System.out.println("\n" +
                                "╔═╗╦  ╔═╗╔═╗╦═╗╔═╗╔═╗╔╦╗╔╦╗╔═╗╔═╗╦═╗╔╦╗\n" +
                                "╚═╗║  ╠═╣║ ╦╠╦╝║ ║║ ║║║║ ║ ╠═╣╠═╣╠╦╝ ║ \n" +
                                "╚═╝╩═╝╩ ╩╚═╝╩╚═╚═╝╚═╝╩ ╩ ╩ ╩ ╩╩ ╩╩╚═ ╩ \n" +
                                "Je hebt nog "+money+" credits over");
                        commandoOngezondWarmGebak = false;
                    }
                    else if (input.equals(commandosOngezondWarmGebak[2])) //0 appeltaart 12 | 1 slagroomtaart 8 | 2 kwarktaart 4.5 | 3 glazuurtaart 20
                    {
                        money = money - 4.5;
                        System.out.println("\n" +
                                "╦╔═╦ ╦╔═╗╦═╗╦╔═╔╦╗╔═╗╔═╗╦═╗╔╦╗\n" +
                                "╠╩╗║║║╠═╣╠╦╝╠╩╗ ║ ╠═╣╠═╣╠╦╝ ║ \n" +
                                "╩ ╩╚╩╝╩ ╩╩╚═╩ ╩ ╩ ╩ ╩╩ ╩╩╚═ ╩ \n" +
                                "Je hebt nog "+money+" credits over");
                        commandoOngezondWarmGebak = false;
                    }
                    else if (input.equals(commandosOngezondWarmGebak[3])) //0 appeltaart 12 | 1 slagroomtaart 8 | 2 kwarktaart 4.5 | 3 glazuurtaart 20
                    {
                        money = money - 20;
                        System.out.println("\n" +
                                "╔═╗╦  ╔═╗╔═╗╦ ╦╦ ╦╦═╗╔╦╗╔═╗╔═╗╦═╗╔╦╗\n" +
                                "║ ╦║  ╠═╣╔═╝║ ║║ ║╠╦╝ ║ ╠═╣╠═╣╠╦╝ ║ \n" +
                                "╚═╝╩═╝╩ ╩╚═╝╚═╝╚═╝╩╚═ ╩ ╩ ╩╩ ╩╩╚═ ╩ \n" +
                                "Je hebt nog "+money+" credits over");
                        commandoOngezondWarmGebak = false;
                    }
                }
            }
            while (commandoOngezondWarmFrituur)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(commandosOngezondWarmFrituur[0])) //0 frikandelbroodje 1 | 1 patat 3 | 2 kroket 1.5 |
                    {
                        money = money - 1;
                        System.out.println("\n" +
                                "╔═╗  ╦═╗  ╦  ╦╔═  ╔═╗  ╔╗╔  ╔╦╗  ╔═╗  ╦    ╔╗   ╦═╗  ╔═╗  ╔═╗  ╔╦╗   ╦  ╔═╗\n" +
                                "╠╣   ╠╦╝  ║  ╠╩╗  ╠═╣  ║║║   ║║  ║╣   ║    ╠╩╗  ╠╦╝  ║ ║  ║ ║   ║║   ║  ║╣ \n" +
                                "╚    ╩╚═  ╩  ╩ ╩  ╩ ╩  ╝╚╝  ═╩╝  ╚═╝  ╩═╝  ╚═╝  ╩╚═  ╚═╝  ╚═╝  ═╩╝  ╚╝  ╚═╝\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoOngezondWarmFrituur = false;
                    }
                    else if (input.equals(commandosOngezondWarmFrituur[1])) //0 frikandelbroodje 1 | 1 patat 3 | 2 kroket 1.5 |
                    {
                        money = money - 3;
                        System.out.println("\n" +
                                "╔═╗╔═╗╔╦╗╔═╗╔╦╗\n" +
                                "╠═╝╠═╣ ║ ╠═╣ ║ \n" +
                                "╩  ╩ ╩ ╩ ╩ ╩ ╩ \n" +
                                "Je hebt nog "+money+" credits over");
                        commandoOngezondWarmFrituur = false;
                    }
                    else if (input.equals(commandosOngezondWarmFrituur[2])) //0 frikandelbroodje 1 | 1 patat 3 | 2 kroket 1.5 |
                    {
                        money = money - 1.5;
                        System.out.println("\n" +
                                "╦╔═╦═╗╔═╗╦╔═╔═╗╔╦╗\n" +
                                "╠╩╗╠╦╝║ ║╠╩╗║╣  ║ \n" +
                                "╩ ╩╩╚═╚═╝╩ ╩╚═╝ ╩ \n" +
                                "Je hebt nog "+money+" credits over");
                        commandoOngezondWarmFrituur = false;
                    }
                }
            }
            while (commandoOngezondKoudKoek)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(commandosOngezondKoudKoek[0])) //0 chocoladekoek 2.5 | 1 speculaaskoek 5 | 2 gevulde koek 2.5 | 3 stroopwafel 2
                    {
                        money = money - 2.5;
                        System.out.println("\n" +
                                "╔═╗╦ ╦╔═╗╔═╗╔═╗╦  ╔═╗╔╦╗╔═╗╦╔═╔═╗╔═╗╦╔═\n" +
                                "║  ╠═╣║ ║║  ║ ║║  ╠═╣ ║║║╣ ╠╩╗║ ║║╣ ╠╩╗\n" +
                                "╚═╝╩ ╩╚═╝╚═╝╚═╝╩═╝╩ ╩═╩╝╚═╝╩ ╩╚═╝╚═╝╩ ╩\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoOngezondKoudKoek = false;
                    }
                    if (input.equals(commandosOngezondKoudKoek[1])) //0 chocoladekoek 2.5 | 1 speculaaskoek 5 | 2 gevulde koek 2.5 | 3 stroopwafel 2
                    {
                        money = money - 5;
                        System.out.println("\n" +
                                "╔═╗╔═╗╔═╗╔═╗╦ ╦╦  ╔═╗╔═╗╔═╗╦╔═╔═╗╔═╗╦╔═\n" +
                                "╚═╗╠═╝║╣ ║  ║ ║║  ╠═╣╠═╣╚═╗╠╩╗║ ║║╣ ╠╩╗\n" +
                                "╚═╝╩  ╚═╝╚═╝╚═╝╩═╝╩ ╩╩ ╩╚═╝╩ ╩╚═╝╚═╝╩ ╩\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoOngezondKoudKoek = false;
                    }
                    if (input.equals(commandosOngezondKoudKoek[2])) //0 chocoladekoek 2.5 | 1 speculaaskoek 5 | 2 gevulde koek 2.5 | 3 stroopwafel 2
                    {
                        money = money - 2.5;
                        System.out.println("\n" +
                                "╔═╗╔═╗╦  ╦╦ ╦╦  ╔╦╗╔═╗  ╦╔═╔═╗╔═╗╦╔═\n" +
                                "║ ╦║╣ ╚╗╔╝║ ║║   ║║║╣   ╠╩╗║ ║║╣ ╠╩╗\n" +
                                "╚═╝╚═╝ ╚╝ ╚═╝╩═╝═╩╝╚═╝  ╩ ╩╚═╝╚═╝╩ ╩\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoOngezondKoudKoek = false;
                    }
                    if (input.equals(commandosOngezondKoudKoek[3])) //0 chocoladekoek 2.5 | 1 speculaaskoek 5 | 2 gevulde koek 2.5 | 3 stroopwafel 2
                    {
                        money = money - 2;
                        System.out.println("\n" +
                                "╔═╗╔╦╗╦═╗╔═╗╔═╗╔═╗╦ ╦╔═╗╔═╗╔═╗╦  \n" +
                                "╚═╗ ║ ╠╦╝║ ║║ ║╠═╝║║║╠═╣╠╣ ║╣ ║  \n" +
                                "╚═╝ ╩ ╩╚═╚═╝╚═╝╩  ╚╩╝╩ ╩╚  ╚═╝╩═╝\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoOngezondKoudKoek = false;
                    }
                }
            }
            while (commandoOngezondKoudSnoep)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(commandosOngezondKoudSnoep[0])) //0 lolly 0.25 | 1 zaksnoep 15 | 2 dropveter 0.25
                    {
                        money = money - 0.25;
                        System.out.println("\n" +
                                "╦  ╔═╗╦  ╦ ╦ ╦\n" +
                                "║  ║ ║║  ║ ╚╦╝\n" +
                                "╩═╝╚═╝╩═╝╩═╝╩ \n" +
                                "Je hebt nog "+money+" credits over");
                        commandoOngezondKoudSnoep = false;
                    }
                    else if (input.equals(commandosOngezondKoudSnoep[1])) //0 lolly 0.25 | 1 zaksnoep 15 | 2 dropveter 0.25
                    {
                        money = money - 15;
                        System.out.println("\n" +
                                "╔═╗╔═╗╦╔═  ╔╦╗╔═╗╔╦╗  ╔═╗╔╗╔╔═╗╔═╗╔═╗\n" +
                                "╔═╝╠═╣╠╩╗  ║║║║╣  ║   ╚═╗║║║║ ║║╣ ╠═╝\n" +
                                "╚═╝╩ ╩╩ ╩  ╩ ╩╚═╝ ╩   ╚═╝╝╚╝╚═╝╚═╝╩  \n" +
                                "Je hebt nog "+money+" credits over");
                        commandoOngezondKoudSnoep = false;
                    }
                    else if (input.equals(commandosOngezondKoudSnoep[2])) //0 lolly 0.25 | 1 zaksnoep 15 | 2 dropveter 0.25
                    {
                        money = money - 0.25;
                        System.out.println("\n" +
                                "╔╦╗╦═╗╔═╗╔═╗╦  ╦╔═╗╔╦╗╔═╗╦═╗\n" +
                                " ║║╠╦╝║ ║╠═╝╚╗╔╝║╣  ║ ║╣ ╠╦╝\n" +
                                "═╩╝╩╚═╚═╝╩   ╚╝ ╚═╝ ╩ ╚═╝╩╚═\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoOngezondKoudSnoep = false;
                    }
                }
            }
            while (commandoOngezondKoudIjs)
            {
                input = scan.nextLine();
                input = input.toLowerCase();
                {
                    if (input.equals(commandosOngezondKoudIjs[0])) //0 waterijsje 1 | 1 softijs1 3 | 2 softijs2 5 | 3 softijs5 10 | 4 softijs40 50
                    {
                        money = money - 1;
                        System.out.println("\n" +
                                "╦ ╦╔═╗╔╦╗╔═╗╦═╗╦ ╦╔═╗ ╦╔═╗\n" +
                                "║║║╠═╣ ║ ║╣ ╠╦╝║ ║╚═╗ ║║╣ \n" +
                                "╚╩╝╩ ╩ ╩ ╚═╝╩╚═╩╚╝╚═╝╚╝╚═╝\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoOngezondKoudIjs = false;
                    }
                    if (input.equals(commandosOngezondKoudIjs[1])) //0 waterijsje 1 | 1 softijs1 3 | 2 softijs2 5 | 3 softijs5 10 | 4 softijs40 50
                    {
                        money = money - 3;
                        System.out.println("\n" +
                                "╔═╗╔═╗╔═╗╔╦╗╦ ╦╔═╗       ╔═╗╔═╗╔╗╔  ╔╗ ╔═╗╦  ╦  ╔═╗╔╦╗╦╔═╗\n" +
                                "╚═╗║ ║╠╣  ║ ║ ║╚═╗  ───  ║╣ ║╣ ║║║  ╠╩╗║ ║║  ║  ║╣  ║ ║║╣ \n" +
                                "╚═╝╚═╝╚   ╩ ╩╚╝╚═╝       ╚═╝╚═╝╝╚╝  ╚═╝╚═╝╩═╝╩═╝╚═╝ ╩╚╝╚═╝\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoOngezondKoudIjs = false;
                    }
                    else if (input.equals(commandosOngezondKoudIjs[2])) //0 waterijsje 1 | 1 softijs1 3 | 2 softijs2 5 | 3 softijs5 10 | 4 softijs40 50
                    {
                        money = money - 5;
                        System.out.println("\n" +
                                "╔═╗╔═╗╔═╗╔╦╗╦ ╦╔═╗       ╔╦╗╦ ╦╔═╗╔═╗  ╔╗ ╔═╗╦  ╦  ╔═╗╔╦╗╦╔═╗╔═╗\n" +
                                "╚═╗║ ║╠╣  ║ ║ ║╚═╗  ───   ║ ║║║║╣ ║╣   ╠╩╗║ ║║  ║  ║╣  ║ ║║╣ ╚═╗\n" +
                                "╚═╝╚═╝╚   ╩ ╩╚╝╚═╝        ╩ ╚╩╝╚═╝╚═╝  ╚═╝╚═╝╩═╝╩═╝╚═╝ ╩╚╝╚═╝╚═╝\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoOngezondKoudIjs = false;
                    }
                    else if (input.equals(commandosOngezondKoudIjs[3])) //0 waterijsje 1 | 1 softijs1 3 | 2 softijs2 5 | 3 softijs5 10 | 4 softijs40 50
                    {
                        money = money - 10;
                        System.out.println("\n" +
                                "╔═╗╔═╗╔═╗╔╦╗╦ ╦╔═╗       ╦  ╦╦ ╦╔═╗  ╔╗ ╔═╗╦  ╦  ╔═╗╔╦╗╦╔═╗╔═╗\n" +
                                "╚═╗║ ║╠╣  ║ ║ ║╚═╗  ───  ╚╗╔╝║ ║╠╣   ╠╩╗║ ║║  ║  ║╣  ║ ║║╣ ╚═╗\n" +
                                "╚═╝╚═╝╚   ╩ ╩╚╝╚═╝        ╚╝ ╩╚╝╚    ╚═╝╚═╝╩═╝╩═╝╚═╝ ╩╚╝╚═╝╚═╝\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoOngezondKoudIjs = false;
                    }
                    else if (input.equals(commandosOngezondKoudIjs[4])) //0 waterijsje 1 | 1 softijs1 3 | 2 softijs2 5 | 3 softijs5 10 | 4 softijs40 50
                    {
                        money = money - 50;
                        System.out.println("\n" +
                                "╔═╗╔═╗╔═╗╔╦╗╦ ╦╔═╗       ╦  ╦╔═╗╔═╗╦═╗╔╦╗╦╔═╗  ╔╗ ╔═╗╦  ╦  ╔═╗╔╦╗╦╔═╗╔═╗\n" +
                                "╚═╗║ ║╠╣  ║ ║ ║╚═╗  ───  ╚╗╔╝║╣ ║╣ ╠╦╝ ║ ║║ ╦  ╠╩╗║ ║║  ║  ║╣  ║ ║║╣ ╚═╗\n" +
                                "╚═╝╚═╝╚   ╩ ╩╚╝╚═╝        ╚╝ ╚═╝╚═╝╩╚═ ╩ ╩╚═╝  ╚═╝╚═╝╩═╝╩═╝╚═╝ ╩╚╝╚═╝╚═╝\n" +
                                "Je hebt nog "+money+" credits over");
                        commandoOngezondKoudIjs = false;
                    }
                }
            }
        }
        }
}