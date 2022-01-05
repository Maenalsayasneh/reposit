package defpackage;

import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.android.ui.channels.ChannelFragment$showChannelOptions$1$1$1$2$1;
import com.clubhouse.android.ui.channels.ChannelFragment$showChannelOptions$1$1$1$4$1;
import com.clubhouse.android.ui.channels.ChannelFragment$showChannelOptions$1$1$1$8$1;
import com.clubhouse.app.R;
import i0.e.b.g3.i.c;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* renamed from: e  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class e extends Lambda implements l<c, i> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(int i, Object obj) {
        super(1);
        this.c = i;
        this.d = obj;
    }

    public final Object invoke(Object obj) {
        int i = this.c;
        if (i == 0) {
            c cVar = (c) obj;
            m0.n.b.i.e(cVar, "$this$action");
            String string = ((ChannelFragment) this.d).getString(R.string.let_visitors_in);
            m0.n.b.i.d(string, "getString(R.string.let_visitors_in)");
            cVar.b(string);
            cVar.a(new ChannelFragment$showChannelOptions$1$1$1$2$1((ChannelFragment) this.d));
            return i.a;
        } else if (i == 1) {
            c cVar2 = (c) obj;
            m0.n.b.i.e(cVar2, "$this$action");
            String string2 = ((ChannelFragment) this.d).getString(R.string.search_room_action);
            m0.n.b.i.d(string2, "getString(R.string.search_room_action)");
            cVar2.b(string2);
            cVar2.a(new ChannelFragment$showChannelOptions$1$1$1$4$1((ChannelFragment) this.d));
            return i.a;
        } else if (i == 2) {
            c cVar3 = (c) obj;
            m0.n.b.i.e(cVar3, "$this$action");
            String string3 = ((ChannelFragment) this.d).getString(R.string.end_room);
            m0.n.b.i.d(string3, "getString(R.string.end_room)");
            cVar3.b(string3);
            cVar3.b = Integer.valueOf(R.color.clubhouse_red);
            cVar3.a(new ChannelFragment$showChannelOptions$1$1$1$8$1((ChannelFragment) this.d));
            return i.a;
        } else {
            throw null;
        }
    }
}
