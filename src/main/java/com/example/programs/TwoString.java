package com.example.programs;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoString {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        HashMap<Character, Integer> CharHash = new HashMap<Character, Integer>();
        for (int i = 0; i< s1.length(); i++){
            if (CharHash.get(s1.charAt(i)) == null){
                CharHash.put(s1.charAt(i), 1);
            }   
        }
        for (int j = 0; j < s2.length(); j++) {
            if (CharHash.get(s2.charAt(j)) != null) {
                return "YES";
            }
        }
        System.out.println(s1.split("a").toString());
        
        return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();
            
            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
