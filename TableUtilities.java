   

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int a;
        int b;
        String sum = "";
        
         for (a=1; a <= 5; a++){
            
             for(b=1; b <= 5; b++){
                 sum+= String.format("%3d |", a*b);
                }
              
                sum+= "\n";
            
            }
        
        return sum;
    }

    public static String getLargeMultiplicationTable() {
         int a;
         int b;
         String sum = "";
         
         for(a =1; a <= 10; a++){
             
             for(b=1; b <=10; b++){
                 
                 sum += String.format("%3d |", a*b);
                
                
                
                
                
               
            }
               
             sum += "\n";
            }
        
        return sum;
    }

    public static String getMultiplicationTable(int tableSize) {
        int a;
        int b;
        String sum = ""; 
          for(a=1; a <= tableSize;  a++){
             
              for(b=1; b <= tableSize; b++) {
                     sum += String.format( "%3d |", a*b); 
                  
                
                } 
                sum +="\n";
            }
        return sum;
    }
}
