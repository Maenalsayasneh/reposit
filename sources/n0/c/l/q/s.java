package n0.c.l.q;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.model.session.config.SessionsConfigParameter;
import java.util.Objects;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.internal.WriteMode;
import m0.d;
import m0.e;
import m0.f;
import m0.h;
import m0.n.b.i;
import n0.c.l.g;

/* compiled from: StreamingJsonEncoder.kt */
public final class s extends n0.c.j.b implements g {
    public final n0.c.m.b a;
    public final d b;
    public boolean c;
    public boolean d;
    public final a e;
    public final n0.c.l.a f;
    public final WriteMode g;
    public final g[] h;

    /* compiled from: StreamingJsonEncoder.kt */
    public static class a {
        public int a;
        public boolean b = true;
        public final StringBuilder c;
        public final n0.c.l.a d;

        public a(StringBuilder sb, n0.c.l.a aVar) {
            i.e(sb, "sb");
            i.e(aVar, "json");
            this.c = sb;
            this.d = aVar;
        }

        public final void a() {
            this.b = false;
            if (this.d.b.e) {
                e("\n");
                int i = this.a;
                for (int i2 = 0; i2 < i; i2++) {
                    e(this.d.b.f);
                }
            }
        }

        public StringBuilder b(byte b2) {
            StringBuilder sb = this.c;
            sb.append(Byte.valueOf(b2));
            return sb;
        }

        public StringBuilder c(int i) {
            StringBuilder sb = this.c;
            sb.append(i);
            return sb;
        }

        public StringBuilder d(long j) {
            StringBuilder sb = this.c;
            sb.append(j);
            return sb;
        }

        public StringBuilder e(String str) {
            i.e(str, "v");
            StringBuilder sb = this.c;
            sb.append(str);
            return sb;
        }

        public StringBuilder f(short s) {
            StringBuilder sb = this.c;
            sb.append(Short.valueOf(s));
            return sb;
        }

        public final void g() {
            if (this.d.b.e) {
                this.c.append(' ');
            }
        }
    }

    /* compiled from: StreamingJsonEncoder.kt */
    public static final class b extends a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(StringBuilder sb, n0.c.l.a aVar) {
            super(sb, aVar);
            i.e(sb, "sb");
            i.e(aVar, "json");
        }

        public StringBuilder b(byte b) {
            StringBuilder e = e(d.a(b));
            i.d(e, "super.print(v.toUByte().toString())");
            return e;
        }

        public StringBuilder c(int i) {
            StringBuilder e = e(e.a(i));
            i.d(e, "super.print(v.toUInt().toString())");
            return e;
        }

        public StringBuilder d(long j) {
            StringBuilder e = e(f.a(j));
            i.d(e, "super.print(v.toULong().toString())");
            return e;
        }

