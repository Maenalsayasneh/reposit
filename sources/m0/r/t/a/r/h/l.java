package m0.r.t.a.r.h;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;

/* compiled from: MessageLite */
public interface l extends m {

    /* compiled from: MessageLite */
    public interface a extends Cloneable, m {
        l build();

        a k(d dVar, e eVar) throws IOException;
    }

    a c();

    void d(CodedOutputStream codedOutputStream) throws IOException;

    int e();

    a f();
}
