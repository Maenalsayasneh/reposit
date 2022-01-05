package i0.c.a;

import java.util.Objects;

/* compiled from: AmplitudeClient */
public class j implements Runnable {
    public final /* synthetic */ f c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String q;
    public final /* synthetic */ f x;

    public j(f fVar, f fVar2, boolean z, String str) {
        this.x = fVar;
        this.c = fVar2;
        this.d = z;
        this.q = str;
    }

    public void run() {
        if (!r.d(this.c.e)) {
            if (this.d) {
                Objects.requireNonNull(this.x);
            }
            f fVar = this.c;
            String str = this.q;
            fVar.g = str;
            this.x.d.I("user_id", str);
            if (this.d) {
                Objects.requireNonNull(this.x);
                long currentTimeMillis = System.currentTimeMillis();
                this.x.q(currentTimeMillis);
                this.x.m(currentTimeMillis);
                Objects.requireNonNull(this.x);
            }
        }
    }
}
