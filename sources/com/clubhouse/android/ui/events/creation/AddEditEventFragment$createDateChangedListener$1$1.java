package com.clubhouse.android.ui.events.creation;

import i0.e.b.g3.o.w0.l0;
import i0.e.b.g3.o.w0.w;
import j$.time.OffsetDateTime;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: AddEditEventFragment.kt */
public final class AddEditEventFragment$createDateChangedListener$1$1 extends Lambda implements l<w, i> {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int q;
    public final /* synthetic */ AddEditEventFragment x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddEditEventFragment$createDateChangedListener$1$1(int i, int i2, int i3, AddEditEventFragment addEditEventFragment) {
        super(1);
        this.c = i;
        this.d = i2;
        this.q = i3;
        this.x = addEditEventFragment;
    }

    public Object invoke(Object obj) {
        w wVar = (w) obj;
        m0.n.b.i.e(wVar, "state");
        OffsetDateTime offsetDateTime = wVar.g;
        if (offsetDateTime != null) {
            int i = this.c;
            int i2 = this.d;
            int i3 = this.q;
            AddEditEventFragment addEditEventFragment = this.x;
            OffsetDateTime withDayOfMonth = offsetDateTime.withYear(i).withMonth(i2 + 1).withDayOfMonth(i3);
            k<Object>[] kVarArr = AddEditEventFragment.Z1;
            AddEditEventViewModel O0 = addEditEventFragment.O0();
            m0.n.b.i.d(withDayOfMonth, "newDateTime");
            O0.p(new l0(withDayOfMonth));
        }
        return i.a;
    }
}
