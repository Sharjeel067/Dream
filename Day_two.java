public class Day_two{
    public static void main(String[] args){
        System.out.println(Math.max(20, 30));
        System.out.println(Math.min(23, 24));
        System.out.println(Math.sqrt(49));
        System.out.println(Math.abs(-23.45));
        System.out.println(Math.pow(7, 8));
        System.out.println(Math.round(2.54));
        System.out.println(Math.ceil(2.54));
        System.out.println(Math.floor(2.54));
        System.out.println(Math.random());
        int mathRandom = (int)(Math.random() * 100000000);
        System.out.println(mathRandom);

        int x = 20;
        int y = 20;
        System.out.println(x != y);

        if (x < y){
            System.out.println("X is less then Y");
        } else if (x > y) {
            System.out.println("X is not greater then Y");
        } else {
            System.out.println("X is Equal to Y");
        }


    }
}