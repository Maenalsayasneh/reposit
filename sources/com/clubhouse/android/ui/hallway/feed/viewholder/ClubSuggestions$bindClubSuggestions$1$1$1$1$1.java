package com.clubhouse.android.ui.hallway.feed.viewholder;

import com.clubhouse.android.data.models.local.club.Club;
import i0.e.b.g3.p.c0.e0.r;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: ClubSuggestions.kt */
public final class ClubSuggestions$bindClubSuggestions$1$1$1$1$1 extends Lambda implements a<i> {
    public final /* synthetic */ r c;
    public final /* synthetic */ Club d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubSuggestions$bindClubSuggestions$1$1$1$1$1(r rVar, Club club) {
        super(0);
        this.c = rVar;
        this.d = club;
    }

    public Object invoke() {
        l<? super Club, i> lVar = this.c.m;
        if (lVar != null) {
            lVar.invoke(this.d);
        }
        return i.a;
    }
}
