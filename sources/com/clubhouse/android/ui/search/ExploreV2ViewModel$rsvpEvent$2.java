package com.clubhouse.android.ui.search;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.b3.b.e.g;
import i0.e.b.g3.o.b0;
import i0.e.b.g3.o.c0;
import i0.e.b.g3.w.y;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ExploreV2ViewModel.kt */
public final class ExploreV2ViewModel$rsvpEvent$2 extends Lambda implements p<y, b<? extends EmptySuccessResponse>, y> {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ExploreV2ViewModel d;
    public final /* synthetic */ g q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreV2ViewModel$rsvpEvent$2(boolean z, ExploreV2ViewModel exploreV2ViewModel, g gVar) {
        super(2);
        this.c = z;
        this.d = exploreV2ViewModel;
        this.q = gVar;
    }

    public Object invoke(Object obj, Object obj2) {
        y yVar = (y) obj;
        b bVar = (b) obj2;
        i.e(yVar, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            if (this.c) {
                this.d.o(new c0(this.q.d));
            } else {
                this.d.o(new b0(this.q.d));
            }
        }
        if (bVar instanceof c) {
            this.d.o(new d((String) null, 1));
        }
        return yVar;
    }
}
