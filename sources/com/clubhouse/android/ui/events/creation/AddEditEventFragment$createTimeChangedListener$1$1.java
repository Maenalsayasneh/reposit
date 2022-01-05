package com.clubhouse.android.ui.events.creation;

import h0.b0.v;
import i0.e.b.g3.o.w0.l0;
import i0.e.b.g3.o.w0.w;
import j$.time.OffsetDateTime;
import j$.time.ZonedDateTime;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: AddEditEventFragment.kt */
public final class AddEditEventFragment$createTimeChangedListener$1$1 extends Lambda implements l<w, i> {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ AddEditEventFragment q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddEditEventFragment$createTimeChangedListener$1$1(int i, int i2, AddEditEventFragment addEditEventFragment) {
        super(1);
        this.c = i;
        this.d = i2;
        this.q = addEditEventFragment;
    }

    public Object invoke(Object obj) {
        w wVar = (w) obj;
        m0.n.b.i.e(wVar, "state");
        OffsetDateTime offsetDateTime = wVar.g;
        if (offsetDateTime != null) {
            int i = this.c;
            int i2 = this.d;
            AddEditEventFragment addEditEventFragment = this.q;
            ZonedDateTime withMinute = v.m(offsetDateTime).withHour(i).withMinute(i2);
            k<Object>[] kVarArr = AddEditEventFragment.Z1;
            AddEditEventViewModel O0 = addEditEventFragment.O0();
            OffsetDateTime offsetDateTime2 = withMinute.toOffsetDateTime();
            m0.n.b.i.d(offsetDateTime2, "newDateTime.toOffsetDateTime()");
            O0.p(new l0(offsetDateTime2));
        }
        return i.a;
    }
}
