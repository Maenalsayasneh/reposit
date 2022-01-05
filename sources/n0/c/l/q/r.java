package n0.c.l.q;

import com.instabug.library.model.session.config.SessionsConfigParameter;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.WriteMode;
import m0.n.b.i;
import n0.c.j.a;
import n0.c.j.c;
import n0.c.l.e;
import n0.c.m.b;

/* compiled from: StreamingJsonDecoder.kt */
public class r extends a implements e {
    public final b a;
    public int b = -1;
    public final d c;
    public final n0.c.l.a d;
    public final WriteMode e;
    public final i f;

    public r(n0.c.l.a aVar, WriteMode writeMode, i iVar) {
        i.e(aVar, "json");
        i.e(writeMode, SessionsConfigParameter.SYNC_MODE);
        i.e(iVar, "reader");
        this.d = aVar;
        this.e = writeMode;
        this.f = iVar;
        d dVar = aVar.b;
        this.a = dVar.k;
        this.c = dVar;
    }

    public <T> T B(n0.c.b<T> bVar) {
        i.e(bVar, "deserializer");
        return p.b(this, bVar);
    }

    public byte C() {
        i iVar = this.f;
        String h = iVar.h();
        try {
            return Byte.parseByte(h);
        } catch (IllegalArgumentException unused) {
            iVar.c("Failed to parse type '" + "byte" + "' for input '" + h + '\'', iVar.a);
            throw null;
        }
    }

    public short D() {
        i iVar = this.f;
        String h = iVar.h();
        try {
            return Short.parseShort(h);
        } catch (IllegalArgumentException unused) {
            iVar.c("Failed to parse type '" + "short" + "' for input '" + h + '\'', iVar.a);
            throw null;
        }
    }

    public float E() {
        i iVar = this.f;
        String h = iVar.h();
        try {
            float parseFloat = Float.parseFloat(h);
            if (!this.d.b.j) {
                if (!(!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat))) {
                    m0.r.t.a.r.m.a1.a.V3(this.f, Float.valueOf(parseFloat));
                    throw null;
                }
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            iVar.c("Failed to parse type '" + "float" + "' for input '" + h + '\'', iVar.a);
            throw null;
        }
    }

    public double G() {
        i iVar = this.f;
        String h = iVar.h();
        try {
            double parseDouble = Double.parseDouble(h);
            if (!this.d.b.j) {
                if (!(!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble))) {
                    m0.r.t.a.r.m.a1.a.V3(this.f, Double.valueOf(parseDouble));
                    throw null;
                }
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            iVar.c("Failed to parse type '" + "double" + "' for input '" + h + '\'', iVar.a);
            throw null;
        }
    }

    public b a() {
        return this.a;
    }

    public void b(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
        WriteMode writeMode = this.e;
        if (writeMode.end != 0) {
            i iVar = this.f;
            if (iVar.b == writeMode.endTc) {
                iVar.g();
                return;
            }
            StringBuilder P0 = i0.d.a.a.a.P0("Expected '");
            P0.append(this.e.end);
            P0.append('\'');
            iVar.c(P0.toString(), iVar.c);
            throw null;
        }
    }

