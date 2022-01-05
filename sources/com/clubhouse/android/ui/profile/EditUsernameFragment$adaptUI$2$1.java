package com.clubhouse.android.ui.profile;

import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.u.j;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__IndentKt;
import m0.i;
import m0.n.a.l;

/* compiled from: EditUsernameFragment.kt */
public final class EditUsernameFragment$adaptUI$2$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ EditUsernameFragment c;
    public final /* synthetic */ String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditUsernameFragment$adaptUI$2$1(EditUsernameFragment editUsernameFragment, String str) {
        super(1);
        this.c = editUsernameFragment;
        this.d = str;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.e(R.string.make_sure_its_right_every);
        aVar.a.f = this.c.getString(R.string.your_username_will_be, StringsKt__IndentKt.X(String.valueOf(this.d)).toString());
        aVar.d(R.string.looks_good, new i0.e.b.g3.u.i(this.c, this.d));
        aVar.c(R.string.cancel, j.c);
        return i.a;
    }
}
