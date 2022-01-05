package defpackage;

import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.inbox.BackchannelInboxFragment;
import com.clubhouse.backchannel.inbox.BackchannelInboxFragment$buildChatModel$1$2$1$1$1;
import com.clubhouse.backchannel.inbox.BackchannelInboxFragment$buildChatModel$1$2$1$2$1;
import i0.e.b.g3.i.c;
import i0.e.c.f.b.a.a;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* renamed from: c0  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class c0 extends Lambda implements l<c, i> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(int i, Object obj, Object obj2) {
        super(1);
        this.c = i;
        this.d = obj;
        this.q = obj2;
    }

    public final Object invoke(Object obj) {
        int i = this.c;
        if (i == 0) {
            c cVar = (c) obj;
            m0.n.b.i.e(cVar, "$this$action");
            String string = ((BackchannelInboxFragment) this.d).getString(R.string.archive);
            m0.n.b.i.d(string, "getString(R.string.archive)");
            cVar.b(string);
            int i2 = R.color.clubhouse_red;
            cVar.b = Integer.valueOf(i2);
            cVar.a = Integer.valueOf(R.drawable.ic_archive);
            cVar.c = Integer.valueOf(i2);
            cVar.a(new BackchannelInboxFragment$buildChatModel$1$2$1$1$1((BackchannelInboxFragment) this.d, (a) this.q));
            return i.a;
        } else if (i == 1) {
            c cVar2 = (c) obj;
            m0.n.b.i.e(cVar2, "$this$action");
            String string2 = ((BackchannelInboxFragment) this.d).getString(R.string.hide);
            m0.n.b.i.d(string2, "getString(R.string.hide)");
            cVar2.b(string2);
            int i3 = R.color.clubhouse_red;
            cVar2.b = Integer.valueOf(i3);
            cVar2.a = Integer.valueOf(R.drawable.ic_hide);
            cVar2.c = Integer.valueOf(i3);
            cVar2.a(new BackchannelInboxFragment$buildChatModel$1$2$1$2$1((BackchannelInboxFragment) this.d, (a) this.q));
            return i.a;
        } else {
            throw null;
        }
    }
}
