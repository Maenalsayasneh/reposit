package com.clubhouse.android.ui.clubs.nominate;

import android.content.res.Resources;
import com.clubhouse.android.databinding.DialogEditTextBinding;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.l.z2.b;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: ClubDialogUtil.kt */
public final class ClubDialogUtilKt$showJoinClubReasonDialog$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ Resources c;
    public final /* synthetic */ String d;
    public final /* synthetic */ DialogEditTextBinding q;
    public final /* synthetic */ l<String, i> x;
    public final /* synthetic */ a<i> y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubDialogUtilKt$showJoinClubReasonDialog$1(Resources resources, String str, DialogEditTextBinding dialogEditTextBinding, l<? super String, i> lVar, a<i> aVar) {
        super(1);
        this.c = resources;
        this.d = str;
        this.q = dialogEditTextBinding;
        this.x = lVar;
        this.y = aVar;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.a.d = this.c.getString(R.string.why_should_you_be, new Object[]{this.d});
        aVar.a.f = this.c.getString(R.string.add_a_note_below, new Object[]{this.d});
        aVar.f(this.q.a);
        aVar.d(R.string.attach_note, new b(this.x, this.q));
        aVar.c(R.string.skip, new i0.e.b.g3.l.z2.a(this.y));
        return i.a;
    }
}
