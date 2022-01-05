package q0.h0.e;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.IOException;
import m0.i;
import m0.n.a.l;
import r0.j;
import r0.w;

/* compiled from: FaultHidingSink.kt */
public class f extends j {
    public boolean d;
    public final l<IOException, i> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(w wVar, l<? super IOException, i> lVar) {
        super(wVar);
        m0.n.b.i.e(wVar, "delegate");
        m0.n.b.i.e(lVar, "onException");
        this.q = lVar;
    }

    public void S(r0.f fVar, long j) {
        m0.n.b.i.e(fVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        if (this.d) {
            fVar.skip(j);
            return;
        }
        try {
            super.S(fVar, j);
        } catch (IOException e) {
            this.d = true;
            this.q.invoke(e);
        }
    }

    public void close() {
        if (!this.d) {
            try {
                super.close();
            } catch (IOException e) {
                this.d = true;
                this.q.invoke(e);
            }
        }
    }

    public void flush() {
        if (!this.d) {
            try {
                this.c.flush();
            } catch (IOException e) {
                this.d = true;
                this.q.invoke(e);
            }
        }
    }
}
