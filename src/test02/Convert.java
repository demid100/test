package test02;
@FunctionalInterface
public interface Convert<T, F> {
    void convert (F from);
}
