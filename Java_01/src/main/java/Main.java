import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>(Arrays.asList("H-","-H-","-H-H-","H-HHH-","HH-H-H","HH--HH","H-HH-","H--H-H-"));
        for (String item: test) {
            int result =  Exercise.minTankNeeded(item);
            System.out.println(result);
        }

    }

}
