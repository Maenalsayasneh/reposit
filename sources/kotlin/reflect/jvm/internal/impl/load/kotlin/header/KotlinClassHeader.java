package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import i0.j.f.p.h;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import m0.n.b.i;
import m0.r.t.a.r.f.d.a.c;
import m0.r.t.a.r.f.d.a.f;

/* compiled from: KotlinClassHeader.kt */
public final class KotlinClassHeader {
    public final Kind a;
    public final f b;
    public final String[] c;
    public final String[] d;
    public final String[] e;
    public final String f;
    public final int g;

    /* compiled from: KotlinClassHeader.kt */
    public enum Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        
        public static final a Companion = null;
        /* access modifiers changed from: private */
        public static final Map<Integer, Kind> entryById = null;
        private final int id;

        /* compiled from: KotlinClassHeader.kt */
        public static final class a {
            public a(m0.n.b.f fVar) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new a((m0.n.b.f) null);
            Kind[] values = values();
            int R2 = h.R2(6);
            if (R2 < 16) {
                R2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(R2);
            for (int i = 0; i < 6; i++) {
                Kind kind = values[i];
                linkedHashMap.put(Integer.valueOf(kind.getId()), kind);
            }
            entryById = linkedHashMap;
        }

        private Kind(int i) {
            this.id = i;
        }

        public static final Kind getById(int i) {
            Objects.requireNonNull(Companion);
            Kind kind = (Kind) entryById.get(Integer.valueOf(i));
            return kind == null ? UNKNOWN : kind;
        }

        public final int getId() {
            return this.id;
        }
    }

    public KotlinClassHeader(Kind kind, f fVar, c cVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2) {
        i.e(kind, "kind");
        i.e(fVar, "metadataVersion");
        i.e(cVar, "bytecodeVersion");
        this.a = kind;
        this.b = fVar;
        this.c = strArr;
        this.d = strArr2;
        this.e = strArr3;
        this.f = str;
        this.g = i;
    }

    public final String a() {
        String str = this.f;
        if (this.a == Kind.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final boolean b(int i, int i2) {
        return (i & i2) != 0;
    }

    public String toString() {
        return this.a + " version=" + this.b;
    }
}
