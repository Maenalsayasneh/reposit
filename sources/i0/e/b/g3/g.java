package i0.e.b.g3;

import h0.b.a.e;
import h0.q.m0;
import i0.j.f.p.h;
import j0.a.a.c.b.c;
import j0.a.a.c.c.a;
import j0.a.b.b;
import java.util.Objects;

/* compiled from: Hilt_ClubhouseActivity */
public abstract class g extends e implements b {
    public volatile a c;
    public final Object d = new Object();
    public boolean q = false;

    public g() {
        addOnContextAvailableListener(new f(this));
    }

    public final Object U() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new a(this);
                }
            }
        }
        return this.c.U();
    }

    public m0.b getDefaultViewModelProviderFactory() {
        m0.b defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        c a = ((j0.a.a.c.b.a) h.L0(this, j0.a.a.c.b.a.class)).a();
        Objects.requireNonNull(a);
        return a.a(this, getIntent() != null ? getIntent().getExtras() : null, defaultViewModelProviderFactory);
    }
}
