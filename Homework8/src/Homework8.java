public class Homework8 {
    public static void main(String[] args) {
   Sequence test=new Sequence();
   test.add(0,1);
   test.add(1,2);
   test.display();
//   System.out.println(test.search(2));
//   System.out.println(test.include(2));
//   System.out.println(test.src(2));
//   test.setValue(50,50);
//   test.display();
//        test.del(2);
//        test.display();
        System.out.println(test.getLength());
        test.clear();
        test.display();
    }

}
