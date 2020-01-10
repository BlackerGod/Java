public class Test {
    public static void main(String[] args) {
//        LinkedList test=new LinkedList();
//        test.addFirst(1);
//        test.addFirst(2);
//        test.addFirst(3);
//        test.addFirst(4);
//        test.reverseOut();
////        test.addLast(4);
//        test.addLast(5);
//        test.addLast(5);
////        test.addIndex(2,20);
////        test.remove(1);
////        System.out.println(test.size()+1);//我们返回的是数组下标 所以加1
//        test.removeAllKey(3);
//        test.display(test.midValue());
//        System.out.println(test.contains(1));


        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.display();
//        linkedList.addAtTail(3);
//        linkedList.display();
        linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
        linkedList.display();
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(2));//返回2
//        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
//        System.out.println(linkedList.get(1));           //返回3

    }

}
