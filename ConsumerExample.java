// interface Consumer
// {
//     void Convert(String str);
// }
// class ConsumeExample{
//     public static void main(String[] args){
//         Consumer example-str->System.out.println(str.toUpperCase());
//         example.Convert("hello");
//     }
// }

// ORRRRRRRRRR
import java.util.function.Consumer;
class ConsumerExample{
    public static void main(String args[]){
        Consumer<String> example=str->System.out.println(str .toUpperCase());
        example.accept("hello");
    }   
}