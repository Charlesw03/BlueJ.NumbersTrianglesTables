


public class NumberUtilities {

    public static String getRange(int stop) {
         String result = "";
          for( int x = 0; x< stop; x++){
             result += x;
            }
        return result;
    }

    public static String getRange(int start, int stop) {
           String result = "";
           for(int i = start ; i < stop; i++){
            result = result + i ;
            }
           
         return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        for(int i = start; i < stop; i +=step ){
            result = result + i;
            
        }
        
        return result ;
    }

    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        for(int i =start; i < stop ; i++){
           // if i mod 2 is equal to 0 we  have an even number b/c t
           // n remainder
            if( i%2 == 0){
             result += i;
            }
        }  
        
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
        for( int i= start; i < stop; i++){
            //if i mod 2 does not have a reaminder(only evens do) retur 
            //result
            if(i%2!=0){
             result+=i;   
            }
        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        
        String result = "";
        for(int i = start ; i <= stop; i++){
            double d = Math.pow(i,exponent);
            result = result + (int) d;
            
            
        }
        
        return result;
    }
}
