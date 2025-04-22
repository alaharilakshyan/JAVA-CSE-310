class pair<T extends Number,U>{
    private T first;
    private U second;
    public pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
    public void displayPair() {
        System.out.println("First: " + first );
        System.out.println("Second: " + second );
    }
    }
    public class generic {
        public static void main(String[] args) {
            pair<Integer,String> person = new pair<>(12345,"okkk");
            person.displayPair(); // Output: First: 12345, Second: okkk

            pair<Double,String> person1 = new pair<>(123.45,"okkkk");   
            person1.displayPair(); // Output: First: 123.45, Second: okkkk
            
            pair<Float,String> person2 = new pair<>(123.45f,"okkkk");
            person2.displayPair(); // Output: First: 123.45, Second: okkkk
        }
}