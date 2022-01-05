package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.payments.SendDirectPaymentViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.s.b1;
import i0.e.b.l;
import i0.j.f.p.h;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class k0 implements a {
    public final /* synthetic */ l.e a;

    public k0(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new SendDirectPaymentViewModel((b1) jVar, h.m3(eVar.b.b), eVar.b.u(), eVar.b.h(), eVar.b.v());
    }
}
