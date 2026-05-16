
import java.util.Arrays;
import java.util.stream.Collectors;
public class Example2{
    public static void main(String[] args) {

        int [] arr = new int[]{1,2,3,4,5,6,0,10};
        int Max= Arrays.stream(arr).max().getAsInt();
        System.out.println(Max);
    }

}