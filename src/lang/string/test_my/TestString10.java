package lang.string.test_my;

// split(), join()
public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        // 코드 작성
        String[] fruitArr = fruits.split(",");
        for (String f : fruitArr) {
            System.out.println(f);
        }

        String joinedString = String.join("->", fruitArr);
        System.out.println("joinedString = " + joinedString);
    }
}
