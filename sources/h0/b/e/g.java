package h0.b.e;

import android.view.View;
import android.view.animation.Interpolator;
import h0.i.i.a0;
import h0.i.i.y;
import h0.i.i.z;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet */
public class g {
    public final ArrayList<y> a = new ArrayList<>();
    public long b = -1;
    public Interpolator c;
    public z d;
    public boolean e;
    public final a0 f = new a();

    /* compiled from: ViewPropertyAnimatorCompatSet */
    public class a extends a0 {
        public boolean a = false;
        public int b = 0;

        public a() {
        }

        public void b(View view) {
            int i = this.b + 1;
            this.b = i;
            if (i == g.this.a.size()) {
                z zVar = g.this.d;
                if (zVar != null) {
                    zVar.b((View) null);
                }
                this.b = 0;
                this.a = false;
                g.this.e = false;
            }
        }

        public void c(View view) {
            if (!this.a) {
                this.a = true;
                z zVar = g.this.d;
                if (zVar != null) {
                    zVar.c((View) null);
                }
            }
        }
    }

    public void a() {
        if (this.e) {
            Iterator<y> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.e = false;
        }
    }

    public void b() {
        if (!this.e) {
            Iterator<y> it = this.a.iterator();
            while (it.hasNext()) {
                y next = it.next();
                long j = this.b;
                if (j >= 0) {
                    next.c(j);
                }
                Interpolator interpolator = this.c;
                if (interpolator != null) {
                    next.d(interpolator);
                }
                if (this.d != null) {
                    next.e(this.f);
                }
                next.i();
            }
            this.e = true;
        }
    }
}
