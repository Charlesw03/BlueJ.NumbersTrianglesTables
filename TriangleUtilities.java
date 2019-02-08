 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String row = "";
         for(int x = 0; x < numberOfStars; x++){
             row = row + "*" ; }
        return row;
    }
    
    public static String getTriangle(int numberOfRows) {
        String row = "";
            for(int x = 1; x <= numberOfRows; x++){
              row += getRow(x) +"\n";
              System.out.println(row);
              
              
              
            }
        return row;
    }


    public static String getSmallTriangle() {
        String row ="";
         for(int x = 1; x <= 4; x++){
             row += getRow(x) +"\n";}
        return row;
    }

    public static String getLargeTriangle() {
            String row = "";
            for(int x = 1; x <= 9; x++) {
               row += getRow(x) + "\n";
            }
        return row; 
        
    }
}
