
public class StudentRewarded {
	
public boolean checkRecord(String s) {
	
		int countA = 0;
	
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == 'A'){
				countA = countA + 1;
			}else if(s.length() > i+2 && s.charAt(i) == 'L' && s.charAt(i+1) == 'L' && s.charAt(i+2) == 'L'){
				return false;
				
			}
		}
         
		if (countA > 1)
			return false;
		
		return true;
    }

}
