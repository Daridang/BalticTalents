package oop1.p0516;

public class HungryException extends Exception {
    private String code;

    public HungryException(String msg, String code) {
        super(msg);
        this.code = code;
    }

    public HungryException(ErrorCode code) {
        super(code.getMsg());
        this.code = code.name();
    }

    public String getCode() {
        return code;
    }


}
