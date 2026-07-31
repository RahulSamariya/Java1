public class Local_Variable {
    static int x = 3; // Class

    public static void main()
    {
        int x = 1; // Local
        doSomething();
    }
            static void doSomething () {
            int x = 2; // LOCAL
            System.out.println(x);
    }
}
