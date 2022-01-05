package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.backchannel.archive.BackchannelArchiveViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.l;
import i0.e.c.b.f;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class d2 implements a {
    public final /* synthetic */ l.e a;

    public d2(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new BackchannelArchiveViewModel((f) jVar, eVar.b.h());
    }
}
