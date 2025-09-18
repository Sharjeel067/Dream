//practicing day four problems and topics
// public class Day_five {
//     public static void main(String[] args){
//         int[] num = {1, 2, 3, 0, 4, 5};
//         for(int n: num){
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

//use of array list and hashset in java
// import java.util.ArrayList;
// import java.util.HashSet;

// public class Day_five{
//     public static void main(String[] args){
//         ArrayList<String> cars = new ArrayList<String>();
//         cars.add("Volvo");
//         cars.add("Mercedez");
//         cars.add("Honda");
//         cars.add("BMW");
//         System.out.println(cars);

//         HashSet<String> brothers = new HashSet<String>();
//         brothers.add("Sharjeell");
//         brothers.add("Jawad");
//         brothers.add("Kaleem");
//         brothers.add("Zeeshan");
//         brothers.add("Sharjeel");
//         brothers.add("Jawadd");
//         System.out.println(brothers);

//     }
// }

import java.util.ArrayList;
import java.util.Iterator;

public class Day_five{
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Mehran");
        cars.add("Honda");
        cars.add("Merce");

        Iterator car = cars.iterator();

        while (car.hasNext()){
            // System.out.println(car);
            System.out.println(car.hasNext());
        }
    }
}