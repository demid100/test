package test01;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.SortedMap;

class Cat

{
    public static void print(int n)
    {
        System.out.println(n);
    }
    public static void print(short n)
    {
        System.out.println(n);
    }
    public static void print(Integer n)
    {
        System.out.println(n);
    }
    public static void print(String s)
    {
        System.out.println(s);
    }


    @Override
    protected Object clone() {
        Object o = null;
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
}

class CatChild extends Cat{
    public static void main(String[] args)
    {
        final int CON;

        CON = 10;
        Cat.print(CON);
        Cat.print((byte)1);
        Cat.print("1");
        Cat.print((Integer) null);
        CatChild cat = new CatChild();
        Object ob = new Object();

        cat.clone();
        SortedMap<String,Charset> charsets = Charset.availableCharsets();
        for (Map.Entry<String, Charset> entry: charsets.entrySet()) {
            System.out.println(entry.getKey()+ " --- " +entry.getValue());

        }

    }
}