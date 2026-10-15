package com.example;

public class Second_Largest_Element {
    public static void main(String[] args) {
        int []arr={10, 5, 20, 8, 20, 15};
        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;

        for(int i:arr)
        {
            if(i>max)
            {
                sec_max=max;
                max=i;
            }

           else  if(i<max && sec_max<i)
            {
                sec_max=i;
            }
        }
        if (sec_max == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest element: " + sec_max);
        }

        System.out.println(sec_max);
    }
}
