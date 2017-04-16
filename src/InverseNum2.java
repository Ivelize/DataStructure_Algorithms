
public class InverseNum2 {
    public int reverse(int x) {
		Long inverseNum = 0l;
		int input = Math.abs(x);

		while(input!=0){
		   inverseNum = (inverseNum * 10) + (input % 10); 
		   input = input/10;
		}
		
		if(x<0)
        	inverseNum = -inverseNum;
        	
		if(inverseNum > 2147483647 || inverseNum < -2147483648)
        	return 0;
            
        return inverseNum.intValue();
    }

}
