package com.clubhouse.android.ui.hallway.feed.viewholder;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.e.b.g3.p.c0.e0.w;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: EventSuggestions.kt */
public final class EventSuggestions$bindEventSuggestions$1$1$1$1$1 extends Lambda implements a<i> {
    public final /* synthetic */ w c;
    public final /* synthetic */ EventInClub d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventSuggestions$bindEventSuggestions$1$1$1$1$1(w wVar, EventInClub eventInClub) {
        super(0);
        this.c = wVar;
        this.d = eventInClub;
    }

    public Object invoke() {
        l<? super EventInClub, i> lVar = this.c.m;
        if (lVar != null) {
            lVar.invoke(this.d);
        }
        return i.a;
    }
}
