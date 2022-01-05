package i0.n.c.a.d.a;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import i0.n.c.a.d.a.c;
import m0.n.b.i;

/* compiled from: EmptyInitializationListener.kt */
public class a<T extends c> implements b<T> {
    public void b(T t) {
        i.e(t, MessageExtension.FIELD_DATA);
    }

    public void d(Throwable th) {
        i.e(th, "t");
    }
}
