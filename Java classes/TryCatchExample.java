// class TryCatchExample {
//     public static void main(String args[]) {
//         try {
//             int a = 10, b = 0;
//             int result = a / b; // This will throw an ArithmeticException
//             System.out.println(result);
//         } catch (ArithmeticException e) {
//             System.out.println("Exception caught: " + e);
//         }
//         finally{
//         System.out.println("Hello");
//         }
//     }
// }





class TryCatchExample {
    public static void main(String args[]) {
        try {
            int a = 10, b = 0;
            int result = a / b; // This will throw an ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);
        }

        try {
            int a[] = new int[5];
            a[5] = 10; // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
        }
    }
}