package exceptionTest;

public class ThrowExceptionEx {
    // 첫 번째 케이스 : 자식이 해결
    // 심부름하는 자식
    public static int divide(int x, int y) {
        try {
            return x / y;    // 원인은 얘한테 있음
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
    // 심부름 시키는 부모
    static void main(String[] args) {
        int result = divide(10, 0);
        System.out.println(result);
    }
}
