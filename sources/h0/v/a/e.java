package h0.v.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: ChildHelper */
public class e {
    public final b a;
    public final a b = new a();
    public final List<View> c = new ArrayList();

    /* compiled from: ChildHelper */
    public static class a {
        public long a = 0;
        public a b;

        public void a(int i) {
            if (i >= 64) {
                a aVar = this.b;
                if (aVar != null) {
                    aVar.a(i - 64);
                    return;
                }
                return;
            }
            this.a &= ~(1 << i);
        }

        public int b(int i) {
            a aVar = this.b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.a);
                }
                return Long.bitCount(this.a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.a & ((1 << i) - 1));
            } else {
                return Long.bitCount(this.a) + aVar.b(i - 64);
            }
        }

        public final void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        public boolean d(int i) {
            if (i < 64) {
                return (this.a & (1 << i)) != 0;
            }
            c();
            return this.b.d(i - 64);
        }

        public void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.b.e(i - 64, z);
                return;
            }
            long j = this.a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.b != null) {
                c();
                this.b.e(0, z2);
            }
        }

        public boolean f(int i) {
            if (i >= 64) {
                c();
                return this.b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.a = j3;
            long j4 = j - 1;
            this.a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z;
        }

        public void g() {
            this.a = 0;
            a aVar = this.b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i) {
            if (i >= 64) {
                c();
                this.b.h(i - 64);
                return;
            }
            this.a |= 1 << i;
        }

        public String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    /* compiled from: ChildHelper */
    public interface b {
    }

    public e(b bVar) {
        this.a = bVar;
    }

    public void a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = ((RecyclerView.e) this.a).b();
        } else {
            i2 = f(i);
        }
        this.b.e(i2, z);
        if (z) {
            i(view);
        }
        RecyclerView.e eVar = (RecyclerView.e) this.a;
        RecyclerView.this.addView(view, i2);
        RecyclerView.this.dispatchChildAttached(view);
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = ((RecyclerView.e) this.a).b();
        } else {
            i2 = f(i);
        }
        this.b.e(i2, z);
        if (z) {
            i(view);
        }
        RecyclerView.e eVar = (RecyclerView.e) this.a;
        Objects.requireNonNull(eVar);
        RecyclerView.b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(i0.d.a.a.a.S(RecyclerView.this, sb));
            }
        }
        RecyclerView.this.attachViewToParent(view, i2, layoutParams);
    }

    public void c(int i) {
        RecyclerView.b0 childViewHolderInt;
        int f = f(i);
        this.b.f(f);
        RecyclerView.e eVar = (RecyclerView.e) this.a;
        View childAt = RecyclerView.this.getChildAt(f);
        if (!(childAt == null || (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) == null)) {
            if (!childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(256);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(i0.d.a.a.a.S(RecyclerView.this, sb));
            }
        }
        RecyclerView.this.detachViewFromParent(f);
    }

    public View d(int i) {
        return ((RecyclerView.e) this.a).a(f(i));
    }

    public int e() {
        return ((RecyclerView.e) this.a).b() - this.c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int b2 = ((RecyclerView.e) this.a).b();
        int i2 = i;
        while (i2 < b2) {
            int b3 = i - (i2 - this.b.b(i2));
            if (b3 == 0) {
                while (this.b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b3;
        }
        return -1;
    }

    public View g(int i) {
        return RecyclerView.this.getChildAt(i);
    }

    public int h() {
        return ((RecyclerView.e) this.a).b();
    }

    public final void i(View view) {
        this.c.add(view);
        RecyclerView.e eVar = (RecyclerView.e) this.a;
        Objects.requireNonNull(eVar);
        RecyclerView.b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
        }
    }

    public int j(View view) {
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        if (indexOfChild != -1 && !this.b.d(indexOfChild)) {
            return indexOfChild - this.b.b(indexOfChild);
        }
        return -1;
    }

    public boolean k(View view) {
        return this.c.contains(view);
    }

    public void l(int i) {
        int f = f(i);
        View a2 = ((RecyclerView.e) this.a).a(f);
        if (a2 != null) {
            if (this.b.f(f)) {
                m(a2);
            }
            ((RecyclerView.e) this.a).c(f);
        }
    }

    public final boolean m(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        RecyclerView.e eVar = (RecyclerView.e) this.a;
        Objects.requireNonNull(eVar);
        RecyclerView.b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt == null) {
            return true;
        }
        childViewHolderInt.onLeftHiddenState(RecyclerView.this);
        return true;
    }

    public String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
