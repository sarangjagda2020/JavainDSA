public class BitwiseOperators {

    public static void main (String[] args){

        int a = 6 ;
        int b = 5  ;
        System.out.println("First Number : "+a);
        System.out.println("Second Number : "+b);

System.out.println("     ") ;

        System.out.println("AND: a & b = "+ ( a&b ));
        System.out.println("OR: a|b = " +(a | b )) ;
        System.out.println("XOR : a ^ b = "+( a ^ b )) ;
        System.out.println("NOT of a : ~a = "+( ~a )) ;
        System.out.println("NOT of b :"+(~b)) ;
        System.out.println("RIGHT SHIFT: a>>1 = "+(a>>1)) ;
        System.out.println("LEFT SHIFT : b<<2 = "+(b>>2)) ;
        System.out.println("Unsigned Right Shift : a>>>1 = "+(a>>>1) );
    }
}
