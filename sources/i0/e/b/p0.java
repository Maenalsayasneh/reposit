package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.selection.SelectionViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.x.f;
import i0.e.b.l;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class p0 implements a {
    public p0(l.e eVar) {
    }

    public MavericksViewModel c(j jVar) {
        return new SelectionViewModel((f) jVar);
    }
}
