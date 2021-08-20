public class genrics {
    public static void main(String[] args) {
        Integer a = new Integer(9);
        Integer b = new Integer(11);
        Integer c = new Integer(11);

        genrics gen = new genrics();
        gen.maxNumbers(a,b,c);

    }

    public void maxNumbers(Integer a, Integer b, Integer c){
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
