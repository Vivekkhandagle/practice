package com.example;

import java.util.HashMap;
import java.util.Map;

public class Non_Repeating_Character_IN_String {

    public static void main(String[] args) {

        String str="swisshellooi";
        Map<Character,Integer>map=new HashMap<>();
        for(char ch:str.toCharArray()) {

            map.put(ch,map.getOrDefault(ch,0)+1);
        }

       for (char ch:str.toCharArray())
       {
           if(map.get(ch)>1)
           {
               System.out.println(ch);
               break;
           }
       }


    }
}
