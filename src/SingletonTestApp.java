public class SingletonTestApp {

    public static void main(String[] args) {
        SingletonPatternExample a = SingletonPatternExample.getInstance();
        SingletonPatternExample b = SingletonPatternExample.getInstance();

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());



    }
}
