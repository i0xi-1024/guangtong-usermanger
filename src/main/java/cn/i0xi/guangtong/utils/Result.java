package cn.i0xi.guangtong.utils;

public class Result<T> {

    private int code = 0;
    private String msg = null;
    private T data = null;


    private Result() {}


    public static <T> Result<T> success(T data){
        Result<T>result =  new Result<>();
        result.code = Status.OK.code;
        result.msg = Status.OK.msg;
        result.data = data;
        return result;
    }

    public static Result<String> success(String msg){
        Result<String>result =  new Result<>();
        result.code = Status.OK.code;
        result.msg = msg;
        result.data = null;
        return result;
    }

    public enum Status{
        OK(0,"成功"),
        ERROR(1,"失败");
        public int code;
        public String msg;

        Status(int i, String msg) {
            code = i;
            this.msg = msg;
        }
    }

}
