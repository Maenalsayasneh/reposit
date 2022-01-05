package com.clubhouse.android.ui.clubs.nominate;

import android.content.res.Resources;
import com.clubhouse.android.databinding.DialogEditTextBinding;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.l.z2.c;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: ClubDialogUtil.kt */
public final class ClubDialogUtilKt$showNominationReasonDialog$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ a<i> Y1;
    public final /* synthetic */ Resources c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String q;
    public final /* synthetic */ DialogEditTextBinding x;
    public final /* synthetic */ l<String, i> y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubDialogUtilKt$showNominationReasonDialog$1(Resources resources, String str, String str2, DialogEditTextBinding dialogEditTextBinding, l<? super String, i> lVar, a<i> aVar) {
        super(1);
        this.c = resources;
        this.d = str;
        this.q = str2;
        this.x = dialogEditTextBinding;
        this.y = lVar;
        this.Y1 = aVar;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.a.d = this.c.getString(R.string.club_nomination_reason_title, new Object[]{this.d, this.q});
        aVar.a.f = this.c.getString(R.string.club_nomination_reason_body, new Object[]{this.q});
        aVar.f(this.x.a);
        aVar.d(R.string.attach_note, new c(this.y, this.x));
        aVar.c(R.string.skip, new i0.e.b.g3.l.z2.d(this.Y1));
        return i.a;
    }
}
