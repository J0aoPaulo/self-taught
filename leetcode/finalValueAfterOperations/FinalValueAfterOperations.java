/**
 * FinalValueAfterOperations
 */
public class FinalValueAfterOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        
        for (int idx = 0; idx < operations.length; idx++) {
            switch (operations[idx].charAt(1)) {
                case '+' -> x++; 
                case '-' -> x--;
            }
        }
        return x;
    }
}