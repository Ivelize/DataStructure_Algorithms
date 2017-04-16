
public class Palindrome {
	public boolean isPalindrome(int x) {
        int inverseNum = 0;
        
        int xAbs = Math.abs(x);
        
        while(xAbs != 0){
            inverseNum = inverseNum * 10 + xAbs % 10;
            xAbs = xAbs/10;
        }
        
        if(x == inverseNum)
            return true;
            
        return false;    
    }

}
