import java.util.Scanner;

class RPS{
     static Scanner Scan = new Scanner(System.in);
     static final int Rock = 1;
     static final int Paper = 2;
     static final int Scissors = 3;
     static int Wins = 0;
     static int Losses = 0;
     static int Ties = 0;
     static int Disgrace = 0;
     static String Continue = "Y";
     static int HumanChoose = 0;
     static int MachineChoose = 0;
     
    public static void main(String[] arg){
        PrintIntro();
        do {
            HumanChoice();
            if (HumanChoose == Rock || HumanChoose == Paper || HumanChoose == Scissors){
                MachineChoise();
            }
            PlayAgain();
        }
        while (Continue.equals("Y"));
        PrintEnding();
    }
    
    public static void PrintIntro(){
        System.out.println("RPS 1.0");
        System.out.println("***********************************************************************************");
        System.out.println("");
        System.out.println(": Welcome, Challenger.");
        System.out.println(": I admire your courage yet you will end up like all the others,");
        System.out.println(": Defeated.");
        System.out.println(": Now, show me what you got...");
        System.out.println("");
    }
    
    public static void HumanChoice(){        
        System.out.print("What do you throw? [1] Rock, [2] Paper, [3] Scissors ");
        HumanChoose = Scan.nextInt();
        //System.out.println(HumanChoose);
        //System.out.println(Rock);
        //System.out.println(Paper);
        //System.out.println(Scissors);
        if (HumanChoose != Rock && HumanChoose != Paper && HumanChoose != Scissors){
            System.out.println("");
            System.out.println("What are you doing challenger? you disgrace yourself!");
            Disgrace++;
        }
    }
    
    public static void MachineChoise(){
        MachineChoose = (int) (Math.random() * 3) + 1;
        //System.out.println(MachineChoose);
        if (MachineChoose == HumanChoose){
            if (HumanChoose == Rock){
                System.out.println("You threw Rock! I threw Rock!");
                System.out.println(": A draw... impressive for an amatuer.");
            }
            else if (HumanChoose == Paper){
                System.out.println("You threw Paper! I threw Paper!");
                System.out.println(": Looks like you got something up your sleeves, I am surprised you could force a draw..");
            }
            else if (HumanChoose == Scissors){
                System.out.println("You threw Scissors! I threw Scissors!");
                System.out.println(": A draw, not bad, I demand a rematch. I will crush you this time!");
            }
            Ties++;
        }
        else{ 
            if (MachineChoose == Rock){// 1
                if (HumanChoose == Paper){
                    System.out.println("You threw Paper! I threw Rock!");// Win
                    Wins++;
                    System.out.println(": You Win, guess today is your lucky day... ");
                }
                else {
                    System.out.println("You threw Scissors! I threw Rock");// Lose
                    Losses++;
                    System.out.println(": You Lose, Who did you think you are, you were NO MATCH to me!");
                }
            }
            else if (MachineChoose == Paper){// 2
                if (HumanChoose == Scissors){
                    System.out.println("You threw Scissors! I threw Paper!");// Win
                    Wins++;
                    System.out.println(": You Win. What! Something must be wrong!");
                }
                else {
                    System.out.println("You threw Rock! I threw Paper!");// Lose
                    Losses++;
                    System.out.println(": You Lose, I would have more of a challenge playing against Siri.");
                }
            }
            else if (MachineChoose == Scissors){// 3
                if (HumanChoose == Rock){
                    System.out.println("You threw Rock! I threw Scissors!");// Win
                    Wins++;
                    System.out.println(": You Win, this is not the end for you challenger, this is merely the beginning!");
                }
                else {
                    System.out.println("You threw Rock! I threw Scissors!");// Lose
                    Losses++;
                    System.out.println(": You Lose, you are a third rate player with a forth rate game sense!");
                }
            }
        }
        System.out.println("");
    }
    
    public static void PlayAgain(){
        System.out.print("Play again? [Y/N] ");
        Continue = Scan.next(); 
        System.out.println("");
    }
    
    public static void PrintEnding(){
        System.out.println("");
        System.out.println(": That was a honourable battle, Good luck in the future challenger.");
        System.out.println("***********************************************************************************");
        System.out.println("Wins: " + Wins);
        System.out.println("Losses: " + Losses);
        System.out.println("Ties: " + Ties);
        if (Disgrace > 0){
            System.out.println("Disgrace: " + Disgrace);
        }
    }
}
