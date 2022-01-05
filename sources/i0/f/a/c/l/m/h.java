package i0.f.a.c.l.m;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import i0.f.a.a.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: ReadableObjectId */
public class h {
    public Object a;
    public final ObjectIdGenerator.IdKey b;
    public LinkedList<a> c;
    public z d;

    public h(ObjectIdGenerator.IdKey idKey) {
        this.b = idKey;
    }

    public void a(a aVar) {
        if (this.c == null) {
            this.c = new LinkedList<>();
        }
        this.c.add(aVar);
    }

    public void b(Object obj) throws IOException {
        this.d.a(this.b, obj);
        this.a = obj;
        Object obj2 = this.b.q;
        LinkedList<a> linkedList = this.c;
        if (linkedList != null) {
            Iterator it = linkedList.iterator();
            this.c = null;
            while (it.hasNext()) {
                ((a) it.next()).a(obj2, obj);
            }
        }
    }

    public String toString() {
        return String.valueOf(this.b);
    }

    /* compiled from: ReadableObjectId */
    public static abstract class a {
        public final UnresolvedForwardReference a;
        public final Class<?> b;

        public a(UnresolvedForwardReference unresolvedForwardReference, Class<?> cls) {
            this.a = unresolvedForwardReference;
            this.b = cls;
        }

        public abstract void a(Object obj, Object obj2) throws IOException;

        public a(UnresolvedForwardReference unresolvedForwardReference, JavaType javaType) {
            this.a = unresolvedForwardReference;
            this.b = javaType.c;
        }
    }
}
