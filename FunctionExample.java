// FUNCTIONAL INTERFACE KA  fourth example  true ya false hi dega
import java.util.function.Function;
class FunctionExample{
    public static void main(String args[]){
        Function<Integer,Integer> obj=(num)->num*2;
        System.out.println(obj.apply(10));
    }
}
// Compare this snippet from ConsumerExample.java:
interface FunctionExamplee{
    int operate(int num);
}
class FunctionExample{
    public static void main(String args[]){
        FunctionExamplee obj=(num)->num*2;
        System.out.println(obj.operate(10));
    }
}