package pozoriste;

public class Test {
    public static void main(String[] args) {
        Pozoriste p1 = new Pozoriste("Slavija");
        System.out.println(p1.getId());
        Pozoriste p2 = new Pozoriste("Jugoslovensko dramsko pozoriste");
        System.out.println(p2.getId());
    }
}
