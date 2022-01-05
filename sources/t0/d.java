package t0;

import java.io.IOException;
import q0.b0;

/* compiled from: Call */
public interface d<T> extends Cloneable {
    void J(f<T> fVar);

    void cancel();

    d<T> clone();

    v<T> execute() throws IOException;

    boolean isCanceled();

    b0 request();
}
