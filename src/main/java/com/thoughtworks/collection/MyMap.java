package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().mapToInt(Integer::intValue).map(i->i*3).boxed().collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        throw new NotImplementedException();
        //return array.stream().mapToInt(Integer::intValue).map(i->Integer.valueOf((char)(i+48))).boxed().collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        throw new NotImplementedException();
    }

    public List<Integer> sortFromBig() {
        List<Integer>res=array.stream().sorted().collect(Collectors.toList());
        Collections.reverse(res);
        System.out.println(res);
        return res;
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted().collect(Collectors.toList());

    }
}
