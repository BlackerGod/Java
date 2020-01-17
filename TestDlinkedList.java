public class TestDlinkedList {
    public static void main(String[] args) {
        DLinkedList newList =new DLinkedList();
//        newList.addFirst(1);   //头插测试
//        newList.addFirst(2);
//        newList.addFirst(3);
//        newList.addFirst(4);
//        newList.display();
        newList.addLast(1);
        newList.addLast(1);
        newList.addLast(1);
        newList.addLast(1);
//        newList.addIndex(0,0);    插入
//        newList.addIndex(5,5);
//        System.out.println(newList.contains(0)); 判断存在
//        newList.remove(10);  判断删除第一个
//        newList.removeAllKey(1);删除全部key值
         newList.clear();
        newList.display();
//        System.out.println(newList.size());   长度
    }


}
