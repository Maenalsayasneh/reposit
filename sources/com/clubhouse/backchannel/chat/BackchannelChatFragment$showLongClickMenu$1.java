package com.clubhouse.backchannel.chat;

import android.net.Uri;
import android.view.MenuItem;
import com.clubhouse.backchannel.R;
import h0.b.f.m0;
import i0.e.b.d3.k;
import i0.e.c.c.v;
import i0.e.c.c.y;
import i0.e.c.f.b.a.c;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: BackchannelChatFragment.kt */
public final class BackchannelChatFragment$showLongClickMenu$1 extends Lambda implements l<m0, i> {
    public final /* synthetic */ c.a c;
    public final /* synthetic */ BackchannelChatFragment d;
    public final /* synthetic */ y q;
    public final /* synthetic */ Uri x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatFragment$showLongClickMenu$1(c.a aVar, BackchannelChatFragment backchannelChatFragment, y yVar, Uri uri) {
        super(1);
        this.c = aVar;
        this.d = backchannelChatFragment;
        this.q = yVar;
        this.x = uri;
    }

    public Object invoke(Object obj) {
        m0 m0Var = (m0) obj;
        m0.n.b.i.e(m0Var, "$this$popUpMenu");
        m0Var.a(R.menu.menu_chat_message);
        if (this.c.e) {
            MenuItem findItem = m0Var.b.findItem(R.id.report);
            m0.n.b.i.d(findItem, "menu.findItem(R.id.report)");
            k.o(findItem);
        }
        m0Var.e = new v(this.d, this.c, this.q, this.x);
        return i.a;
    }
}
