package techmentTrainingDay12.stream;

import java.util.stream.Stream;

public class Distinct{  
   public static void main(String[] args) {  
   	Stream.of("Jai", "Mahesh", "Vishal", "Naren", "Hemant", "Naren", "Vishal")
       .distinct()
       .forEach(System.out::println);
   }  
}