package m0.t;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Pair;
import m0.n.a.p;
import m0.q.e;
import m0.q.i;
import m0.s.h;

/* compiled from: Strings.kt */
public final class b implements h<e> {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final p<CharSequence, Integer, Pair<Integer, Integer>> d;

    /* compiled from: Strings.kt */
    public static final class a implements Iterator<e>, m0.n.b.s.a {
        public final /* synthetic */ b Y1;
        public int c = -1;
        public int d;
        public int q;
        public e x;
        public int y;

        public a(b bVar) {
            this.Y1 = bVar;
            int b = i.b(bVar.b, 0, bVar.a.length());
            this.d = b;
            this.q = b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r6 < r3) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r7 = this;
                int r0 = r7.q
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r7.c = r1
                r0 = 0
                r7.x = r0
                goto L_0x0082
            L_0x000c:
                m0.t.b r2 = r7.Y1
                int r3 = r2.c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L_0x001b
                int r6 = r7.y
                int r6 = r6 + r5
                r7.y = r6
                if (r6 >= r3) goto L_0x0023
            L_0x001b:
                java.lang.CharSequence r2 = r2.a
                int r2 = r2.length()
                if (r0 <= r2) goto L_0x0037
            L_0x0023:
                int r0 = r7.d
                m0.q.e r1 = new m0.q.e
                m0.t.b r2 = r7.Y1
                java.lang.CharSequence r2 = r2.a
                int r2 = kotlin.text.StringsKt__IndentKt.h(r2)
                r1.<init>(r0, r2)
                r7.x = r1
                r7.q = r4
                goto L_0x0080
            L_0x0037:
                m0.t.b r0 = r7.Y1
                m0.n.a.p<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> r2 = r0.d
                java.lang.CharSequence r0 = r0.a
                int r3 = r7.q
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r2.invoke(r0, r3)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L_0x005f
                int r0 = r7.d
                m0.q.e r1 = new m0.q.e
                m0.t.b r2 = r7.Y1
                java.lang.CharSequence r2 = r2.a
                int r2 = kotlin.text.StringsKt__IndentKt.h(r2)
                r1.<init>(r0, r2)
                r7.x = r1
                r7.q = r4
                goto L_0x0080
            L_0x005f:
                A r2 = r0.c
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.d
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.d
                m0.q.e r3 = m0.q.i.f(r3, r2)
                r7.x = r3
                int r2 = r2 + r0
                r7.d = r2
                if (r0 != 0) goto L_0x007d
                r1 = r5
            L_0x007d:
                int r2 = r2 + r1
                r7.q = r2
            L_0x0080:
                r7.c = r5
            L_0x0082:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.t.b.a.a():void");
        }

        public boolean hasNext() {
            if (this.c == -1) {
                a();
            }
            return this.c == 1;
        }

        public Object next() {
            if (this.c == -1) {
                a();
            }
            if (this.c != 0) {
                e eVar = this.x;
                Objects.requireNonNull(eVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.x = null;
                this.c = -1;
                return eVar;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(CharSequence charSequence, int i, int i2, p<? super CharSequence, ? super Integer, Pair<Integer, Integer>> pVar) {
        m0.n.b.i.e(charSequence, "input");
        m0.n.b.i.e(pVar, "getNextMatch");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = pVar;
    }

    public Iterator<e> iterator() {
        return new a(this);
    }
}
