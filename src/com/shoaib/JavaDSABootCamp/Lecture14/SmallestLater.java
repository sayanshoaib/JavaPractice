package com.shoaib.JavaDSABootCamp.Lecture14;

public class SmallestLater {
    public static void main(String[] args) {
        char[] letters = {'a', 'c', 'f', 'i'};
        char target = 'd';
        int ans = smallestLetter(letters, target);
        System.out.println("index found at: " + ans);

    }

    static int smallestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        //int ceiling = 0;

        //find whether the array is sorted in ascending order or descending
        boolean isAsc = letters[start] < letters[end];
//        if (arr[start] < arr[end]) {
//            isAsc = true;
//        } else {
//            isAsc = false;
//        }

        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2; might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (letters[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if(target < letters[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > letters[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            //ceiling = mid + 1;
        }

        return letters[start % letters.length];
    }
}