        public StringBuilder f(short s) {
            StringBuilder e = e(h.a(s));
            i.d(e, "super.print(v.toUShort().toString())");
            return e;
        }
    }

    public s(a aVar, n0.c.l.a aVar2, WriteMode writeMode, g[] gVarArr) {
        i.e(aVar, "composer");
        i.e(aVar2, "json");
        i.e(writeMode, SessionsConfigParameter.SYNC_MODE);
        this.e = aVar;
        this.f = aVar2;
        this.g = writeMode;
        this.h = gVarArr;
        d dVar = aVar2.b;
        this.a = dVar.k;
        this.b = dVar;
        int ordinal = writeMode.ordinal();
        if (gVarArr == null) {
            return;
        }
        if (gVarArr[ordinal] != null || gVarArr[ordinal] != this) {
            gVarArr[ordinal] = this;
        }
    }

    public void C(long j) {
        if (this.c) {
            F(String.valueOf(j));
        } else {
            this.e.d(j);
        }
    }

    public void F(String str) {
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        a aVar = this.e;
        Objects.requireNonNull(aVar);
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        u.a(aVar.c, str);
    }

    public boolean G(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        int ordinal = this.g.ordinal();
        if (ordinal != 1) {
            boolean z = false;
            if (ordinal == 2) {
                a aVar = this.e;
                if (!aVar.b) {
                    if (i % 2 == 0) {
                        aVar.c.append(',');
                        this.e.a();
                        z = true;
                    } else {
                        aVar.c.append(':');
                        this.e.g();
                    }
                    this.c = z;
                } else {
                    this.c = true;
                    aVar.a();
                }
            } else if (ordinal != 3) {
                a aVar2 = this.e;
                if (!aVar2.b) {
                    aVar2.c.append(',');
                }
                this.e.a();
                F(serialDescriptor.g(i));
                this.e.c.append(':');
                this.e.g();
            } else {
                if (i == 0) {
                    this.c = true;
                }
                if (i == 1) {
                    this.e.c.append(',');
                    this.e.g();
                    this.c = false;
                }
            }
        } else {
            a aVar3 = this.e;
            if (!aVar3.b) {
                aVar3.c.append(',');
            }
            this.e.a();
        }
        return true;
    }

    public <T> void H(n0.c.f<? super T> fVar, T t) {
        i.e(fVar, "serializer");
        i.e(fVar, "serializer");
        m0.r.t.a.r.m.a1.a.l1(this, fVar, t);
    }

    public n0.c.m.b a() {
        return this.a;
    }

    public void b(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
        if (this.g.end != 0) {
            a aVar = this.e;
            aVar.a--;
            aVar.a();
            this.e.c.append(this.g.end);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        r5 = r5[r0.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n0.c.j.d c(kotlinx.serialization.descriptors.SerialDescriptor r5) {
        /*
            r4 = this;
            java.lang.String r0 = "descriptor"
            m0.n.b.i.e(r5, r0)
            n0.c.l.a r0 = r4.f
            kotlinx.serialization.json.internal.WriteMode r0 = n0.c.l.q.p.c(r0, r5)
            char r1 = r0.begin
            if (r1 == 0) goto L_0x0020
            n0.c.l.q.s$a r2 = r4.e
            java.lang.StringBuilder r2 = r2.c
            r2.append(r1)
            n0.c.l.q.s$a r1 = r4.e
            r2 = 1
            r1.b = r2
            int r3 = r1.a
            int r3 = r3 + r2
            r1.a = r3
        L_0x0020:
            boolean r1 = r4.d
            if (r1 == 0) goto L_0x0048
            r1 = 0
            r4.d = r1
            n0.c.l.q.s$a r1 = r4.e
            r1.a()
            n0.c.l.q.d r1 = r4.b
            java.lang.String r1 = r1.i
            r4.F(r1)
            n0.c.l.q.s$a r1 = r4.e
            java.lang.StringBuilder r1 = r1.c
            r2 = 58
            r1.append(r2)
            n0.c.l.q.s$a r1 = r4.e
            r1.g()
            java.lang.String r5 = r5.a()
            r4.F(r5)
        L_0x0048:
            kotlinx.serialization.json.internal.WriteMode r5 = r4.g
            if (r5 != r0) goto L_0x004d
            return r4
        L_0x004d:
            n0.c.l.g[] r5 = r4.h
            if (r5 == 0) goto L_0x005a
            int r1 = r0.ordinal()
            r5 = r5[r1]
            if (r5 == 0) goto L_0x005a
            goto L_0x0065
        L_0x005a:
            n0.c.l.q.s r5 = new n0.c.l.q.s
            n0.c.l.q.s$a r1 = r4.e
            n0.c.l.a r2 = r4.f
            n0.c.l.g[] r3 = r4.h
            r5.<init>(r1, r2, r0, r3)
        L_0x0065:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.c.l.q.s.c(kotlinx.serialization.descriptors.SerialDescriptor):n0.c.j.d");
    }

    public n0.c.l.a d() {
        return this.f;
    }

    public <T> void e(n0.c.f<? super T> fVar, T t) {
        i.e(fVar, "serializer");
        if (!(fVar instanceof n0.c.k.b) || this.f.b.h) {
            fVar.serialize(this, t);
            return;
        }
        Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.Any");
        n0.c.f a2 = p.a(this, fVar, t);
        this.d = true;
        a2.serialize(this, t);
    }

    public void f() {
        this.e.e("null");
    }

    public void h(double d2) {
        if (this.c) {
            F(String.valueOf(d2));
        } else {
            this.e.c.append(d2);
        }
        if (!this.b.j) {
            if (!(!Double.isInfinite(d2) && !Double.isNaN(d2))) {
                Double valueOf = Double.valueOf(d2);
                String sb = this.e.c.toString();
                i.d(sb, "composer.sb.toString()");
                throw m0.r.t.a.r.m.a1.a.k(valueOf, sb);
            }
        }
    }

    public void i(short s) {
        if (this.c) {
            F(String.valueOf(s));
        } else {
            this.e.f(s);
        }
    }

    public void j(byte b2) {
        if (this.c) {
            F(String.valueOf(b2));
        } else {
            this.e.b(b2);
        }
    }

    public void k(boolean z) {
        if (this.c) {
            F(String.valueOf(z));
        } else {
            this.e.c.append(z);
        }
    }

    public void n(float f2) {
        if (this.c) {
            F(String.valueOf(f2));
        } else {
            this.e.c.append(f2);
        }
        if (!this.b.j) {
            if (!(!Float.isInfinite(f2) && !Float.isNaN(f2))) {
                Float valueOf = Float.valueOf(f2);
                String sb = this.e.c.toString();
                i.d(sb, "composer.sb.toString()");
                throw m0.r.t.a.r.m.a1.a.k(valueOf, sb);
            }
        }
    }

    public void o(char c2) {
        F(String.valueOf(c2));
    }

    public void p() {
    }

    public n0.c.j.d t(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        i.e(serialDescriptor, "descriptor");
        return m0.r.t.a.r.m.a1.a.a0(this, serialDescriptor);
    }

    public void u(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "enumDescriptor");
        F(serialDescriptor.g(i));
    }

    public boolean v(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "descriptor");
        return this.b.a;
    }

    public void w(JsonElement jsonElement) {
        i.e(jsonElement, "element");
        e(JsonElementSerializer.b, jsonElement);
    }

    public void x(int i) {
        if (this.c) {
            F(String.valueOf(i));
        } else {
            this.e.c(i);
        }
    }

    public Encoder y(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "inlineDescriptor");
        if (!t.a(serialDescriptor)) {
            return this;
        }
        a aVar = this.e;
        return new s(new b(aVar.c, aVar.d), this.f, this.g, (g[]) null);
    }
}
