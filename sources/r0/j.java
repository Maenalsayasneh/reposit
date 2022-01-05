package r0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.IOException;
import m0.n.b.i;

/* compiled from: ForwardingSink.kt */
public abstract class j implements w {
    public final w c;

    public j(w wVar) {
        i.e(wVar, "delegate");
        this.c = wVar;
    }

    public void S(f fVar, long j) throws IOException {
        i.e(fVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.c.S(fVar, j);
    }

    public void close() throws IOException {
        this.c.close();
    }

    public z d() {
        return this.c.d();
    }

    public void flush() throws IOException {
        this.c.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.c + ')';
    }
}
