package Collection;

import java.util.Vector;

public class ExampleForVector {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<Integer>();
        //List l = new Vector(); 

        v.add(21);
        v.add(22);
        v.add(23);

        for(Object i : v) 
        {
            System.out.println(i);
        }

        System.out.println(v.get(2));

    }
}
