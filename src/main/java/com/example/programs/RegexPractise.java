package com.example.programs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 



public class RegexPractise {
	public static String MyString = "gdwgdjhsgdg ghj12g@dkjjg.com jhkdgs 2873tihu"
			+ "sank@gmail.com"
			+ " lhdlhsdl;hsa;ld sanke@fb.com";
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\b[\\w]+@\\b[\\w.%-]+\\.[A-Za-z]{2,4}");
		String[] SplitString = MyString.split(" ");
		for (String word: SplitString) {
			if (p.matcher(word).matches()) {
				System.out.println(word);
			}
		}

		Matcher m = p.matcher(MyString);
		while(m.find()) {
			System.out.println(m.group());
		}
		String a = "Anagram";
		String b = "margana";
        HashMap<Character, Integer> aMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> bMap = new HashMap<Character, Integer>();
       
        for (char aChar: a.toCharArray()){
        	aMap.merge(aChar, 1, Integer::sum);
        }
        for (char bChar: b.toCharArray()){
        	bMap.merge(bChar, 1, Integer::sum);
        }
        if(aMap.equals(bMap)) {
        	System.out.println("Its Anagram");
        }
        else {
        	System.out.println("Its not Anagram");
        }
        char [] aChar =  a.toCharArray();
        int len = aChar.length;
        char [] Asorted = sortRecordsbubble(a.toCharArray());
        char [] Bsorted = sortRecordsbubble(b.toCharArray());
        int n = Asorted.length;
        for (int i = 0; i < n; i++) {
            char AChar = Asorted[i];
            char bChar = Bsorted[i]; 
            if (AChar >= 'A' && AChar <= 'Z'){
                AChar = (char) (AChar + 'a' - 'A');
            }
            if (bChar >= 'A' && bChar <= 'Z') {
                bChar = (char) (bChar + 'a' - 'A');
            }
            //System.out.printf("%c, %c", AChar, bChar);
            if (AChar != bChar) {
            	//System.out.printf("%c, %c", AChar, bChar);
                System.out.println("Not anagram");
            }
        }
        
        System.out.println("Anagram result" + isAnagram("Hello", "hello"));
        
        String s = " ";
        //regexString = regexString;
        String [] splitString = s.strip().split("[ !,?._'@]+");
        System.out.println(splitString.length);
        // for (String word: splitString) {
        // System.out.println(word);}
        try {
        Pattern p1 = Pattern.compile("[AZ[a-z](a-z)");
        System.out.println("Valid");
        } catch (Exception e) {
        	System.out.println("Invalid");
        }
        
		}
	
    public static char [] sortRecordsbubble(char [] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    }
    
    public static boolean isAnagram(String a, String b) {
        boolean result = true;
        char [] Aunsorted = a.toCharArray();
        char [] Bunsorted = b.toCharArray();
        int Alen = Aunsorted.length;
        for (int i = 0; i < Alen; i++) {
            if (Aunsorted[i] >= 'A' && Aunsorted[i] <= 'Z'){
            	Aunsorted[i] = (char) (Aunsorted[i] + 'a' - 'A');
            }
        }
        int Blen = Bunsorted.length;
        for (int i = 0; i < Blen; i++) {
            if (Bunsorted[i] >= 'A' && Bunsorted[i] <= 'Z'){
            	Bunsorted[i] = (char) (Bunsorted[i] + 'a' - 'A');
            }
        }
        char [] Asorted = sortRecordsbubble(Aunsorted);
        char [] Bsorted = sortRecordsbubble(Bunsorted);
        int n = a.length();
        if (b.length() < n){
            n = b.length();
        }
        for (int i = 0; i < n; i++) {
            char aChar = Asorted[i];
            char bChar = Bsorted[i];
            if (aChar >= 'A' && aChar <= 'Z'){
                aChar = (char) (aChar + 'a' - 'A');
            }
            if (bChar >= 'A' && bChar <= 'Z') {
                bChar = (char) (bChar + 'a' - 'A');
            }
            System.out.printf("%c, %c", aChar, bChar);
            if (aChar != bChar) {
                result = false;
            }
        }
        return result;

    }

}



class MyRegex{
	public static String pattern;
	public MyRegex(){
        pattern =  "[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}";
    }
}
