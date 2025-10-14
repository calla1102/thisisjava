package ch05.sec04;

public class NullPointerExceptionExample {

    public static void main(String[] args) {

        int[] intArray = new int[3]; 
        System.out.println("배열 길이 : " + intArray.length);

        // 문자열 예시
        String str = null;

        // null 체크 후 안전하게 처리
        if (str != null) {
            System.out.println("총 문자수 : " + str.length());
        } else {
            System.out.println("총 문자수 : 0 (문자열이 null입니다)");
        }
    }
}
