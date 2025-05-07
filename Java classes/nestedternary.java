public class nestedternary {
    public static void main(String args[]){
        int a = 123;
        int c = 2342;
        int g = 99583;
        int x = (a>c)? ((a>g)?a:g):((c>g)? c:g);
        System.out.println(x);
    }
}
