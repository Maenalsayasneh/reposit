package com.clubhouse.android.ui.profile;

import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.u.c;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__IndentKt;
import m0.i;
import m0.n.a.l;

/* compiled from: EditNameFragment.kt */
public final class EditNameFragment$adaptUI$2$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ EditNameFragment c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditNameFragment$adaptUI$2$1(EditNameFragment editNameFragment, String str, String str2) {
        super(1);
        this.c = editNameFragment;
        this.d = str;
        this.q = str2;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.e(R.string.make_sure_its_right_every);
        EditNameFragment editNameFragment = this.c;
        String str = this.d + ' ' + this.q;
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
        aVar.a.f = editNameFragment.getString(R.string.your_full_name_will_be, StringsKt__IndentKt.X(str).toString());
        aVar.d(R.string.looks_good, new c(this.c, this.d, this.q));
        aVar.c(R.string.cancel, i0.e.b.g3.u.d.c);
        return i.a;
    }
}
