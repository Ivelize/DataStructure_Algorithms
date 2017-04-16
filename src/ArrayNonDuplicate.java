
public class ArrayNonDuplicate {
	
	public int singleNonDuplicate(int[] nums) {
       
		int aux = -1;
        int count = -1;

        for(int i = 0; i < nums.length; i++){
            
        	if(nums[i] != aux && count == 1){
                break;
            }else if(nums[i] != aux && (count == 2 || count == -1)){
                aux = nums[i];
                count = 1;    
            }else if(nums[i] == aux && count == 1){
                count = count + 1;
            }
        	
        }
        return aux;
    }

}
