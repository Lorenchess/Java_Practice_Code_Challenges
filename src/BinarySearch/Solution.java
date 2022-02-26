package BinarySearch;

public class Solution {
    public static void main(String[] args) {
        int[]array = {1,3,5,6,9,10};
        System.out.println(binarySearch(array, 90));
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
}
