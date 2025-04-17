// class ResultCheck{
//     static void driverLicence(int age){
//         if(age<18){
//             throw new ArithmeticException(" Can't make licence! Halt the process");
//         }
//     }
//     public static void main(String[] args){
//         driverLicence(16);
//         System.out.println("You are eligible to make a driver licence");
//     }

// }

class ThrowsExample {
    static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {
        try {
            divide(10, 0); 
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}