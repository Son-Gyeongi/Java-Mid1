package lang.object.tostring;

public class ObjectPrinter {

    // 3. Object 다형성 활용
    public static void print(Object obj) {
        String string = "객체 정보 출력: " + obj.toString();
        System.out.println(string);
    }
}
