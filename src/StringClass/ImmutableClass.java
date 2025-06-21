package StringClass;


import java.util.ArrayList;
import java.util.List;

public class ImmutableClass {   // immutable class

    private final int id;
    private final String name;

    private final List<String> items;   // mutable object

    ImmutableClass(int id, String name, List<String>items){
        this.id = id;
        this.name = name;
       // this.items = items;  // we should  not directly pass it.
        this.items = new ArrayList<>(items);  // deep copy of mutable object
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return items;       // return a copy of the list
    }
}

class main{

    public static void main(String[] args) {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("play");

        ImmutableClass immutableClass = new ImmutableClass(1, "abc", hobbies);



    }

}
