package h0.u;

import androidx.paging.DiffingChangePayload;
import h0.v.a.r;
import m0.n.b.i;

/* compiled from: NullPaddedListDiffHelper.kt */
public final class q<T> implements r {
    public int a;
    public int b;
    public int c;
    public int d = 1;
    public int e = 1;
    public final o<T> f;
    public final o<T> g;
    public final r h;

    public q(o<T> oVar, o<T> oVar2, r rVar) {
        i.e(oVar, "oldList");
        i.e(oVar2, "newList");
        i.e(rVar, "callback");
        this.f = oVar;
        this.g = oVar2;
        this.h = rVar;
        this.a = oVar.b();
        this.b = oVar.c();
        this.c = oVar.a();
    }

    public void a(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= this.c && this.e != 2) {
            int min = Math.min(i2, this.b);
            if (min > 0) {
                this.e = 3;
                this.h.d(this.a + i, min, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.b -= min;
            }
            int i3 = i2 - min;
            if (i3 > 0) {
                this.h.a(min + i + this.a, i3);
            }
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (i <= 0 && this.d != 2) {
                int min2 = Math.min(i2, this.a);
                if (min2 > 0) {
                    this.d = 3;
                    this.h.d((0 - min2) + this.a, min2, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                    this.a -= min2;
                }
                int i4 = i2 - min2;
                if (i4 > 0) {
                    this.h.a(this.a + 0, i4);
                }
            } else {
                z2 = false;
            }
            if (!z2) {
                this.h.a(i + this.a, i2);
            }
        }
        this.c += i2;
    }

    public void b(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i + i2 >= this.c && this.e != 3) {
            int min = Math.min(this.g.c() - this.b, i2);
            if (min < 0) {
                min = 0;
            }
            int i3 = i2 - min;
            if (min > 0) {
                this.e = 2;
                this.h.d(this.a + i, min, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
                this.b += min;
            }
            if (i3 > 0) {
                this.h.b(min + i + this.a, i3);
            }
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (i <= 0 && this.d != 3) {
                int min2 = Math.min(this.g.b() - this.a, i2);
                if (min2 < 0) {
                    min2 = 0;
                }
                int i4 = i2 - min2;
                if (i4 > 0) {
                    this.h.b(this.a + 0, i4);
                }
                if (min2 > 0) {
                    this.d = 2;
                    this.h.d(this.a + 0, min2, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
                    this.a += min2;
                }
            } else {
                z2 = false;
            }
            if (!z2) {
                this.h.b(i + this.a, i2);
            }
        }
        this.c -= i2;
    }

    public void c(int i, int i2) {
        r rVar = this.h;
        int i3 = this.a;
        rVar.c(i + i3, i2 + i3);
    }

    public void d(int i, int i2, Object obj) {
        this.h.d(i + this.a, i2, obj);
    }
}
