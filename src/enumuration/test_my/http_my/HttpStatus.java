package enumuration.test_my.http_my;

/*
HTTP 상태 코드 정의
참고: HTTP 상태 코드는 200 - 299사이의 숫자를 성공으로 인정한다.
 */
public enum HttpStatus {
    // 코드 작성
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),;

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int input) {
        HttpStatus[] values = HttpStatus.values();
        for (HttpStatus value : values) {
            if (value.getCode() == input) {
                return value;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return code == 200;
    }
}
