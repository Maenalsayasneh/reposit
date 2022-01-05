package i0.h.a.b.d;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import i0.h.a.b.d.a;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class j implements a.C0135a {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ LayoutInflater b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ a e;

    public j(a aVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.e = aVar;
        this.a = frameLayout;
        this.b = layoutInflater;
        this.c = viewGroup;
        this.d = bundle;
    }

    public final void a(c cVar) {
        this.a.removeAllViews();
        this.a.addView(this.e.a.k(this.b, this.c, this.d));
    }

    public final int b() {
        return 2;
    }
}
