package baledung;

public class Thread1 {
    public static void main(String[] args) {

        //Hi
        int number = 12;
        Thread newThread = new Thread(() -> {
            System.out.println("Factorial of " + number + " is: " + factorial(number));
        });
        newThread.start();
    }
    public static int factorial(int number){
        int i,fact=1;

        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        return fact;
    }
}
