//use while loop and reverse number
// public class Day_four{
//     public static void main(String[] args){
//         int number = 1234;
//         int reverse = 0;
//         while (number != 0){
//             int digit = number % 10;
//             System.out.println("The digit is: " + digit);
//             reverse = reverse * 10 + digit;
//             System.out.println("The Reverse No. is: " + reverse);
//             number = number / 10;
//             System.out.println("The No. is: " + number);
//         }
//         System.out.println("The reversed No. is: " + reverse);
//     }
// }

//use for loop for star pattren
// public class Day_four{
//     public static void main(String[] args){
//         for (int i = 0; i <= 5; i++){
//             for (int j = 0; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

//for-each loop: iterate like for loop in arrays
// public class Day_four{
//     public static void main(String[] args){
//         int[] numbers = {1,2,3,4};
//         String[] brothers = {"Sharjeel", "Jawad", "Kaleem", "Zeeshan"};
//         int index = 0;
//         for (String brother: brothers){
//             System.out.println(numbers[index] + ". " + brother);
//             index++;
//         }

//         for (int i = 0; i < numbers.length; i++){
//             System.out.println(numbers[i] + ". " + brothers[i]);
//         }
//     }
// }

//factorial of a number
// public class Day_four{
//     public static void main(String[] args){
//         int n = 5;
//         int fact = 1;
//         for (int i = 1; i <= n; i++){
//             fact *= i;
//             System.out.print("No. is: " + fact + " ");
//         }
//         System.out.println("\n" + fact);
//     }
// }

//break continue in loop
// public class Day_four{
//     public static void main(String[] args){
//         int[] nums = {23, -3, 6, 1, 0, 4, 5};
//         for (int n : nums){
//             if(n < 0){
//                 continue;
//             }
//             if(n == 0){
//                 break;
//             }
//             System.out.println(n);
//         }
//     }
// }