package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
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
        List<Integer>res=new ArrayList();
        for(Integer a:array){
            res.add(a*3);
        }
        return  res;
    }

    public List<String> mapLetter() {
        List<String>res=new ArrayList();
        for(Integer a:array){
            res.add(String.valueOf((char)(a+96)));
        }
        return res;
    }

    public List<String> mapLetters() {
        throw new NotImplementedException();
    }

    public List<Integer> sortFromBig() {
        int temp;
        for(int i=0;i<array.size();i++){
            for(int j=i+1;j<array.size();j++){
                if(array.get(i)<array.get(j)){
                    temp=array.get(i);
                    array.set(i,array.get(j));
                    array.set(j,temp);
                }
            }
        }
        return array;
    }

    public List<Integer> sortFromSmall() {
        int temp;
        for(int i=0;i<array.size();i++){
            for(int j=i+1;j<array.size();j++){
                if(array.get(i)>array.get(j)){
                    temp=array.get(i);
                    array.set(i,array.get(j));
                    array.set(j,temp);
                }
            }
        }
        return array;
    }
}
