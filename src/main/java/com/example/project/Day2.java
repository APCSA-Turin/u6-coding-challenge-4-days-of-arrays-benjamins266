
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        int random = (int) (Math.random() * (1-0+1) + 0);
        String[][] naughtyOrNice = new String[names.length][names.length];
        for(int i = 0; i<names.length; i++){
            if(random == 0){
                naughtyOrNice[0][i] = names[i];
            } else {
                naughtyOrNice[1][i] = names[i];
            }
        }
        return naughtyOrNice;
        


    }

    public static void main(String[] args) {

    }
}