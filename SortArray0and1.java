public class SortArray0and1 {

    public int[] sortArray(int[] nums){
        int n = nums.length ;
        int i = 0 ;
        int j = n - 1 ;

        while(i<j){
            if(nums[i]==1 && nums[j]==0) {
                nums[i] = 0;
                nums[j] = 1;

            }
            if(nums[i]==0){
                i++ ;
            }
            if(nums[j]==1){
                j--;
            }
        }
    return nums ;
    }

 public static void main(String[] args) {

     int[] arr = {1, 0, 1, 0, 1, 0, 1, 1, 0, 0};
     SortArray0and1 obj = new SortArray0and1();
     int[] result = obj.sortArray(arr);

     for (int num : result) {
         
         System.out.print(num);

     }
 }
 }
