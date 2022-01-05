package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.hallway.feed.FeedViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.p.c0.v;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class w implements a {
    public final /* synthetic */ l.e a;

    public w(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new FeedViewModel((v) jVar, eVar.b.h(), eVar.b.K(), l.r(eVar.b), l.m(eVar.b), l.o(eVar.b));
    }
}
