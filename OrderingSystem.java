import java.util.Scanner;

public class OrderingSystem {
    public static void main(String args[]) {
    
    Scanner scan = new Scanner(System.in);
    
    //log in
    String username = "Zyra", user;
    int password = 123, pass;
    
    //ordering chicken
    char order, chicken;
    int drinksonechick,quantityonechick = 0; 
    int drinkstwochick,quantitytwochick = 0;
    
    //ordering of pasta
    char pasta;
    int drinkspag,spag = 0;
    int drinkscarb,carb = 0;
    
    //ordering of dessert
    char dessert;
    int ic = 0;
    int brow = 0;
    
    //add-ons
    char addons;
    int rice = 0,gravy = 0;
    
    //looping
    char action = 'Y';
    
    //payment
    int money;
    int total = 0;
    
    //receipt
    String receipt = "";
    
    
    System.out.println("==========================================");
    System.out.println("               POS System");
    System.out.println("==========================================\n");
    
    // System.out.println("==========================================");
    // System.out.println("               Please Log-in");
    // System.out.println("==========================================\n");
    
    // System.out.print("Username: ");
    //     user = scan.nextLine();
    // System.out.print("Password: ");
    //     pass = scan.nextInt();
        
    //     if (username.equals(user) && password == pass) {
    //         System.out.println("==========================================");
    //         System.out.println("               MENU");
    //         System.out.println("==========================================\n");
      
    //     } else {
    //      System.out.print("Fail to Log-in, Please try again");
    //          System.exit(0);
    //     }
    
    System.out.println("Dine-in / Take-out\n");

    for (int i = 0; action == 'Y'; i++) { //start of looping
        
    
    System.out.println("Type the corresponding letter for customer choice\n");
    
    
    System.out.println("[A] Chicken");
    System.out.println("[B] Pasta");
    System.out.println("[C] Dessert");
    System.out.println("[D] Add-ons\n");
    
    System.out.print("Enter Category: ");
        order =  scan.next().charAt(0);
    System.out.print(" \n");
    
    
    if (order == 'A') {   // Customer order a Chicken
        System.out.println("==========================================");
        System.out.println("                 Chicken");
        System.out.println("==========================================\n");
        
        System.out.println("[A] 1pc. chicken (79)");
        System.out.println("[B] 2pc. chicken (150)\n");
        
        
        System.out.print("Enter Category: ");
            chicken = scan.next().charAt(0);
      

        if (chicken == 'A') { //customer choose 1pc. Chicken
            System.out.println("1pc. Chicken\n");
           
            
            System.out.println("Beverage\n");   //drinks
            System.out.println("[A] Coke (+10)");
            System.out.println("[B] Sprite(+12)");
            System.out.println("[C] Alacarte\n");
            
            
            System.out.print("Enter Category: ");
                drinksonechick = scan.next().charAt(0);
                
                
            
                    if (drinksonechick == 'A') {
                        System.out.print("Quantity: ");  //quantity of 1pc chick and coke
                            quantityonechick = scan.nextInt();
                        total += ((quantityonechick * 10) + (quantityonechick * 79));
                            receipt += quantityonechick + "               " + "1pc. Chicken w/ coke\n";
                    } else if (drinksonechick == 'B') {
                        System.out.print("Quantity: ");  //quantity of 1pc chick and sprite
                            quantityonechick = scan.nextInt();
                        total += ((quantityonechick * 10) + (quantityonechick * 79));
                            receipt += quantityonechick + "               " + "1pc. Chicken w/ Sprite\n";
                           
                    } else if (drinksonechick == 'C') {
                        System.out.print("Quantity: ");  //quantity of alacarte
                            quantityonechick = scan.nextInt();
                        total += quantityonechick * 79;
                            receipt += quantityonechick + "               " + "1pc. Chicken\n";
                    } else {
                         System.out.print("You Entered a wrong key !");
                         
                    }
               
                  
        }   else if (chicken == 'B') { // customer order 2pc. chicken
                    System.out.println("2pc. Chicken\n");
            
                    System.out.println("Beverage\n");   //drinks
                    System.out.println("[A] Coke (+10)");
                    System.out.println("[B] Sprite(+12)");
                    System.out.println("[C] Alacarte\n");
                    
                   
                    System.out.print("Enter Category: \n");
                          drinkstwochick = scan.next().charAt(0);
                    
                    
                    if (drinkstwochick == 'A') {
                    System.out.print("Quantity: ");  //quantity of 2pc chick and coke
                            quantitytwochick = scan.nextInt();
                        total += ((quantitytwochick * 10) + (quantitytwochick * 150));
                                receipt += quantitytwochick + "               " + "2pc. Chicken w/ coke\n";
                        
                    } else if (drinkstwochick == 'B') {
                        System.out.print("Quantity: ");  //quantity of 2pc chick and sprite
                            quantitytwochick = scan.nextInt();
                                receipt += quantitytwochick + "               " + "2pc. Chicken w/ Sprite\n";
                            
                    } else if (drinkstwochick == 'C') {
                        System.out.print("Quantity: ");  //quantity of 2pc chick and alacarte
                            quantitytwochick = scan.nextInt();
                        total += quantitytwochick * 150;
                                receipt += quantitytwochick + "               " + "2pc. Chicken\n";
                    } else {
                        System.out.print("You Entered a wrong key !");
                    }       
            }
 
    }   else if (order == 'B') { // if customer order a pasta

             System.out.println("==========================================");
             System.out.println("                 Pasta");
             System.out.println("==========================================\n");
        
             System.out.println("[A] Spaghetti (50)");
             System.out.println("[B] Carbonara (60)\n");
             
           
            System.out.print("Enter Category: ");
                pasta = scan.next().charAt(0);
           
            
            if (pasta == 'A') { //customer order a spaghetti
                
            System.out.println("Beverage\n");   //drinks
            System.out.println("[A] Coke (+10)");
            System.out.println("[B] Sprite(+12)");
            System.out.println("[C] Alacarte\n");
            
           
            System.out.print("Enter Category: \n");
           
            
                drinkspag = scan.next().charAt(0);
                    if (drinkspag == 'A') {
                      
                        System.out.print("Quantity: ");  //quantity of pasta coke
                            spag = scan.nextInt();
                        total += ((spag * 10) + (spag * 50));
                            receipt += spag + "               " + "Spaghetti w/ coke";
                    } else if (drinkspag == 'B') {
                        System.out.print("Quantity: ");  //quantity of pasta sprite
                            spag = scan.nextInt();
                        total += ((spag * 10) + (spag * 50));
                            receipt += spag + "               " + "Spaghetti w/ Sprite";
                    } else if (drinkspag == 'C') {
                        System.out.print("Quantity: ");  //quantity of pasta alacarte
                            spag = scan.nextInt();
                        total += spag * 50;
                            receipt += spag + "               " + "Spaghetti";
                    } else {
                        System.out.print("You Entered a wrong key !");
                    }
            }   else if (pasta == 'B') { // customer order a carbonara
                System.out.println("Beverage\n");   //drinks
                System.out.println("[A] Coke (+10)");
                System.out.println("[B] Sprite(+12)");
                System.out.println("[C] Alacarte\n");
                
               
                System.out.print("Enter Category: ");
                    drinkscarb = scan.next().charAt(0);
                
                
                    if (drinkscarb == 'A') {
                        System.out.print("Quantity: ");  //quantity of pasta coke
                            carb = scan.nextInt();
                        total += ((carb * 10) + (carb * 60));
                            receipt += carb + "               " + "Carbonara w/ coke";
                    } else if (drinkscarb == 'B') {
                        System.out.print("Quantity: ");  //quantity of pasta sprite
                            carb = scan.nextInt();
                        total += ((carb * 10) + (carb * 60));
                            receipt += carb + "               " + "Carbonara w/ Sprite";
                    } else if (drinkscarb == 'C') {
                        System.out.print("Quantity: ");  //quantity of pasta alacarte
                            carb = scan.nextInt();
                        total += carb * 60;
                        receipt += carb + "               " + "Carbonara";
                    } else {
                        System.out.print("You Entered a wrong key !");
                    }
                }
  
        }   
             else if (order == 'C') { // if customer order a dessert

                 System.out.println("==========================================");
                 System.out.println("                 Dessert");
                 System.out.println("==========================================\n");
        
                 System.out.println("[A] Ice cream (25)");
                 System.out.println("[B] Brownies (20)\n");
        
          
                 System.out.print("Enter Category: ");
                     dessert = scan.next().charAt(0);
               
                 
                 if (dessert == 'A') {
                    System.out.println("Ice Cream"); // quantity of ice cream
                    System.out.print("Quantity: ");
                        ic = scan.nextInt();
                    total += ic * 25;
                        receipt += ic + "               " + "Ice Cream\n";
                 
                 } else if (dessert == 'B') {
                    System.out.println("Brownies"); // quantity of brownies
                    System.out.print("Quantity: ");
                        brow = scan.nextInt();
                    total += brow * 20;
                        receipt += brow + "               " + "Brownies\n";
                 }
             }
                else if (order == 'D') { //add-ons
                        System.out.println("==========================================");
                        System.out.println("                 Add-ons");
                        System.out.println("==========================================\n");

                        System.out.println("[A] Rice (15)");
                        System.out.println("[B] Gravy (10)\n");

                        System.out.print("Enter Category: \n");
                        addons = scan.next().charAt(0);
                   

                            if (addons == 'A') {
                                System.out.println("Rice");
                                System.out.print("Quantity: "); //add ons for rice
                                    rice = scan.nextInt();
                                total += rice * 15;
                                    receipt += rice + "               " + "Rice\n";
                                } else if (addons == 'B') {
                                    System.out.println("Gravy");
                                    System.out.print("Quantity: "); // add ons for gravy
                                        gravy = scan.nextInt();
                                total += gravy * 20;
                                     receipt += gravy + "               " + "Gravy\n";
                                  }
   


                } // add ons ending
                else  {
                    System.out.println("You Entered a wrong key");
                }
    System.out.print(" \n");
    System.out.println("Do you want to proceed?Y/N");
        System.out.print("Type your Answer: ");
            action = scan.next().charAt(0);
            
    }//end of looping
    
      System.out.print(" \n");
      System.out.println("==========================================");
      System.out.println("              Receipt");
      System.out.println("==========================================\n");
      System.out.println("Quantity          Product\n");
      System.out.println(receipt);
      
      System.out.print(" \n");
      System.out.println("Total: " + total + " \n");   
      System.out.print("PAYMENT CASH: ");
        money = scan.nextInt();
          if (money > total) {
              System.out.println("Change: " + (money - total));
          } else if (money == total) {
              System.out.print("Thank you ! Please come again.");
          }

          
          









































 
 
 
 
    }
}