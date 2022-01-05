package t0;

import java.io.IOException;
import java.lang.reflect.Array;

/* compiled from: ParameterHandler */
public class q extends r<Object> {
    public final /* synthetic */ r a;

    public q(r rVar) {
        this.a = rVar;
    }

    public void a(t tVar, Object obj) throws IOException {
        if (obj != null) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                this.a.a(tVar, Array.get(obj, i));
            }
        }
    }
}
