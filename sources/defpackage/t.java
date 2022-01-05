package defpackage;

import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.inbox.BackchannelInboxFragment;
import com.clubhouse.backchannel.inbox.BackchannelInboxFragment$showSettings$1$1$1$1;
import com.clubhouse.backchannel.inbox.BackchannelInboxFragment$showSettings$1$1$2$1;
import com.clubhouse.backchannel.inbox.BackchannelInboxFragment$showSettings$1$1$3$1;
import i0.e.b.g3.i.c;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* renamed from: t  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class t extends Lambda implements l<c, i> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(int i, Object obj) {
        super(1);
        this.c = i;
        this.d = obj;
    }

    public final Object invoke(Object obj) {
        int i = this.c;
        if (i == 0) {
            c cVar = (c) obj;
            m0.n.b.i.e(cVar, "$this$action");
            String string = ((BackchannelInboxFragment) this.d).getString(R.string.view_archive);
            m0.n.b.i.d(string, "getString(R.string.view_archive)");
            cVar.b(string);
            cVar.a(new BackchannelInboxFragment$showSettings$1$1$1$1((BackchannelInboxFragment) this.d));
            return i.a;
        } else if (i == 1) {
            c cVar2 = (c) obj;
            m0.n.b.i.e(cVar2, "$this$action");
            String string2 = ((BackchannelInboxFragment) this.d).getString(R.string.disable_requests);
            m0.n.b.i.d(string2, "getString(R.string.disable_requests)");
            cVar2.b(string2);
            cVar2.a(new BackchannelInboxFragment$showSettings$1$1$2$1((BackchannelInboxFragment) this.d));
            return i.a;
        } else if (i == 2) {
            c cVar3 = (c) obj;
            m0.n.b.i.e(cVar3, "$this$action");
            String string3 = ((BackchannelInboxFragment) this.d).getString(R.string.enable_requests);
            m0.n.b.i.d(string3, "getString(R.string.enable_requests)");
            cVar3.b(string3);
            cVar3.a(new BackchannelInboxFragment$showSettings$1$1$3$1((BackchannelInboxFragment) this.d));
            return i.a;
        } else {
            throw null;
        }
    }
}
