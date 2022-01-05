package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.instabug.library.model.StepType;
import i0.f.a.a.k;
import i0.f.a.c.t.f;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class JsonMappingException extends JsonProcessingException {
    public LinkedList<Reference> d;
    public transient Closeable q;

    public JsonMappingException(Closeable closeable, String str) {
        super(str);
        this.q = closeable;
        if (closeable instanceof JsonParser) {
            this.c = ((JsonParser) closeable).f0();
        }
    }

    public static JsonMappingException e(IOException iOException) {
        return new JsonMappingException((Closeable) null, String.format("Unexpected IOException (of type %s): %s", new Object[]{iOException.getClass().getName(), f.j(iOException)}));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.Closeable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fasterxml.jackson.databind.JsonMappingException h(java.lang.Throwable r4, com.fasterxml.jackson.databind.JsonMappingException.Reference r5) {
        /*
            boolean r0 = r4 instanceof com.fasterxml.jackson.databind.JsonMappingException
            if (r0 == 0) goto L_0x0007
            com.fasterxml.jackson.databind.JsonMappingException r4 = (com.fasterxml.jackson.databind.JsonMappingException) r4
            goto L_0x0046
        L_0x0007:
            java.lang.String r0 = i0.f.a.c.t.f.j(r4)
            if (r0 == 0) goto L_0x0013
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
        L_0x0013:
            java.lang.String r0 = "(was "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x002d:
            r1 = 0
            boolean r2 = r4 instanceof com.fasterxml.jackson.core.JsonProcessingException
            if (r2 == 0) goto L_0x0040
            r2 = r4
            com.fasterxml.jackson.core.JsonProcessingException r2 = (com.fasterxml.jackson.core.JsonProcessingException) r2
            java.lang.Object r2 = r2.c()
            boolean r3 = r2 instanceof java.io.Closeable
            if (r3 == 0) goto L_0x0040
            r1 = r2
            java.io.Closeable r1 = (java.io.Closeable) r1
        L_0x0040:
            com.fasterxml.jackson.databind.JsonMappingException r2 = new com.fasterxml.jackson.databind.JsonMappingException
            r2.<init>((java.io.Closeable) r1, (java.lang.String) r0, (java.lang.Throwable) r4)
            r4 = r2
        L_0x0046:
            r4.f(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.JsonMappingException.h(java.lang.Throwable, com.fasterxml.jackson.databind.JsonMappingException$Reference):com.fasterxml.jackson.databind.JsonMappingException");
    }

    public static JsonMappingException i(Throwable th, Object obj, int i) {
        return h(th, new Reference(obj, i));
    }

    public static JsonMappingException k(Throwable th, Object obj, String str) {
        return h(th, new Reference(obj, str));
    }

    @k
    public Object c() {
        return this.q;
    }

    public String d() {
        String message = super.getMessage();
        if (this.d == null) {
            return message;
        }
        StringBuilder sb = message == null ? new StringBuilder() : new StringBuilder(message);
        sb.append(" (through reference chain: ");
        LinkedList<Reference> linkedList = this.d;
        if (linkedList != null) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb.append(((Reference) it.next()).toString());
                if (it.hasNext()) {
                    sb.append("->");
                }
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public void f(Reference reference) {
        if (this.d == null) {
            this.d = new LinkedList<>();
        }
        if (this.d.size() < 1000) {
            this.d.addFirst(reference);
        }
    }

    public void g(Object obj, String str) {
        f(new Reference(obj, str));
    }

    public String getLocalizedMessage() {
        return d();
    }

    public String getMessage() {
        return d();
    }

    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public static class Reference implements Serializable {
        public transient Object c;
        public String d;
        public int q = -1;
        public String x;

        public Reference() {
        }

        public String toString() {
            if (this.x == null) {
                StringBuilder sb = new StringBuilder();
                Object obj = this.c;
                if (obj != null) {
                    Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
                    int i = 0;
                    while (cls.isArray()) {
                        cls = cls.getComponentType();
                        i++;
                    }
                    sb.append(cls.getName());
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        sb.append("[]");
                    }
                } else {
                    sb.append(StepType.UNKNOWN);
                }
                sb.append('[');
                if (this.d != null) {
                    sb.append('\"');
                    sb.append(this.d);
                    sb.append('\"');
                } else {
                    int i2 = this.q;
                    if (i2 >= 0) {
                        sb.append(i2);
                    } else {
                        sb.append('?');
                    }
                }
                sb.append(']');
                this.x = sb.toString();
            }
            return this.x;
        }

        public Reference(Object obj, String str) {
            this.c = obj;
            Objects.requireNonNull(str, "Cannot pass null fieldName");
            this.d = str;
        }

        public Reference(Object obj, int i) {
            this.c = obj;
            this.q = i;
        }
    }

    public JsonMappingException(Closeable closeable, String str, Throwable th) {
        super(str, th);
        this.q = closeable;
        if (th instanceof JsonProcessingException) {
            this.c = ((JsonProcessingException) th).c;
        } else if (closeable instanceof JsonParser) {
            this.c = ((JsonParser) closeable).f0();
        }
    }

    public JsonMappingException(Closeable closeable, String str, JsonLocation jsonLocation) {
        super(str, jsonLocation);
        this.q = closeable;
    }
}
