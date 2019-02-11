package com.example.programs;
class LongestSubStringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        int MaxSubstr = 0;
        int MaxSofar = 0;
        int [] charMap = new int [200];
        char [] sCharArray = s.toCharArray();
        for(char c: sCharArray){
            System.out.println(c + " " + MaxSofar + " " + MaxSubstr);
            /*if ((int)c < 97){
            	
                continue;
            }
            if ((int)c > 122){
            	
                continue;
            }*/
            if (charMap[(int)c] == 0){
            	System.out.println("If condition");
                MaxSofar++;
                charMap[(int)c] = 1;
            }else{
            	System.out.println("Else condition");
                charMap = new int [200];
                MaxSofar =1;
                charMap[(int)c] = 1;
            }
            if(MaxSofar> MaxSubstr){
                MaxSubstr = MaxSofar;
            }
            
        }
        
        return MaxSubstr;
    }
    public static void main(String[] args) {
    	System.out.println(lengthOfLongestSubstring("dvdf"));
    }
    
}