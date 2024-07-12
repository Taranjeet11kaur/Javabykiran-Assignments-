public class ex4 {
    boolean a = false;

    void check() {
        if (a == false) {
            a = true;
            System.out.println("The Boolean Value is : " + a);
        }
    }

    public static void main(String args[]) {
        ex4 obj = new ex4();
        obj.check();

        System.out.println(obj.a);
    }
}
