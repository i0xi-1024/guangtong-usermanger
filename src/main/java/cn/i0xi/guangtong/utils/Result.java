package cn.i0xi.guangtong.utils;

import lombok.Getter;

@Getter
public class Result<T> {

    private int code = Status.SUCCESS.code;
    private String msg = null;
    private T data = null;


    private Result() {
    }

    private Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> Result<T> success() {
        return success(Status.SUCCESS.code, Status.SUCCESS.msg, null);
    }
    public static <T> Result<T> success(T data) {
        return success(Status.SUCCESS.code, Status.SUCCESS.msg, data);
    }

    public static Result<String> success(String msg) {
        return success(Status.SUCCESS.code, msg, (String) null);
    }

    public static Result<?> success(int code, String msg) {
        return success(code, msg, null);
    }

    public static <T> Result<T> success(int code, String msg, T data) {
        return new Result<>(code, msg, data);
    }

    public static Result<String> error(Exception e) {
        return new Result<>(Status.ERROR.code, Status.ERROR.msg, e.getMessage());
    }

    public static Result<String> error(String msg) {
        return new Result<>(Status.ERROR.code, msg, null);
    }

    public static Result<?> error(int code, String msg) {
        return new Result<>(code, msg, null);
    }

    public enum Status {
        SUCCESS(0, "成功"),
        ERROR(1, "失败");
        public int code;
        public String msg;

        Status(int i, String msg) {
            code = i;
            this.msg = msg;
        }
    }

}
