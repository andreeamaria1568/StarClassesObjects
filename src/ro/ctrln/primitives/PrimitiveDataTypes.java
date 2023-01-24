package ro.ctrln.primitives;

import sun.font.TrueTypeFont;

public class PrimitiveDataTypes {

    public static void main(String[] args) {
        byte b1 = -128;
        byte b2 = 127;
        byte b3 = 30;
        byte b4 = (byte) 130;
        System.out.println(b4);

        short s1 = -32768;
        short s2 = 32767;
        short s3 = 10468;
        int s4 = 40691;
        System.out.println(s4);

        int i1 = 456776876;
        int i2 = -345976123;
        long i3 = 123456789123L;
        long l1 = 42567892;
        long l2 = -521567891;
        float f1 = 567890;
        float f2 = 123456789123F;

        float f3 = 25.67f;
        float f4 = 456789101112.642F;

        double d1 = 25.67;
        double d2 = 123456789123D;
        double d3 = 123456789.123;

        boolean isTrue = true;
        boolean isFalse = false;
        //boolean anotherValue = 12.9;
        char c1 = 'F';
        char c2 = '$';

    }
}
