package h0.k.a;

import android.graphics.Rect;
import h0.k.a.a;
import java.util.Comparator;

/* compiled from: FocusStrategy */
public class d<T> implements Comparator<T> {
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public final boolean q;
    public final b<T> x;

    public d(boolean z, b<T> bVar) {
        this.q = z;
        this.x = bVar;
    }

    public int compare(T t, T t2) {
        Rect rect = this.c;
        Rect rect2 = this.d;
        ((a.C0052a) this.x).a(t, rect);
        ((a.C0052a) this.x).a(t2, rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        if (i3 < i4) {
            if (this.q) {
                return 1;
            }
            return -1;
        } else if (i3 <= i4) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                if (this.q) {
                    return 1;
                }
                return -1;
            } else if (i7 <= i8) {
                return 0;
            } else {
                if (this.q) {
                    return -1;
                }
                return 1;
            }
        } else if (this.q) {
            return -1;
        } else {
            return 1;
        }
    }
}
