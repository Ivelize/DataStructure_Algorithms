
public class InverseNum {
	
	public int reverse(int x) {
        char[] charNums = (""+x).toCharArray();
		String inverseNum = "";
		int max = 0;
		int num = 0;
		
		if(x<0){
        	max = 1;
        }
        
		for(int i = charNums.length - 1; i >= max; i--){
           inverseNum = inverseNum + charNums[i]; 
        }
       
        if(x<0){
        	try {
        		num = -Integer.parseInt(inverseNum);
			} catch (NumberFormatException e) {
				return 0;
			}
        }else{
        	try {
        		num = Integer.parseInt(inverseNum);
			} catch (NumberFormatException e) {
				return 0;
			}
        }
            
        return num;
    }
}
