package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.activity.overflow.ActivityOverflowViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.j.k0.g;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class o1 implements a {
    public final /* synthetic */ l.e a;

    public o1(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new ActivityOverflowViewModel((g) jVar, eVar.b.h());
    }
}
