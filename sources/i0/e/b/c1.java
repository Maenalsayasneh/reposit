package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.profile.EditBioViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.u.c4;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class c1 implements a {
    public final /* synthetic */ l.e a;

    public c1(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new EditBioViewModel((c4) jVar, eVar.b.h());
    }
}
