package i0.e.b.g3.l.y2;

import m0.n.b.f;

/* compiled from: ClubMigrationUpsell.kt */
public abstract class a {
    public final boolean a;

    /* renamed from: i0.e.b.g3.l.y2.a$a  reason: collision with other inner class name */
    /* compiled from: ClubMigrationUpsell.kt */
    public static final class C0201a extends a {
        public final boolean b;

        public C0201a() {
            this(false, 1);
        }

        public C0201a(boolean z) {
            super(z, (f) null);
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0201a) && this.b == ((C0201a) obj).b;
        }

        public int hashCode() {
            boolean z = this.b;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return i0.d.a.a.a.C0(i0.d.a.a.a.P0("ChangesComplete(shown="), this.b, ')');
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0201a(boolean r1, int r2) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0005
                r1 = 0
            L_0x0005:
                r2 = 0
                r0.<init>(r1, r2)
                r0.b = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.l.y2.a.C0201a.<init>(boolean, int):void");
        }
    }

    /* compiled from: ClubMigrationUpsell.kt */
    public static final class b extends a {
        public final boolean b;

        public b() {
            super(false, (f) null);
            this.b = false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public int hashCode() {
            boolean z = this.b;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return i0.d.a.a.a.C0(i0.d.a.a.a.P0("Leaders(shown="), this.b, ')');
        }

        public b(boolean z) {
            super(z, (f) null);
            this.b = z;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(boolean r1, int r2) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0005
                r1 = 0
            L_0x0005:
                r2 = 0
                r0.<init>(r1, r2)
                r0.b = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.l.y2.a.b.<init>(boolean, int):void");
        }
    }

    /* compiled from: ClubMigrationUpsell.kt */
    public static final class c extends a {
        public final boolean b;
        public final boolean c;

        public c(boolean z, boolean z2) {
            super(z, (f) null);
            this.b = z;
            this.c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && this.c == cVar.c;
        }

        public int hashCode() {
            boolean z = this.b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.c;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("MemberApproval(shown=");
            P0.append(this.b);
            P0.append(", readOnly=");
            return i0.d.a.a.a.C0(P0, this.c, ')');
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(boolean r1, boolean r2, int r3) {
            /*
                r0 = this;
                r3 = r3 & 1
                if (r3 == 0) goto L_0x0005
                r1 = 0
            L_0x0005:
                r3 = 0
                r0.<init>(r1, r3)
                r0.b = r1
                r0.c = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.l.y2.a.c.<init>(boolean, boolean, int):void");
        }
    }

    /* compiled from: ClubMigrationUpsell.kt */
    public static final class d extends a {
        public final boolean b;

        public d() {
            super(false, (f) null);
            this.b = false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public int hashCode() {
            boolean z = this.b;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return i0.d.a.a.a.C0(i0.d.a.a.a.P0("MemberRoomStart(shown="), this.b, ')');
        }

        public d(boolean z) {
            super(z, (f) null);
            this.b = z;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(boolean r1, int r2) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0005
                r1 = 0
            L_0x0005:
                r2 = 0
                r0.<init>(r1, r2)
                r0.b = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.l.y2.a.d.<init>(boolean, int):void");
        }
    }

    public a(boolean z, f fVar) {
        this.a = z;
    }
}
