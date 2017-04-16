import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BestDivision {
	 public String optimalDivision(int[] nums) {
		 
		 String division = "";
		 	List<Integer> numSorted = new ArrayList<Integer>();
		 	
		 	for (int j = 0; j < nums.length; j++) {
				numSorted.add(nums[j]);
			}
	       
		 	Collections.sort(numSorted ,Collections.reverseOrder());
		 	
		 	for (int i = 0; i < nums.length; i++) {
		 	    if (nums.length == 1){
		 	        division = nums[0] + "";
		 	    }else if (nums.length == 2){
		 	        division = nums[0] + "/" + nums[1];
		 	        i = i + 1;
		 	    }else if(i == 0){
		 			division = nums[0] + "/(";
		 		}else if (nums.length == i+1){
		 			division = division + nums[i] + ")";
		 		}else{
		 			division = division + nums[i] + "/" ;
		 		}
				
			}
		 	
		 	return division;
	    }

}
