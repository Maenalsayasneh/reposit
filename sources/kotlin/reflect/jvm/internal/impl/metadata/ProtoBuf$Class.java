package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import m0.r.t.a.r.h.a;
import m0.r.t.a.r.h.c;
import m0.r.t.a.r.h.d;
import m0.r.t.a.r.h.e;
import m0.r.t.a.r.h.l;
import m0.r.t.a.r.h.m;
import m0.r.t.a.r.h.n;

public final class ProtoBuf$Class extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Class> implements m {
    public static final ProtoBuf$Class d;
    public static n<ProtoBuf$Class> q = new a();
    public int Y1;
    public int Z1;
    public int a2;
    public List<ProtoBuf$TypeParameter> b2;
    public List<ProtoBuf$Type> c2;
    public List<Integer> d2;
    public int e2;
    public List<Integer> f2;
    public int g2;
    public List<ProtoBuf$Constructor> h2;
    public List<ProtoBuf$Function> i2;
    public List<ProtoBuf$Property> j2;
    public List<ProtoBuf$TypeAlias> k2;
    public List<ProtoBuf$EnumEntry> l2;
    public List<Integer> m2;
    public int n2;
    public ProtoBuf$TypeTable o2;
    public List<Integer> p2;
    public ProtoBuf$VersionRequirementTable q2;
    public byte r2;
    public int s2;
    public final c x;
    public int y;

