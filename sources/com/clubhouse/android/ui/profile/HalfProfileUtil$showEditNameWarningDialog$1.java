package com.clubhouse.android.ui.profile;

import androidx.fragment.app.Fragment;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.d.a.a.a;
import i0.e.b.g3.u.t1;
import i0.e.b.g3.u.u1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$showEditNameWarningDialog$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ h0.t.l d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$showEditNameWarningDialog$1(Fragment fragment, h0.t.l lVar) {
        super(1);
        this.c = fragment;
        this.d = lVar;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        a.j(aVar, "$this$alertDialog", R.string.clubhouse_is_for_real_names, R.string.you_can_fix_your_legal_name);
        aVar.d(R.string.correct_my_legal_name, new t1(this.c, this.d));
        aVar.c(R.string.never_mind, u1.c);
        return i.a;
    }
}
