package i0.b.c.h;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.airbnb.paris.R;
import java.util.Set;
import m0.j.g;

/* compiled from: TypedArrayWrapper.kt */
public abstract class c {
    public static final Set<Integer> a = g.h0(Integer.valueOf(R.anim.null_), Integer.valueOf(R.array.null_), Integer.valueOf(R.color.null_), Integer.valueOf(R.drawable.null_), Integer.valueOf(R.font.null_), Integer.valueOf(R.string.null_));

    public abstract boolean a(int i);

    public abstract ColorStateList b(int i);

    public abstract int c(int i);

    public abstract Drawable d(int i);

    public abstract float e(int i);

    public abstract int f(int i);

    public abstract int g();

    public abstract int h(int i);

    public abstract int i(int i);

    public abstract int j(int i);

    public abstract CharSequence k(int i);

    public abstract boolean l(int i);

    public final boolean m(int i) {
        return a.contains(Integer.valueOf(i));
    }

    public abstract void n();
}
