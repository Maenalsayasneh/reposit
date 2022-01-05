package i0.c.a;

/* compiled from: AmplitudeClient */
public class g implements Runnable {
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ f q;

    /* compiled from: AmplitudeClient */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            f fVar = g.this.q;
            fVar.t(fVar.C);
        }
    }

    public g(f fVar, long j, long j2) {
        this.q = fVar;
        this.c = j;
        this.d = j2;
    }

    public void run() {
        long j = this.c;
        if (j >= 0) {
            m mVar = this.q.d;
            synchronized (mVar) {
                mVar.Q("events", j);
            }
        }
        long j2 = this.d;
        if (j2 >= 0) {
            m mVar2 = this.q.d;
            synchronized (mVar2) {
                mVar2.Q("identifys", j2);
            }
        }
        this.q.H.set(false);
        long z = this.q.d.z();
        f fVar = this.q;
        if (z > ((long) fVar.w)) {
            s sVar = fVar.J;
            a aVar = new a();
            sVar.b();
            sVar.c.post(aVar);
            return;
        }
        fVar.C = false;
        fVar.D = fVar.x;
    }
}
