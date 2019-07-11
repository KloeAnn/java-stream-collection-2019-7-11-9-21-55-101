package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer>res=new ArrayList();
        if(left<right)
            while (left<=right){
                res.add(left);
                left++;
            }
        else{
            while (left>=right){
                res.add(left);
                left--;
            }
        }
        return res;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer>res=new ArrayList();
        if(left<right)
            while (left<=right){
                if(left%2==0)
                res.add(left);
                left++;
            }
        else{
            while (left>=right){
                if(left%2==0)
                res.add(left);
                left--;
            }
        }
        return res;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer>res=new ArrayList();
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0)
                res.add(array[i]);
        }
        return res;
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
