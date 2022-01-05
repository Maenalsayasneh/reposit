package i0.e.b;

import com.clubhouse.backchannel.data.network.ChatRecipientsDataSource;
import i0.e.b.l;
import i0.e.c.f.c.b;
import i0.j.f.p.h;
import n0.a.f0;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class z1 implements ChatRecipientsDataSource.a {
    public final /* synthetic */ l.e a;

    public z1(l.e eVar) {
        this.a = eVar;
    }

    public ChatRecipientsDataSource a(f0 f0Var) {
        l.e eVar = this.a.c;
        return new ChatRecipientsDataSource(new b(l.k(eVar.b), eVar.b.y(), h.m3(eVar.b.b)), eVar.b.u(), f0Var);
    }
}
