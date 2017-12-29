package functionals.java8.add;

import java.io.IOException;

/**
 * Created by Pet on 5.4.2017.
 */
@FunctionalInterface
public interface CheckedFunction <T, R>{
    R apply(T t) throws IOException;
}
