package com.company;

public class topic3 {
    public static void main(String[] args){

        int a[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        int aver;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        aver=sum/a.length;
        for(int i=0;i<a.length;i++){
            if(a[i]>aver)
            System.out.println(a[i]);
        }
    }
}
