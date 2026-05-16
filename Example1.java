//Find numbers which are divided by 5 in Integer List

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
    int [] arr =new int[]{1,2,15,30,40};
    List<Integer> list =Arrays.stream(arr).boxed().collect(Collectors.toList());
      //list.stream().filter(n -> n%5==0).forEach(System.out :: println);
    List<Integer> ans=list.stream().filter(n -> n%5==0).toList();
    ans.stream().forEach(System.out :: println);
    }

}