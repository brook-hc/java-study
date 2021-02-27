package aao_object_equals;

public class Equals_override {


    public static void main(String[] args) {
        Person p1 = new Person(10,"hello");
        Person p2 = new Person(10,"hello");

        System.out.println(p1.equals(p2));

    }
}
