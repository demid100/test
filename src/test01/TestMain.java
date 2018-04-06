package test01;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("Hello, World!!!");
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1 == i2);
        Integer i3 = Integer.valueOf(12);
        Integer i4 = Integer.valueOf(12);
        System.out.println(i3 == i4);
        Long l = (long)5;
        byte b = (byte)500 +2;
    }

    public  int swap(){
        System.out.println("Override");
        return 5;
    }
}
