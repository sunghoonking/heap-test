package kr.heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Heap {

    private ArrayList<Integer> heap;
    public static void main(String[] args) {

        int [] arr = {2,5,1,6,7,3};
        System.out.println("정렬 전");
        for (int val : arr) {
            System.out.println(val);

        }
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
            System.out.println(heap);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = heap.poll();
        }

        for (int val : arr) {
            System.out.println(val);

        }


}

// 힙으로
}
