package com.poleemploi.javanese;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JavaneseTest
{

    @Test
    public void apply_without_entry(){
        //set
        Javanese javanese = new Javanese();
        //test
        String result = javanese.apply(null);
        //assert
        assertThat(result).isEmpty();
    }

    @Test
    public void apply_with_empty_entry(){
        //set
        Javanese javanese = new Javanese();
        String entry ="";
        //test
        String result = javanese.apply(entry);
        //assert
        assertThat(result).isEmpty();
    }

    @Test
    public void apply_with_only_consonant(){
        //set
        Javanese javanese = new Javanese();
        String entry ="tmlpfgbcs";
        //test
        String result = javanese.apply(entry);
        //assert
        assertThat(result).isEqualTo(entry);
    }

    @Test
    public void apply_with_first_letter_is_vowel(){
        //set
        Javanese javanese = new Javanese();
        String entry ="au";
        //test
        String result = javanese.apply(entry);
        //assert
        assertThat(result).isEqualTo("avau");
    }

    @Test
    public void apply_with_consonant_followed_by_vowel(){
        //set
        Javanese javanese = new Javanese();
        String entry ="bonjour";
        //test
        String result = javanese.apply(entry);
        //assert
        assertThat(result).isEqualTo("bavonjavour");
    }


}
