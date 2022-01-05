package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.search.ExploreV2ViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.w.y;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class m1 implements a {
    public final /* synthetic */ l.e a;

    public m1(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new ExploreV2ViewModel((y) jVar, eVar.b.h(), eVar.c(), l.m(eVar.b), l.o(eVar.b));
    }
}
