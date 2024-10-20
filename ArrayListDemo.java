import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo{
    public static void main(String... args){
        System.out.println(
        "welcome the the ArrayList learing tutorial."
        );
        ArrayList<Integer> list=new ArrayList<>();

        //adding the element to arraylist
        list.add(1);
        list.add(2);
        list.add(3);
        
        //printing the list.
        System.out.println(list);

        //accessing the element
        System.out.println(list.get(0));

        //adding element to the given index.
        list.add(1,24);

        //replacing the element at given index.
        list.set(0,56);

        //removing the element at gievn index
        list.remove(3);

        System.out.println(list);
        System.out.println(list.size());

        //traversing the list
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //sorting the arraylist using Collection method
        Collections.sort(list);
        System.out.println(list);
    }
}