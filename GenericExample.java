class Container<T>{
    private T item;
    public Container(T item) {
        this.item = item;
    }
    public void showItem() {
        System.out.println("Item: " + item);
    }
}
    public class GenericExample {
        public static void main(String[] args) {
            Container<String> stringContainer = new Container<>("Hello, Generics!");
            stringContainer.showItem(); // Output: Item: Hello, Generics!
            
            Container<Integer> intContainer = new Container<>(123);
            intContainer.showItem(); // Output: Item: 123
        }
    }
// This code defines a generic class Container that can hold any type of item.