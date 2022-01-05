package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.creation.ChooseUsersViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.n.q;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class a1 implements a {
    public final /* synthetic */ l.e a;

    public a1(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new ChooseUsersViewModel((q) jVar, new y0(eVar));
    }
}
