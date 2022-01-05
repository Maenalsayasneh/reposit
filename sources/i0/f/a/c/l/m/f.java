package i0.f.a.c.l.m;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.util.Map;

/* compiled from: PropertyValue */
public abstract class f {
    public final f a;
    public final Object b;

    /* compiled from: PropertyValue */
    public static final class a extends f {
        public final SettableAnyProperty c;
        public final String d;

        public a(f fVar, Object obj, SettableAnyProperty settableAnyProperty, String str) {
            super(fVar, obj);
            this.c = settableAnyProperty;
            this.d = str;
        }

        public void a(Object obj) throws IOException, JsonProcessingException {
            this.c.c(obj, this.d, this.b);
        }
    }

    /* compiled from: PropertyValue */
    public static final class b extends f {
        public final Object c;

        public b(f fVar, Object obj, Object obj2) {
            super(fVar, obj);
            this.c = obj2;
        }

        public void a(Object obj) throws IOException, JsonProcessingException {
            ((Map) obj).put(this.c, this.b);
        }
    }

    /* compiled from: PropertyValue */
    public static final class c extends f {
        public final SettableBeanProperty c;

        public c(f fVar, Object obj, SettableBeanProperty settableBeanProperty) {
            super(fVar, obj);
            this.c = settableBeanProperty;
        }

        public void a(Object obj) throws IOException, JsonProcessingException {
            this.c.I(obj, this.b);
        }
    }

    public f(f fVar, Object obj) {
        this.a = fVar;
        this.b = obj;
    }

    public abstract void a(Object obj) throws IOException, JsonProcessingException;
}
