package exceptionTest;

public class TryCatchEx {
    static void main(String[] args) {
        // exit code 0 : 정상 종료
        // exit code 1 : 강제 종료
        // ArithmeticException : / by zero
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없어요");
            System.out.println("오류 메시지 : " + e.getMessage());
        } catch (Exception e) {    // Exception : 모든 예외의 조상
            System.out.println("오류 메시지 : " + e.getMessage());
        } finally {
            System.out.println("여긴 무조건 실행돼요");    // 성공해도 실패해도
        }
        // ArrayIndexOutOfBoundsException
        System.out.println("================================================");
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("오류 메시지 : " + e.getMessage());
        } finally {
            System.out.println("여긴 무조건 실행돼요");
        }
    }
}
