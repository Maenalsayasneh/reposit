package q0;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.networkv2.request.Header;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;
import okio.ByteString;
import q0.y;
import r0.h;

/* compiled from: MultipartBody.kt */
public final class z extends d0 {
    public static final y b = y.a.a("multipart/mixed");
    public static final y c = y.a.a("multipart/form-data");
    public static final byte[] d = {(byte) 58, (byte) 32};
    public static final byte[] e = {(byte) 13, (byte) 10};
    public static final byte[] f;
    public static final b g = new b((f) null);
    public final y h;
    public long i = -1;
    public final ByteString j;
    public final y k;
    public final List<c> l;

    /* compiled from: MultipartBody.kt */
    public static final class a {
        public final ByteString a;
        public y b;
        public final List<c> c;

        public a(String str, int i) {
            String str2;
            if ((i & 1) != 0) {
                str2 = UUID.randomUUID().toString();
                i.d(str2, "UUID.randomUUID().toString()");
            } else {
                str2 = null;
            }
            i.e(str2, "boundary");
            this.a = ByteString.d.c(str2);
            this.b = z.b;
            this.c = new ArrayList();
        }

        public final a a(String str, String str2) {
            i.e(str, "name");
            i.e(str2, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            i.e(str, "name");
            i.e(str2, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            b(c.b(str, (String) null, d0.a.a(str2, (y) null)));
            return this;
        }

        public final a b(c cVar) {
            i.e(cVar, "part");
            this.c.add(cVar);
            return this;
        }

        public final z c() {
            if (!this.c.isEmpty()) {
                return new z(this.a, this.b, q0.h0.c.x(this.c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        public final a d(y yVar) {
            i.e(yVar, "type");
            if (i.a(yVar.e, "multipart")) {
                this.b = yVar;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + yVar).toString());
        }
    }

    /* compiled from: MultipartBody.kt */
    public static final class b {
        public b(f fVar) {
        }

        public final void a(StringBuilder sb, String str) {
            i.e(sb, "$this$appendQuotedString");
            i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
            sb.append('\"');
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == 10) {
                    sb.append("%0A");
                } else if (charAt == 13) {
                    sb.append("%0D");
                } else if (charAt != '\"') {
                    sb.append(charAt);
                } else {
                    sb.append("%22");
                }
            }
            sb.append('\"');
        }
    }

    /* compiled from: MultipartBody.kt */
    public static final class c {
        public final v a;
        public final d0 b;

        public c(v vVar, d0 d0Var, f fVar) {
            this.a = vVar;
            this.b = d0Var;
        }

        public static final c a(v vVar, d0 d0Var) {
            i.e(d0Var, "body");
            boolean z = true;
            if ((vVar != null ? vVar.b(Header.CONTENT_TYPE) : null) == null) {
                if ((vVar != null ? vVar.b("Content-Length") : null) != null) {
                    z = false;
                }
                if (z) {
                    return new c(vVar, d0Var, (f) null);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }
            throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
        }

        public static final c b(String str, String str2, d0 d0Var) {
            i.e(str, "name");
            i.e(d0Var, "body");
            StringBuilder sb = new StringBuilder();
            sb.append("form-data; name=");
            b bVar = z.g;
            bVar.a(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                bVar.a(sb, str2);
            }
            String sb2 = sb.toString();
            i.d(sb2, "StringBuilder().apply(builderAction).toString()");
            ArrayList arrayList = new ArrayList(20);
            i.e("Content-Disposition", "name");
            i.e(sb2, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            v.c.a("Content-Disposition");
            i.e("Content-Disposition", "name");
            i.e(sb2, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            arrayList.add("Content-Disposition");
            arrayList.add(StringsKt__IndentKt.X(sb2).toString());
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return a(new v((String[]) array, (f) null), d0Var);
        }
    }

    static {
        y.a aVar = y.c;
        y.a.a("multipart/alternative");
        y.a.a("multipart/digest");
        y.a.a("multipart/parallel");
        byte b2 = (byte) 45;
        f = new byte[]{b2, b2};
    }

    public z(ByteString byteString, y yVar, List<c> list) {
        i.e(byteString, "boundaryByteString");
        i.e(yVar, "type");
        i.e(list, "parts");
        this.j = byteString;
        this.k = yVar;
        this.l = list;
        y.a aVar = y.c;
        this.h = y.a.a(yVar + "; boundary=" + byteString.v());
    }

    public long a() throws IOException {
        long j2 = this.i;
        if (j2 != -1) {
            return j2;
        }
        long e2 = e((h) null, true);
        this.i = e2;
        return e2;
    }

    public y b() {
        return this.h;
    }

    public void d(h hVar) throws IOException {
        i.e(hVar, "sink");
        e(hVar, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: r0.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: r0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: r0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: r0.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: r0.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long e(r0.h r13, boolean r14) throws java.io.IOException {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            r0.f r13 = new r0.f
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<q0.z$c> r1 = r12.l
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = r2
        L_0x0014:
            if (r5 >= r1) goto L_0x00aa
            java.util.List<q0.z$c> r6 = r12.l
            java.lang.Object r6 = r6.get(r5)
            q0.z$c r6 = (q0.z.c) r6
            q0.v r7 = r6.a
            q0.d0 r6 = r6.b
            m0.n.b.i.c(r13)
            byte[] r8 = f
            r13.k0(r8)
            okio.ByteString r8 = r12.j
            r13.l0(r8)
            byte[] r8 = e
            r13.k0(r8)
            if (r7 == 0) goto L_0x005b
            int r8 = r7.size()
            r9 = r2
        L_0x003b:
            if (r9 >= r8) goto L_0x005b
            java.lang.String r10 = r7.c(r9)
            r0.h r10 = r13.K(r10)
            byte[] r11 = d
            r0.h r10 = r10.k0(r11)
            java.lang.String r11 = r7.k(r9)
            r0.h r10 = r10.K(r11)
            byte[] r11 = e
            r10.k0(r11)
            int r9 = r9 + 1
            goto L_0x003b
        L_0x005b:
            q0.y r7 = r6.b()
            if (r7 == 0) goto L_0x0072
            java.lang.String r8 = "Content-Type: "
            r0.h r8 = r13.K(r8)
            java.lang.String r7 = r7.d
            r0.h r7 = r8.K(r7)
            byte[] r8 = e
            r7.k0(r8)
        L_0x0072:
            long r7 = r6.a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008c
            java.lang.String r9 = "Content-Length: "
            r0.h r9 = r13.K(r9)
            r0.h r9 = r9.B0(r7)
            byte[] r10 = e
            r9.k0(r10)
            goto L_0x0097
        L_0x008c:
            if (r14 == 0) goto L_0x0097
            m0.n.b.i.c(r0)
            long r13 = r0.d
            r0.skip(r13)
            return r9
        L_0x0097:
            byte[] r9 = e
            r13.k0(r9)
            if (r14 == 0) goto L_0x00a0
            long r3 = r3 + r7
            goto L_0x00a3
        L_0x00a0:
            r6.d(r13)
        L_0x00a3:
            r13.k0(r9)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00aa:
            m0.n.b.i.c(r13)
            byte[] r1 = f
            r13.k0(r1)
            okio.ByteString r2 = r12.j
            r13.l0(r2)
            r13.k0(r1)
            byte[] r1 = e
            r13.k0(r1)
            if (r14 == 0) goto L_0x00ca
            m0.n.b.i.c(r0)
            long r13 = r0.d
            long r3 = r3 + r13
            r0.skip(r13)
        L_0x00ca:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.z.e(r0.h, boolean):long");
    }
}
