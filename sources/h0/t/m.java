package h0.t;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.common.R;
import h0.f.i;
import h0.t.k;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: NavGraph */
public class m extends k implements Iterable<k> {
    public final i<k> b2 = new i<>();
    public int c2;
    public String d2;

    /* compiled from: NavGraph */
    public class a implements Iterator<k> {
        public int c = -1;
        public boolean d = false;

        public a() {
        }

        public boolean hasNext() {
            return this.c + 1 < m.this.b2.i();
        }

        public Object next() {
            if (hasNext()) {
                this.d = true;
                i<k> iVar = m.this.b2;
                int i = this.c + 1;
                this.c = i;
                return iVar.j(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.d) {
                m.this.b2.j(this.c).d = null;
                i<k> iVar = m.this.b2;
                int i = this.c;
                Object[] objArr = iVar.x;
                Object obj = objArr[i];
                Object obj2 = i.c;
                if (obj != obj2) {
                    objArr[i] = obj2;
                    iVar.d = true;
                }
                this.c = i - 1;
                this.d = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
    }

    public m(s<? extends m> sVar) {
        super((s<? extends k>) sVar);
    }

    public final Iterator<k> iterator() {
        return new a();
    }

    public k.a k(j jVar) {
        k.a k = super.k(jVar);
        a aVar = new a();
        while (aVar.hasNext()) {
            k.a k2 = ((k) aVar.next()).k(jVar);
            if (k2 != null && (k == null || k2.compareTo(k) > 0)) {
                k = k2;
            }
        }
        return k;
    }

    public void o(Context context, AttributeSet attributeSet) {
        super.o(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.NavGraphNavigator);
        u(obtainAttributes.getResourceId(R.styleable.NavGraphNavigator_startDestination, 0));
        this.d2 = k.j(context, this.c2);
        obtainAttributes.recycle();
    }

    public final void r(k kVar) {
        int i = kVar.q;
        if (i == 0) {
            throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
        } else if (i != this.q) {
            k e = this.b2.e(i);
            if (e != kVar) {
                if (kVar.d == null) {
                    if (e != null) {
                        e.d = null;
                    }
                    kVar.d = this;
                    this.b2.h(kVar.q, kVar);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
        } else {
            throw new IllegalArgumentException("Destination " + kVar + " cannot have the same id as graph " + this);
        }
    }

    public final k s(int i) {
        return t(i, true);
    }

    public final k t(int i, boolean z) {
        m mVar;
        k f = this.b2.f(i, null);
        if (f != null) {
            return f;
        }
        if (!z || (mVar = this.d) == null) {
            return null;
        }
        return mVar.s(i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" startDestination=");
        k s = s(this.c2);
        if (s == null) {
            String str = this.d2;
            if (str == null) {
                sb.append("0x");
                sb.append(Integer.toHexString(this.c2));
            } else {
                sb.append(str);
            }
        } else {
            sb.append("{");
            sb.append(s.toString());
            sb.append("}");
        }
        return sb.toString();
    }

    public final void u(int i) {
        if (i != this.q) {
            this.c2 = i;
            this.d2 = null;
            return;
        }
        throw new IllegalArgumentException("Start destination " + i + " cannot use the same id as the graph " + this);
    }
}
