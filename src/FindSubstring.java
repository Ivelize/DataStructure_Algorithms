import java.util.HashMap;
import java.util.Map;


public class FindSubstring {
	
	public int minimumRemovals(String s1, String s2){
		int removalsNum = 0;
		String maior, menor ="";
		String newStr = "";
		boolean found = false;
	
		if(s1.length() > s2.length()){
			maior = s1;
			menor = s2;
		}else{
			maior = s2;
			menor = s1;
		}
		
		
		for (int i = 0; i < maior.length(); i++) {
			found = false;
			if(menor.length() == 0)
				removalsNum = removalsNum + 1;
			for (int j = 0; j < menor.length(); j++) {
				if(menor.charAt(j) == maior.charAt(i)){
					newStr = newStr + menor.charAt(j);
					if(menor.length() > j+1)
						menor = menor.substring(j+1);
					found = true;
					break;
				}
				
			}
			if(!found)
				removalsNum = removalsNum + 1;
		}
		
		System.out.println(newStr);
			
		return removalsNum;
	}

}
