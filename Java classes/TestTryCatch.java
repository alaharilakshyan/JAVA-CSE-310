//multiple  try catch ka code
class TestTryCatch2{
    public static void main(String args[]){
        try
        {
            int a= 50/0;
            System.out.println(a); // This will cause an ArithmeticException
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
         finally{ //finally block will execute even if there is an exception
            System.out.println("rest of the code...after 1st try catch block");
        }

        //second try catch block
        try
        {
            int a[] = new int[5];
            a[10] = 50; // This will cause an ArrayIndexOutOfBoundsException
            System.out.println(a[10]);
        }
        catch(ArrayIndexOutOfBoundsException e) //catching the exception
        {
            System.out.println(e); 
        }
        finally{ //finally block will execute even if there is an exception
            System.out.println("rest of the code...after 2nd try catch block");
        }
    }
}