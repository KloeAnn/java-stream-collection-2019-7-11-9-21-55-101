package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        return  array.stream().mapToInt(Integer::byteValue).filter(i->i%2==0).boxed().collect(Collectors.toList());
    }

    public List<Integer> filterMultipleOfThree() {
        return  array.stream().mapToInt(Integer::byteValue).filter(i->i%3==0).boxed().collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        Set<Integer>set1=new HashSet<>(firstList);
        Set<Integer>set2=new HashSet<>(firstList);
        return set1.stream().filter(i->set2.stream().mapToInt(Integer::byteValue).filter(j->j==i).boxed().collect(Collectors.toList()).size()!=0).collect(Collectors.toList());

    }

    public List<Integer> getDifferentElements() {
        return new ArrayList<>(array.stream().collect(Collectors.toSet()));
    }
}