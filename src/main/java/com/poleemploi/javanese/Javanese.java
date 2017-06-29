package com.poleemploi.javanese;

import java.util.Arrays;
import java.util.List;

public class Javanese
{

    public String apply(String entry) {
        if(entry == null || entry.isEmpty()){
            return "";
        }
        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u", "y");
        String[] letters = entry.toLowerCase().split("");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < letters.length; i++) {
            if( i == 0 && vowels.contains(letters[i])){
                result.append("av").append(letters[i]);
            }else if(vowels.contains(letters[i]) && !vowels.contains(letters[i-1])){
                result.append("av").append(letters[i]);
            }else{
                result.append(letters[i]);
            }
        }

        return result.toString();
    }
}
