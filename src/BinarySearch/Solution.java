package BinarySearch;

public class Solution {
    public static void main(String[] args) {
        int[]array = {1,3,5,6,9,10};
        System.out.println(binarySearch(array, 90));
        System.out.println(binarySearch2(array, 9));
        System.out.println("Binary Search Recursive");
        System.out.println(binarySearchRecurse(array, 9, 0, 6));
    }
  public static int binarySearch(int[]arr, int x){
        int left = 0, right = arr.length-1;
        while(left <= right){
          int pivot = left + (right - left)/2;
          if (arr[pivot] == x) return pivot;
          if (arr[pivot] > x)
              right = pivot -1;
          else
              left = pivot + 1;
        }
        return -1;
  }

  public static int binarySearch2(int[]arr, int target){
       int left = 0, right = arr.length-1;
       while(left <= right){
           int pivot = left + (right - left) / 2;
           if (arr[pivot] > target)
               right = pivot - 1;
           else if(arr[pivot] < target)
               left = pivot + 1;
           else
               return pivot;
       }
       return -1;
  }
    public static int binarySearchRecurse(int[] arr, int target, int left, int right){
        if (left > right) return -1;
        int pivot = left + (right - left) / 2;
        if (arr[pivot] == target) return pivot;
        else {
            if (arr[pivot] > target)
                right = pivot - 1;
            if(arr[pivot] < target)
                left = pivot + 1;
        }
            return binarySearchRecurse(arr, target, left, right);
    }
}


















