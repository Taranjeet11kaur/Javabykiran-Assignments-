public class ex8 {
    double getArea(double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {
        ex8 area = new ex8();
        double z = area.getArea(11.2, 20.1);
        System.out.println(z);
    }
}
