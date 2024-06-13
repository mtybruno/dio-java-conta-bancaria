

public class Main {
    public static void main(String[] args){ 
        System.out.println("Starting Main");
        a();
        System.out.println("Finished Main");

}

    static void a() {
        System.out.println("Starting A Method");
        b();
        System.out.println("Finished A Method");
    }

    static void b() {
        System.out.println("Starting B Method");
        for(int i = 0; i <= 5; i++ ) System.out.println(i);
        c();
        System.out.println("Finished B Method");
    }
    
    static void c() {
        System.out.println("Starting C Method");

        System.out.println("Finished C Method");

    }
}