    public enum Kind implements Internal.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);
        
        private static Internal.b<Kind> internalValueMap;
        private final int value;

        public static class a implements Internal.b<Kind> {
            public Internal.a a(int i) {
                return Kind.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new a();
        }

        private Kind(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static Kind valueOf(int i) {
            switch (i) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }
    }

    public static class a extends m0.r.t.a.r.h.b<ProtoBuf$Class> {
        public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Class(dVar, eVar);
        }
    }

    public static final class b extends GeneratedMessageLite.c<ProtoBuf$Class, b> implements m {
        public int Y1;
        public int Z1;
        public List<ProtoBuf$TypeParameter> a2 = Collections.emptyList();
        public List<ProtoBuf$Type> b2 = Collections.emptyList();
        public List<Integer> c2 = Collections.emptyList();
        public List<Integer> d2 = Collections.emptyList();
        public List<ProtoBuf$Constructor> e2 = Collections.emptyList();
        public List<ProtoBuf$Function> f2 = Collections.emptyList();
        public List<ProtoBuf$Property> g2 = Collections.emptyList();
        public List<ProtoBuf$TypeAlias> h2 = Collections.emptyList();
        public List<ProtoBuf$EnumEntry> i2 = Collections.emptyList();
        public List<Integer> j2 = Collections.emptyList();
        public ProtoBuf$TypeTable k2 = ProtoBuf$TypeTable.c;
        public List<Integer> l2 = Collections.emptyList();
        public ProtoBuf$VersionRequirementTable m2 = ProtoBuf$VersionRequirementTable.c;
        public int x;
        public int y = 6;

        public l build() {
            ProtoBuf$Class m = m();
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
            n((ProtoBuf$Class) generatedMessageLite);
            return this;
        }

        public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
            o(dVar, eVar);
            return this;
        }

        public ProtoBuf$Class m() {
            ProtoBuf$Class protoBuf$Class = new ProtoBuf$Class((GeneratedMessageLite.c) this, (m0.r.t.a.r.f.a) null);
            int i = this.x;
            int i3 = 1;
            if ((i & 1) != 1) {
                i3 = 0;
            }
            protoBuf$Class.Y1 = this.y;
            if ((i & 2) == 2) {
                i3 |= 2;
            }
            protoBuf$Class.Z1 = this.Y1;
            if ((i & 4) == 4) {
                i3 |= 4;
            }
            protoBuf$Class.a2 = this.Z1;
            if ((i & 8) == 8) {
                this.a2 = Collections.unmodifiableList(this.a2);
                this.x &= -9;
            }
            protoBuf$Class.b2 = this.a2;
            if ((this.x & 16) == 16) {
                this.b2 = Collections.unmodifiableList(this.b2);
                this.x &= -17;
            }
            protoBuf$Class.c2 = this.b2;
            if ((this.x & 32) == 32) {
                this.c2 = Collections.unmodifiableList(this.c2);
                this.x &= -33;
            }
            protoBuf$Class.d2 = this.c2;
            if ((this.x & 64) == 64) {
                this.d2 = Collections.unmodifiableList(this.d2);
                this.x &= -65;
            }
            protoBuf$Class.f2 = this.d2;
            if ((this.x & 128) == 128) {
                this.e2 = Collections.unmodifiableList(this.e2);
                this.x &= -129;
            }
            protoBuf$Class.h2 = this.e2;
            if ((this.x & 256) == 256) {
                this.f2 = Collections.unmodifiableList(this.f2);
                this.x &= -257;
            }
            protoBuf$Class.i2 = this.f2;
            if ((this.x & 512) == 512) {
                this.g2 = Collections.unmodifiableList(this.g2);
                this.x &= -513;
            }
            protoBuf$Class.j2 = this.g2;
            if ((this.x & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                this.h2 = Collections.unmodifiableList(this.h2);
                this.x &= -1025;
            }
            protoBuf$Class.k2 = this.h2;
            if ((this.x & 2048) == 2048) {
                this.i2 = Collections.unmodifiableList(this.i2);
                this.x &= -2049;
            }
            protoBuf$Class.l2 = this.i2;
            if ((this.x & 4096) == 4096) {
                this.j2 = Collections.unmodifiableList(this.j2);
                this.x &= -4097;
            }
            protoBuf$Class.m2 = this.j2;
            if ((i & 8192) == 8192) {
                i3 |= 8;
            }
            protoBuf$Class.o2 = this.k2;
            if ((this.x & 16384) == 16384) {
                this.l2 = Collections.unmodifiableList(this.l2);
                this.x &= -16385;
            }
            protoBuf$Class.p2 = this.l2;
            if ((i & 32768) == 32768) {
                i3 |= 16;
            }
            protoBuf$Class.q2 = this.m2;
            protoBuf$Class.y = i3;
            return protoBuf$Class;
        }

        public b n(ProtoBuf$Class protoBuf$Class) {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable;
            ProtoBuf$TypeTable protoBuf$TypeTable;
            if (protoBuf$Class == ProtoBuf$Class.d) {
                return this;
            }
            int i = protoBuf$Class.y;
            boolean z = false;
            if ((i & 1) == 1) {
                int i3 = protoBuf$Class.Y1;
                this.x |= 1;
                this.y = i3;
            }
            if ((i & 2) == 2) {
                int i4 = protoBuf$Class.Z1;
                this.x = 2 | this.x;
                this.Y1 = i4;
            }
            if ((i & 4) == 4) {
                int i5 = protoBuf$Class.a2;
                this.x = 4 | this.x;
                this.Z1 = i5;
            }
            if (!protoBuf$Class.b2.isEmpty()) {
                if (this.a2.isEmpty()) {
                    this.a2 = protoBuf$Class.b2;
                    this.x &= -9;
                } else {
                    if ((this.x & 8) != 8) {
                        this.a2 = new ArrayList(this.a2);
                        this.x |= 8;
                    }
                    this.a2.addAll(protoBuf$Class.b2);
                }
            }
            if (!protoBuf$Class.c2.isEmpty()) {
                if (this.b2.isEmpty()) {
                    this.b2 = protoBuf$Class.c2;
                    this.x &= -17;
                } else {
                    if ((this.x & 16) != 16) {
                        this.b2 = new ArrayList(this.b2);
                        this.x |= 16;
                    }
                    this.b2.addAll(protoBuf$Class.c2);
                }
            }
            if (!protoBuf$Class.d2.isEmpty()) {
                if (this.c2.isEmpty()) {
                    this.c2 = protoBuf$Class.d2;
                    this.x &= -33;
                } else {
                    if ((this.x & 32) != 32) {
                        this.c2 = new ArrayList(this.c2);
                        this.x |= 32;
                    }
                    this.c2.addAll(protoBuf$Class.d2);
                }
            }
            if (!protoBuf$Class.f2.isEmpty()) {
                if (this.d2.isEmpty()) {
                    this.d2 = protoBuf$Class.f2;
                    this.x &= -65;
                } else {
                    if ((this.x & 64) != 64) {
                        this.d2 = new ArrayList(this.d2);
                        this.x |= 64;
                    }
                    this.d2.addAll(protoBuf$Class.f2);
                }
            }
            if (!protoBuf$Class.h2.isEmpty()) {
                if (this.e2.isEmpty()) {
                    this.e2 = protoBuf$Class.h2;
                    this.x &= -129;
                } else {
                    if ((this.x & 128) != 128) {
                        this.e2 = new ArrayList(this.e2);
                        this.x |= 128;
                    }
                    this.e2.addAll(protoBuf$Class.h2);
                }
            }
            if (!protoBuf$Class.i2.isEmpty()) {
                if (this.f2.isEmpty()) {
                    this.f2 = protoBuf$Class.i2;
                    this.x &= -257;
                } else {
                    if ((this.x & 256) != 256) {
                        this.f2 = new ArrayList(this.f2);
                        this.x |= 256;
                    }
                    this.f2.addAll(protoBuf$Class.i2);
                }
            }
            if (!protoBuf$Class.j2.isEmpty()) {
                if (this.g2.isEmpty()) {
                    this.g2 = protoBuf$Class.j2;
                    this.x &= -513;
                } else {
                    if ((this.x & 512) != 512) {
                        this.g2 = new ArrayList(this.g2);
                        this.x |= 512;
                    }
                    this.g2.addAll(protoBuf$Class.j2);
                }
            }
            if (!protoBuf$Class.k2.isEmpty()) {
                if (this.h2.isEmpty()) {
                    this.h2 = protoBuf$Class.k2;
                    this.x &= -1025;
                } else {
                    if ((this.x & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 1024) {
                        this.h2 = new ArrayList(this.h2);
                        this.x |= RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE;
                    }
                    this.h2.addAll(protoBuf$Class.k2);
                }
            }
            if (!protoBuf$Class.l2.isEmpty()) {
                if (this.i2.isEmpty()) {
                    this.i2 = protoBuf$Class.l2;
                    this.x &= -2049;
                } else {
                    if ((this.x & 2048) != 2048) {
                        this.i2 = new ArrayList(this.i2);
                        this.x |= 2048;
                    }
                    this.i2.addAll(protoBuf$Class.l2);
                }
            }
            if (!protoBuf$Class.m2.isEmpty()) {
                if (this.j2.isEmpty()) {
                    this.j2 = protoBuf$Class.m2;
                    this.x &= -4097;
                } else {
                    if ((this.x & 4096) != 4096) {
                        this.j2 = new ArrayList(this.j2);
                        this.x |= 4096;
                    }
                    this.j2.addAll(protoBuf$Class.m2);
                }
            }
            if ((protoBuf$Class.y & 8) == 8) {
                ProtoBuf$TypeTable protoBuf$TypeTable2 = protoBuf$Class.o2;
                if ((this.x & 8192) != 8192 || (protoBuf$TypeTable = this.k2) == ProtoBuf$TypeTable.c) {
                    this.k2 = protoBuf$TypeTable2;
                } else {
                    ProtoBuf$TypeTable.b i6 = ProtoBuf$TypeTable.i(protoBuf$TypeTable);
                    i6.m(protoBuf$TypeTable2);
                    this.k2 = i6.l();
                }
                this.x |= 8192;
            }
            if (!protoBuf$Class.p2.isEmpty()) {
                if (this.l2.isEmpty()) {
                    this.l2 = protoBuf$Class.p2;
                    this.x &= -16385;
                } else {
                    if ((this.x & 16384) != 16384) {
                        this.l2 = new ArrayList(this.l2);
                        this.x |= 16384;
                    }
                    this.l2.addAll(protoBuf$Class.p2);
                }
            }
            if ((protoBuf$Class.y & 16) == 16) {
                z = true;
            }
            if (z) {
                ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable2 = protoBuf$Class.q2;
                if ((this.x & 32768) != 32768 || (protoBuf$VersionRequirementTable = this.m2) == ProtoBuf$VersionRequirementTable.c) {
                    this.m2 = protoBuf$VersionRequirementTable2;
                } else {
                    ProtoBuf$VersionRequirementTable.b i7 = ProtoBuf$VersionRequirementTable.i(protoBuf$VersionRequirementTable);
                    i7.m(protoBuf$VersionRequirementTable2);
                    this.m2 = i7.l();
                }
                this.x |= 32768;
            }
            l(protoBuf$Class);
            this.c = this.c.c(protoBuf$Class.x);
            return this;
        }

        public b o(d dVar, e eVar) throws IOException {
            ProtoBuf$Class protoBuf$Class;
            ProtoBuf$Class protoBuf$Class2 = null;
            try {
                ProtoBuf$Class a = ProtoBuf$Class.q.a(dVar, eVar);
                if (a != null) {
                    n(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Class = (ProtoBuf$Class) e.c;
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$Class2 = protoBuf$Class;
            }
            if (protoBuf$Class2 != null) {
                n(protoBuf$Class2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$Class protoBuf$Class = new ProtoBuf$Class();
        d = protoBuf$Class;
        protoBuf$Class.x();
    }

    public ProtoBuf$Class(GeneratedMessageLite.c cVar, m0.r.t.a.r.f.a aVar) {
        super(cVar);
        this.e2 = -1;
        this.g2 = -1;
        this.n2 = -1;
        this.r2 = -1;
        this.s2 = -1;
        this.x = cVar.c;
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
        GeneratedMessageLite.ExtendableMessage<MessageType>.defpackage.a q3 = q();
        if ((this.y & 1) == 1) {
            codedOutputStream.p(1, this.Y1);
        }
        if (this.d2.size() > 0) {
            codedOutputStream.y(18);
            codedOutputStream.y(this.e2);
        }
        for (int i = 0; i < this.d2.size(); i++) {
            codedOutputStream.q(this.d2.get(i).intValue());
        }
        if ((this.y & 2) == 2) {
            codedOutputStream.p(3, this.Z1);
        }
        if ((this.y & 4) == 4) {
            codedOutputStream.p(4, this.a2);
        }
        for (int i3 = 0; i3 < this.b2.size(); i3++) {
            codedOutputStream.r(5, this.b2.get(i3));
        }
        for (int i4 = 0; i4 < this.c2.size(); i4++) {
            codedOutputStream.r(6, this.c2.get(i4));
        }
        if (this.f2.size() > 0) {
            codedOutputStream.y(58);
            codedOutputStream.y(this.g2);
        }
        for (int i5 = 0; i5 < this.f2.size(); i5++) {
            codedOutputStream.q(this.f2.get(i5).intValue());
        }
        for (int i6 = 0; i6 < this.h2.size(); i6++) {
            codedOutputStream.r(8, this.h2.get(i6));
        }
        for (int i7 = 0; i7 < this.i2.size(); i7++) {
            codedOutputStream.r(9, this.i2.get(i7));
        }
        for (int i8 = 0; i8 < this.j2.size(); i8++) {
            codedOutputStream.r(10, this.j2.get(i8));
        }
        for (int i9 = 0; i9 < this.k2.size(); i9++) {
            codedOutputStream.r(11, this.k2.get(i9));
        }
        for (int i10 = 0; i10 < this.l2.size(); i10++) {
            codedOutputStream.r(13, this.l2.get(i10));
        }
        if (this.m2.size() > 0) {
            codedOutputStream.y(130);
            codedOutputStream.y(this.n2);
        }
        for (int i11 = 0; i11 < this.m2.size(); i11++) {
            codedOutputStream.q(this.m2.get(i11).intValue());
        }
        if ((this.y & 8) == 8) {
            codedOutputStream.r(30, this.o2);
        }
        for (int i12 = 0; i12 < this.p2.size(); i12++) {
            codedOutputStream.p(31, this.p2.get(i12).intValue());
        }
        if ((this.y & 16) == 16) {
            codedOutputStream.r(32, this.q2);
        }
        q3.a(19000, codedOutputStream);
        codedOutputStream.u(this.x);
    }

    public int e() {
        int i = this.s2;
        if (i != -1) {
            return i;
        }
        int c = (this.y & 1) == 1 ? CodedOutputStream.c(1, this.Y1) + 0 : 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.d2.size(); i4++) {
            i3 += CodedOutputStream.d(this.d2.get(i4).intValue());
        }
        int i5 = c + i3;
        if (!this.d2.isEmpty()) {
            i5 = i5 + 1 + CodedOutputStream.d(i3);
        }
        this.e2 = i3;
        if ((this.y & 2) == 2) {
            i5 += CodedOutputStream.c(3, this.Z1);
        }
        if ((this.y & 4) == 4) {
            i5 += CodedOutputStream.c(4, this.a2);
        }
        for (int i6 = 0; i6 < this.b2.size(); i6++) {
            i5 += CodedOutputStream.e(5, this.b2.get(i6));
        }
        for (int i7 = 0; i7 < this.c2.size(); i7++) {
            i5 += CodedOutputStream.e(6, this.c2.get(i7));
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f2.size(); i9++) {
            i8 += CodedOutputStream.d(this.f2.get(i9).intValue());
        }
        int i10 = i5 + i8;
        if (!this.f2.isEmpty()) {
            i10 = i10 + 1 + CodedOutputStream.d(i8);
        }
        this.g2 = i8;
        for (int i11 = 0; i11 < this.h2.size(); i11++) {
            i10 += CodedOutputStream.e(8, this.h2.get(i11));
        }
        for (int i12 = 0; i12 < this.i2.size(); i12++) {
            i10 += CodedOutputStream.e(9, this.i2.get(i12));
        }
        for (int i13 = 0; i13 < this.j2.size(); i13++) {
            i10 += CodedOutputStream.e(10, this.j2.get(i13));
        }
        for (int i14 = 0; i14 < this.k2.size(); i14++) {
            i10 += CodedOutputStream.e(11, this.k2.get(i14));
        }
        for (int i15 = 0; i15 < this.l2.size(); i15++) {
            i10 += CodedOutputStream.e(13, this.l2.get(i15));
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.m2.size(); i17++) {
            i16 += CodedOutputStream.d(this.m2.get(i17).intValue());
        }
        int i18 = i10 + i16;
        if (!this.m2.isEmpty()) {
            i18 = i18 + 2 + CodedOutputStream.d(i16);
        }
        this.n2 = i16;
        if ((this.y & 8) == 8) {
            i18 += CodedOutputStream.e(30, this.o2);
        }
        int i19 = 0;
        for (int i20 = 0; i20 < this.p2.size(); i20++) {
            i19 += CodedOutputStream.d(this.p2.get(i20).intValue());
        }
        int size = (this.p2.size() * 2) + i18 + i19;
        if ((this.y & 16) == 16) {
            size += CodedOutputStream.e(32, this.q2);
        }
        int size2 = this.x.size() + l() + size;
        this.s2 = size2;
        return size2;
    }

    public l.a f() {
        return new b();
    }

    public final boolean g() {
        byte b3 = this.r2;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        if (!((this.y & 2) == 2)) {
            this.r2 = 0;
            return false;
        }
        for (int i = 0; i < this.b2.size(); i++) {
            if (!this.b2.get(i).g()) {
                this.r2 = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.c2.size(); i3++) {
            if (!this.c2.get(i3).g()) {
                this.r2 = 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.h2.size(); i4++) {
            if (!this.h2.get(i4).g()) {
                this.r2 = 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.i2.size(); i5++) {
            if (!this.i2.get(i5).g()) {
                this.r2 = 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.j2.size(); i6++) {
            if (!this.j2.get(i6).g()) {
                this.r2 = 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.k2.size(); i7++) {
            if (!this.k2.get(i7).g()) {
                this.r2 = 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.l2.size(); i8++) {
            if (!this.l2.get(i8).g()) {
                this.r2 = 0;
                return false;
            }
        }
        if (((this.y & 8) == 8) && !this.o2.g()) {
            this.r2 = 0;
            return false;
        } else if (!i()) {
            this.r2 = 0;
            return false;
        } else {
            this.r2 = 1;
            return true;
        }
    }

    public final void x() {
        this.Y1 = 6;
        this.Z1 = 0;
        this.a2 = 0;
        this.b2 = Collections.emptyList();
        this.c2 = Collections.emptyList();
        this.d2 = Collections.emptyList();
        this.f2 = Collections.emptyList();
        this.h2 = Collections.emptyList();
        this.i2 = Collections.emptyList();
        this.j2 = Collections.emptyList();
        this.k2 = Collections.emptyList();
        this.l2 = Collections.emptyList();
        this.m2 = Collections.emptyList();
        this.o2 = ProtoBuf$TypeTable.c;
        this.p2 = Collections.emptyList();
        this.q2 = ProtoBuf$VersionRequirementTable.c;
    }

    public ProtoBuf$Class() {
        this.e2 = -1;
        this.g2 = -1;
        this.n2 = -1;
        this.r2 = -1;
        this.s2 = -1;
        this.x = c.c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b} */
    /* JADX WARNING: type inference failed for: r16v5, types: [kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$b] */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02b0, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02c0, code lost:
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02c5, code lost:
        r4 = r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProtoBuf$Class(m0.r.t.a.r.h.d r18, m0.r.t.a.r.h.e r19) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r17.<init>()
            r3 = -1
            r1.e2 = r3
            r1.g2 = r3
            r1.n2 = r3
            r1.r2 = r3
            r1.s2 = r3
            r17.x()
            m0.r.t.a.r.h.c$b r3 = m0.r.t.a.r.h.c.u()
            r4 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r5 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.k(r3, r4)
            r6 = 0
            r7 = r6
        L_0x0022:
            r8 = 2048(0x800, float:2.87E-42)
            r9 = 1024(0x400, float:1.435E-42)
            r10 = 512(0x200, float:7.175E-43)
            r13 = 16384(0x4000, float:2.2959E-41)
            r14 = 4096(0x1000, float:5.74E-42)
            r4 = 16
            r15 = 8
            if (r6 != 0) goto L_0x0382
            int r12 = r18.o()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r16 = 0
            switch(r12) {
                case 0: goto L_0x02bf;
                case 8: goto L_0x02b2;
                case 16: goto L_0x0294;
                case 18: goto L_0x025f;
                case 24: goto L_0x0252;
                case 32: goto L_0x0245;
                case 42: goto L_0x022c;
                case 50: goto L_0x0210;
                case 56: goto L_0x01f2;
                case 58: goto L_0x01bc;
                case 66: goto L_0x01a0;
                case 74: goto L_0x0184;
                case 82: goto L_0x016a;
                case 90: goto L_0x0150;
                case 106: goto L_0x0136;
                case 128: goto L_0x011a;
                case 130: goto L_0x00e6;
                case 242: goto L_0x00bd;
                case 248: goto L_0x00a1;
                case 250: goto L_0x006b;
                case 258: goto L_0x0042;
                default: goto L_0x003b;
            }     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
        L_0x003b:
            r11 = 1
            boolean r4 = r1.v(r0, r5, r2, r12)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02c2
        L_0x0042:
            int r12 = r1.y     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r12 = r12 & r4
            if (r12 != r4) goto L_0x004d
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r12 = r1.q2     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$b r16 = r12.l()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
        L_0x004d:
            r12 = r16
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable.d     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            m0.r.t.a.r.h.l r11 = r0.h(r11, r2)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r11 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable) r11     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.q2 = r11     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r12 == 0) goto L_0x0064
            r12.m(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r11 = r12.l()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.q2 = r11     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
        L_0x0064:
            int r11 = r1.y     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11 = r11 | r4
            r1.y = r11     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x006b:
            int r11 = r18.l()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r11 = r0.d(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r12 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r12 == r13) goto L_0x0086
            int r12 = r18.b()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r12 <= 0) goto L_0x0086
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.p2 = r12     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 16384(0x4000, float:2.2959E-41)
        L_0x0086:
            int r12 = r18.b()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r12 <= 0) goto L_0x009c
            java.util.List<java.lang.Integer> r12 = r1.p2     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r16 = r18.g()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r12.add(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4 = 16
            goto L_0x0086
        L_0x009c:
            r0.c(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x00a1:
            r4 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r4 == r13) goto L_0x00ae
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.p2 = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 16384(0x4000, float:2.2959E-41)
        L_0x00ae:
            java.util.List<java.lang.Integer> r4 = r1.p2     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r11 = r18.g()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x00bd:
            int r4 = r1.y     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4 = r4 & r15
            if (r4 != r15) goto L_0x00c8
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r4 = r1.o2     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b r16 = r4.l()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
        L_0x00c8:
            r4 = r16
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable.d     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            m0.r.t.a.r.h.l r11 = r0.h(r11, r2)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r11 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable) r11     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.o2 = r11     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r4 == 0) goto L_0x00df
            r4.m(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r4 = r4.l()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.o2 = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
        L_0x00df:
            int r4 = r1.y     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4 = r4 | r15
            r1.y = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x00e6:
            int r4 = r18.l()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r4 = r0.d(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11 = r7 & 4096(0x1000, float:5.74E-42)
            if (r11 == r14) goto L_0x0101
            int r11 = r18.b()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r11 <= 0) goto L_0x0101
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.m2 = r11     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 4096(0x1000, float:5.74E-42)
        L_0x0101:
            int r11 = r18.b()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r11 <= 0) goto L_0x0115
            java.util.List<java.lang.Integer> r11 = r1.m2     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r12 = r18.g()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x0101
        L_0x0115:
            r0.c(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x011a:
            r4 = r7 & 4096(0x1000, float:5.74E-42)
            if (r4 == r14) goto L_0x0127
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.m2 = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 4096(0x1000, float:5.74E-42)
        L_0x0127:
            java.util.List<java.lang.Integer> r4 = r1.m2     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r11 = r18.g()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x0136:
            r4 = r7 & 2048(0x800, float:2.87E-42)
            if (r4 == r8) goto L_0x0143
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.l2 = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 2048(0x800, float:2.87E-42)
        L_0x0143:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r4 = r1.l2     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry.q     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            m0.r.t.a.r.h.l r11 = r0.h(r11, r2)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x0150:
            r4 = r7 & 1024(0x400, float:1.435E-42)
            if (r4 == r9) goto L_0x015d
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.k2 = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 1024(0x400, float:1.435E-42)
        L_0x015d:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r4 = r1.k2     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias.q     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            m0.r.t.a.r.h.l r11 = r0.h(r11, r2)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x016a:
            r4 = r7 & 512(0x200, float:7.175E-43)
            if (r4 == r10) goto L_0x0177
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.j2 = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 512(0x200, float:7.175E-43)
        L_0x0177:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r4 = r1.j2     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property.q     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            m0.r.t.a.r.h.l r11 = r0.h(r11, r2)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x0184:
            r4 = r7 & 256(0x100, float:3.59E-43)
            r11 = 256(0x100, float:3.59E-43)
            if (r4 == r11) goto L_0x0193
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.i2 = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 256(0x100, float:3.59E-43)
        L_0x0193:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r4 = r1.i2     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function.q     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            m0.r.t.a.r.h.l r11 = r0.h(r11, r2)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x01a0:
            r4 = r7 & 128(0x80, float:1.794E-43)
            r11 = 128(0x80, float:1.794E-43)
            if (r4 == r11) goto L_0x01af
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.h2 = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 128(0x80, float:1.794E-43)
        L_0x01af:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r4 = r1.h2     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor.q     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            m0.r.t.a.r.h.l r11 = r0.h(r11, r2)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x01bc:
            int r4 = r18.l()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r4 = r0.d(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11 = r7 & 64
            r12 = 64
            if (r11 == r12) goto L_0x01d9
            int r11 = r18.b()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r11 <= 0) goto L_0x01d9
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f2 = r11     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 64
        L_0x01d9:
            int r11 = r18.b()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r11 <= 0) goto L_0x01ed
            java.util.List<java.lang.Integer> r11 = r1.f2     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r12 = r18.g()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x01d9
        L_0x01ed:
            r0.c(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x01f2:
            r4 = r7 & 64
            r11 = 64
            if (r4 == r11) goto L_0x0201
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f2 = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 64
        L_0x0201:
            java.util.List<java.lang.Integer> r4 = r1.f2     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r11 = r18.g()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x0210:
            r4 = r7 & 16
            r11 = 16
            if (r4 == r11) goto L_0x021f
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.c2 = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 16
        L_0x021f:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r4 = r1.c2     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.q     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            m0.r.t.a.r.h.l r11 = r0.h(r11, r2)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x022c:
            r4 = r7 & 8
            if (r4 == r15) goto L_0x0239
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.b2 = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 8
        L_0x0239:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r4 = r1.b2     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter.q     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            m0.r.t.a.r.h.l r11 = r0.h(r11, r2)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x0245:
            int r4 = r1.y     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4 = r4 | 4
            r1.y = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r4 = r18.g()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.a2 = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x0252:
            int r4 = r1.y     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4 = r4 | 2
            r1.y = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r4 = r18.g()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.Z1 = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x025f:
            int r4 = r18.l()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r4 = r0.d(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11 = r7 & 32
            r12 = 32
            if (r11 == r12) goto L_0x027c
            int r11 = r18.b()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r11 <= 0) goto L_0x027c
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.d2 = r11     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 32
        L_0x027c:
            int r11 = r18.b()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r11 <= 0) goto L_0x0290
            java.util.List<java.lang.Integer> r11 = r1.d2     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r12 = r18.g()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x027c
        L_0x0290:
            r0.c(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x0294:
            r4 = r7 & 32
            r11 = 32
            if (r4 == r11) goto L_0x02a3
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.d2 = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 32
        L_0x02a3:
            java.util.List<java.lang.Integer> r4 = r1.d2     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r11 = r18.g()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
        L_0x02b0:
            r11 = 1
            goto L_0x02c5
        L_0x02b2:
            int r4 = r1.y     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11 = 1
            r4 = r4 | r11
            r1.y = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r4 = r18.g()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.Y1 = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02c5
        L_0x02bf:
            r11 = 1
        L_0x02c0:
            r6 = r11
            goto L_0x02c5
        L_0x02c2:
            if (r4 != 0) goto L_0x02c5
            goto L_0x02c0
        L_0x02c5:
            r4 = r11
            goto L_0x0022
        L_0x02c8:
            r0 = move-exception
            goto L_0x02dd
        L_0x02ca:
            r0 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r2 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x02c8 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02c8 }
            r2.<init>(r0)     // Catch:{ all -> 0x02c8 }
            r2.c(r1)     // Catch:{ all -> 0x02c8 }
            throw r2     // Catch:{ all -> 0x02c8 }
        L_0x02d8:
            r0 = move-exception
            r0.c(r1)     // Catch:{ all -> 0x02c8 }
            throw r0     // Catch:{ all -> 0x02c8 }
        L_0x02dd:
            r2 = r7 & 32
            r4 = 32
            if (r2 != r4) goto L_0x02eb
            java.util.List<java.lang.Integer> r2 = r1.d2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.d2 = r2
        L_0x02eb:
            r2 = r7 & 8
            if (r2 != r15) goto L_0x02f7
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r2 = r1.b2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.b2 = r2
        L_0x02f7:
            r2 = r7 & 16
            r4 = 16
            if (r2 != r4) goto L_0x0305
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r2 = r1.c2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.c2 = r2
        L_0x0305:
            r2 = r7 & 64
            r4 = 64
            if (r2 != r4) goto L_0x0313
            java.util.List<java.lang.Integer> r2 = r1.f2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f2 = r2
        L_0x0313:
            r2 = r7 & 128(0x80, float:1.794E-43)
            r4 = 128(0x80, float:1.794E-43)
            if (r2 != r4) goto L_0x0321
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r2 = r1.h2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.h2 = r2
        L_0x0321:
            r2 = r7 & 256(0x100, float:3.59E-43)
            r4 = 256(0x100, float:3.59E-43)
            if (r2 != r4) goto L_0x032f
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r2 = r1.i2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.i2 = r2
        L_0x032f:
            r2 = r7 & 512(0x200, float:7.175E-43)
            if (r2 != r10) goto L_0x033b
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r2 = r1.j2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.j2 = r2
        L_0x033b:
            r2 = r7 & 1024(0x400, float:1.435E-42)
            if (r2 != r9) goto L_0x0347
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r2 = r1.k2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.k2 = r2
        L_0x0347:
            r2 = r7 & 2048(0x800, float:2.87E-42)
            if (r2 != r8) goto L_0x0353
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r2 = r1.l2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.l2 = r2
        L_0x0353:
            r2 = r7 & 4096(0x1000, float:5.74E-42)
            if (r2 != r14) goto L_0x035f
            java.util.List<java.lang.Integer> r2 = r1.m2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.m2 = r2
        L_0x035f:
            r2 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r2 != r13) goto L_0x036b
            java.util.List<java.lang.Integer> r2 = r1.p2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.p2 = r2
        L_0x036b:
            r5.j()     // Catch:{ IOException -> 0x036e, all -> 0x0375 }
        L_0x036e:
            m0.r.t.a.r.h.c r2 = r3.e()
            r1.x = r2
            goto L_0x037e
        L_0x0375:
            r0 = move-exception
            r2 = r0
            m0.r.t.a.r.h.c r0 = r3.e()
            r1.x = r0
            throw r2
        L_0x037e:
            r17.p()
            throw r0
        L_0x0382:
            r0 = r7 & 32
            r2 = 32
            if (r0 != r2) goto L_0x0390
            java.util.List<java.lang.Integer> r0 = r1.d2
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.d2 = r0
        L_0x0390:
            r0 = r7 & 8
            if (r0 != r15) goto L_0x039c
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r0 = r1.b2
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.b2 = r0
        L_0x039c:
            r0 = r7 & 16
            r2 = 16
            if (r0 != r2) goto L_0x03aa
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r0 = r1.c2
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.c2 = r0
        L_0x03aa:
            r0 = r7 & 64
            r2 = 64
            if (r0 != r2) goto L_0x03b8
            java.util.List<java.lang.Integer> r0 = r1.f2
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f2 = r0
        L_0x03b8:
            r0 = r7 & 128(0x80, float:1.794E-43)
            r2 = 128(0x80, float:1.794E-43)
            if (r0 != r2) goto L_0x03c6
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r0 = r1.h2
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.h2 = r0
        L_0x03c6:
            r0 = r7 & 256(0x100, float:3.59E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 != r2) goto L_0x03d4
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r0 = r1.i2
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.i2 = r0
        L_0x03d4:
            r0 = r7 & 512(0x200, float:7.175E-43)
            if (r0 != r10) goto L_0x03e0
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r0 = r1.j2
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.j2 = r0
        L_0x03e0:
            r0 = r7 & 1024(0x400, float:1.435E-42)
            if (r0 != r9) goto L_0x03ec
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r0 = r1.k2
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.k2 = r0
        L_0x03ec:
            r0 = r7 & 2048(0x800, float:2.87E-42)
            if (r0 != r8) goto L_0x03f8
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r0 = r1.l2
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.l2 = r0
        L_0x03f8:
            r0 = r7 & 4096(0x1000, float:5.74E-42)
            if (r0 != r14) goto L_0x0404
            java.util.List<java.lang.Integer> r0 = r1.m2
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.m2 = r0
        L_0x0404:
            r0 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r0 != r13) goto L_0x0410
            java.util.List<java.lang.Integer> r0 = r1.p2
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.p2 = r0
        L_0x0410:
            r5.j()     // Catch:{ IOException -> 0x0413, all -> 0x041a }
        L_0x0413:
            m0.r.t.a.r.h.c r0 = r3.e()
            r1.x = r0
            goto L_0x0423
        L_0x041a:
            r0 = move-exception
            r2 = r0
            m0.r.t.a.r.h.c r0 = r3.e()
            r1.x = r0
            throw r2
        L_0x0423:
            r17.p()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class.<init>(m0.r.t.a.r.h.d, m0.r.t.a.r.h.e):void");
    }
}
