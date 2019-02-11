package com.example.programs;
import java.io.*;
import java.util.ArrayList; 
  
class GFG  
{ 	static int counter = 0;
    // Function that print all combinations of  
    // balanced parentheses 
    // open store the count of opening parenthesis 
    // close store the count of closing parenthesis 
    static void _printParenthesis(char str[], int pos, int n, int open, int close) 
    { 
        if(close == n)  
        { 
            // print the possible combinations 
            for(int i=0;i<str.length;i++) 
                {System.out.print(str[i]);}
            	counter++;
            	System.out.print(counter );
            	System.out.println(); 
            return; 
        } 
        else
        { 
            if(open > close) { 
                str[pos] = ')'; 
                _printParenthesis(str, pos+1, n, open, close+1); 
            } 
            if(open < n) { 
                str[pos] = '('; 
                _printParenthesis(str, pos+1, n, open+1, close); 
            } 
        } 
    } 
      
    // Wrapper over _printParenthesis() 
    static void printParenthesis(char str[], int n) 
    { 
        if(n > 0) 
        _printParenthesis(str, 0, n, 0, 0); 
        return; 
    } 
      
    // driver program  
    public static void main (String[] args)  
    { 
        int n = 5; 
        char[] str = new char[2 * n]; 
        printParenthesis(str, n); 
    }
    
    static void Calculate(int n){
        ArrayList<String> OldList = new ArrayList<String>();
        
        for (int i=0; i<n; i++){
        
          if(i==0){
          	OldList.add("()");
          } else{
            ArrayList<String> newList = new ArrayList<String>();
            for(String elem: OldList){
              
              newList.add(new String("(" + elem + ")"));
              newList.add(new String(elem + "()"));
              newList.add(new String("()" + elem));
              
            }
            newList.remove(newList.size()-1);
            System.out.println(newList);
            System.out.println(newList.size());
            OldList = newList;
          }
          
          
        }
        
      }
} 