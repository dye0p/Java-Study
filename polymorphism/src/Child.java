public class Child extends Parent {

    //Parent 클래스의 printClass 재정의 (오버라이드)
    @Override
    public void printClass() {
        System.out.println("This class is Child");
    }

    //동일한 클래스 이름이지만 타입과 매개변수가 다름 (오버로딩)
    public String printClass(String str) {
        System.out.printf("This Class is Child and Parameter is %s\n", str);
        return str;
    }
}
