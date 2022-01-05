package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import m0.r.t.a.r.h.a;
import m0.r.t.a.r.h.c;
import m0.r.t.a.r.h.d;
import m0.r.t.a.r.h.e;
import m0.r.t.a.r.h.l;
import m0.r.t.a.r.h.m;
import m0.r.t.a.r.h.n;

public final class ProtoBuf$Property extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Property> implements m {
    public static final ProtoBuf$Property d;
    public static n<ProtoBuf$Property> q = new a();
    public int Y1;
    public int Z1;
    public int a2;
    public ProtoBuf$Type b2;
    public int c2;
    public List<ProtoBuf$TypeParameter> d2;
    public ProtoBuf$Type e2;
    public int f2;
    public ProtoBuf$ValueParameter g2;
    public int h2;
    public int i2;
    public List<Integer> j2;
    public byte k2;
    public int l2;
    public final c x;
    public int y;

    public static class a extends m0.r.t.a.r.h.b<ProtoBuf$Property> {
        public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Property(dVar, eVar, (m0.r.t.a.r.f.a) null);
        }
    }

    public static final class b extends GeneratedMessageLite.c<ProtoBuf$Property, b> implements m {
        public int Y1 = 2054;
        public int Z1;
        public ProtoBuf$Type a2;
        public int b2;
        public List<ProtoBuf$TypeParameter> c2;
        public ProtoBuf$Type d2;
        public int e2;
        public ProtoBuf$ValueParameter f2;
        public int g2;
        public int h2;
        public List<Integer> i2;
        public int x;
        public int y = 518;

        public b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.d;
            this.a2 = protoBuf$Type;
            this.c2 = Collections.emptyList();
            this.d2 = protoBuf$Type;
            this.f2 = ProtoBuf$ValueParameter.d;
            this.i2 = Collections.emptyList();
        }

        public l build() {
            ProtoBuf$Property m = m();
            if (m.g()) {
                return m;
            }
            throw new UninitializedMessageException();
        }

        public Object clone() throws CloneNotSupportedException {
            b bVar = new b();
            bVar.n(m());
            return bVar;
        }

        public /* bridge */ /* synthetic */ a.C0267a h(d dVar, e eVar) throws IOException {
            o(dVar, eVar);
            return this;
        }

        public GeneratedMessageLite.b i() {
            b bVar = new b();
            bVar.n(m());
            return bVar;
        }

        public /* bridge */ /* synthetic */ GeneratedMessageLite.b j(GeneratedMessageLite generatedMessageLite) {
            n((ProtoBuf$Property) generatedMessageLite);
            return this;
        }

        public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
            o(dVar, eVar);
            return this;
        }

        public ProtoBuf$Property m() {
            ProtoBuf$Property protoBuf$Property = new ProtoBuf$Property(this, (m0.r.t.a.r.f.a) null);
            int i = this.x;
            int i3 = 1;
            if ((i & 1) != 1) {
                i3 = 0;
            }
            protoBuf$Property.Y1 = this.y;
            if ((i & 2) == 2) {
                i3 |= 2;
            }
            protoBuf$Property.Z1 = this.Y1;
            if ((i & 4) == 4) {
                i3 |= 4;
            }
            protoBuf$Property.a2 = this.Z1;
            if ((i & 8) == 8) {
                i3 |= 8;
            }
            protoBuf$Property.b2 = this.a2;
            if ((i & 16) == 16) {
                i3 |= 16;
            }
            protoBuf$Property.c2 = this.b2;
            if ((i & 32) == 32) {
                this.c2 = Collections.unmodifiableList(this.c2);
                this.x &= -33;
            }
            protoBuf$Property.d2 = this.c2;
            if ((i & 64) == 64) {
                i3 |= 32;
            }
            protoBuf$Property.e2 = this.d2;
            if ((i & 128) == 128) {
                i3 |= 64;
            }
            protoBuf$Property.f2 = this.e2;
            if ((i & 256) == 256) {
                i3 |= 128;
            }
            protoBuf$Property.g2 = this.f2;
            if ((i & 512) == 512) {
                i3 |= 256;
            }
            protoBuf$Property.h2 = this.g2;
            if ((i & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                i3 |= 512;
            }
            protoBuf$Property.i2 = this.h2;
            if ((this.x & 2048) == 2048) {
                this.i2 = Collections.unmodifiableList(this.i2);
                this.x &= -2049;
            }
            protoBuf$Property.j2 = this.i2;
            protoBuf$Property.y = i3;
            return protoBuf$Property;
        }

        public b n(ProtoBuf$Property protoBuf$Property) {
            ProtoBuf$ValueParameter protoBuf$ValueParameter;
            ProtoBuf$Type protoBuf$Type;
            ProtoBuf$Type protoBuf$Type2;
            if (protoBuf$Property == ProtoBuf$Property.d) {
                return this;
            }
            int i = protoBuf$Property.y;
            boolean z = false;
            if ((i & 1) == 1) {
                int i3 = protoBuf$Property.Y1;
                this.x |= 1;
                this.y = i3;
            }
            if ((i & 2) == 2) {
                int i4 = protoBuf$Property.Z1;
                this.x = 2 | this.x;
                this.Y1 = i4;
            }
            if ((i & 4) == 4) {
                int i5 = protoBuf$Property.a2;
                this.x = 4 | this.x;
                this.Z1 = i5;
            }
            if (protoBuf$Property.z()) {
                ProtoBuf$Type protoBuf$Type3 = protoBuf$Property.b2;
                if ((this.x & 8) != 8 || (protoBuf$Type2 = this.a2) == ProtoBuf$Type.d) {
                    this.a2 = protoBuf$Type3;
                } else {
                    this.a2 = i0.d.a.a.a.p1(protoBuf$Type2, protoBuf$Type3);
                }
                this.x |= 8;
            }
            if ((protoBuf$Property.y & 16) == 16) {
                int i6 = protoBuf$Property.c2;
                this.x = 16 | this.x;
                this.b2 = i6;
            }
            if (!protoBuf$Property.d2.isEmpty()) {
                if (this.c2.isEmpty()) {
                    this.c2 = protoBuf$Property.d2;
                    this.x &= -33;
                } else {
                    if ((this.x & 32) != 32) {
                        this.c2 = new ArrayList(this.c2);
                        this.x |= 32;
                    }
                    this.c2.addAll(protoBuf$Property.d2);
                }
            }
            if (protoBuf$Property.x()) {
                ProtoBuf$Type protoBuf$Type4 = protoBuf$Property.e2;
                if ((this.x & 64) != 64 || (protoBuf$Type = this.d2) == ProtoBuf$Type.d) {
                    this.d2 = protoBuf$Type4;
                } else {
                    this.d2 = i0.d.a.a.a.p1(protoBuf$Type, protoBuf$Type4);
                }
                this.x |= 64;
            }
            if (protoBuf$Property.y()) {
                int i7 = protoBuf$Property.f2;
                this.x |= 128;
                this.e2 = i7;
            }
            if ((protoBuf$Property.y & 128) == 128) {
                ProtoBuf$ValueParameter protoBuf$ValueParameter2 = protoBuf$Property.g2;
                if ((this.x & 256) != 256 || (protoBuf$ValueParameter = this.f2) == ProtoBuf$ValueParameter.d) {
                    this.f2 = protoBuf$ValueParameter2;
                } else {
                    ProtoBuf$ValueParameter.b bVar = new ProtoBuf$ValueParameter.b();
                    bVar.n(protoBuf$ValueParameter);
                    bVar.n(protoBuf$ValueParameter2);
                    this.f2 = bVar.m();
                }
                this.x |= 256;
            }
            int i8 = protoBuf$Property.y;
            if ((i8 & 256) == 256) {
                int i9 = protoBuf$Property.h2;
                this.x |= 512;
                this.g2 = i9;
            }
            if ((i8 & 512) == 512) {
                z = true;
            }
            if (z) {
                int i10 = protoBuf$Property.i2;
                this.x |= RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE;
                this.h2 = i10;
            }
            if (!protoBuf$Property.j2.isEmpty()) {
                if (this.i2.isEmpty()) {
                    this.i2 = protoBuf$Property.j2;
                    this.x &= -2049;
                } else {
                    if ((this.x & 2048) != 2048) {
                        this.i2 = new ArrayList(this.i2);
                        this.x |= 2048;
                    }
                    this.i2.addAll(protoBuf$Property.j2);
                }
            }
            l(protoBuf$Property);
            this.c = this.c.c(protoBuf$Property.x);
            return this;
        }

        public b o(d dVar, e eVar) throws IOException {
            ProtoBuf$Property protoBuf$Property;
            ProtoBuf$Property protoBuf$Property2 = null;
            try {
                ProtoBuf$Property a = ProtoBuf$Property.q.a(dVar, eVar);
                if (a != null) {
                    n(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Property = (ProtoBuf$Property) e.c;
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$Property2 = protoBuf$Property;
            }
            if (protoBuf$Property2 != null) {
                n(protoBuf$Property2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$Property protoBuf$Property = new ProtoBuf$Property();
        d = protoBuf$Property;
        protoBuf$Property.A();
    }

    public ProtoBuf$Property(GeneratedMessageLite.c cVar, m0.r.t.a.r.f.a aVar) {
        super(cVar);
        this.k2 = -1;
        this.l2 = -1;
        this.x = cVar.c;
    }

    public final void A() {
        this.Y1 = 518;
        this.Z1 = 2054;
        this.a2 = 0;
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.d;
        this.b2 = protoBuf$Type;
        this.c2 = 0;
        this.d2 = Collections.emptyList();
        this.e2 = protoBuf$Type;
        this.f2 = 0;
        this.g2 = ProtoBuf$ValueParameter.d;
        this.h2 = 0;
        this.i2 = 0;
        this.j2 = Collections.emptyList();
    }

    public l b() {
        return d;
    }

    public l.a c() {
        b bVar = new b();
        bVar.n(this);
        return bVar;
    }

    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        GeneratedMessageLite.ExtendableMessage<MessageType>.defpackage.a q2 = q();
        if ((this.y & 2) == 2) {
            codedOutputStream.p(1, this.Z1);
        }
        if ((this.y & 4) == 4) {
            codedOutputStream.p(2, this.a2);
        }
        if ((this.y & 8) == 8) {
            codedOutputStream.r(3, this.b2);
        }
        for (int i = 0; i < this.d2.size(); i++) {
            codedOutputStream.r(4, this.d2.get(i));
        }
        if ((this.y & 32) == 32) {
            codedOutputStream.r(5, this.e2);
        }
        if ((this.y & 128) == 128) {
            codedOutputStream.r(6, this.g2);
        }
        if ((this.y & 256) == 256) {
            codedOutputStream.p(7, this.h2);
        }
        if ((this.y & 512) == 512) {
            codedOutputStream.p(8, this.i2);
        }
        if ((this.y & 16) == 16) {
            codedOutputStream.p(9, this.c2);
        }
        if ((this.y & 64) == 64) {
            codedOutputStream.p(10, this.f2);
        }
        if ((this.y & 1) == 1) {
            codedOutputStream.p(11, this.Y1);
        }
        for (int i3 = 0; i3 < this.j2.size(); i3++) {
            codedOutputStream.p(31, this.j2.get(i3).intValue());
        }
        q2.a(19000, codedOutputStream);
        codedOutputStream.u(this.x);
    }

    public int e() {
        int i = this.l2;
        if (i != -1) {
            return i;
        }
        int c = (this.y & 2) == 2 ? CodedOutputStream.c(1, this.Z1) + 0 : 0;
        if ((this.y & 4) == 4) {
            c += CodedOutputStream.c(2, this.a2);
        }
        if ((this.y & 8) == 8) {
            c += CodedOutputStream.e(3, this.b2);
        }
        for (int i3 = 0; i3 < this.d2.size(); i3++) {
            c += CodedOutputStream.e(4, this.d2.get(i3));
        }
        if ((this.y & 32) == 32) {
            c += CodedOutputStream.e(5, this.e2);
        }
        if ((this.y & 128) == 128) {
            c += CodedOutputStream.e(6, this.g2);
        }
        if ((this.y & 256) == 256) {
            c += CodedOutputStream.c(7, this.h2);
        }
        if ((this.y & 512) == 512) {
            c += CodedOutputStream.c(8, this.i2);
        }
        if ((this.y & 16) == 16) {
            c += CodedOutputStream.c(9, this.c2);
        }
        if ((this.y & 64) == 64) {
            c += CodedOutputStream.c(10, this.f2);
        }
        if ((this.y & 1) == 1) {
            c += CodedOutputStream.c(11, this.Y1);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.j2.size(); i5++) {
            i4 += CodedOutputStream.d(this.j2.get(i5).intValue());
        }
        int size = this.x.size() + l() + (this.j2.size() * 2) + c + i4;
        this.l2 = size;
        return size;
    }

    public l.a f() {
        return new b();
    }

    public final boolean g() {
        byte b3 = this.k2;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        if (!((this.y & 4) == 4)) {
            this.k2 = 0;
            return false;
        } else if (!z() || this.b2.g()) {
            for (int i = 0; i < this.d2.size(); i++) {
                if (!this.d2.get(i).g()) {
                    this.k2 = 0;
                    return false;
                }
            }
            if (!x() || this.e2.g()) {
                if (((this.y & 128) == 128) && !this.g2.g()) {
                    this.k2 = 0;
                    return false;
                } else if (!i()) {
                    this.k2 = 0;
                    return false;
                } else {
                    this.k2 = 1;
                    return true;
                }
            } else {
                this.k2 = 0;
                return false;
            }
        } else {
            this.k2 = 0;
            return false;
        }
    }

    public boolean x() {
        return (this.y & 32) == 32;
    }

    public boolean y() {
        return (this.y & 64) == 64;
    }

    public boolean z() {
        return (this.y & 8) == 8;
    }

    public ProtoBuf$Property() {
        this.k2 = -1;
        this.l2 = -1;
        this.x = c.c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$b} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProtoBuf$Property(m0.r.t.a.r.h.d r10, m0.r.t.a.r.h.e r11, m0.r.t.a.r.f.a r12) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r9 = this;
            r9.<init>()
            r12 = -1
            r9.k2 = r12
            r9.l2 = r12
            r9.A()
            m0.r.t.a.r.h.c$b r12 = m0.r.t.a.r.h.c.u()
            r0 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.k(r12, r0)
            r2 = 0
            r3 = r2
        L_0x0016:
            r4 = 32
            r5 = 2048(0x800, float:2.87E-42)
            if (r2 != 0) goto L_0x01bb
            int r6 = r10.o()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r7 = 0
            switch(r6) {
                case 0: goto L_0x0175;
                case 8: goto L_0x0165;
                case 16: goto L_0x0157;
                case 26: goto L_0x012e;
                case 34: goto L_0x0114;
                case 42: goto L_0x00ed;
                case 50: goto L_0x00bd;
                case 56: goto L_0x00af;
                case 64: goto L_0x00a1;
                case 72: goto L_0x0093;
                case 80: goto L_0x0086;
                case 88: goto L_0x007a;
                case 248: goto L_0x005f;
                case 250: goto L_0x002a;
                default: goto L_0x0024;
            }     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
        L_0x0024:
            boolean r4 = r9.v(r10, r1, r11, r6)     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            goto L_0x0173
        L_0x002a:
            int r6 = r10.l()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            int r6 = r10.d(r6)     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r7 = r3 & 2048(0x800, float:2.87E-42)
            if (r7 == r5) goto L_0x0045
            int r7 = r10.b()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            if (r7 <= 0) goto L_0x0045
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r9.j2 = r7     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r3 = r3 | 2048(0x800, float:2.87E-42)
        L_0x0045:
            int r7 = r10.b()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            if (r7 <= 0) goto L_0x0059
            java.util.List<java.lang.Integer> r7 = r9.j2     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            int r8 = r10.l()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            goto L_0x0045
        L_0x0059:
            r10.i = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r10.p()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            goto L_0x0016
        L_0x005f:
            r6 = r3 & 2048(0x800, float:2.87E-42)
            if (r6 == r5) goto L_0x006c
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r6.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r9.j2 = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r3 = r3 | 2048(0x800, float:2.87E-42)
        L_0x006c:
            java.util.List<java.lang.Integer> r6 = r9.j2     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            int r7 = r10.l()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r6.add(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            goto L_0x0016
        L_0x007a:
            int r6 = r9.y     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r6 = r6 | r0
            r9.y = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            int r6 = r10.l()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r9.Y1 = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            goto L_0x0016
        L_0x0086:
            int r6 = r9.y     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r6 = r6 | 64
            r9.y = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            int r6 = r10.l()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r9.f2 = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            goto L_0x0016
        L_0x0093:
            int r6 = r9.y     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r6 = r6 | 16
            r9.y = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            int r6 = r10.l()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r9.c2 = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            goto L_0x0016
        L_0x00a1:
            int r6 = r9.y     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r6 = r6 | 512(0x200, float:7.175E-43)
            r9.y = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            int r6 = r10.l()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r9.i2 = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            goto L_0x0016
        L_0x00af:
            int r6 = r9.y     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r6 = r6 | 256(0x100, float:3.59E-43)
            r9.y = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            int r6 = r10.l()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r9.h2 = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            goto L_0x0016
        L_0x00bd:
            int r6 = r9.y     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r8 = 128(0x80, float:1.794E-43)
            r6 = r6 & r8
            if (r6 != r8) goto L_0x00d1
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r6 = r9.g2     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            java.util.Objects.requireNonNull(r6)     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$b r7 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$b     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r7.n(r6)     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
        L_0x00d1:
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter.q     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            m0.r.t.a.r.h.l r6 = r10.h(r6, r11)     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter) r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r9.g2 = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            if (r7 == 0) goto L_0x00e6
            r7.n(r6)     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r6 = r7.m()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r9.g2 = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
        L_0x00e6:
            int r6 = r9.y     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r6 = r6 | r8
            r9.y = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            goto L_0x0016
        L_0x00ed:
            int r6 = r9.y     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r6 = r6 & r4
            if (r6 != r4) goto L_0x00f8
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r6 = r9.e2     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b r7 = r6.c()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
        L_0x00f8:
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.q     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            m0.r.t.a.r.h.l r6 = r10.h(r6, r11)     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type) r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r9.e2 = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            if (r7 == 0) goto L_0x010d
            r7.j(r6)     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r6 = r7.m()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r9.e2 = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
        L_0x010d:
            int r6 = r9.y     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r6 = r6 | r4
            r9.y = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            goto L_0x0016
        L_0x0114:
            r6 = r3 & 32
            if (r6 == r4) goto L_0x0121
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r6.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r9.d2 = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r3 = r3 | 32
        L_0x0121:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r6 = r9.d2     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter.q     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            m0.r.t.a.r.h.l r7 = r10.h(r7, r11)     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r6.add(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            goto L_0x0016
        L_0x012e:
            int r6 = r9.y     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r8 = 8
            r6 = r6 & r8
            if (r6 != r8) goto L_0x013b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r6 = r9.b2     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b r7 = r6.c()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
        L_0x013b:
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.q     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            m0.r.t.a.r.h.l r6 = r10.h(r6, r11)     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type) r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r9.b2 = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            if (r7 == 0) goto L_0x0150
            r7.j(r6)     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r6 = r7.m()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r9.b2 = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
        L_0x0150:
            int r6 = r9.y     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r6 = r6 | r8
            r9.y = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            goto L_0x0016
        L_0x0157:
            int r6 = r9.y     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r6 = r6 | 4
            r9.y = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            int r6 = r10.l()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r9.a2 = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            goto L_0x0016
        L_0x0165:
            int r6 = r9.y     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r6 = r6 | 2
            r9.y = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            int r6 = r10.l()     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            r9.Z1 = r6     // Catch:{ InvalidProtocolBufferException -> 0x0187, IOException -> 0x017a }
            goto L_0x0016
        L_0x0173:
            if (r4 != 0) goto L_0x0016
        L_0x0175:
            r2 = r0
            goto L_0x0016
        L_0x0178:
            r10 = move-exception
            goto L_0x018b
        L_0x017a:
            r10 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r11 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0178 }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x0178 }
            r11.<init>(r10)     // Catch:{ all -> 0x0178 }
            r11.c = r9     // Catch:{ all -> 0x0178 }
            throw r11     // Catch:{ all -> 0x0178 }
        L_0x0187:
            r10 = move-exception
            r10.c = r9     // Catch:{ all -> 0x0178 }
            throw r10     // Catch:{ all -> 0x0178 }
        L_0x018b:
            r11 = r3 & 32
            if (r11 != r4) goto L_0x0197
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r11 = r9.d2
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.d2 = r11
        L_0x0197:
            r11 = r3 & 2048(0x800, float:2.87E-42)
            if (r11 != r5) goto L_0x01a3
            java.util.List<java.lang.Integer> r11 = r9.j2
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.j2 = r11
        L_0x01a3:
            r1.j()     // Catch:{ IOException -> 0x01af, all -> 0x01a7 }
            goto L_0x01af
        L_0x01a7:
            r10 = move-exception
            m0.r.t.a.r.h.c r11 = r12.e()
            r9.x = r11
            throw r10
        L_0x01af:
            m0.r.t.a.r.h.c r11 = r12.e()
            r9.x = r11
            m0.r.t.a.r.h.f<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d> r11 = r9.c
            r11.i()
            throw r10
        L_0x01bb:
            r10 = r3 & 32
            if (r10 != r4) goto L_0x01c7
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r10 = r9.d2
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.d2 = r10
        L_0x01c7:
            r10 = r3 & 2048(0x800, float:2.87E-42)
            if (r10 != r5) goto L_0x01d3
            java.util.List<java.lang.Integer> r10 = r9.j2
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.j2 = r10
        L_0x01d3:
            r1.j()     // Catch:{ IOException -> 0x01df, all -> 0x01d7 }
            goto L_0x01df
        L_0x01d7:
            r10 = move-exception
            m0.r.t.a.r.h.c r11 = r12.e()
            r9.x = r11
            throw r10
        L_0x01df:
            m0.r.t.a.r.h.c r10 = r12.e()
            r9.x = r10
            m0.r.t.a.r.h.f<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d> r10 = r9.c
            r10.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property.<init>(m0.r.t.a.r.h.d, m0.r.t.a.r.h.e, m0.r.t.a.r.f.a):void");
    }
}
