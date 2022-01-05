package q0;

import java.io.IOException;

/* compiled from: Call.kt */
public interface f extends Cloneable {

    /* compiled from: Call.kt */
    public interface a {
        f newCall(b0 b0Var);
    }

    void cancel();

    void enqueue(g gVar);

    e0 execute() throws IOException;

    boolean isCanceled();

    b0 request();
}
