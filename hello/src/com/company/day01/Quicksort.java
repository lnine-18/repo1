package com.company.day01;

public class Quicksort {
    public static void main(String[] args) {
        int arr[] = {3, 4, 9, 7, 9, 10, 5,1};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i]);
        }
    }

    private static void quickSort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int aver = arr[(left + right) / 2];
        int temp;
        while (l < r) {
            while (arr[l] < aver) {
                l++;
            }
            while (arr[r] > aver) {
                r--;
            }
            if (l >=r) break;
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            if (arr[l] == aver) {
                r--;
            }
            if (arr[r] == aver) {
                l++;
            }

        }
        if(l==r){
            l++;
            r--;
        }
        if (left<r){
            quickSort(arr,left,r);
        }
        if(l<right){
            quickSort(arr,l,right);
        }
    }

}