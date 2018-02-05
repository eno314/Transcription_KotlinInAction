package nine;

import java.util.function.Function;

/**
 * Java
 */
public interface Stream<T> {
    <R> Stream<R> map(Function<? super T, ? extends R> mapper);
}
