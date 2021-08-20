public class genrics {

    public static void main(String[] args) {
        String a = new String("Apple");
        String b = new String("Peach");
        String c = new String("Banana");

        Integer d = new Integer(4);
        Integer e = new Integer(5);
        Integer f = new Integer(6);

        Float g = new Float(1.1);
        Float h = new Float(1.2);
        Float i = new Float(0.9);

        genrics gen = new genrics();
        gen.maxNumbers(a,b,c);
        gen.maxNumbers(d,e,f);
        gen.maxNumbers(g,h,i);
    }

    public <T extends Comparable<T>> void maxNumbers (T a, T b, T c){
        if ((a.compareTo(b) >= 0) && (a.compareTo(c) >= 0)){
                System.out.println( a + " is greatest");
        }
        else if ((b.compareTo(c) >= 0) && (b.compareTo(a) >= 0)) {
            System.out.println( b + " is greatest");
        }
        else if ((c.compareTo(a) >= 0) && (c.compareTo(b) >= 0))
            System.out.println( c + " is greatest");
    }
}