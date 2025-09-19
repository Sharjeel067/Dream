//practice previous topic like arraylist
// import java.util.ArrayList;
// import java.util.Iterator;

// public class Day_six {
//     public static void main(String[] args){
//         ArrayList<String> cars = new ArrayList<>();
//         cars.add("BMW");
//         cars.add("Mehran");
//         cars.add("Ferrari");
//         cars.add("Lambo");

//         Iterator car = cars.iterator();
//         while(car.hasNext()){
//             System.out.println(car.hasNext());
//         }
//     }
// }

//arratlist advance
// import java.util.ArrayList;
// import java.util.Collections;

// public class Day_six{
//     public static void main(String[] args){
//         ArrayList<String> bros = new ArrayList<>();
//         bros.add("Sharjeel");
//         bros.add("Jawad");
//         bros.add("Kaleem");

//         for(int i = 0; i < bros.size(); i++){
//             System.out.println(bros.get(i));
//         }

//         bros.add("Zeeshan");

//         for(String bro: bros){
//             System.out.println(bro);
//         }

//         // bros.remove(0);

//         Collections.sort(bros);

//         System.out.println(bros);

//     }
// }

import java.util.ArrayList;
import java.util.Collections;

//array sorting by using sort function
public class Day_six{
    public static void main(String[] args){
        ArrayList<Integer> dayInWeek = new ArrayList<>();

        dayInWeek.add(4);
        dayInWeek.add(5);
        dayInWeek.add(2);
        dayInWeek.add(3);
        dayInWeek.add(6);

        Collections.sort(dayInWeek);

        System.out.println(dayInWeek);

        System.out.println(dayInWeek.size());

        dayInWeek.set(2, 7);

        System.out.println(dayInWeek);
    }
}