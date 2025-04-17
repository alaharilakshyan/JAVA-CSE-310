interface predicate{
    boolean check(int num);
}
class PredicateExample{
    public static void main(String args[]){
        predicate obj=(num)->num%2==0;
        System.out.println(obj.check(10));
        System.out.println(obj.check(9));
    }
}

import java.util.function.Predicate;
class PredicateExample{
    public static void main(String args[]){
        Predicate<Integer> obj=(num)->num%2==0;
        System.out.println(obj.test(10));
        System.out.println(obj.test(9));
    }
}