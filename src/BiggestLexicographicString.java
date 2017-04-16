
public class BiggestLexicographicString {
	
	/*
	 * Step 1: Compare every string with its own reverse, if the reverse is lexicographically bigger, 
	 * then replace the string with reverse.
	   Step 2: Concatenate all the strings into one, called 'stot'.
	   Step 3: Try all the cut cases: loop over every string and every character within the string. 
	   For each case, you have to consider using the string or its reverse, and build two candidate 
	   solutions s1, s2. 
	   Compare s1, s2 with the current best solution. Finally you get the best solution.
	 * 
	 */
	
	public String splitLoopedString(String[] strs) {
	    String stot = "";
	    for (int i = 0; i < strs.length; i++) {
	        String rever = new StringBuffer(strs[i]).reverse().toString();
	        if (rever.compareTo(strs[i]) > 0) strs[i] = rever;
	        stot = stot + strs[i];
	    }
	    System.out.println("Strs: " + strs);
	    System.out.println("Stot: " + stot);
	    int start = 0;
	    String sol = stot;
	    for (int i = 0; i < strs.length; i++) {
	        int n = strs[i].length();
	        start += n;
	        String rever = new StringBuffer(strs[i]).reverse().toString();
	        String other_strs = stot.substring(start) + stot.substring(0, start - n);
	        for (int j = 0; j < n; j++) {
	            String s1 = strs[i].substring(j) + other_strs + strs[i].substring(0, j);
	            String s2 = rever.substring(n-1-j) + other_strs + rever.substring(0, n-1-j);
	            if (s1.compareTo(sol) > 0) sol = s1;
	            if (s2.compareTo(sol) > 0) sol = s2;
	        }
	    }
	    return sol;
	}


}
