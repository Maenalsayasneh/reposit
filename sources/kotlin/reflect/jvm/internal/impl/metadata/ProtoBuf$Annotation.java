package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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

public final class ProtoBuf$Annotation extends GeneratedMessageLite implements m {
    public static final ProtoBuf$Annotation c;
    public static n<ProtoBuf$Annotation> d = new a();
    public List<Argument> Y1;
    public byte Z1;
    public int a2;
    public final c q;
    public int x;
    public int y;

    public static class a extends m0.r.t.a.r.h.b<ProtoBuf$Annotation> {
        public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Annotation(dVar, eVar, (m0.r.t.a.r.f.a) null);
        }
    }

    public static final class b extends GeneratedMessageLite.b<ProtoBuf$Annotation, b> implements m {
        public int d;
        public int q;
        public List<Argument> x = Collections.emptyList();

        public l build() {
            ProtoBuf$Annotation l = l();
            if (l.g()) {
                return l;
            }
            throw new UninitializedMessageException();
        }

        public Object clone() throws CloneNotSupportedException {
            b bVar = new b();
            bVar.m(l());
            return bVar;
        }

        public /* bridge */ /* synthetic */ a.C0267a h(d dVar, e eVar) throws IOException {
            n(dVar, eVar);
            return this;
        }

        public GeneratedMessageLite.b i() {
            b bVar = new b();
            bVar.m(l());
            return bVar;
        }

        public /* bridge */ /* synthetic */ GeneratedMessageLite.b j(GeneratedMessageLite generatedMessageLite) {
            m((ProtoBuf$Annotation) generatedMessageLite);
            return this;
        }

        public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
            n(dVar, eVar);
            return this;
        }

        public ProtoBuf$Annotation l() {
            ProtoBuf$Annotation protoBuf$Annotation = new ProtoBuf$Annotation(this, (m0.r.t.a.r.f.a) null);
            int i = this.d;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            protoBuf$Annotation.y = this.q;
            if ((i & 2) == 2) {
                this.x = Collections.unmodifiableList(this.x);
                this.d &= -3;
            }
            protoBuf$Annotation.Y1 = this.x;
            protoBuf$Annotation.x = i2;
            return protoBuf$Annotation;
        }

        public b m(ProtoBuf$Annotation protoBuf$Annotation) {
            if (protoBuf$Annotation == ProtoBuf$Annotation.c) {
                return this;
            }
            if ((protoBuf$Annotation.x & 1) == 1) {
                int i = protoBuf$Annotation.y;
                this.d = 1 | this.d;
                this.q = i;
            }
            if (!protoBuf$Annotation.Y1.isEmpty()) {
                if (this.x.isEmpty()) {
                    this.x = protoBuf$Annotation.Y1;
                    this.d &= -3;
                } else {
                    if ((this.d & 2) != 2) {
                        this.x = new ArrayList(this.x);
                        this.d |= 2;
                    }
                    this.x.addAll(protoBuf$Annotation.Y1);
                }
            }
            this.c = this.c.c(protoBuf$Annotation.q);
            return this;
        }

        public b n(d dVar, e eVar) throws IOException {
            ProtoBuf$Annotation protoBuf$Annotation;
            ProtoBuf$Annotation protoBuf$Annotation2 = null;
            try {
                ProtoBuf$Annotation a = ProtoBuf$Annotation.d.a(dVar, eVar);
                if (a != null) {
                    m(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Annotation = (ProtoBuf$Annotation) e.c;
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$Annotation2 = protoBuf$Annotation;
            }
            if (protoBuf$Annotation2 != null) {
                m(protoBuf$Annotation2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$Annotation protoBuf$Annotation = new ProtoBuf$Annotation();
        c = protoBuf$Annotation;
        protoBuf$Annotation.y = 0;
        protoBuf$Annotation.Y1 = Collections.emptyList();
    }

    public ProtoBuf$Annotation(GeneratedMessageLite.b bVar, m0.r.t.a.r.f.a aVar) {
        super(bVar);
        this.Z1 = -1;
        this.a2 = -1;
        this.q = bVar.c;
    }

    public l.a c() {
        b bVar = new b();
        bVar.m(this);
        return bVar;
    }

    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        if ((this.x & 1) == 1) {
            codedOutputStream.p(1, this.y);
        }
        for (int i = 0; i < this.Y1.size(); i++) {
            codedOutputStream.r(2, this.Y1.get(i));
        }
        codedOutputStream.u(this.q);
    }

    public int e() {
        int i = this.a2;
        if (i != -1) {
            return i;
        }
        int c2 = (this.x & 1) == 1 ? CodedOutputStream.c(1, this.y) + 0 : 0;
        for (int i2 = 0; i2 < this.Y1.size(); i2++) {
            c2 += CodedOutputStream.e(2, this.Y1.get(i2));
        }
        int size = this.q.size() + c2;
        this.a2 = size;
        return size;
    }

    public l.a f() {
        return new b();
    }

    public final boolean g() {
        byte b2 = this.Z1;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!((this.x & 1) == 1)) {
            this.Z1 = 0;
            return false;
        }
        for (int i = 0; i < this.Y1.size(); i++) {
            if (!this.Y1.get(i).g()) {
                this.Z1 = 0;
                return false;
            }
        }
        this.Z1 = 1;
        return true;
    }

    public static final class Argument extends GeneratedMessageLite implements m {
        public static final Argument c;
        public static n<Argument> d = new a();
        public Value Y1;
        public byte Z1;
        public int a2;
        public final c q;
        public int x;
        public int y;

        public static class a extends m0.r.t.a.r.h.b<Argument> {
            public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
                return new Argument(dVar, eVar, (m0.r.t.a.r.f.a) null);
            }
        }

        public static final class b extends GeneratedMessageLite.b<Argument, b> implements m {
            public int d;
            public int q;
            public Value x = Value.c;

            public l build() {
                Argument l = l();
                if (l.g()) {
                    return l;
                }
                throw new UninitializedMessageException();
            }

            public Object clone() throws CloneNotSupportedException {
                b bVar = new b();
                bVar.m(l());
                return bVar;
            }

            public /* bridge */ /* synthetic */ a.C0267a h(d dVar, e eVar) throws IOException {
                n(dVar, eVar);
                return this;
            }

            public GeneratedMessageLite.b i() {
                b bVar = new b();
                bVar.m(l());
                return bVar;
            }

            public /* bridge */ /* synthetic */ GeneratedMessageLite.b j(GeneratedMessageLite generatedMessageLite) {
                m((Argument) generatedMessageLite);
                return this;
            }

            public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
                n(dVar, eVar);
                return this;
            }

            public Argument l() {
                Argument argument = new Argument(this, (m0.r.t.a.r.f.a) null);
                int i = this.d;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                argument.y = this.q;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                argument.Y1 = this.x;
                argument.x = i2;
                return argument;
            }

            public b m(Argument argument) {
                Value value;
                if (argument == Argument.c) {
                    return this;
                }
                int i = argument.x;
                boolean z = false;
                if ((i & 1) == 1) {
                    int i2 = argument.y;
                    this.d |= 1;
                    this.q = i2;
                }
                if ((i & 2) == 2) {
                    z = true;
                }
                if (z) {
                    Value value2 = argument.Y1;
                    if ((this.d & 2) != 2 || (value = this.x) == Value.c) {
                        this.x = value2;
                    } else {
                        Value.b bVar = new Value.b();
                        bVar.m(value);
                        bVar.m(value2);
                        this.x = bVar.l();
                    }
                    this.d |= 2;
                }
                this.c = this.c.c(argument.q);
                return this;
            }

            public b n(d dVar, e eVar) throws IOException {
                Argument argument;
                Argument argument2 = null;
                try {
                    Argument a = Argument.d.a(dVar, eVar);
                    if (a != null) {
                        m(a);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    argument = (Argument) e.c;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    argument2 = argument;
                }
                if (argument2 != null) {
                    m(argument2);
                }
                throw th;
            }
        }

        static {
            Argument argument = new Argument();
            c = argument;
            argument.y = 0;
            argument.Y1 = Value.c;
        }

        public Argument(GeneratedMessageLite.b bVar, m0.r.t.a.r.f.a aVar) {
            super(bVar);
            this.Z1 = -1;
            this.a2 = -1;
            this.q = bVar.c;
        }

        public l.a c() {
            b bVar = new b();
            bVar.m(this);
            return bVar;
        }

        public void d(CodedOutputStream codedOutputStream) throws IOException {
            e();
            if ((this.x & 1) == 1) {
                codedOutputStream.p(1, this.y);
            }
            if ((this.x & 2) == 2) {
                codedOutputStream.r(2, this.Y1);
            }
            codedOutputStream.u(this.q);
        }

        public int e() {
            int i = this.a2;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.x & 1) == 1) {
                i2 = 0 + CodedOutputStream.c(1, this.y);
            }
            if ((this.x & 2) == 2) {
                i2 += CodedOutputStream.e(2, this.Y1);
            }
            int size = this.q.size() + i2;
            this.a2 = size;
            return size;
        }

        public l.a f() {
            return new b();
        }

        public final boolean g() {
            byte b2 = this.Z1;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            int i = this.x;
            if (!((i & 1) == 1)) {
                this.Z1 = 0;
                return false;
            }
            if (!((i & 2) == 2)) {
                this.Z1 = 0;
                return false;
            } else if (!this.Y1.g()) {
                this.Z1 = 0;
                return false;
            } else {
                this.Z1 = 1;
                return true;
            }
        }

        public static final class Value extends GeneratedMessageLite implements m {
            public static final Value c;
            public static n<Value> d = new a();
            public long Y1;
            public float Z1;
            public double a2;
            public int b2;
            public int c2;
            public int d2;
            public ProtoBuf$Annotation e2;
            public List<Value> f2;
            public int g2;
            public int h2;
            public byte i2;
            public int j2;
            public final c q;
            public int x;
            public Type y;

            public enum Type implements Internal.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);
                
                private static Internal.b<Type> internalValueMap;
                private final int value;

                public static class a implements Internal.b<Type> {
                    public Internal.a a(int i) {
                        return Type.valueOf(i);
                    }
                }

                /* access modifiers changed from: public */
                static {
                    internalValueMap = new a();
                }

                private Type(int i, int i2) {
                    this.value = i2;
                }

                public final int getNumber() {
                    return this.value;
                }

                public static Type valueOf(int i) {
                    switch (i) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }
            }

            public static class a extends m0.r.t.a.r.h.b<Value> {
                public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
                    return new Value(dVar, eVar, (m0.r.t.a.r.f.a) null);
                }
            }

            public static final class b extends GeneratedMessageLite.b<Value, b> implements m {
                public double Y1;
                public int Z1;
                public int a2;
                public int b2;
                public ProtoBuf$Annotation c2 = ProtoBuf$Annotation.c;
                public int d;
                public List<Value> d2 = Collections.emptyList();
                public int e2;
                public int f2;
                public Type q = Type.BYTE;
                public long x;
                public float y;

                public l build() {
                    Value l = l();
                    if (l.g()) {
                        return l;
                    }
                    throw new UninitializedMessageException();
                }

                public Object clone() throws CloneNotSupportedException {
                    b bVar = new b();
                    bVar.m(l());
                    return bVar;
                }

                public /* bridge */ /* synthetic */ a.C0267a h(d dVar, e eVar) throws IOException {
                    n(dVar, eVar);
                    return this;
                }

                public GeneratedMessageLite.b i() {
                    b bVar = new b();
                    bVar.m(l());
                    return bVar;
                }

                public /* bridge */ /* synthetic */ GeneratedMessageLite.b j(GeneratedMessageLite generatedMessageLite) {
                    m((Value) generatedMessageLite);
                    return this;
                }

                public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
                    n(dVar, eVar);
                    return this;
                }

                public Value l() {
                    Value value = new Value(this, (m0.r.t.a.r.f.a) null);
                    int i = this.d;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    value.y = this.q;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    value.Y1 = this.x;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    value.Z1 = this.y;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    value.a2 = this.Y1;
                    if ((i & 16) == 16) {
                        i2 |= 16;
                    }
                    value.b2 = this.Z1;
                    if ((i & 32) == 32) {
                        i2 |= 32;
                    }
                    value.c2 = this.a2;
                    if ((i & 64) == 64) {
                        i2 |= 64;
                    }
                    value.d2 = this.b2;
                    if ((i & 128) == 128) {
                        i2 |= 128;
                    }
                    value.e2 = this.c2;
                    if ((i & 256) == 256) {
                        this.d2 = Collections.unmodifiableList(this.d2);
                        this.d &= -257;
                    }
                    value.f2 = this.d2;
                    if ((i & 512) == 512) {
                        i2 |= 256;
                    }
                    value.g2 = this.e2;
                    if ((i & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                        i2 |= 512;
                    }
                    value.h2 = this.f2;
                    value.x = i2;
                    return value;
                }

                public b m(Value value) {
                    ProtoBuf$Annotation protoBuf$Annotation;
                    if (value == Value.c) {
                        return this;
                    }
                    boolean z = true;
                    if ((value.x & 1) == 1) {
                        Type type = value.y;
                        Objects.requireNonNull(type);
                        this.d |= 1;
                        this.q = type;
                    }
                    int i = value.x;
                    if ((i & 2) == 2) {
                        long j = value.Y1;
                        this.d |= 2;
                        this.x = j;
                    }
                    if ((i & 4) == 4) {
                        float f = value.Z1;
                        this.d = 4 | this.d;
                        this.y = f;
                    }
                    if ((i & 8) == 8) {
                        double d3 = value.a2;
                        this.d |= 8;
                        this.Y1 = d3;
                    }
                    if ((i & 16) == 16) {
                        int i2 = value.b2;
                        this.d = 16 | this.d;
                        this.Z1 = i2;
                    }
                    if ((i & 32) == 32) {
                        int i3 = value.c2;
                        this.d = 32 | this.d;
                        this.a2 = i3;
                    }
                    if ((i & 64) == 64) {
                        int i4 = value.d2;
                        this.d = 64 | this.d;
                        this.b2 = i4;
                    }
                    if ((i & 128) == 128) {
                        ProtoBuf$Annotation protoBuf$Annotation2 = value.e2;
                        if ((this.d & 128) != 128 || (protoBuf$Annotation = this.c2) == ProtoBuf$Annotation.c) {
                            this.c2 = protoBuf$Annotation2;
                        } else {
                            b bVar = new b();
                            bVar.m(protoBuf$Annotation);
                            bVar.m(protoBuf$Annotation2);
                            this.c2 = bVar.l();
                        }
                        this.d |= 128;
                    }
                    if (!value.f2.isEmpty()) {
                        if (this.d2.isEmpty()) {
                            this.d2 = value.f2;
                            this.d &= -257;
                        } else {
                            if ((this.d & 256) != 256) {
                                this.d2 = new ArrayList(this.d2);
                                this.d |= 256;
                            }
                            this.d2.addAll(value.f2);
                        }
                    }
                    int i5 = value.x;
                    if ((i5 & 256) == 256) {
                        int i6 = value.g2;
                        this.d |= 512;
                        this.e2 = i6;
                    }
                    if ((i5 & 512) != 512) {
                        z = false;
                    }
                    if (z) {
                        int i7 = value.h2;
                        this.d |= RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE;
                        this.f2 = i7;
                    }
                    this.c = this.c.c(value.q);
                    return this;
                }

                public b n(d dVar, e eVar) throws IOException {
                    Value value;
                    Value value2 = null;
                    try {
                        Value a = Value.d.a(dVar, eVar);
                        if (a != null) {
                            m(a);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        value = (Value) e.c;
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        value2 = value;
                    }
                    if (value2 != null) {
                        m(value2);
                    }
                    throw th;
                }
            }

            static {
                Value value = new Value();
                c = value;
                value.i();
            }

            public Value(GeneratedMessageLite.b bVar, m0.r.t.a.r.f.a aVar) {
                super(bVar);
                this.i2 = -1;
                this.j2 = -1;
                this.q = bVar.c;
            }

            public l.a c() {
                b bVar = new b();
                bVar.m(this);
                return bVar;
            }

            public void d(CodedOutputStream codedOutputStream) throws IOException {
                e();
                if ((this.x & 1) == 1) {
                    codedOutputStream.n(1, this.y.getNumber());
                }
                if ((this.x & 2) == 2) {
                    long j = this.Y1;
                    codedOutputStream.y(16);
                    codedOutputStream.z((j << 1) ^ (j >> 63));
                }
                if ((this.x & 4) == 4) {
                    float f = this.Z1;
                    codedOutputStream.y(29);
                    codedOutputStream.w(Float.floatToRawIntBits(f));
                }
                if ((this.x & 8) == 8) {
                    double d3 = this.a2;
                    codedOutputStream.y(33);
                    codedOutputStream.x(Double.doubleToRawLongBits(d3));
                }
                if ((this.x & 16) == 16) {
                    codedOutputStream.p(5, this.b2);
                }
                if ((this.x & 32) == 32) {
                    codedOutputStream.p(6, this.c2);
                }
                if ((this.x & 64) == 64) {
                    codedOutputStream.p(7, this.d2);
                }
                if ((this.x & 128) == 128) {
                    codedOutputStream.r(8, this.e2);
                }
                for (int i = 0; i < this.f2.size(); i++) {
                    codedOutputStream.r(9, this.f2.get(i));
                }
                if ((this.x & 512) == 512) {
                    codedOutputStream.p(10, this.h2);
                }
                if ((this.x & 256) == 256) {
                    codedOutputStream.p(11, this.g2);
                }
                codedOutputStream.u(this.q);
            }

            public int e() {
                int i = this.j2;
                if (i != -1) {
                    return i;
                }
                int b3 = (this.x & 1) == 1 ? CodedOutputStream.b(1, this.y.getNumber()) + 0 : 0;
                if ((this.x & 2) == 2) {
                    long j = this.Y1;
                    b3 += CodedOutputStream.h((j >> 63) ^ (j << 1)) + CodedOutputStream.i(2);
                }
                if ((this.x & 4) == 4) {
                    b3 += CodedOutputStream.i(3) + 4;
                }
                if ((this.x & 8) == 8) {
                    b3 += CodedOutputStream.i(4) + 8;
                }
                if ((this.x & 16) == 16) {
                    b3 += CodedOutputStream.c(5, this.b2);
                }
                if ((this.x & 32) == 32) {
                    b3 += CodedOutputStream.c(6, this.c2);
                }
                if ((this.x & 64) == 64) {
                    b3 += CodedOutputStream.c(7, this.d2);
                }
                if ((this.x & 128) == 128) {
                    b3 += CodedOutputStream.e(8, this.e2);
                }
                for (int i3 = 0; i3 < this.f2.size(); i3++) {
                    b3 += CodedOutputStream.e(9, this.f2.get(i3));
                }
                if ((this.x & 512) == 512) {
                    b3 += CodedOutputStream.c(10, this.h2);
                }
                if ((this.x & 256) == 256) {
                    b3 += CodedOutputStream.c(11, this.g2);
                }
                int size = this.q.size() + b3;
                this.j2 = size;
                return size;
            }

            public l.a f() {
                return new b();
            }

            public final boolean g() {
                byte b3 = this.i2;
                if (b3 == 1) {
                    return true;
                }
                if (b3 == 0) {
                    return false;
                }
                if (!((this.x & 128) == 128) || this.e2.g()) {
                    for (int i = 0; i < this.f2.size(); i++) {
                        if (!this.f2.get(i).g()) {
                            this.i2 = 0;
                            return false;
                        }
                    }
                    this.i2 = 1;
                    return true;
                }
                this.i2 = 0;
                return false;
            }

            public final void i() {
                this.y = Type.BYTE;
                this.Y1 = 0;
                this.Z1 = 0.0f;
                this.a2 = 0.0d;
                this.b2 = 0;
                this.c2 = 0;
                this.d2 = 0;
                this.e2 = ProtoBuf$Annotation.c;
                this.f2 = Collections.emptyList();
                this.g2 = 0;
                this.h2 = 0;
            }

            public Value() {
                this.i2 = -1;
                this.j2 = -1;
                this.q = c.c;
            }

            public Value(d dVar, e eVar, m0.r.t.a.r.f.a aVar) throws InvalidProtocolBufferException {
                this.i2 = -1;
                this.j2 = -1;
                i();
                c.b u = c.u();
                CodedOutputStream k = CodedOutputStream.k(u, 1);
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int o = dVar.o();
                        switch (o) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                int l = dVar.l();
                                Type valueOf = Type.valueOf(l);
                                if (valueOf != null) {
                                    this.x |= 1;
                                    this.y = valueOf;
                                    break;
                                } else {
                                    k.y(o);
                                    k.y(l);
                                    break;
                                }
                            case 16:
                                this.x |= 2;
                                long m = dVar.m();
                                this.Y1 = (-(m & 1)) ^ (m >>> 1);
                                break;
                            case 29:
                                this.x |= 4;
                                this.Z1 = Float.intBitsToFloat(dVar.j());
                                break;
                            case 33:
                                this.x |= 8;
                                this.a2 = Double.longBitsToDouble(dVar.k());
                                break;
                            case 40:
                                this.x |= 16;
                                this.b2 = dVar.l();
                                break;
                            case 48:
                                this.x |= 32;
                                this.c2 = dVar.l();
                                break;
                            case 56:
                                this.x |= 64;
                                this.d2 = dVar.l();
                                break;
                            case 66:
                                b bVar = null;
                                if ((this.x & 128) == 128) {
                                    ProtoBuf$Annotation protoBuf$Annotation = this.e2;
                                    Objects.requireNonNull(protoBuf$Annotation);
                                    b bVar2 = new b();
                                    bVar2.m(protoBuf$Annotation);
                                    bVar = bVar2;
                                }
                                ProtoBuf$Annotation protoBuf$Annotation2 = (ProtoBuf$Annotation) dVar.h(ProtoBuf$Annotation.d, eVar);
                                this.e2 = protoBuf$Annotation2;
                                if (bVar != null) {
                                    bVar.m(protoBuf$Annotation2);
                                    this.e2 = bVar.l();
                                }
                                this.x |= 128;
                                break;
                            case 74:
                                if (!(z2 & true)) {
                                    this.f2 = new ArrayList();
                                    z2 |= true;
                                }
                                this.f2.add(dVar.h(d, eVar));
                                break;
                            case 80:
                                this.x |= 512;
                                this.h2 = dVar.l();
                                break;
                            case 88:
                                this.x |= 256;
                                this.g2 = dVar.l();
                                break;
                            default:
                                if (dVar.r(o, k)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        e.c = this;
                        throw e;
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.c = this;
                        throw invalidProtocolBufferException;
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.f2 = Collections.unmodifiableList(this.f2);
                        }
                        try {
                            k.j();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.q = u.e();
                            throw th2;
                        }
                        this.q = u.e();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.f2 = Collections.unmodifiableList(this.f2);
                }
                try {
                    k.j();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.q = u.e();
                    throw th3;
                }
                this.q = u.e();
            }
        }

        public Argument() {
            this.Z1 = -1;
            this.a2 = -1;
            this.q = c.c;
        }

        public Argument(d dVar, e eVar, m0.r.t.a.r.f.a aVar) throws InvalidProtocolBufferException {
            this.Z1 = -1;
            this.a2 = -1;
            boolean z = false;
            this.y = 0;
            this.Y1 = Value.c;
            c.b u = c.u();
            CodedOutputStream k = CodedOutputStream.k(u, 1);
            while (!z) {
                try {
                    int o = dVar.o();
                    if (o != 0) {
                        if (o == 8) {
                            this.x |= 1;
                            this.y = dVar.l();
                        } else if (o == 18) {
                            Value.b bVar = null;
                            if ((this.x & 2) == 2) {
                                Value value = this.Y1;
                                Objects.requireNonNull(value);
                                Value.b bVar2 = new Value.b();
                                bVar2.m(value);
                                bVar = bVar2;
                            }
                            Value value2 = (Value) dVar.h(Value.d, eVar);
                            this.Y1 = value2;
                            if (bVar != null) {
                                bVar.m(value2);
                                this.Y1 = bVar.l();
                            }
                            this.x |= 2;
                        } else if (!dVar.r(o, k)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    e.c = this;
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.c = this;
                    throw invalidProtocolBufferException;
                } catch (Throwable th) {
                    try {
                        k.j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.q = u.e();
                        throw th2;
                    }
                    this.q = u.e();
                    throw th;
                }
            }
            try {
                k.j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.q = u.e();
                throw th3;
            }
            this.q = u.e();
        }
    }

    public ProtoBuf$Annotation() {
        this.Z1 = -1;
        this.a2 = -1;
        this.q = c.c;
    }

    public ProtoBuf$Annotation(d dVar, e eVar, m0.r.t.a.r.f.a aVar) throws InvalidProtocolBufferException {
        this.Z1 = -1;
        this.a2 = -1;
        boolean z = false;
        this.y = 0;
        this.Y1 = Collections.emptyList();
        c.b u = c.u();
        CodedOutputStream k = CodedOutputStream.k(u, 1);
        boolean z2 = false;
        while (!z) {
            try {
                int o = dVar.o();
                if (o != 0) {
                    if (o == 8) {
                        this.x |= 1;
                        this.y = dVar.l();
                    } else if (o == 18) {
                        if (!(z2 & true)) {
                            this.Y1 = new ArrayList();
                            z2 |= true;
                        }
                        this.Y1.add(dVar.h(Argument.d, eVar));
                    } else if (!dVar.r(o, k)) {
                    }
                }
                z = true;
            } catch (InvalidProtocolBufferException e) {
                e.c = this;
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.c = this;
                throw invalidProtocolBufferException;
            } catch (Throwable th) {
                if (z2 & true) {
                    this.Y1 = Collections.unmodifiableList(this.Y1);
                }
                try {
                    k.j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.q = u.e();
                    throw th2;
                }
                this.q = u.e();
                throw th;
            }
        }
        if (z2 & true) {
            this.Y1 = Collections.unmodifiableList(this.Y1);
        }
        try {
            k.j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.q = u.e();
            throw th3;
        }
        this.q = u.e();
    }
}
