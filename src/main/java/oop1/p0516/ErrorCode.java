package oop1.p0516;

public enum ErrorCode {
    HUNGRY("I'm very hungry!");
    private String msg;
    ErrorCode(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
