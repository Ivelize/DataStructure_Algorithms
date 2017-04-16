import java.util.HashMap;
import java.util.Map;


public class SumIndex2 {
	public int[] twoSum(int[] nums, int target) {
	    Map<Integer,Integer> mapNums = new HashMap<Integer,Integer>(); 
	    int remaind = 0;
	    int x[]={-1,-1};
	   
	    for(int i = 0; i < nums.length; i++){
	    	remaind = target - nums[i];
	    	if(mapNums.containsKey(remaind)){
	          x[0] = mapNums.get(remaind);
	          x[1] = i;
	          return x;
	      }
		  mapNums.put(nums[i], i);          
		}
		   
		return null;
	}

}
