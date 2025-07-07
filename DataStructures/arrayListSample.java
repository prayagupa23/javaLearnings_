import java.util.ArrayList;

public class arrayListSample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("apple"); // Add
        list.add("Orange");
        list.add("grapes");
        list.set(0, "banana"); // Update
        list.remove(0); // Remove by index
        list.contains("apple"); // Search
        list.get(0); // Access by index

        for (String item : list) { // For-each loop
            System.out.println(item);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
