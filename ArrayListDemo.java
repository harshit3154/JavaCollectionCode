import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo{
    public static void main(String... args){
        System.out.println(
        "welcome the the ArrayList learing tutorial."
        );

        /* used in sceniario where searching element is more prior
         * uses the conept of dynamic array.
         * once the array is filled new array is formed the element is copied in       it to  maintain the order
         * has many inbuilt function.
         * store element in contiguous memory allocation.
         */
        ArrayList<Integer> list=new ArrayList<>();

        //adding the element to arraylist
        list.add(1);
        list.add(2);
        list.add(3);
        
        //printing the list.
        System.out.println(list);

        //accessing the element
        System.out.println(list.get(0));  //Time complexity O(1)

        //adding element to the given index.
        list.add(1,24);    // Time complexity O(N)

        //replacing the element at given index.
        list.set(0,56);

        //removing the element at gievn index
        list.remove(3);

        System.out.println(list);
        System.out.println(list.size());

        //Removing particular element.
        list.remove(Integer.valueOf(56));

        //traversing the list
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //sorting the arraylist using Collection method
        Collections.sort(list);
        System.out.println(list);

        //Traversing using the for each loop.
        for(Integer x:list){
            System.out.println(x);
        }

        //Traversing through iterator
        Iterator<Integer> it=list.iterator();
        while (it.hasNext()) {
            System.out.println("The element is : "+it.next());
        }

        //Remove all the element of the list.
        list.clear();
        System.out.println(list);
    }
}