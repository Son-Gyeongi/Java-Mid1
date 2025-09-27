package lang.string.method;

// String 클래스 주요 메서드 - 문자열 분할 및 조합
public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // split() - 분할
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        // String joinStr = ""; // 복잡한 문자열 합치기
/*
        for (String string : splitStr) {
            joinStr += string + "-";
        }
*/
/*
        for (int i = 0; i < splitStr.length; i++) {
            String string = splitStr[i];
            joinStr += string;
            if (i != splitStr.length - 1) {
                joinStr += "-";
            }
        }
        System.out.println("joinStr = " + joinStr);
*/

        // join() - 조합, 분리된 문자를 합침
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 = " + joinedStr);

        // 문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }
}
