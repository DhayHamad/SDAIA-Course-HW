package HW.day1;

public class HW {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 ==0){
                System.out.println("FizzBuzz");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else if (i % 5 ==0) {
                System.out.println("Buzz");

            } else if (i % 7 == 0) {
                System.out.println("Jazz");

            }
            else {
                System.out.println(i);

            }
        }

       /* Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++){
            if (i % 3 == 0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 ==0) {
                System.out.println("Buzz");
            } else if (i % 7 == 0) {
                System.out.println("Jazz");
            }
            else {
                System.out.println(i);

            }
        }*/
    }
}
