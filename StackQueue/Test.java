package StackQueue;

public class Test {
    public static void main(String[] args) {
        MyListTrack track=new MyListTrack();
        track.push(1);
        System.out.println(track.pop());
        track.push(2);
        System.out.println(track.pop());
        track.push(3);
        System.out.println(track.pop());
        track.push(4);
        System.out.println(track.pop());
        System.out.println(track.isEmpty());


    }

}
