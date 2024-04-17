public class Main {
    public static void main(String[] args) {
        //case 1
        Parent p = new Parent();
        p.printClass();

        //case 2
        Parent p1 = new Child(); //부모타입
        p1.printClass();

        //case 3
        Child c = new Child();
        Parent p2 = c;
        c.printClass();
        p2.printClass();
        c.printClass("case 3");

        //case 4
       /*부모 클래스의 객체는 자식 클래스를 참조할 수 없음
       *ClassCastException 발생*/
        Child c1 = (Child) new Parent();
        c1.printClass();
        c1.printClass("case 4");

    }
}