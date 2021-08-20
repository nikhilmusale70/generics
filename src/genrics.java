public class genrics {

    public static void main(String[] args) {
        testMaximum();
    }

    public static void testMaximum() {
        String a = new String("Apple");
        String b = new String("Peach");
        String c = new String("Banana");
        String j = new String("Aello");

        Integer d = new Integer(4);
        Integer e = new Integer(5);
        Integer f = new Integer(6);
        Integer k = new Integer(7);

        Float g = new Float(1.1);
        Float h = new Float(1.2);
        Float i = new Float(0.9);
        Float l = new Float(1.3);

        testMaximum(a, b, c, j);
        testMaximum(d, e, f, k);
        testMaximum(g, h, i, l);
    }

    public static <T extends Comparable<T>> void testMaximum(T a, T b, T c, T d) {
        T max = a;
        if ((a.compareTo(b) >= 0) && ((a.compareTo(c) >= 0) && (a.compareTo(d) >= 0))) {
            max = a;
        } else if ((b.compareTo(c) >= 0) && ((b.compareTo(a) >= 0) && (b.compareTo(d) >= 0))) {
            max = b;
        } else if ((c.compareTo(a) >= 0) && ((c.compareTo(b) >= 0) && (c.compareTo(d) >= 0))) {
            max = c;
        } else if ((d.compareTo(a) >= 0) && ((d.compareTo(b) >= 0) && (d.compareTo(c) >= 0))) {
            max = d;
        }

        print(max);
    }

    public static <E> void print(E a) {
        System.out.println(a + " is greatest \t");
    }
}