package org.ravi;

import java.util.Optional;

public class OptionalMethods {
    public static void main(String[] args) {
        String[] st = new String[10];
        String sentence = "Hi! Good Morning. I am Ravi.";
        String[] words = sentence.split(" ");
        int i = 0;
        for(String s : words){
            st[i] = s;
            i++;
        }
        Optional<String> word = Optional.ofNullable(st[5]);
//        if(word.isPresent()){
//            System.out.println(word.get());
//        } else {
//            System.out.println("out of bounds");
//        }
       // word.ifPresent(System.out::println);
        System.out.println(word.orElse("Didn't found any word."));
        if(word.isPresent()){
            word.map(s ->  "Yes, Yes!! I got the word -> " + s).ifPresent(System.out::println);
        }
    }


}
