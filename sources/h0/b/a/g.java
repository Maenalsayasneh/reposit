package h0.b.a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import h0.b.e.a;
import h0.f.c;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: AppCompatDelegate */
public abstract class g {
    public static final c<WeakReference<g>> c = new c<>(0);
    public static final Object d = new Object();

    public static void t(g gVar) {
        synchronized (d) {
            Iterator<WeakReference<g>> it = c.iterator();
            while (it.hasNext()) {
                g gVar2 = (g) it.next().get();
                if (gVar2 == gVar || gVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(CharSequence charSequence);

    public abstract a B(a.C0017a aVar);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public Context d(Context context) {
        return context;
    }

    public abstract <T extends View> T e(int i);

    public abstract b f();

    public int g() {
        return -100;
    }

    public abstract MenuInflater h();

    public abstract a i();

    public abstract void j();

    public abstract void k();

    public abstract void l(Configuration configuration);

    public abstract void m(Bundle bundle);

    public abstract void n();

    public abstract void o(Bundle bundle);

    public abstract void p();

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s();

    public abstract boolean u(int i);

    public abstract void v(int i);

    public abstract void w(View view);

    public abstract void x(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void y(Toolbar toolbar);

    public void z(int i) {
    }
}
