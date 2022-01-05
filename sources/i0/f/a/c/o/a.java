package i0.f.a.c.o;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import i0.f.a.c.b;
import i0.f.a.c.n.i;
import i0.f.a.c.t.f;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: JDK14Util */
public class a {
    public final b a;
    public final DeserializationConfig b;
    public final AnnotationIntrospector c;
    public final List<AnnotatedConstructor> d;
    public final AnnotatedConstructor e;
    public final b[] f;

    public a(DeserializationContext deserializationContext, b bVar) {
        this.a = bVar;
        this.c = deserializationContext.G();
        this.b = deserializationContext.q;
        RuntimeException runtimeException = c.b;
        if (runtimeException == null) {
            c cVar = c.a;
            Class<?> cls = bVar.a.c;
            Object[] a2 = cVar.a(cls);
            int length = a2.length;
            b[] bVarArr = new b[length];
            int i = 0;
            while (i < a2.length) {
                try {
                    try {
                        bVarArr[i] = new b((Class) cVar.e.invoke(a2[i], new Object[0]), (String) cVar.d.invoke(a2[i], new Object[0]));
                        i++;
                    } catch (Exception e2) {
                        throw new IllegalArgumentException(String.format("Failed to access type of field #%d (of %d) of Record type %s", new Object[]{Integer.valueOf(i), Integer.valueOf(a2.length), f.E(cls)}), e2);
                    }
                } catch (Exception e3) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", new Object[]{Integer.valueOf(i), Integer.valueOf(a2.length), f.E(cls)}), e3);
                }
            }
            this.f = bVarArr;
            AnnotatedConstructor annotatedConstructor = null;
            if (length != 0) {
                List<AnnotatedConstructor> k = ((i) bVar).f.k();
                this.d = k;
                Iterator<AnnotatedConstructor> it = k.iterator();
                loop1:
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnnotatedConstructor next = it.next();
                    if (next.x() == length) {
                        int i2 = 0;
                        while (i2 < length) {
                            if (next.z(i2).equals(this.f[i2].a)) {
                                i2++;
                            }
                        }
                        annotatedConstructor = next;
                        break loop1;
                    }
                }
            } else {
                annotatedConstructor = ((i) bVar).f.g().a;
                this.d = Collections.singletonList(annotatedConstructor);
            }
            if (annotatedConstructor != null) {
                this.e = annotatedConstructor;
                return;
            }
            StringBuilder P0 = i0.d.a.a.a.P0("Failed to find the canonical Record constructor of type ");
            P0.append(f.t(this.a.a));
            throw new IllegalArgumentException(P0.toString());
        }
        throw runtimeException;
    }
}
