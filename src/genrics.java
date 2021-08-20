public class genrics {
    public static void main(String[] args) {
        String a = new String("Apple");
        String b = new String("Peach");
        String c = new String("Banana");

        genrics gen = new genrics();
        gen.maxNumbers(a,b,c);

    }

    public void maxNumbers(String a, String b, String c){
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
