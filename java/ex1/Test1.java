public class Test1 {
    public static void main(String[] args) {
        System.out.println("main(String[] args)");
        main("one arg");
        main("one","two");

    }

    public static void main(String arg1) {
        System.out.println("main(String arg1)");
    }

    public static void main(String arg1, String arg2) {
        System.out.println("main(String arg1, String arg2)");
    }
}