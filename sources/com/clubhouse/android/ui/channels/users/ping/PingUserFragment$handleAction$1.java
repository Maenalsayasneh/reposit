package com.clubhouse.android.ui.channels.users.ping;

import com.clubhouse.app.R;
import i0.e.b.a3.f.j;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: PingUserFragment.kt */
public final class PingUserFragment$handleAction$1 extends Lambda implements l<j, i> {
    public final /* synthetic */ PingUserFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PingUserFragment$handleAction$1(PingUserFragment pingUserFragment) {
        super(1);
        this.c = pingUserFragment;
    }

    public Object invoke(Object obj) {
        j jVar = (j) obj;
        m0.n.b.i.e(jVar, "$this$showBanner");
        jVar.e(this.c.getString(R.string.copied_to_clipboard));
        return i.a;
    }
}
