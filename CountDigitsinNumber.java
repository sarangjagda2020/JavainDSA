public class CountDigitsinNumber {
    public static void main(String[] args){
        int n =54321 ;
        int count = 0 ;

        while(n>0){
            count ++ ;
            n = n/10 ;
        }
        System.out.println("Number - 54321 ") ;
        System.out.println("Numbers Of Digits = " + count) ;
    }
}
