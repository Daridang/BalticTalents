package oop1.p0516;

public class Main2 {
    public static void main(String[] args) {
        try {
            throwHungryException2();
        } catch (HungryException e) {
            //e.printStackTrace();
            System.out.println(e.getCode());
            System.out.println(e.getMessage());
        }
    }

    private static void throwHungryException() throws HungryException {
        throw new HungryException("String1", "String2");
    }

    private static void throwHungryException2() throws HungryException {
        throw new HungryException(ErrorCode.HUNGRY);
    }
}
