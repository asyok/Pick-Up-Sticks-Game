


import java.util.Scanner;

public class PickUpSticks {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //great a user
        System.out.println("\nHello!\n\nLet's play Pick-Up-Sticks!\n\n");
        System.out.println("\nHere's how game works:\n\nThe computer will randomly choose the number of sticks, from 5 to 60, to place in a pile.\nThe computer will also decide randomly who goes first: you or the computer.\nDuring each turn of the game, the contestant can remove one, two, or three sticks.\nThe contestant who chooses the last stick loses.\n\nGood luck!\n");

		
		//create the loop to ask if a user wants to repeat the game
		char loopControl = 'y';
		while(true && (loopControl == 'y' || loopControl == 'Y')){
            while(true){
                try{
                    break;
                }catch(Exception e){
                    System.out.println("Invalid!");
                }
            }
            

        //decide who goes first
        int WhoGoesFirst = (int)(Math.random() * (1 - 0 + 1) + 0);
        //System.out.println(WhoGoesFirst);
        
        //computer goes first
        if (WhoGoesFirst == 1) {
            System.out.println("\nI am going first!\n");
            
            //calculate a random number to start the game & notify the user
            int NumberOfSticks1 = (int)(Math.random() * (60 - 5 + 1) + 5);
            System.out.println("\nThere are " + NumberOfSticks1 + " sticks in the pile.\n");
            System.out.println("\n(" + "|".repeat(NumberOfSticks1) + ")\n");
      
                //proccess the turn
                while (NumberOfSticks1 >= 1) {
                        if (NumberOfSticks1 % 4 == 0) {
                                NumberOfSticks1 = NumberOfSticks1 - 3;
                                System.out.println("\nI picked 3 sticks.");
                        } else if (NumberOfSticks1 % 4 == 1) {
                                NumberOfSticks1 = NumberOfSticks1 - 1;
                                System.out.println("\nI picked 1 stick.");
                        } else if (NumberOfSticks1 % 4 == 2) {
                                NumberOfSticks1 = NumberOfSticks1 - 1;
                                System.out.println("\nI picked 1 stick.");
                        } else if (NumberOfSticks1 % 4 == 3) {
                                NumberOfSticks1 = NumberOfSticks1 - 2;
                                System.out.println("\nI picked 2 sticks.");
                        }
                        //see if computer lost
                        if (NumberOfSticks1 >=1) {
                        System.out.println("\nThere are(is) " + NumberOfSticks1 + " stick(s) in the pile.");
                        System.out.println("\n(" + "|".repeat(NumberOfSticks1) + ")\n");
                        } else {
                            System.out.println("\nThere are no more stick in the pile.\n");
                            System.out.println("\nUh-oh... I lost...\n");
                                break;
                        }
                            
                        //take a number from the user
                        System.out.println("\nHow many do you chose?\nYou can pick one, two, or three."); 
                        int UserChoice = scan.nextInt();
                        if ((UserChoice == 1) || (UserChoice == 2) || (UserChoice == 3)) {
                                NumberOfSticks1 = NumberOfSticks1 - UserChoice;
                        } else {
                                System.out.println("Please pick a number between 1 and 3!");
                                    System.exit(0); 
                        }
                        
                        //see if the user lost
                        if (NumberOfSticks1 >=1) {
                        System.out.println("\nThere are(is) " + NumberOfSticks1 + " stick(s) in the pile.");
                        System.out.println("\n(" + "|".repeat(NumberOfSticks1) + ")\n");
                        } else {
                            System.out.println("\nThere are no more stick in the pile.\n");
                            System.out.println("\nUh-oh... You lost...\n");
                                break;
                        }
                }
        //user goes first
        } else {
            System.out.println("\nYou are going first!\n");
            
            //calculate a random number to start the game & notify the user
            int NumberOfSticks = (int)(Math.random() * (60 - 5 + 1) + 5);
            System.out.println("\nThere are " + NumberOfSticks + " sticks in the pile.\n");
            System.out.println("\n(" + "|".repeat(NumberOfSticks) + ")\n");
      
                //take a number from the user
                while (NumberOfSticks >= 1) {
                        System.out.println("\nHow many do you chose?\nYou can pick one, two, or three."); 
                        int UserChoice = scan.nextInt();
                        if ((UserChoice == 1) || (UserChoice == 2) || (UserChoice == 3)) {
                                NumberOfSticks = NumberOfSticks - UserChoice;
                        } else {
                                System.out.println("Please pick a number between 1 and 3!");
                                    System.exit(0); 
                        }
                        
                        //see if the user lost
                        if (NumberOfSticks >=1) {
                        System.out.println("\nThere are(is) " + NumberOfSticks + " stick(s) in the pile.");
                        System.out.println("\n(" + "|".repeat(NumberOfSticks) + ")\n");
                        } else {
                            System.out.println("\nThere are no more stick in the pile.\n");
                            System.out.println("\nUh-oh... You lost...\n");
                                break;
                        }
                        
                        //proccess the turn
                        if (NumberOfSticks % 4 == 0) {
                                NumberOfSticks = NumberOfSticks - 3;
                                System.out.println("\nI picked 3 sticks.");
                        } else if (NumberOfSticks % 4 == 1) {
                                NumberOfSticks = NumberOfSticks - 1;
                                System.out.println("\nI picked 1 stick.");
                        } else if (NumberOfSticks % 4 == 2) {
                                NumberOfSticks = NumberOfSticks - 1;
                                System.out.println("\nI picked 1 stick.");
                        } else if (NumberOfSticks % 4 == 3) {
                                NumberOfSticks = NumberOfSticks - 2;
                                System.out.println("\nI picked 2 sticks.");
                        }
                        
                        //see if computer lost
                        if (NumberOfSticks >=1) {
                        System.out.println("\nThere are(is) " + NumberOfSticks + " stick(s) in the pile.");
                        System.out.println("\n(" + "|".repeat(NumberOfSticks) + ")\n");
                        } else {
                            System.out.println("\nThere are no more stick in the pile.\n");
                            System.out.println("\nUh-oh... I lost...\n");
                                break;
                        }
                }           
        }

            

            
            //ask a user if they want to repeat
            while(true){
                System.out.print("\nDo you want to play again? (Y/N): ");
                String input = scan.nextLine();
                if(input.length() == 1){
                    loopControl = input.charAt(0);
                    
                    if(loopControl == 'y' || loopControl == 'Y' ||
                       loopControl == 'n' || loopControl == 'N'){
                       
                       if(loopControl == 'n' || loopControl == 'N'){
                           System.out.println("\nThank you for the game! Bye...");
                       }
                       
                        break;    
                        
                   }
                    
                    
                }
                
            }
            
            
		}
		
	}
}
