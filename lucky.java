class lucky{
    public static void main(String[] args){
        try{
            System.out.println("Learn");
            int a = 20, b = 0, c;
            c= a/b;
            System.out.println(c);
            System.out.println("Like");
        }
        catch(Exception e){
            int x = 20, y=0,z;
            z=x/y;
            System.out.println(z);
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("Share");
        }
        System.out.println("main method ended");
    }
}