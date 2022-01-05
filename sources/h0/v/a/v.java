package h0.v.a;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper */
public abstract class v {
    public final RecyclerView.n a;
    public int b = Integer.MIN_VALUE;
    public final Rect c = new Rect();

    public v(RecyclerView.n nVar, t tVar) {
        this.a = nVar;
    }

    public static v a(RecyclerView.n nVar, int i) {
        if (i == 0) {
            return new t(nVar);
        }
        if (i == 1) {
            return new u(nVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return l() - this.b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);
}
