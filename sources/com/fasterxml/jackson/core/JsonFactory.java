package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import i0.f.a.b.d;
import i0.f.a.b.f;
import i0.f.a.b.j.h;
import i0.f.a.b.k.a;
import i0.f.a.b.k.b;
import i0.f.a.b.m.e;
import i0.f.a.b.m.j;
import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.lang.ref.SoftReference;

public class JsonFactory extends TokenStreamFactory implements Serializable {
    public static final int c = Feature.collectDefaults();
    public static final int d = JsonParser.Feature.collectDefaults();
    public static final int q = JsonGenerator.Feature.collectDefaults();
    public static final f x = DefaultPrettyPrinter.c;
    public final transient a Y1;
    public int Z1;
    public int a2;
    public int b2;
    public d c2;
    public f d2;
    public final char e2;
    public final transient b y;

    public enum Feature implements e {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);
        
        private final boolean _defaultState;

        private Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            Feature[] values = values();
            int i = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                Feature feature = values[i2];
                if (feature.enabledByDefault()) {
                    i |= feature.getMask();
                }
            }
            return i;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (i & getMask()) != 0;
        }

        public int getMask() {
            return 1 << ordinal();
        }
    }

    public JsonFactory() {
        this((d) null);
    }

    public i0.f.a.b.i.b a(Object obj, boolean z) {
        return new i0.f.a.b.i.b(d(), obj, z);
    }

    public JsonGenerator b(Writer writer, i0.f.a.b.i.b bVar) throws IOException {
        h hVar = new h(bVar, this.b2, this.c2, writer, this.e2);
        f fVar = this.d2;
        if (fVar != x) {
            hVar.f2 = fVar;
        }
        return hVar;
    }

    public JsonParser c(byte[] bArr, int i, int i2, i0.f.a.b.i.b bVar) throws IOException {
        return new i0.f.a.b.j.a(bVar, bArr, i, i2).b(this.a2, this.c2, this.Y1, this.y, this.Z1);
    }

    public i0.f.a.b.m.a d() {
        i0.f.a.b.m.a aVar;
        SoftReference softReference;
        if (!Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(this.Z1)) {
            return new i0.f.a.b.m.a();
        }
        SoftReference softReference2 = i0.f.a.b.m.b.b.get();
        if (softReference2 == null) {
            aVar = null;
        } else {
            aVar = (i0.f.a.b.m.a) softReference2.get();
        }
        if (aVar == null) {
            aVar = new i0.f.a.b.m.a();
            j jVar = i0.f.a.b.m.b.a;
            if (jVar != null) {
                softReference = new SoftReference(aVar, jVar.b);
                jVar.a.put(softReference, Boolean.TRUE);
                while (true) {
                    SoftReference softReference3 = (SoftReference) jVar.b.poll();
                    if (softReference3 == null) {
                        break;
                    }
                    jVar.a.remove(softReference3);
                }
            } else {
                softReference = new SoftReference(aVar);
            }
            i0.f.a.b.m.b.b.set(softReference);
        }
        return aVar;
    }

    public JsonParser e(byte[] bArr) throws IOException, JsonParseException {
        return c(bArr, 0, bArr.length, a(bArr, true));
    }

    public d f() {
        return this.c2;
    }

    public JsonFactory(d dVar) {
        long currentTimeMillis = System.currentTimeMillis();
        this.y = new b((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
        long currentTimeMillis2 = System.currentTimeMillis();
        this.Y1 = new a(64, true, (((int) currentTimeMillis2) + ((int) (currentTimeMillis2 >>> 32))) | 1, true);
        this.Z1 = c;
        this.a2 = d;
        this.b2 = q;
        this.d2 = x;
        this.c2 = dVar;
        this.e2 = '\"';
    }
}
