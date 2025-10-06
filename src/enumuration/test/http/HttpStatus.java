package enumuration.test.http;

/*
HTTP 상태 코드 정의
참고: HTTP 상태 코드는 200 - 299사이의 숫자를 성공으로 인정한다.
HTTP는 웹의 기반

좋은 프로그래밍은 제약이 있는 프로그래밍
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

    public static HttpStatus findByCode(int code) {
        // HttpStatus[] values = HttpStatus.values();
        HttpStatus[] values = values();
        for (HttpStatus status : values) {
            if (status.getCode() == code) {
                return status;
            }
        }
        return null;
    }

    public boolean isSuccess() {
        return 200 <= code && code <= 299;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
