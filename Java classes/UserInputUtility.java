import java.util.Scanner;

interface Adder {
    int add(int a, int b);
}

class SumExample implements Adder {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first number:");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number:");
            int num2 = scanner.nextInt();

            Adder adder = new SumExample();
            int sum = adder.add(num1, num2);
            System.out.println("The sum is: " + sum);
        } finally {
            scanner.close();
        }
    }
}