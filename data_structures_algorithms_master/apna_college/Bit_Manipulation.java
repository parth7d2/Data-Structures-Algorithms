public class Bit_Manipulation {
    public static void main(String[] args) {
        // getBit(5, 3);
        // setBit(5, 2);
        // clearBit(5, 3);
        updateBit(5, 2);
    }

    static void getBit(int n, int bit) {
        // position = (bit-1) because position start with 0 and bit start with 1
        // Bit Mask: 1<<position
        // Operation: AND

        int position = (bit - 1);
        int bitMask = 1 << position;
        int and = n & bitMask;

        if (and == 0)
            System.out.println("Bit is ZERO");
        else
            System.out.println("Bit is ONE");

    }

    static void setBit(int n, int position) {
        // n = position start with 0 and bit start with 1
        // Bit Mask = 1 << position
        // Operation = OR

        int bitMask = 1 << position;
        int oR = n | bitMask;
        System.out.println(oR);

        n = oR;

        // get bit
        int gbit = 1 << position;
        int and = n & gbit;
        if (and > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    static void clearBit(int n, int bit) {
        // Bit Mask : 1 << bit-1;
        // Operation : AND with NOT means first BitMask convert NOT and after n & NOT
        int bitMask = 1 << bit - 1;
        int not = ~bitMask;
        int and = n & not;
        System.out.println(and);
    }

    static void updateBit(int n, int position) {
        // For 0 to 1 // For 1 to 0
        // Bit Mask : 1<<i // Bit Mask : 1 << i
        // Operation : OR // Operation : AND with NOT

        // for 0 to 1
        int bitMask = 1 << position;
        int oR = n | bitMask;
        System.out.println(oR);

        // for 1 to 0
        int bitMask2 = 1 << position;
        int not = ~bitMask2;
        int and = n & not;
        System.out.println(and);

    }
}