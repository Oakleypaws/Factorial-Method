//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(number);

        System.out.println(factorial(number));
    }

    public static int factorial(int input) {
        if (input > 1) {
            return input * factorial(input - 1);
        } else {
            return 1;
        }
    }
}
