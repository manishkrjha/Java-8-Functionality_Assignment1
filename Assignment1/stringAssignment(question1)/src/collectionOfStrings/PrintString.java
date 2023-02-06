package collectionOfStrings;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintString {
    public static void main(String[] args){
//        Creating list of string
        List<String> stringList = Arrays.asList("This", "is", "my", "submission", "for", "this", "weeks", "example", "assignment", "Please", "review", "it");

//        Creating a list to display the result
        List<String> displayStringList = new ArrayList<String>();

        displayStringList = stringList.stream().filter(itr->(itr.length()>5 && itr.length()<8)).collect(Collectors.toList());

        System.out.println("The following strings have length greater than 5 and less than 8");
        System.out.print(displayStringList);
    }
}
