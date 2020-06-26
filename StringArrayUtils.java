import java.util.*; 
/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean contain = false;

        for(int i = 0; i < array.length; i++){
            if(array[i] == value)
                contain = true;
        }

        return contain;
    }

      /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

    	String[] reversedA = array;
    	
    	for(int i=0; i<reversedA.length/2; i++){ 
    		String temp = reversedA[i]; 
    		reversedA[i] = reversedA[reversedA.length -i -1];
    		reversedA[reversedA.length -i -1] = temp; }
  

        return reversedA;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        boolean isSame = false;
        

        String[] reversedA = new String[array.length];
        reversedA =	reverse(array);

        if(reversedA == array)
            isSame = true;
        

        return isSame;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        boolean isUsed = false;

        Set<Integer> alphabet = new HashSet<>(26);

       
        int cnt = 0;
        
        String sentence = " ";

        for(int i = 0; i < array.length; i++) {
        	sentence += array[i];
        }

        for (char c : sentence.toCharArray()) {
            int n = c - 'a';
            if (n >= 0 && n < 26) {
                if (alphabet.add(n)) {
                    cnt += 1;
                    if (cnt == 26) {
                        isUsed = true;
                        break;
                    }
                }
            }
        }
        
        return isUsed;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        
        for(int i = 0; i < array.length; i++) {
        	if(array[i] == value)
        		count++;
        }
        
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        
        
         if (array != null) {
    	        List<String> list = new ArrayList<String>(Arrays.asList(array));
    	        for (int i = 0; i < list.size(); i++) {
    	            if (list.get(i).equals(valueToRemove)) {
    	                list.remove(i);
    	            }
    	        }
    	        return list.toArray(new String[0]);
    	    } else {
    	        return new String[0];
    	    }
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
    	
             String temp=array[0];
     	
      	 for(int i = 1; i < array.length; i++) {
      		 
      		 if(array[i]==array[i-1]) {
      			 
      		 }
      		 else
      		 {
      			temp+=" ";
      			temp+=array[i];
      		 }
      		 
      	 }
        
        
        
//          System.out.print(temp);
          
          String strArray[] = temp.split(" ");
          
          for(int i = 0; i < strArray.length; i++)
          {
       	   System.out.print(strArray[i]+" ");
          }
      	
            return strArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
    	
     String temp=array[0];
     	
   	 for(int i = 1; i < array.length; i++) {
   		 
   		 if(array[i]==array[i-1]) {
   			 temp+=array[i];
   		 }
   		 else
   		 {
   			temp+=" ";
   			temp+=array[i];
   		 }
   		 
   	 }
     
     
     
//       System.out.print(temp);
       
       String strArray[] = temp.split(" ");
       
       for(int i = 0; i < strArray.length; i++)
       {
    	   System.out.print(strArray[i]+" ");
       }
   	
         return strArray;
    }

}
