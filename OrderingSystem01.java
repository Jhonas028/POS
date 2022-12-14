import java.util.Scanner;

public class OrderingSystem01 {
    public static void main(String args[]) {
    
    Scanner scan = new Scanner(System.in);
    
    //log in Assume that the counter already have an account created in the office.
    String username = "Jhonas", user;
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
    double payment,payment1,payment2,discount1;
    double total = 0;
    char pwdsnr = 'Y',transaction = 'Y';
   
    //receipt
    String receipt = "";

    //dineine or Take home
    char answ = 'D';
    boolean validation = false;
      
    System.out.println("==========================================");
    System.out.println("             ORDERING SYSTEM");
    System.out.println("==========================================\n");
    
    System.out.println("==========================================");
    System.out.println("               Please Log-in");
    System.out.println("==========================================\n");
    
    System.out.print("Username: ");
        user = scan.nextLine();
    System.out.print("Password: ");
        pass = scan.nextInt();
        
        if (username.equals(user) && password == pass) {
            while (Character.toUpperCase(Character.toLowerCase(action)) == 'Y') {
                System.out.println("\nInstruction: Type the corresponding letter for customer choice\n");
                System.out.println("[D] for Dine-in");
                System.out.println("[T] for Take-Home\n");
                System.out.print("Type your Answer: ");
                    answ = scan.next().charAt(0);
                    if (Character.toUpperCase(Character.toLowerCase(answ)) == 'D' || Character.toUpperCase(Character.toLowerCase(answ)) == 'T') {
                        validation = true;
                        break;
                    
                    }
                    else {
                        System.out.println("Invalid keyword");
                   
                        System.out.print(" \n");
                        System.out.println("Continue? Y/N");
                        System.out.print("Type your Answer: ");
                            action = scan.next().charAt(0);
                    }
         
            }
                
                       
        } else {
            System.out.print(" \n");
            System.out.print("Fail to Log-in, Please try again");
                System.exit(0);
        }
        
    while (Character.toUpperCase(Character.toLowerCase(action)) == 'Y') { //start of looping
        System.out.println("\n==========================================");
        System.out.println("                   MENU");
        System.out.println("==========================================\n");
          
        System.out.println("+-----------------------------------------+");
        System.out.println("| A |             Chicken                 |");
        System.out.println("+-----------------------------------------+");
        System.out.println("| B |             Pasta                   |");
        System.out.println("+-----------------------------------------+");
        System.out.println("| C |             Dessert                 |");
        System.out.println("+-----------------------------------------+");
        System.out.println("| D |             Add-ons                 |");
        System.out.println("+-----------------------------------------+\n");
    
        System.out.print("Enter Order Category: ");
            order =  scan.next().charAt(0);
        System.out.print(" \n");
     
    if (Character.toUpperCase(Character.toLowerCase(order)) == 'A') {   // Customer order a Chicken
        System.out.println("\n==========================================");
        System.out.println("                 Chicken");
        System.out.println("==========================================\n");
        
        System.out.println("+-----------------------------------------+");
        System.out.println("| A |            1pc. chicken (79)        |");
        System.out.println("+-----------------------------------------+");
        System.out.println("| B |            2pc. chicken (150)       |");
        System.out.println("+-----------------------------------------+\n");
        
        
        System.out.print("Enter Chicken Category: ");
            chicken = scan.next().charAt(0);
      
        if (Character.toUpperCase(Character.toLowerCase(chicken)) == 'A') { //customer choose 1pc. Chicken
            System.out.println("\n==========================================");
            System.out.println("              1pc. Chicken");
            System.out.println("==========================================\n");
           
            
            System.out.println("+-----------------------------------------+");
            System.out.println("|             BEVERAGE                    |");
            System.out.println("+-----------------------------------------+");
            System.out.println("| A |         Coke (+10)                  |");
            System.out.println("+-----------------------------------------+");
            System.out.println("| B |         Sprite(+12)                 |");
            System.out.println("+-----------------------------------------+");
            System.out.println("| C |         Alacarte                    |");
            System.out.println("+-----------------------------------------+\n");
             
            System.out.print("Enter Beverage Category: ");
                drinksonechick = scan.next().charAt(0);
                
                    if (Character.toUpperCase(Character.toLowerCase(drinksonechick)) == 'A') {
                        System.out.print("Quantity: ");  //quantity of 1pc chick and coke
                            quantityonechick = scan.nextInt();
                        total += ((quantityonechick * 10) + (quantityonechick * 79));
                            receipt += quantityonechick + "               " + "1pc. Chicken w/ coke\n";
                    } else if (Character.toUpperCase(Character.toLowerCase(drinksonechick)) == 'B') {
                        System.out.print("Quantity: ");  //quantity of 1pc chick and sprite
                            quantityonechick = scan.nextInt();
                        total += ((quantityonechick * 10) + (quantityonechick * 79));
                            receipt += quantityonechick + "               " + "1pc. Chicken w/ Sprite\n";
                           
                    } else if (Character.toUpperCase(Character.toLowerCase(drinksonechick)) == 'C') {
                        System.out.print("Quantity: ");  //quantity of alacarte
                            quantityonechick = scan.nextInt();
                        total += quantityonechick * 79;
                            receipt += quantityonechick + "               " + "1pc. Chicken\n";
                    } else {
                         System.out.print("\nYou Entered a wrong key !");
                         
                    }
            
        }   else if (Character.toUpperCase(Character.toLowerCase(chicken)) == 'B') { // customer order 2pc. chicken
                    System.out.println("==========================================");
                    System.out.println("              2pc. Chicken\n");
                    System.out.println("==========================================\n");
            
                    System.out.println("+-----------------------------------------+");
                    System.out.println("|             BEVERAGE                    |");
                    System.out.println("+-----------------------------------------+");
                    System.out.println("| A |         Coke (+10)                  |");
                    System.out.println("+-----------------------------------------+");
                    System.out.println("| B |         Sprite(+12)                 |");
                    System.out.println("+-----------------------------------------+");
                    System.out.println("| C |         Alacarte                    |");
                    System.out.println("+-----------------------------------------+\n");
                    
                    System.out.print("Enter Beverage Category:");
                          drinkstwochick = scan.next().charAt(0);
                    
                    if (Character.toUpperCase(Character.toLowerCase(drinkstwochick)) == 'A') {
                    System.out.print("Quantity: ");  //quantity of 2pc chick and coke
                            quantitytwochick = scan.nextInt();
                        total += ((quantitytwochick * 10) + (quantitytwochick * 150));
                                receipt += quantitytwochick + "               " + "2pc. Chicken w/ coke\n";
                        
                    } else if (Character.toUpperCase(Character.toLowerCase(drinkstwochick)) == 'B') {
                        System.out.print("Quantity: ");  //quantity of 2pc chick and sprite
                            quantitytwochick = scan.nextInt();
                        total += ((quantitytwochick * 10) + (quantitytwochick * 150));
                                receipt += quantitytwochick + "               " + "2pc. Chicken w/ Sprite\n";
                            
                    } else if (Character.toUpperCase(Character.toLowerCase(drinkstwochick)) == 'C') {
                        System.out.print("Quantity: ");  //quantity of 2pc chick and alacarte
                            quantitytwochick = scan.nextInt();
                        total += quantitytwochick * 150;
                                receipt += quantitytwochick + "               " + "2pc. Chicken\n";
                    } else {
                        System.out.print("You Entered a wrong key !");
                    }       
            } else {
                System.out.print("You Entered a wrong key !");
            }
 
    }   else if (Character.toUpperCase(Character.toLowerCase(order)) == 'B') { // if customer order a pasta

             System.out.println("==========================================");
             System.out.println("                 Pasta");
             System.out.println("==========================================\n");
        
             System.out.println("+----------------------------------------+");
             System.out.println("| A |           Spaghetti (50)           |");
             System.out.println("+----------------------------------------+");
             System.out.println("| B |           Carbonara (60)           |");
             System.out.println("+----------------------------------------+\n");
             
           
            System.out.print("Enter Pasta Category: ");
                pasta = scan.next().charAt(0);
           
            if (Character.toUpperCase(Character.toLowerCase(pasta)) == 'A') { //customer order a spaghetti
                System.out.println("==========================================");
                System.out.println("              Spaghetti");
                System.out.println("==========================================\n");
                
                System.out.println("+-----------------------------------------+");
                System.out.println("|             BEVERAGE                    |");
                System.out.println("+-----------------------------------------+");
                System.out.println("| A |         Coke (+10)                  |");
                System.out.println("+-----------------------------------------+");
                System.out.println("| B |         Sprite(+12)                 |");
                System.out.println("+-----------------------------------------+");
                System.out.println("| C |         Alacarte                    |");
                System.out.println("+-----------------------------------------+\n");
            
            System.out.print("Enter Beverage Category: ");
           
                drinkspag = scan.next().charAt(0);
                    if (Character.toUpperCase(Character.toLowerCase(drinkspag)) == 'A') {
                      
                        System.out.print("Quantity: ");  //quantity of pasta coke
                            spag = scan.nextInt();
                        total += ((spag * 10) + (spag * 50));
                            receipt += spag + "               " + "Spaghetti w/ coke\n";
                    } else if (Character.toUpperCase(Character.toLowerCase(drinkspag)) == 'B') {
                        System.out.print("Quantity: ");  //quantity of pasta sprite
                            spag = scan.nextInt();
                        total += ((spag * 10) + (spag * 50));
                            receipt += spag + "               " + "Spaghetti w/ Sprite\n";
                    } else if (Character.toUpperCase(Character.toLowerCase(drinkspag)) == 'C') {
                        System.out.print("Quantity: ");  //quantity of pasta alacarte
                            spag = scan.nextInt();
                        total += spag * 50;
                            receipt += spag + "               " + "Spaghetti\n";
                    } else {
                        System.out.print("You Entered a wrong key !");
                    }
            }   else if (Character.toUpperCase(Character.toLowerCase(pasta)) == 'B') { // customer order a carbonara
                System.out.println("==========================================");
                System.out.println("              Carbonara");
                System.out.println("==========================================\n");

                System.out.println("+-----------------------------------------+");
                System.out.println("|             BEVERAGE                    |");
                System.out.println("+-----------------------------------------+");
                System.out.println("| A |         Coke (+10)                  |");
                System.out.println("+-----------------------------------------+");
                System.out.println("| B |         Sprite(+12)                 |");
                System.out.println("+-----------------------------------------+");
                System.out.println("| C |         Alacarte                    |");
                System.out.println("+-----------------------------------------+\n");
                
               
                System.out.print("Enter Beverage Category: ");
                    drinkscarb = scan.next().charAt(0);
                
                    if (Character.toUpperCase(Character.toLowerCase(drinkscarb)) == 'A') {
                        System.out.print("Quantity: ");  //quantity of pasta coke
                            carb = scan.nextInt();
                        total += ((carb * 10) + (carb * 60));
                            receipt += carb + "               " + "Carbonara w/ coke\n";
                    } else if (Character.toUpperCase(Character.toLowerCase(drinkscarb)) == 'B') {
                        System.out.print("Quantity: ");  //quantity of pasta sprite
                            carb = scan.nextInt();
                        total += ((carb * 10) + (carb * 60));
                            receipt += carb + "               " + "Carbonara w/ Sprite\n";
                    } else if (Character.toUpperCase(Character.toLowerCase(drinkscarb)) == 'C') {
                        System.out.print("Quantity: ");  //quantity of pasta alacarte
                            carb = scan.nextInt();
                        total += carb * 60;
                        receipt += carb + "               " + "Carbonara\n";
                    } else {
                        System.out.print("You Entered a wrong key !");
                    }
                }
  
        }   
             else if (Character.toUpperCase(Character.toLowerCase(order)) == 'C') { // if customer order a dessert

                 System.out.println("==========================================");
                 System.out.println("                 Dessert");
                 System.out.println("==========================================\n");
        
                 System.out.println("+-----------------------------------------+");
                 System.out.println("| A |            Chocolate Ice cream (25) |");
                 System.out.println("+-----------------------------------------+");
                 System.out.println("| B |            Brownies (20)            |");
                 System.out.println("+-----------------------------------------+\n");
        
          
                 System.out.print("Enter Dessert Category: ");
                     dessert = scan.next().charAt(0);
               
                 if (Character.toUpperCase(Character.toLowerCase(dessert)) == 'A') {
                    System.out.println("==========================================");
                    System.out.println("              Ice Cream");
                    System.out.println("==========================================\n");

                    System.out.println("+----------------------------------------+");
                    System.out.println("|             Chocolate Ice Cream        |");
                    System.out.println("+----------------------------------------+\n");

                    System.out.print("Quantity: "); // quantity of ice cream
                        ic = scan.nextInt();
                    total += ic * 25;
                        receipt += ic + "               " + "Ice Cream\n";
                 
                 } else if (Character.toUpperCase(Character.toLowerCase(dessert)) == 'B') {
                    System.out.println("==========================================");
                    System.out.println("              Brownies");
                    System.out.println("==========================================\n");
                    System.out.println("+---------------------------------------+");
                    System.out.println("|             Brownies                  |");
                    System.out.println("+---------------------------------------+\n");
                    System.out.print("Quantity: "); // quantity of brownies
                        brow = scan.nextInt();
                    total += brow * 20;
                        receipt += brow + "               " + "Brownies\n";
                 }
             }
                else if (Character.toUpperCase(Character.toLowerCase(order)) == 'D') { //add-ons
                        System.out.println("==========================================");
                        System.out.println("                 Add-ons");
                        System.out.println("==========================================\n");

                        System.out.println("+-----------------------------------------+");
                        System.out.println("| A |            Rice (15)                |");
                        System.out.println("+-----------------------------------------+");
                        System.out.println("| B |            Gravy (10)               |");
                        System.out.println("+-----------------------------------------+\n");

                        System.out.print("Enter Add-ons Category: \n");
                        addons = scan.next().charAt(0);
                   

                            if (Character.toUpperCase(Character.toLowerCase(addons)) == 'A') {
                                System.out.println("==========================================");
                                System.out.println("              Rice");
                                System.out.println("==========================================\n");

                                System.out.println("+---------------------------------------+");
                                System.out.println("|             Rice                      |");
                                System.out.println("+---------------------------------------+");

                                System.out.print("Quantity: "); //add ons for rice
                                    rice = scan.nextInt();
                                total += rice * 15;
                                    receipt += rice + "               " + "Rice\n";
                                } else if (Character.toUpperCase(Character.toLowerCase(addons)) == 'B') {
                                    System.out.println("==========================================");
                                    System.out.println("              Gravy");
                                    System.out.println("==========================================\n");
                                    System.out.println("+-----------------------------------------+");
                                    System.out.println("|              Gravy                      |");
                                    System.out.println("+-----------------------------------------+");
                                    System.out.print("Quantity: "); // add ons for gravy
                                        gravy = scan.nextInt();
                                total += gravy * 20;
                                     receipt += gravy + "               " + "Gravy\n";
                                  }
   
                } // add ons ending
                else  {
                    System.out.print(" \n");
                    System.out.println("You Entered a wrong key\n");
                    
                }
        System.out.print(" \n");
        System.out.println("Continue? Y/N");
        System.out.print("Type your Answer: ");
            action = scan.next().charAt(0);
        
    }//end of looping
    
      System.out.print(" \n");
      System.out.println("==========================================");
      System.out.println("                 Summary");
      System.out.println("==========================================\n");

      System.out.println("Quantity          Product\n");
      System.out.println(receipt);
      
      System.out.print(" \n");
      System.out.println("Total: " + total + " \n");   

    //Computing pwd and snr discount for payment

        System.out.println("==========================================\n");
        System.out.println("\nPWD/SNR Discount? Y/N");
        System.out.print("Type your answer: ");
          pwdsnr = scan.next().charAt(0);
        System.out.print(" \n");

        if (Character.toUpperCase(Character.toLowerCase(pwdsnr)) == 'Y') {

            discount1 = total * .20;
            total = total - discount1;
           
            System.out.printf("Total payment: %.2f",total);
            System.out.print(" \n");

        }  else {
            System.out.println("Total payment: " + total);
            System.out.print(" \n");
        }
    
        //Client pays money
        

        while (Character.toUpperCase(Character.toLowerCase(transaction)) == 'Y') { // start of for loop for payment

            System.out.print(" \n");
            System.out.println("==========================================\n");
            System.out.print("Cash payment: ");
                payment = scan.nextDouble();
            System.out.println("\n==========================================\n");

             if (payment > total) { //customer payment is greater than the total
                payment1 = payment - total;

                System.out.print(" \n");
                System.out.println("\n==========================================\n");
                System.out.println("             JOBILEE PINOY");
                System.out.println("        234 Ayala, Marikina City");
                System.out.println("              [Receipt]");
                System.out.println("==========================================\n"); // intro receipt
          
                if (Character.toUpperCase(Character.toLowerCase(answ)) == 'D') { // code for dine in and take out
                  System.out.println("Dine-in\n");                      
                } else { 
                  System.out.print("Take-Home\n");
                }// end of dn/th statement
          
                System.out.println("Quantity          Product\n");  //receip2
                System.out.println(receipt);
          
                System.out.println("\nTotal: " + total);   //total of bills
                System.out.println("Customer payment: " + payment);   //customer payment code
                System.out.printf("Change: %.2f",payment1); //customer change   

                if (Character.toUpperCase(Character.toLowerCase(pwdsnr)) == 'Y') { //discount code
                    System.out.println("\nDiscount: " + "20%");
                    System.out.println("\nThis serves as official receipt");
                    System.out.println("feedback? Email us @jobileepinoy.com.ph");
                    System.out.print("Thank you please come again.\n");
                    System.out.println("\n==========================================\n");
                    System.exit(0);
                } else {
                    System.out.print("\n");
                    System.out.println("\nThis serves as official receipt");
                    System.out.println("feedback? Email us @jobileepinoy.com.ph");
                    System.out.print("Thank you please come again.\n"); 
                    System.out.println("\n==========================================\n");
                    System.exit(0);
                }
             } 
                else if (payment < total) {
                    payment2 = payment - total;
                    System.out.printf("\nPayment insufficient: %.2f\n",payment2);
                    System.out.println("\nDo you want to continue the transaction? Y/N");
                    System.out.print("Type your answer: ");
                        transaction =  scan.next().charAt(0);
                }
                    else if (payment == total) { // customer equal payment
                        System.out.print(" \n");
                        System.out.println("\n==========================================\n");
                        System.out.println("             JOBILEE PINOY");
                        System.out.println("        234 Ayala, Marikina City");
                        System.out.println("              [Receipt]");
                        System.out.println("==========================================\n");
          
                        if (Character.toUpperCase(Character.toLowerCase(answ)) == 'D') { // start of if statement for din/th
                            System.out.println("Dine-in\n");
                        } else { 
                            System.out.print("Take-Home");
                        }// end of dn/th statement
                            System.out.println("Quantity          Product\n");
                            System.out.println(receipt);
                            System.out.println("\nTotal: " + total);  
                        if (pwdsnr == 'Y') {
                            System.out.println("Discount: 20%");
                            System.out.println("\nThis serves as official receipt");
                            System.out.println("feedback? Email us @jobileepinoy.com.ph");
                            System.out.print("Thank you please come again.\n");
                            System.out.println("\n==========================================\n");
                            System.exit(0);
                        }
                        else {
                            System.out.print(" \n");
                            System.out.println("This serves as official receipt");
                            System.out.println("feedback? Email us @jobileepinoy.com.ph");
                            System.out.print("Thank you please come again.\n"); 
                            System.out.println("\n==========================================\n");
                            System.exit(0);
                        }
            } // end of customer equal payment
                System.out.print("Invalid keyword! Thank you please come again!"); // code for 412 if incorrect put of letter
         } // end of for loop for payment


    }
}