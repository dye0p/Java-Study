public class Main {
    public static void main(String[] args) {
        Capsule capsule = new Capsule(10);

        /*데이터 처리방식을 외부에서 알 수 없음*/
        System.out.println(capsule.half());
    }
}