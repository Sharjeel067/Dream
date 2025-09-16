// public class Day_three{
//     public static void main(String[] args){
//         int day = 0;
//         switch(day){
//             case 1 -> {System.out.println("Monday");}
                
//                 // break;
//             case 2 -> {System.out.println("Tuesday");}
                
//                 // break;
//             case 3 -> {System.out.println("Wednesday");}
                
//                 // break;
//             case 4 -> {System.out.println("Thursday");}

//                 // break;
//             case 5 -> {System.out.println("Friday");}
                
//                 // break;
//             case 6 -> {System.out.println("Sturday");}
                
//                 // break;
//             case 7 -> {System.out.println("Sunday");}
                
//                 // break;
//             default -> {System.out.println("Its not a day");}
//         }
//     }
// }


//while loop: it will keep running until the condition is true, once that condition becomes false the while loops stops running
// public class Day_three{
//     public static void main (String[] args){
//         int i = 0;
//         while (i < 5){
//             System.out.println(i);
//             i++;
//         }
//         System.out.println("1st while loop ended");
//         int day = 1;
//         while (day <= 6){
//             System.out.println(day);
//             day++;
//         }
//         System.out.println("Its Sunday");
//     }
// }

//do while loop: its the variant of while loop which will run a code before checking the condition
// public class Day_three{
//     public static void main(String[] args) {
//         //do block
//         int age = 1;
//         do {
//             System.out.println("The age is: " + age );
//             age++;
//         } while (age <= 24);
//         System.out.println("Happy birthday");
//     }
// }

//Print numbers from 1 to 10.
// public class Day_three{
//     public static void main(String[] args) {
//         int number = 1;
//         while(number <= 10){
//             System.out.println(number);
//             number++;
//         }
//     }
// }

//Print the factorial of a number.
// public class Day_three{
//     public static void main(String[] args){
//         int factorial = 1;
//         int number = 5;
//         while (number > 0){
//             factorial = factorial * number;
//             number--;
//         }
//         System.out.println("The factorial is: " + factorial);
//     }
// }

//Keep generating random numbers until you get 7.
// public class Day_three{
//     public static void main(String[] args){
//         int randomNumber = 0;
//         int count = 1;
//         while (randomNumber != 7){
//             randomNumber = (int) (Math.random() * 10);
//             System.out.println("Random number is: " + randomNumber);
//             count++;
//         }
//         System.out.println("Random Number found: " + randomNumber + "and the total count is: " + count);
//     }
// }

//Reverse number
// public class Day_three {
//     public static void main(String[] args){
//         int n = 12345;
//         int reverse = 0;
//         while (n != 0) {
//             int digit = n % 10;
//             System.out.println("The Digit is: " + digit);
//             reverse = reverse * 10 + digit;
//             System.out.println("The Reverse No. is: " + reverse);
//             n = n / 10;
//             System.out.println("The number is: " + n);
//         }
//         System.out.println("The Reversed Number is: " + reverse);
//     }
// }

//For loop: it is used when we know how many times the loop has to run
// public class Day_three{
//     public static void main(String[] args){
//         for(int i = 0; i <= 10; i++){
//             System.out.println("The number is: " + i);
//         }
//         int sum = 0;
//         for (int i = 1; i <= 10; i++){
//             sum = sum + i;
//             System.out.println("The number is: " + i);
//         }
//         System.out.println("The sum of the numbers is: " + sum);
//     }
// }

//nested for loop: star pattren
// public class Day_three {
//     public static void main(String[] args){
//         for (int i = 5; i >= 1; i--){
//             for (int j = i; j >= 1; j--){
//                 System.out.print("*"); //print keyword will let it print on same line
//             }
//             System.out.println("");
//         }
//         System.out.println("\n");
//         for (int i = 0; i <= 5; i++){
//             for (int j = 0; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

