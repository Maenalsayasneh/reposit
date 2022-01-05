package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.invites.InvitesViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.q.m;
import i0.e.b.l;
import i0.j.f.p.h;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class r0 implements a {
    public final /* synthetic */ l.e a;

    public r0(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new InvitesViewModel((m) jVar, h.m3(eVar.b.b), eVar.b.L(), l.m(eVar.b), eVar.b.h());
    }
}
