import java.util.Scanner;

class AgeException {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            String age = sc.nextLine();

            int a = Integer.parseInt(age);

            int result = 100 /(a-20) ;

            System.out.println("Result = " + result);

        } catch (NumberFormatException e) {
            System.out.println("Age must be a number.");

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred.");
        }
    }
}