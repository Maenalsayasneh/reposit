package h0.o.a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import g0.a.b.b.a;

/* compiled from: FragmentHostCallback */
public abstract class t<E> extends q {
    public final Activity c;
    public final Context d;
    public final Handler q;
    public final FragmentManager x = new w();

    public t(k kVar) {
        Handler handler = new Handler();
        this.c = kVar;
        a.m(kVar, "context == null");
        this.d = kVar;
        a.m(handler, "handler == null");
        this.q = handler;
    }

    public abstract E d();

    public abstract LayoutInflater e();

    public abstract boolean f(Fragment fragment);

    public abstract boolean g(String str);

    public abstract void h();
}
