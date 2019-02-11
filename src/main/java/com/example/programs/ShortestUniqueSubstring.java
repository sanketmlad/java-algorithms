package com.example.programs;
import java.io.*;
import java.util.*;

class ShortestUniqueSubstring {

  static String getShortestUniqueSubstring(char[] arr, String str) {
    int n = arr.length;
    List<char[]> arrList = Arrays.asList(arr);
    int strlen = str.length();
    int minLen = strlen+2;
    String result = "";
    String tempString = "";
    int headIndex = 1;
    int tailIndex = 0;
    
    boolean isValid = false;
    while (tailIndex<=strlen-n){
      tempString = str.substring(tailIndex, headIndex);
      System.out.println(tempString);
      char [] tempChars = tempString.toCharArray();
      
      System.out.println(" a in b " + tempString + " tail index " + tailIndex + " head index " + headIndex);
      System.out.println(Arrays.asList(tempChars).containsAll(Arrays.asList(arr)));
      
      if (!Arrays.asList(tempChars).containsAll(Arrays.asList(arr))) {
            headIndex ++;
      }else{
            tailIndex ++;} 
    }
    return result;
  }

  public static void main(String[] args) {
    String str = "xyz"; 
    char [] charArray = str.toCharArray();
    System.out.println(ShortestUniqueSubstring.getShortestUniqueSubstring(charArray, "xyyzyzyx"));
  }

}