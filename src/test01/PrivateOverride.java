package test01;

public class PrivateOverride {
    private void f() {
        System.out.println("private f()");

           Class b = Boolean.class;
        System.out.println(b.getSimpleName());
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride {
    public void f() { System.out.println("public f()"); }
}