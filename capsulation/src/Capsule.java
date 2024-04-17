public class Capsule {
    //상태 필드
    int num;

    public Capsule(int num) {
        this.num = num;
    }

    /*데이터 처리 행위를 객체 내부에서 처리하여 외부에서 알 수 없도록 캡슐화*/
    public double half() {
        return (double) num / 2;
    }
}
