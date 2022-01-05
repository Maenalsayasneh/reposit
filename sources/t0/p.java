package t0;

import java.io.IOException;

/* compiled from: ParameterHandler */
public class p extends r<Iterable<T>> {
    public final /* synthetic */ r a;

    public p(r rVar) {
        this.a = rVar;
    }

    public void a(t tVar, Object obj) throws IOException {
        Iterable<Object> iterable = (Iterable) obj;
        if (iterable != null) {
            for (Object a2 : iterable) {
                this.a.a(tVar, a2);
            }
        }
    }
}
