package com.clubhouse.android.ui.events;

import com.clubhouse.android.core.ui.Banner;
import com.clubhouse.app.R;
import i0.e.b.a3.f.j;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: EventsFragment.kt */
public final class EventsFragment$showError$1 extends Lambda implements l<j, i> {
    public final /* synthetic */ Throwable c;
    public final /* synthetic */ EventsFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventsFragment$showError$1(Throwable th, EventsFragment eventsFragment) {
        super(1);
        this.c = th;
        this.d = eventsFragment;
    }

    public Object invoke(Object obj) {
        j jVar = (j) obj;
        m0.n.b.i.e(jVar, "$this$showBanner");
        String message = this.c.getMessage();
        if (message == null) {
            message = this.d.getString(R.string.common_error_try_again);
            m0.n.b.i.d(message, "getString(R.string.common_error_try_again)");
        }
        jVar.c.b.setText(message);
        jVar.h(Banner.Style.Negative);
        return i.a;
    }
}
