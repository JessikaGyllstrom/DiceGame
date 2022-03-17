import java.util.Scanner;

public class Uppgift3{

   public static void main(String[] args) 
   { 
   /**
   @author Jessika Gyllström, jesgyl-0

   Program som simulerar tärningsspelet 12
      
      Användaren presenteras en meny och väljer mellan att 
      1: Slå tärning 1 
      2: Slå tärning 2
      3: Slå tärning 3 
      4: Avbryta spelet
      
      Slumpar fram ett värde för vald tärning
      Räknar ut summan av värdena
      Presenterar antalet vunna och förlorade omgångar
      Vinst vid 12 poäng
      Förlust när summan överstiger 12 efter att de 3 tärningarna är kastade
      Om summan efter 3 kast understiger 12 startar nästa omgång
      Program avslutas om användaren väljer "4" i menyn. 
      
   */
      //skapar variabler 
      int currentThrow1 = 0;
      int currentThrow2 = 0;
      int currentThrow3 = 0;

    
      String val = "1";
      int sum = 0;
      int won = 0;
      int lost = 0;
      
      //skapar en scanner 
      Scanner keyboard = new Scanner(System.in);
    
      System.out.println("Välkommen till spelet 12. Du ska slå 1-3 tärningar och försöka få summan 12...");    
      //om val inte är lika med 0 körs while-loopen
      while(val != "0") 
      {
         System.out.print("Ange vilken tärning du vill slå [1,2,3](avsluta med q)");
         //läser input från användaren och sparar det i val
         val = keyboard.nextLine();

         switch (val) 
         {
           case "1":
                //slumpar fram tärningskast för kast 1
                currentThrow1 = (int)(Math.random()*6)+1;
                System.out.print(currentThrow1 + " ");  
                //lägger till värdet av kastet till sum
                sum = currentThrow1;
                break;

           case "2":
                 //slumpar fram tärningskast för kast 2
                currentThrow2 = (int)(Math.random()*6)+1;
                System.out.print(currentThrow1 + " " + currentThrow2 + " "); 
                //lägger till värdet av kastet till sum
                sum = currentThrow1 + currentThrow2; 
                break;
                  
           case "3":
                //slumpar fram tärningskast för kast 3
                currentThrow3 = (int)(Math.random()*6)+1;
                //lägger till värdet av kastet till sum
                sum = currentThrow1 + currentThrow2 + currentThrow3;          
                System.out.print(currentThrow1 + " " + currentThrow2 + " " + currentThrow3);    
                //om summan är lika med 12 ökas värdet i won med 1
                if(sum==12) {
                won = + 1;
                //annars om summan är mer än 12 ökas värdet i lost med 1
                }else if(sum>12) {
                lost = + 1;
                }
                System.out.print(" Sum = " + sum + " #vinst: " + won + " #förlust: " + lost);  
                System.out.println("Nästa omgång!");
                break;
                  
           case "q":
                System.out.print("Avslutar programmet");
                //avslutar loopen
                val = "0";
                keyboard.close();
   
           default:
                System.out.print("Error");
           
      }
                 
    }
  }  
}
   

