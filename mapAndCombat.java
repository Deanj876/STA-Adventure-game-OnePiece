import java.util.Scanner;

public class mapAndCombat{
    Scanner sc = new Scanner(System.in);
    public void combat(){
      islandMethods im = new islandMethods();
      im.banditIsland();
    }
    public void map(){
      Main m = new Main();
        while(true){
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.println("----Your current log post is pointing to a small island known as \"Bandit Island\".----");
            System.out.println("\nDo you wish to go to the Bandit Island? (Y/N):");
            String islandChoice = sc.nextLine();
            if(islandChoice.equals("y")){
              System.out.println("\n----HEADING TO BANDIT ISLAND----");
              m.timeDelay();
              combat();
            }
        }
    }
}