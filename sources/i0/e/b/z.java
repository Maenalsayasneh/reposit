package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.channels.mvi.ChannelViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.l;
import i0.j.f.p.h;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class z implements a {
    public final /* synthetic */ l.e a;

    public z(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new ChannelViewModel((i0.e.b.z2.g.l) jVar, eVar.b.h(), eVar.b.L(), h.m3(eVar.b.b), l.o(eVar.b));
    }
}
