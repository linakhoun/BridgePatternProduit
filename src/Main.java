//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produit p1 = new Manteau(new Leather());
        Produit p2 = new Sac(new Cotton());
        System.out.println(p1.make());
        System.out.println(p2.make());
    }
}