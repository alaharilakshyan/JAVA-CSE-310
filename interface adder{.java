interface adder{
    int add(int a,int b);
}
class Sumexample{
    public static void main(String args[]){
        adder obj=(a,b)->a+b;
        System.out.println(obj.add(10,20));
    }
}