package h0.b.a;

import android.view.View;
import h0.i.i.a0;
import h0.i.i.q;
import h0.i.i.y;
import h0.i.i.z;

/* compiled from: AppCompatDelegateImpl */
public class k implements Runnable {
    public final /* synthetic */ h c;

    /* compiled from: AppCompatDelegateImpl */
    public class a extends a0 {
        public a() {
        }

        public void b(View view) {
            k.this.c.l2.setAlpha(1.0f);
            k.this.c.o2.e((z) null);
            k.this.c.o2 = null;
        }

        public void c(View view) {
            k.this.c.l2.setVisibility(0);
        }
    }

    public k(h hVar) {
        this.c = hVar;
    }

    public void run() {
        h hVar = this.c;
        hVar.m2.showAtLocation(hVar.l2, 55, 0, 0);
        this.c.L();
        if (this.c.Y()) {
            this.c.l2.setAlpha(0.0f);
            h hVar2 = this.c;
            y b = q.b(hVar2.l2);
            b.a(1.0f);
            hVar2.o2 = b;
            y yVar = this.c.o2;
            a aVar = new a();
            View view = (View) yVar.a.get();
            if (view != null) {
                yVar.f(view, aVar);
                return;
            }
            return;
        }
        this.c.l2.setAlpha(1.0f);
        this.c.l2.setVisibility(0);
    }
}
