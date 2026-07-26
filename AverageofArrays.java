public class AverageofArrays {

    public static void main(String[] args){
        int[] arr ={10,20,30,40,50};
        int sum = 0 ;
        int size = arr.length ;

        for(int num : arr){
            sum = sum + num ;

        }
        double avg =(double) sum / size ;
        System.out.println("Arr : {10 , 20 , 30 , 40 , 50} ") ;
        System.out.println(   "Average : " + (avg) );

    }
}
