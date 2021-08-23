package techmentTrainingDay12.stream;

import java.util.Arrays;
import java.util.List;
 
public class Upper{  
    public static void main(String[] args) {  
    	List<String> names = Arrays.asList("Jai", "Mahesh", "Vishal", "Hemant", "Naren");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }  
}