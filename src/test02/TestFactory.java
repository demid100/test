package test02;


@FunctionalInterface

public interface TestFactory<T extends TestLambda> {
    T create(String first, String second);
}
