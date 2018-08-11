import java.util.HashMap;

public class NonRepeating {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        Character c,d ;
        c =nonRepeating("abcab"); // should return 'c'
        nonRepeating("abab"); // should return null
        nonRepeating("aabbbc"); // should return 'c'
        d =nonRepeating("aabbdbc"); // should return 'd'

       System.out.println(c);
       System.out.println(d);
    }

    // Implement your solution below.
    public static Character nonRepeating(String s) {
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            int count = 1;
            if(map.containsKey(s.charAt(i))){
              count = map.get(s.charAt(i));
                count = count + 1;
            }
            map.put(s.charAt(i), count);
        }

        for(i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i))== 1){
                return s.charAt(i);
            }
        }
        return null;
    }
}
