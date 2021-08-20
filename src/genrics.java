public class genrics {
    public static void main(String[] args) {
        Float a = new Float(11.3);
        Float b = new Float(11.4);
        Float c = new Float(11.2);

        genrics gen = new genrics();
        gen.maxNumbers(a,b,c);

    }

    public void maxNumbers(Float a, Float b, Float c){
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
