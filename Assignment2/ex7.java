
public class ex7 {
    int add_int(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ex7 addOperation = new ex7();
        int c = addOperation.add_int(20, 40);
        System.out.println(c);
    }
}