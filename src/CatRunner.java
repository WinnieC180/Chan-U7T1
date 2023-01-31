import java.util.ArrayList;

public class CatRunner {
    public static void main(String arg[]) {
        ArrayList<Cat> cats = new ArrayList<Cat>();

        Cat cat1 = new Cat("Yoyo");
        Cat cat2 = new Cat("Erik");
        Cat cat3 = new Cat("Dennie");

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        System.out.println(cats);

        Cat cat4 = new Cat ("Dog");
        Cat replaced = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(replaced);

        cat4.setName("Dog Meow");
        System.out.println(cats);

        for (int i = 0; i < cats.size(); i++) {
            cats.get(i).setName(cats.get(i).getName().toUpperCase());
        }
        System.out.println(cats);

        cats.add(new Cat("SAM"));
        System.out.println(cats);
    }
}


