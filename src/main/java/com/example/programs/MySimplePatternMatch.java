package com.example.programs;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class MySimplePatternMatch {
 
    public boolean isPatternMatching(String line){
     
        Pattern ptn = Pattern.compile("\\d{2}$");
        Matcher mtch = ptn.matcher(line);
        if(mtch.find()){
            return true;
        }
        return false;
    }
     
    public static void main(String a[]){
        MySimplePatternMatch msp = new MySimplePatternMatch();
        System.out.println("Is 'ddfsa12' ends with min 2 digits? "
                    +msp.isPatternMatching("ddfsa12"));
        System.out.println("Is 'ddfsa12adf1' ends with min 2 digits? "
                    +msp.isPatternMatching("ddfsa12adf1"));
    }
}