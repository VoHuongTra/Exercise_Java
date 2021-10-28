import java.util.ArrayList;
import java.util.List;

public class Exercise {
    public static int minTankNeeded(String input) {
        List<Integer> tankIndex = new ArrayList<>();
        if(input.length() == 1) {
            return -1;
        }
        if(input.chars().allMatch(x -> x == 'H') || input.chars().allMatch(x -> x == '-')){
            return -1;
        }
        for (int i = 0; i < input.length(); i++) {
            char prevChar = getPreviousChar(input,i);
            char nextChar = getNextChar(input,i);
            int index = i;
            if(input.charAt(i) == 'H') {
                if((prevChar == 0 && nextChar == 'H') || (prevChar == 'H' && nextChar == 'H') || (prevChar == 'H' && nextChar == 0)) {
                    return -1;
                }
                if(nextChar == '-' && !tankIndex.stream().anyMatch(x -> x == index -1)) {
                    if(!tankIndex.stream().anyMatch(x -> x == index +1)) {
                        tankIndex.add(index +1);
                        continue;
                    }
                }
                if(prevChar == '-') {
                    if(!tankIndex.stream().anyMatch(x -> x == index -1)) {
                        tankIndex.add(index -1);
                        continue;
                    }
                }
            }
        }
    return tankIndex.size();
    }
    public static char getPreviousChar(String input, int index){
        if(index > 0) {
            return input.charAt(index-1);
        }
        return 0;
    }
    public static char getNextChar(String input, int index){
        if(index < input.length()-1) {
            return input.charAt(index+1);
        }
        return 0;
    }
}
