package kr.heap;


import java.util.PriorityQueue;

public class HeapTest {

    public static void main(String[] args) {
        int [] arr = {3,7,5,4,2,8};
        System.out.println("정렬 전 배열");

        for (int a: arr)
        {
            System.out.print(a+"");
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

        for (int i = 0; i < arr.length; i++) {
            priorityQueue.add(arr[i]);

        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = priorityQueue.poll();
        }


        System.out.println("정렬 후 배열");
        for (int b: arr
             ) {
            System.out.print(b + "");

        }
    }
}
