package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum=0,temp;
        if(leftBorder>rightBorder){
            temp=leftBorder;
            leftBorder=rightBorder;
            rightBorder=temp;
        }

        for(int i=leftBorder;i<=rightBorder;i++){
            if(i%2==0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
       int sum=0;
        for(int i=0;i<arrayList.size();i++){
           sum+=arrayList.get(i)*3+2;
        }
        return  sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2==1){
                res.add(arrayList.get(i)*3+2);
                System.out.println(arrayList.get(i));
            }
            else{
                res.add(arrayList.get(i));
                System.out.println(arrayList.get(i));
            }

        }
        return  res;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        double res=0;
        for(int i=0;i<arrayList.size();i++){
           if(i%2==1)
               res+=arrayList.get(i);
        }
        return  res/(arrayList.size()/2);

    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2==0)
                res.add(arrayList.get(i));
        }

        Set result = new HashSet(res);
        List<Integer> resList= new ArrayList<>(result);
        return  resList;
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
