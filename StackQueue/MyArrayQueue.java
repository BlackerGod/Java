package StackQueue;

public class MyArrayQueue {
    public int[] data = new int[100];
    public int head = 0;
    public int tail = 0;
    public int size = 0;

    //入队
    public boolean offer(int x) {
        if (size == data.length) {
            return false;
        }
        data[tail] = x;
        tail++;
        if (tail == data.length) {
            tail = 0;
        }
        size++;
        return true;
    }

    //出队
    public Integer poll() {
        if (size == 0) {
            return null;
        }
        Integer ret = data[head];
        head++;
        if (head == data.length) {
            head = 0;
        }
        size--;
        return ret;
    }

    //队首
    public Integer peek() {
        if (size == 0) {
            return null;
        }
        return data[head];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        MyArrayQueue myQueue2 = new MyArrayQueue();
        myQueue2.offer(1);
        myQueue2.offer(2);
        myQueue2.offer(3);
        myQueue2.offer(4);
        while (!myQueue2.isEmpty()) {
            Integer cur = myQueue2.peek();
            System.out.println(cur);
            myQueue2.poll();
        }
    }
}
