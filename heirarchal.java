 class Parent {
    void Happy() {System.out.println("Happy");
}
 }
class Child1 extends Parent{
    void Smile(){
        System.out.println("Smile");
    }
    }
class Child2 extends Parent{
    void Sad(){
        System.out.println("Sad");
    }
    }
class heirarchal{
    public static void main(String args[]){
        Child1 A = new Child1();
        A.Smile();
        A.Happy();

        Child2 B = new Child2();
        B.Sad();
        B.Happy();
    }
}
 

