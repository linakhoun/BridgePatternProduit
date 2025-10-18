//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product p1 = new Jacket(new Leather());
        Product p2 = new Bag(new Cotton());
        Product p3 = new Shoe(new Suede());
        System.out.println(p1.make());
        System.out.println(p2.make());
        System.out.println(p3.make());
    }
}