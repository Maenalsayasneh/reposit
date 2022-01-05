package com.clubhouse.android.ui.hallway;

import com.clubhouse.android.shared.preferences.Key;
import i0.e.b.f3.k.b;
import i0.e.b.g3.p.r;
import i0.e.b.g3.p.z;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HallwayViewModel.kt */
public final class HallwayViewModel$showWavesNuxIfNeeded$1 extends Lambda implements l<r, i> {
    public final /* synthetic */ HallwayViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HallwayViewModel$showWavesNuxIfNeeded$1(HallwayViewModel hallwayViewModel) {
        super(1);
        this.c = hallwayViewModel;
    }

    public Object invoke(Object obj) {
        r rVar = (r) obj;
        m0.n.b.i.e(rVar, "state");
        if (rVar.g) {
            b bVar = this.c.n;
            Objects.requireNonNull(bVar);
            Key key = Key.SHOW_WAVE_BUDDY_LIST_NUX;
            if (!bVar.a(key, false)) {
                this.c.o(z.a);
                b bVar2 = this.c.n;
                Objects.requireNonNull(bVar2);
                bVar2.g(key, true);
            }
        }
        return i.a;
    }
}
