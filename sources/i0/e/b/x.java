package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.hallway.buddyList.BuddyListViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.p.b0.q;
import i0.e.b.l;
import i0.j.f.p.h;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class x implements a {
    public final /* synthetic */ l.e a;

    public x(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new BuddyListViewModel((q) jVar, h.m3(eVar.b.b), eVar.b.h(), l.o(eVar.b));
    }
}
