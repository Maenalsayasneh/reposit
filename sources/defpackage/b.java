package defpackage;

import com.clubhouse.app.R;
import i0.e.b.a3.f.j;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* renamed from: b  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class b extends Lambda implements l<j, i> {
    public static final b c = new b(0);
    public static final b d = new b(1);
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(int i) {
        super(1);
        this.q = i;
    }

    public final Object invoke(Object obj) {
        int i = this.q;
        if (i == 0) {
            j jVar = (j) obj;
            m0.n.b.i.e(jVar, "$this$showBanner");
            jVar.d(R.string.upsell_type_member_approval_no_success);
            return i.a;
        } else if (i == 1) {
            j jVar2 = (j) obj;
            m0.n.b.i.e(jVar2, "$this$showBanner");
            jVar2.d(R.string.dont_let_members_start_rooms_setting);
            return i.a;
        } else {
            throw null;
        }
    }
}
