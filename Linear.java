import java.util.*; 
 public class Linear{
  public static void main(String [] args){
    int nums[] = {5,11,52,13,15};
    int target = 13;

    int result = linearSearch(nums,target);
     
    if(result !=-1)
    System.out.println("Element found at Index : " + result);
    else
    System.out.println("Element not found");
  }
  public static int linearSearch(int[] nums, int target){

    for (int i=0;i<nums.length;i++){
      if(nums[i]==target){
        return i;
      }
    }
    return -1;
  }
}