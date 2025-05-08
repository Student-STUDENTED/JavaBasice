package Java8.Lambdaexpression;


import java.util.ArrayList;
import java.util.List;

class Students{

    String name;
    int age;

    Students(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return name + " : " + age ;
    }
}

public class SortListOfobjects {

    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students("aaa", 24));
        list.add(new Students("fff", 22));
        list.add(new Students("ccc", 43));
        list.add(new Students("bbb", 34));

        System.out.println(" sorting : ");
       list.sort((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));

        list.forEach(a -> System.out.println(a));

        list.sort((s1,s2) -> s1.getName().compareTo(s2.getName()));

        list.forEach(a -> System.out.println(a));

    }


}
