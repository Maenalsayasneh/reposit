package i0.e.b.g3.r;

import m0.n.b.f;
import m0.n.b.i;

/* compiled from: InvitedByViewModel.kt */
public abstract class h1 {

    /* compiled from: InvitedByViewModel.kt */
    public static final class a extends h1 {
        public final String a;
        public final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super((f) null);
            i.e(str, "clubName");
            this.a = str;
            this.b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.a, aVar.a) && i.a(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Club(clubName=");
            P0.append(this.a);
            P0.append(", clubPhotoUrl=");
            return i0.d.a.a.a.w0(P0, this.b, ')');
        }
    }

    /* compiled from: InvitedByViewModel.kt */
    public static final class b extends h1 {
        public final String a;
        public final String b;
        public final String c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3) {
            super((f) null);
            i.e(str, "inviterName");
            i.e(str2, "clubName");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return i.a(this.a, bVar.a) && i.a(this.b, bVar.b) && i.a(this.c, bVar.c);
        }

        public int hashCode() {
            int F = i0.d.a.a.a.F(this.b, this.a.hashCode() * 31, 31);
            String str = this.c;
            return F + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ClubAndUser(inviterName=");
            P0.append(this.a);
            P0.append(", clubName=");
            P0.append(this.b);
            P0.append(", clubPhotoUrl=");
            return i0.d.a.a.a.w0(P0, this.c, ')');
        }
    }

    /* compiled from: InvitedByViewModel.kt */
    public static final class c extends h1 {
        public static final c a = new c();

        public c() {
            super((f) null);
        }
    }

    /* compiled from: InvitedByViewModel.kt */
    public static final class d extends h1 {
        public final String a;
        public final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super((f) null);
            i.e(str, "inviterName");
            this.a = str;
            this.b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return i.a(this.a, dVar.a) && i.a(this.b, dVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("User(inviterName=");
            P0.append(this.a);
            P0.append(", photoUrl=");
            return i0.d.a.a.a.w0(P0, this.b, ')');
        }
    }

    public h1(f fVar) {
    }
}
