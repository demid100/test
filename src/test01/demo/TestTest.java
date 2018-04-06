package test01.demo;

import java.util.Objects;

public class TestTest   {
    int id;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TestTest)) return false;
        TestTest testTest = (TestTest) o;
        return id == testTest.id &&
                Objects.equals(name, testTest.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }
}
