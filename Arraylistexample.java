import java.util.ArrayList;̥
class ArrayListExample{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("lakshyan");
        list.add("Alahari");
        for(String name:list)
        {
            System.out.println(name);
        }
        System.out.println(list.get(5));
    }
}