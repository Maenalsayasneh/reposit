package defpackage;

import com.clubhouse.app.R;
import i0.e.b.a3.f.j;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* renamed from: o  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class o extends Lambda implements l<j, i> {
    public static final o c = new o(0);
    public static final o d = new o(1);
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(int i) {
        super(1);
        this.q = i;
    }

    public final Object invoke(Object obj) {
        int i = this.q;
        if (i == 0) {
            j jVar = (j) obj;
            m0.n.b.i.e(jVar, "$this$showNegativeBanner");
            jVar.d(R.string.wait_to_retry);
            return i.a;
        } else if (i == 1) {
            j jVar2 = (j) obj;
            m0.n.b.i.e(jVar2, "$this$showNegativeBanner");
            jVar2.d(R.string.did_not_receive_code_contact_us);
            return i.a;
        } else {
            throw null;
        }
    }
}
