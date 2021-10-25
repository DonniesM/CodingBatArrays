package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(maxSpan(a));
    }
    private static int maxSpan(int[] nums){
        int f=0,b=0;
        int count=1;
        int maxCount=1;
        int currentValue = 0;

        if(nums.length==0){
            return 0;
        }


        for(int i=0;i<nums.length;i++){

            currentValue = nums[i];
            if(currentValue!=nums[i]){
                continue;
            }
            for(int k=nums.length-1;k>=0;k--){
                if(currentValue==nums[k]){
                    f=i;
                    b=k;
                    if (f<b){
                        //System.out.println("Current Value = "+currentValue);
                        count = (b-f)+1;
                        if (count>maxCount){
                            maxCount=count;
                        }
                    }
                }
            }
        }

        return maxCount;
    }
}
