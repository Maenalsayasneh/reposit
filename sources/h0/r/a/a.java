package h0.r.a;

import h0.q.o0;
import h0.q.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager */
public abstract class a {

    /* renamed from: h0.r.a.a$a  reason: collision with other inner class name */
    /* compiled from: LoaderManager */
    public interface C0061a<D> {
    }

    public static <T extends p & o0> a b(T t) {
        return new b(t, ((o0) t).getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
