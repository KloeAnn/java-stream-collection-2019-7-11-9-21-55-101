package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer>res=new ArrayList();
        for(int a:array){
            if(a%2==0)
                res.add(a);
        }
        return  res;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer>res=new ArrayList();
        for(int a:array){
            if(a%3==0)
                res.add(a);
        }
        return  res;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer>res=new ArrayList();
        for(int i=0;i<firstList.size();i++){
            for(int j=0;j<secondList.size();j++){
                if(firstList.get(i)==secondList.get(j)){
                    res.add(firstList.get(i));
                }
            }
        }
        return res;
    }

    public List<Integer> getDifferentElements() {
        Set set=new HashSet(array);
        List<Integer> resList= new ArrayList<>(set);
        return resList;
    }
}