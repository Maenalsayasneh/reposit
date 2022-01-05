package h0.g0;

import androidx.work.ListenableWorker;
import h0.g0.j;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* compiled from: WorkRequest */
public abstract class o {
    public UUID a;
    public h0.g0.r.s.o b;
    public Set<String> c;

    /* compiled from: WorkRequest */
    public static abstract class a<B extends a<?, ?>, W extends o> {
        public UUID a = UUID.randomUUID();
        public h0.g0.r.s.o b;
        public Set<String> c = new HashSet();

        public a(Class<? extends ListenableWorker> cls) {
            this.b = new h0.g0.r.s.o(this.a.toString(), cls.getName());
            this.c.add(cls.getName());
        }

        public final W a() {
            j.a aVar = (j.a) this;
            h0.g0.r.s.o oVar = aVar.b;
            if (!oVar.q || !oVar.j.d) {
                W jVar = new j(aVar);
                this.a = UUID.randomUUID();
                h0.g0.r.s.o oVar2 = new h0.g0.r.s.o(this.b);
                this.b = oVar2;
                oVar2.a = this.a.toString();
                return jVar;
            }
            throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
        }
    }

    public o(UUID uuid, h0.g0.r.s.o oVar, Set<String> set) {
        this.a = uuid;
        this.b = oVar;
        this.c = set;
    }

    public String a() {
        return this.a.toString();
    }
}
