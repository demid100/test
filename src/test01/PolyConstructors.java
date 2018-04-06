package test01;

class Glyph {
    void draw() {
        System.out.println("test01.Glyph.draw()"); }
    Glyph() {
        System.out.println("test01.Glyph() before draw()");
        draw();
        System.out.println("test01.Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        draw();
        radius = r;
        System.out.println("test01.RoundGlyph.test01.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        System.out.println("test01.RoundGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
       Glyph po =  new RoundGlyph(5);
    }
}