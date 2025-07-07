//array list in java.

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        //an array list is a resizable array.
        //Elements can be added, removed, after compilation phase
        //store reference data types.

        ArrayList<String> demo = new ArrayList<>();
        demo.add("Pizza");
        demo.add("Burger");
        demo.add("Taco");
        demo.set(0,"Sushi");
        demo.remove(2);
        // demo.clear();
        for(int i=0;i<demo.size();i++){
            System.out.println(demo.get(i));
        }
    }
}
