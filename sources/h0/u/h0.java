package h0.u;

import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;

/* compiled from: ViewportHint.kt */
public abstract class h0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    /* compiled from: ViewportHint.kt */
    public static final class a extends h0 {
        public final int e;
        public final int f;

        public a(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i3, i4, i5, i6, (f) null);
            this.e = i;
            this.f = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.e == aVar.e && this.f == aVar.f && this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f) + Integer.hashCode(this.e) + h0.super.hashCode();
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ViewportHint.Access(\n            |    pageOffset=");
            P0.append(this.e);
            P0.append(",\n            |    indexInPage=");
            P0.append(this.f);
            P0.append(",\n            |    presentedItemsBefore=");
            P0.append(this.a);
            P0.append(",\n            |    presentedItemsAfter=");
            P0.append(this.b);
            P0.append(",\n            |    originalPageOffsetFirst=");
            P0.append(this.c);
            P0.append(",\n            |    originalPageOffsetLast=");
            P0.append(this.d);
            P0.append(",\n            |)");
            return StringsKt__IndentKt.Z(P0.toString(), (String) null, 1);
        }
    }

    /* compiled from: ViewportHint.kt */
    public static final class b extends h0 {
        public b(int i, int i2, int i3, int i4) {
            super(i, i2, i3, i4, (f) null);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ViewportHint.Initial(\n            |    presentedItemsBefore=");
            P0.append(this.a);
            P0.append(",\n            |    presentedItemsAfter=");
            P0.append(this.b);
            P0.append(",\n            |    originalPageOffsetFirst=");
            P0.append(this.c);
            P0.append(",\n            |    originalPageOffsetLast=");
            P0.append(this.d);
            P0.append(",\n            |)");
            return StringsKt__IndentKt.Z(P0.toString(), (String) null, 1);
        }
    }

    public h0(int i, int i2, int i3, int i4, f fVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.a == h0Var.a && this.b == h0Var.b && this.c == h0Var.c && this.d == h0Var.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.d) + Integer.hashCode(this.c) + Integer.hashCode(this.b) + Integer.hashCode(this.a);
    }
}
