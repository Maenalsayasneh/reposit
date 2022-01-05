package n0.c.l.q;

import kotlin.text.StringsKt__IndentKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.f;
import m0.n.b.i;
import n0.c.j.a;
import n0.c.m.b;

/* compiled from: StreamingJsonDecoder.kt */
public final class e extends a {
    public final b a;
    public final i b;

    public e(i iVar, n0.c.l.a aVar) {
        i.e(iVar, "reader");
        i.e(aVar, "json");
        this.b = iVar;
        this.a = aVar.b.k;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031 A[Catch:{ IllegalArgumentException -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034 A[Catch:{ IllegalArgumentException -> 0x0038 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte C() {
        /*
            r5 = this;
            n0.c.l.q.i r0 = r5.b
            java.lang.String r1 = r0.h()
            r2 = 0
            java.lang.String r3 = "$this$toUByte"
            m0.n.b.i.e(r1, r3)     // Catch:{ IllegalArgumentException -> 0x0038 }
            java.lang.String r3 = "$this$toUByteOrNull"
            m0.n.b.i.e(r1, r3)     // Catch:{ IllegalArgumentException -> 0x0038 }
            m0.n.b.i.e(r1, r3)     // Catch:{ IllegalArgumentException -> 0x0038 }
            r3 = 10
            m0.e r3 = kotlin.text.StringsKt__IndentKt.V(r1, r3)     // Catch:{ IllegalArgumentException -> 0x0038 }
            if (r3 == 0) goto L_0x002e
            int r3 = r3.d     // Catch:{ IllegalArgumentException -> 0x0038 }
            r4 = 255(0xff, float:3.57E-43)
            int r4 = i0.j.f.p.h.u4(r3, r4)     // Catch:{ IllegalArgumentException -> 0x0038 }
            if (r4 <= 0) goto L_0x0027
            goto L_0x002e
        L_0x0027:
            byte r3 = (byte) r3     // Catch:{ IllegalArgumentException -> 0x0038 }
            m0.d r4 = new m0.d     // Catch:{ IllegalArgumentException -> 0x0038 }
            r4.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0038 }
            goto L_0x002f
        L_0x002e:
            r4 = r2
        L_0x002f:
            if (r4 == 0) goto L_0x0034
            byte r0 = r4.d     // Catch:{ IllegalArgumentException -> 0x0038 }
            return r0
        L_0x0034:
            kotlin.text.StringsKt__IndentKt.s(r1)     // Catch:{ IllegalArgumentException -> 0x0038 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0038 }
        L_0x0038:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to parse type '"
            r3.append(r4)
            java.lang.String r4 = "UByte"
            r3.append(r4)
            java.lang.String r4 = "' for input '"
            r3.append(r4)
            r3.append(r1)
            r1 = 39
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            int r3 = r0.a
            r0.c(r1, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.c.l.q.e.C():byte");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032 A[Catch:{ IllegalArgumentException -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035 A[Catch:{ IllegalArgumentException -> 0x0039 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public short D() {
        /*
            r5 = this;
            n0.c.l.q.i r0 = r5.b
            java.lang.String r1 = r0.h()
            r2 = 0
            java.lang.String r3 = "$this$toUShort"
            m0.n.b.i.e(r1, r3)     // Catch:{ IllegalArgumentException -> 0x0039 }
            java.lang.String r3 = "$this$toUShortOrNull"
            m0.n.b.i.e(r1, r3)     // Catch:{ IllegalArgumentException -> 0x0039 }
            m0.n.b.i.e(r1, r3)     // Catch:{ IllegalArgumentException -> 0x0039 }
            r3 = 10
            m0.e r3 = kotlin.text.StringsKt__IndentKt.V(r1, r3)     // Catch:{ IllegalArgumentException -> 0x0039 }
            if (r3 == 0) goto L_0x002f
            int r3 = r3.d     // Catch:{ IllegalArgumentException -> 0x0039 }
            r4 = 65535(0xffff, float:9.1834E-41)
            int r4 = i0.j.f.p.h.u4(r3, r4)     // Catch:{ IllegalArgumentException -> 0x0039 }
            if (r4 <= 0) goto L_0x0028
            goto L_0x002f
        L_0x0028:
            short r3 = (short) r3     // Catch:{ IllegalArgumentException -> 0x0039 }
            m0.h r4 = new m0.h     // Catch:{ IllegalArgumentException -> 0x0039 }
            r4.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0039 }
            goto L_0x0030
        L_0x002f:
            r4 = r2
        L_0x0030:
            if (r4 == 0) goto L_0x0035
            short r0 = r4.d     // Catch:{ IllegalArgumentException -> 0x0039 }
            return r0
        L_0x0035:
            kotlin.text.StringsKt__IndentKt.s(r1)     // Catch:{ IllegalArgumentException -> 0x0039 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0039 }
        L_0x0039:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to parse type '"
            r3.append(r4)
            java.lang.String r4 = "UShort"
            r3.append(r4)
            java.lang.String r4 = "' for input '"
            r3.append(r4)
            r3.append(r1)
            r1 = 39
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            int r3 = r0.a
            r0.c(r1, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.c.l.q.e.D():short");
    }

    public b a() {
        return this.a;
    }

    public int j() {
        i iVar = this.b;
        String h = iVar.h();
        try {
            i.e(h, "$this$toUInt");
            i.e(h, "$this$toUIntOrNull");
            m0.e V = StringsKt__IndentKt.V(h, 10);
            if (V != null) {
                return V.d;
            }
            StringsKt__IndentKt.s(h);
            throw null;
        } catch (IllegalArgumentException unused) {
            iVar.c("Failed to parse type '" + "UInt" + "' for input '" + h + '\'', iVar.a);
            throw null;
        }
    }

    public long r() {
        i iVar = this.b;
        String h = iVar.h();
        try {
            i.e(h, "$this$toULong");
            f W = StringsKt__IndentKt.W(h);
            if (W != null) {
                return W.d;
            }
            StringsKt__IndentKt.s(h);
            throw null;
        } catch (IllegalArgumentException unused) {
            iVar.c("Failed to parse type '" + "ULong" + "' for input '" + h + '\'', iVar.a);
            throw null;
        }
    }

    public int x(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }
}
