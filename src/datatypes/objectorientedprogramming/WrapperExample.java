package datatypes.objectorientedprogramming;

public class WrapperExample {
    Byte wrapperByte;
    Short wrapperShort;
    Integer wrapperInt;
    Long wrapperLong;
    Float wrapperFloat;
    Double wrapperDouble;
    Boolean wrapperBoolean;
    Character wrapperChar = 'A';
    String stringExample = "this is not a wrapper data type."; // though this is not a wrapper datatype
    public void printWrapperInfo() {
        System.out.println("wrapperByte " + wrapperByte);
        System.out.println("wrapperShort " + wrapperShort);
        System.out.println("wrapperInt " + wrapperInt);
        System.out.println("wrapperLong " + wrapperLong);
        System.out.println("wrapperFloat " + wrapperFloat);
        System.out.println("wrapperDouble " + wrapperDouble);
        System.out.println("wrapperBoolean " + wrapperBoolean);
        System.out.println("wrapperChar " + wrapperChar);
        System.out.println("wrapper Char value" + wrapperChar.charValue());
        System.out.println ("string Example " + stringExample);
    }
}