    public c c(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
        WriteMode c2 = p.c(this.d, serialDescriptor);
        if (c2.begin != 0) {
            i iVar = this.f;
            if (iVar.b == c2.beginTc) {
                iVar.g();
            } else {
                StringBuilder P0 = i0.d.a.a.a.P0("Expected '");
                P0.append(c2.begin);
                P0.append(", kind: ");
                P0.append(serialDescriptor.f());
                P0.append('\'');
                iVar.c(P0.toString(), iVar.c);
                throw null;
            }
        }
        int ordinal = c2.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return new r(this.d, c2, this.f);
        }
        if (this.e == c2) {
            return this;
        }
        return new r(this.d, c2, this.f);
    }

    public n0.c.l.a d() {
        return this.d;
    }

    public boolean e() {
        String str;
        if (this.c.c) {
            str = this.f.h();
        } else {
            i iVar = this.f;
            if (iVar.b == 0) {
                str = iVar.i(true);
            } else {
                iVar.c("Expected start of the unquoted boolean literal.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", iVar.c);
                throw null;
            }
        }
        Boolean b2 = u.b(str);
        if (b2 != null) {
            return b2.booleanValue();
        }
        i iVar2 = this.f;
        i.d(iVar2, "Failed to parse type 'boolean' for input '" + str + '\'', 0, 2);
        throw null;
    }

    public char f() {
        i iVar = this.f;
        String h = iVar.h();
        try {
            return m0.r.t.a.r.m.a1.a.z3(h);
        } catch (IllegalArgumentException unused) {
            iVar.c("Failed to parse type '" + "char" + "' for input '" + h + '\'', iVar.a);
            throw null;
        }
    }

    public int g(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "enumDescriptor");
        return m0.r.t.a.r.m.a1.a.L1(serialDescriptor, n());
    }

    public JsonElement i() {
        return new f(this.d.b, this.f).a();
    }

    public int j() {
        i iVar = this.f;
        String h = iVar.h();
        try {
            return Integer.parseInt(h);
        } catch (IllegalArgumentException unused) {
            iVar.c("Failed to parse type '" + "int" + "' for input '" + h + '\'', iVar.a);
            throw null;
        }
    }

    public Void l() {
        i iVar = this.f;
        if (iVar.b == 10) {
            iVar.g();
            return null;
        }
        iVar.c("Expected 'null' literal", iVar.c);
        throw null;
    }

    public String n() {
        if (this.c.c) {
            return this.f.h();
        }
        return this.f.j();
    }

    public int o(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
        i.e(serialDescriptor, "descriptor");
        m0.r.t.a.r.m.a1.a.Z0(serialDescriptor);
        return -1;
    }

    public long r() {
        i iVar = this.f;
        String h = iVar.h();
        try {
            return Long.parseLong(h);
        } catch (IllegalArgumentException unused) {
            iVar.c("Failed to parse type '" + "long" + "' for input '" + h + '\'', iVar.a);
            throw null;
        }
    }

    public boolean u() {
        return this.f.b != 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a7, code lost:
        if (r10.d(r11) == -3) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x00b0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int x(kotlinx.serialization.descriptors.SerialDescriptor r15) {
        /*
            r14 = this;
            java.lang.String r0 = "descriptor"
            m0.n.b.i.e(r15, r0)
            n0.c.l.q.i r0 = r14.f
            byte r1 = r0.b
            r2 = 4
            r3 = 0
            r4 = -1
            r5 = 1
            r6 = 0
            if (r1 != r2) goto L_0x0025
            int r7 = r14.b
            if (r7 == r4) goto L_0x0016
            r7 = r5
            goto L_0x0017
        L_0x0016:
            r7 = r3
        L_0x0017:
            int r8 = r0.a
            if (r7 == 0) goto L_0x001f
            r0.g()
            goto L_0x0025
        L_0x001f:
            java.lang.String r15 = "Unexpected leading comma"
            r0.c(r15, r8)
            throw r6
        L_0x0025:
            kotlinx.serialization.json.internal.WriteMode r0 = r14.e
            int r0 = r0.ordinal()
            java.lang.String r7 = "Unexpected trailing comma"
            if (r0 == r5) goto L_0x01b4
            r8 = 5
            r9 = 2
            if (r0 == r9) goto L_0x0169
            r10 = 3
            if (r0 == r10) goto L_0x015b
            if (r1 != r2) goto L_0x0047
            n0.c.l.q.i r0 = r14.f
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0041
            goto L_0x0047
        L_0x0041:
            n0.c.l.q.i r15 = r14.f
            n0.c.l.q.i.d(r15, r7, r3, r9)
            throw r6
        L_0x0047:
            n0.c.l.q.i r0 = r14.f
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x01dc
            int r0 = r14.b
            int r0 = r0 + r5
            r14.b = r0
            java.lang.String r0 = r14.n()
            n0.c.l.q.i r1 = r14.f
            byte r10 = r1.b
            if (r10 != r8) goto L_0x0153
            r1.g()
            int r1 = r15.d(r0)
            r8 = -3
            if (r1 == r8) goto L_0x00b3
            n0.c.l.q.d r10 = r14.c
            boolean r10 = r10.g
            if (r10 == 0) goto L_0x00b0
            kotlinx.serialization.descriptors.SerialDescriptor r10 = r15.h(r1)
            n0.c.l.q.i r11 = r14.f
            byte r11 = r11.b
            r12 = 10
            if (r11 != r12) goto L_0x0081
            boolean r11 = r10.c()
            if (r11 != 0) goto L_0x0081
            goto L_0x00a9
        L_0x0081:
            n0.c.i.g r11 = r10.f()
            n0.c.i.g$b r12 = n0.c.i.g.b.a
            boolean r11 = m0.n.b.i.a(r11, r12)
            if (r11 == 0) goto L_0x00ab
            n0.c.l.q.i r11 = r14.f
            n0.c.l.q.d r12 = r14.c
            boolean r12 = r12.c
            byte r13 = r11.b
            if (r13 == r5) goto L_0x009d
            if (r12 == 0) goto L_0x009b
            if (r13 == 0) goto L_0x009d
        L_0x009b:
            r11 = r6
            goto L_0x00a1
        L_0x009d:
            java.lang.String r11 = r11.i(r3)
        L_0x00a1:
            if (r11 == 0) goto L_0x00ab
            int r10 = r10.d(r11)
            if (r10 != r8) goto L_0x00ab
        L_0x00a9:
            r8 = r5
            goto L_0x00ac
        L_0x00ab:
            r8 = r3
        L_0x00ac:
            if (r8 == 0) goto L_0x00b0
            r1 = r3
            goto L_0x00b4
        L_0x00b0:
            r3 = r1
            goto L_0x01e8
        L_0x00b3:
            r1 = r5
        L_0x00b4:
            if (r1 == 0) goto L_0x00cb
            n0.c.l.q.d r1 = r14.c
            boolean r1 = r1.b
            if (r1 == 0) goto L_0x00bd
            goto L_0x00cb
        L_0x00bd:
            n0.c.l.q.i r15 = r14.f
            java.lang.String r1 = "Encountered an unknown key '"
            java.lang.String r2 = "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys."
            java.lang.String r0 = i0.d.a.a.a.o0(r1, r0, r2)
            n0.c.l.q.i.d(r15, r0, r3, r9)
            throw r6
        L_0x00cb:
            n0.c.l.q.i r0 = r14.f
            byte r1 = r0.b
            r8 = 8
            r10 = 6
            if (r1 == r10) goto L_0x00da
            if (r1 == r8) goto L_0x00da
            r0.g()
            goto L_0x0136
        L_0x00da:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x00df:
            byte r1 = r0.b
            switch(r1) {
                case 6: goto L_0x0125;
                case 7: goto L_0x0105;
                case 8: goto L_0x0125;
                case 9: goto L_0x00e5;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            goto L_0x012c
        L_0x00e5:
            java.lang.Object r1 = m0.j.g.G(r11)
            java.lang.Number r1 = (java.lang.Number) r1
            byte r1 = r1.byteValue()
            if (r1 != r8) goto L_0x00fa
            int r1 = r11.size()
            int r1 = r1 + r4
            r11.remove(r1)
            goto L_0x012c
        L_0x00fa:
            int r15 = r0.a
            java.lang.String r0 = r0.g
            java.lang.String r1 = "found ] instead of }"
            kotlinx.serialization.json.internal.JsonDecodingException r15 = m0.r.t.a.r.m.a1.a.q(r15, r1, r0)
            throw r15
        L_0x0105:
            java.lang.Object r1 = m0.j.g.G(r11)
            java.lang.Number r1 = (java.lang.Number) r1
            byte r1 = r1.byteValue()
            if (r1 != r10) goto L_0x011a
            int r1 = r11.size()
            int r1 = r1 + r4
            r11.remove(r1)
            goto L_0x012c
        L_0x011a:
            int r15 = r0.a
            java.lang.String r0 = r0.g
            java.lang.String r1 = "found } instead of ]"
            kotlinx.serialization.json.internal.JsonDecodingException r15 = m0.r.t.a.r.m.a1.a.q(r15, r1, r0)
            throw r15
        L_0x0125:
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r11.add(r1)
        L_0x012c:
            r0.g()
            boolean r1 = r11.isEmpty()
            r1 = r1 ^ r5
            if (r1 != 0) goto L_0x00df
        L_0x0136:
            n0.c.l.q.i r0 = r14.f
            byte r1 = r0.b
            if (r1 != r2) goto L_0x0150
            r0.g()
            n0.c.l.q.i r0 = r14.f
            boolean r1 = r0.f()
            n0.c.l.q.i r8 = r14.f
            int r8 = r8.a
            if (r1 == 0) goto L_0x014c
            goto L_0x0150
        L_0x014c:
            r0.c(r7, r8)
            throw r6
        L_0x0150:
            r8 = 5
            goto L_0x0047
        L_0x0153:
            int r15 = r1.c
            java.lang.String r0 = "Expected ':'"
            r1.c(r0, r15)
            throw r6
        L_0x015b:
            int r15 = r14.b
            int r15 = r15 + r5
            r14.b = r15
            if (r15 == 0) goto L_0x01e8
            if (r15 == r5) goto L_0x0166
            goto L_0x01dc
        L_0x0166:
            r3 = r5
            goto L_0x01e8
        L_0x0169:
            if (r1 == r2) goto L_0x0180
            int r15 = r14.b
            int r15 = r15 % r9
            if (r15 != r5) goto L_0x0180
            n0.c.l.q.i r15 = r14.f
            r0 = 7
            byte r8 = r15.b
            if (r8 != r0) goto L_0x0178
            goto L_0x0180
        L_0x0178:
            int r0 = r15.c
            java.lang.String r1 = "Expected end of the object or comma"
            r15.c(r1, r0)
            throw r6
        L_0x0180:
            int r15 = r14.b
            int r15 = r15 % r9
            if (r15 != 0) goto L_0x0198
            n0.c.l.q.i r15 = r14.f
            byte r0 = r15.b
            r8 = 5
            if (r0 != r8) goto L_0x0190
            r15.g()
            goto L_0x0198
        L_0x0190:
            int r0 = r15.c
            java.lang.String r1 = "Expected ':' after the key"
            r15.c(r1, r0)
            throw r6
        L_0x0198:
            n0.c.l.q.i r15 = r14.f
            boolean r15 = r15.f()
            if (r15 != 0) goto L_0x01ae
            n0.c.l.q.i r15 = r14.f
            if (r1 == r2) goto L_0x01a5
            r3 = r5
        L_0x01a5:
            int r0 = r15.a
            if (r3 == 0) goto L_0x01aa
            goto L_0x01dc
        L_0x01aa:
            r15.c(r7, r0)
            throw r6
        L_0x01ae:
            int r15 = r14.b
            int r15 = r15 + r5
            r14.b = r15
            goto L_0x01e7
        L_0x01b4:
            if (r1 == r2) goto L_0x01cb
            int r15 = r14.b
            if (r15 == r4) goto L_0x01cb
            n0.c.l.q.i r15 = r14.f
            r0 = 9
            byte r8 = r15.b
            if (r8 != r0) goto L_0x01c3
            goto L_0x01cb
        L_0x01c3:
            int r0 = r15.c
            java.lang.String r1 = "Expected end of the array or comma"
            r15.c(r1, r0)
            throw r6
        L_0x01cb:
            n0.c.l.q.i r15 = r14.f
            boolean r15 = r15.f()
            if (r15 != 0) goto L_0x01e2
            n0.c.l.q.i r15 = r14.f
            if (r1 == r2) goto L_0x01d8
            r3 = r5
        L_0x01d8:
            int r0 = r15.a
            if (r3 == 0) goto L_0x01de
        L_0x01dc:
            r3 = r4
            goto L_0x01e8
        L_0x01de:
            r15.c(r7, r0)
            throw r6
        L_0x01e2:
            int r15 = r14.b
            int r15 = r15 + r5
            r14.b = r15
        L_0x01e7:
            r3 = r15
        L_0x01e8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.c.l.q.r.x(kotlinx.serialization.descriptors.SerialDescriptor):int");
    }

    public boolean y() {
        return false;
    }

    public Decoder z(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "inlineDescriptor");
        return t.a(serialDescriptor) ? new e(this.f, this.d) : this;
    }
}
