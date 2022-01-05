package com.clubhouse.android.ui.clubs.viewholder;

import android.view.View;
import com.clubhouse.android.data.models.local.EventInClub;
import i0.b.a.o;
import i0.e.b.g3.l.c3.a;
import i0.e.b.g3.l.c3.b;
import i0.e.b.g3.l.c3.k;
import i0.e.b.g3.l.c3.l;
import java.util.List;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/clubhouse/android/ui/clubs/viewholder/ClubEvents$bindEvents$1", "Li0/b/a/o;", "Lm0/i;", "buildModels", "()V", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ClubEvents.kt */
public final class ClubEvents$bindEvents$1 extends o {
    public final /* synthetic */ l this$0;

    public ClubEvents$bindEvents$1(l lVar) {
        this.this$0 = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: buildModels$lambda-4$lambda-3$lambda-1$lambda-0  reason: not valid java name */
    public static final void m27buildModels$lambda4$lambda3$lambda1$lambda0(m0.n.a.l lVar, EventInClub eventInClub, View view) {
        i.e(lVar, "$it");
        i.e(eventInClub, "$event");
        lVar.invoke(eventInClub);
    }

    /* access modifiers changed from: private */
    /* renamed from: buildModels$lambda-4$lambda-3$lambda-2  reason: not valid java name */
    public static final void m28buildModels$lambda4$lambda3$lambda2(l lVar, EventInClub eventInClub, View view) {
        i.e(lVar, "this$0");
        i.e(eventInClub, "$event");
        m0.n.a.l<? super EventInClub, m0.i> lVar2 = lVar.m;
        if (lVar2 != null) {
            lVar2.invoke(eventInClub);
        }
    }

    public void buildModels() {
        List<EventInClub> list = this.this$0.j;
        i.c(list);
        l lVar = this.this$0;
        for (EventInClub eventInClub : list) {
            k kVar = new k();
            kVar.a(Integer.valueOf(eventInClub.Y1));
            kVar.b(eventInClub);
            m0.n.a.l<? super EventInClub, m0.i> lVar2 = lVar.l;
            if (lVar2 != null) {
                kVar.f(new b(lVar2, eventInClub));
            }
            kVar.h(new a(lVar, eventInClub));
            add(kVar);
        }
    }
}
