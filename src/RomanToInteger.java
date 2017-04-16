import java.util.HashMap;
import java.util.Map;


public class RomanToInteger {
	
	public int romanToInt(String s) {
        Map<Character, Integer> convert = new HashMap<Character,Integer>();
        convert.put('I', 1);
        convert.put('V', 5);
        convert.put('X', 10);
        convert.put('L', 50);
        convert.put('C', 100);
        convert.put('D', 500);
        convert.put('M', 1000);
        
        int numValue = 0;
        
        for(int i=0; i<s.length(); i++){
            	if(s.length() > i+1 && convert.get(s.charAt(i+1)) > (convert).get(s.charAt(i))){
            		numValue = numValue + (convert.get(s.charAt(i+1)) - convert.get(s.charAt(i)));
            		i = i + 1;
            	}else{
            		numValue = numValue + convert.get(s.charAt(i));
            	}
        }
        
        return numValue;
    }

}
