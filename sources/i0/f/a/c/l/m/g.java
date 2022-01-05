package i0.f.a.c.l.m;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import i0.f.a.c.l.m.f;
import java.io.IOException;
import java.util.BitSet;

/* compiled from: PropertyValueBuffer */
public class g {
    public final JsonParser a;
    public final DeserializationContext b;
    public final ObjectIdReader c;
    public final Object[] d;
    public int e;
    public int f;
    public final BitSet g;
    public f h;
    public Object i;

    public g(JsonParser jsonParser, DeserializationContext deserializationContext, int i2, ObjectIdReader objectIdReader) {
        this.a = jsonParser;
        this.b = deserializationContext;
        this.e = i2;
        this.c = objectIdReader;
        this.d = new Object[i2];
        if (i2 < 32) {
            this.g = null;
        } else {
            this.g = new BitSet();
        }
    }

    public Object a(SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        if (settableBeanProperty.v() != null) {
            this.b.z(settableBeanProperty.v(), settableBeanProperty, (Object) null);
            throw null;
        } else if (settableBeanProperty.c()) {
            this.b.k0(settableBeanProperty, "Missing required creator property '%s' (index %d)", settableBeanProperty.x.q, Integer.valueOf(settableBeanProperty.p()));
            throw null;
        } else if (!this.b.d0(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES)) {
            try {
                Object b2 = settableBeanProperty.c2.b(this.b);
                if (b2 != null) {
                    return b2;
                }
                return settableBeanProperty.y().b(this.b);
            } catch (JsonMappingException e2) {
                AnnotatedMember a2 = settableBeanProperty.a();
                if (a2 != null) {
                    e2.g(a2.h(), settableBeanProperty.x.q);
                }
                throw e2;
            }
        } else {
            this.b.k0(settableBeanProperty, "Missing creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled", settableBeanProperty.x.q, Integer.valueOf(settableBeanProperty.p()));
            throw null;
        }
    }

    public boolean b(SettableBeanProperty settableBeanProperty, Object obj) {
        int p = settableBeanProperty.p();
        this.d[p] = obj;
        BitSet bitSet = this.g;
        if (bitSet == null) {
            int i2 = this.f;
            int i3 = (1 << p) | i2;
            if (i2 != i3) {
                this.f = i3;
                int i4 = this.e - 1;
                this.e = i4;
                if (i4 <= 0) {
                    if (this.c == null || this.i != null) {
                        return true;
                    }
                    return false;
                }
            }
        } else if (!bitSet.get(p)) {
            this.g.set(p);
            this.e--;
        }
        return false;
    }

    public void c(SettableAnyProperty settableAnyProperty, String str, Object obj) {
        this.h = new f.a(this.h, obj, settableAnyProperty, str);
    }

    public boolean d(String str) throws IOException {
        ObjectIdReader objectIdReader = this.c;
        if (objectIdReader == null || !str.equals(objectIdReader.d.q)) {
            return false;
        }
        this.i = this.c.c(this.a, this.b);
        return true;
    }
}
