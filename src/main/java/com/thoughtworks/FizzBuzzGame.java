package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private int count;
    private int specialNum1;
    private int specialNum2;
    private int specialNum3;
    private static final String fizzSlogan="Fizz";
    private static final String buzzSlogan="Buzz";
    private static final String whizzSlogan="Whizz";

    public void setSpecialNums(int[] nums){
        specialNum1=nums[0];
        specialNum2=nums[1];
        specialNum3=nums[2];
    }

    public void start(int count) {
        this.count=count;
        int[] specialNums=new int[]{3,5,7};
        setSpecialNums(specialNums);
    }

    public List<String> getResults() {
        List<String> results = new ArrayList<>();
        for (int i = 1; i <=count ; i++) {
            results.add(getResult(i));
        }
        return results;
    }


    public String getResult(int n) {
        if(n%10==specialNum1){
            return fizzSlogan;
        }

        int m=n;
        while (m/10>0){
            m/=10;
            if(m%10==specialNum1){
                return fizzSlogan;
            }
        }

        String resultStr="";
        if(n%specialNum1==0)
            resultStr+=fizzSlogan;
        if (n%specialNum2==0)
            resultStr+=buzzSlogan;
        if(n%specialNum3==0)
            resultStr+=whizzSlogan;

        if(resultStr.length()==0)
            return String.valueOf(n);

        return resultStr;
    }
}


