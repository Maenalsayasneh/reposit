package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import i0.f.a.c.m.a;
import i0.f.a.c.t.f;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class OptionalHandlerFactory implements Serializable {
    public static final Class<?> c = Node.class;
    public static final Class<?> d;
    public static final a q;
    public static final OptionalHandlerFactory x = new OptionalHandlerFactory();
    public final Map<String, Object> Y1;
    public final Map<String, String> y;

    static {
        a aVar = null;
        Class<Document> cls = Document.class;
        d = cls;
        try {
            aVar = a.a;
        } catch (Throwable unused) {
        }
        q = aVar;
    }

    public OptionalHandlerFactory() {
        HashMap hashMap = new HashMap();
        this.y = hashMap;
        hashMap.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        hashMap.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap hashMap2 = new HashMap();
        this.Y1 = hashMap2;
        hashMap2.put("java.sql.Timestamp", DateSerializer.Y1);
        hashMap2.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        hashMap2.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        hashMap2.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        hashMap2.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }

    public final boolean a(Class<?> cls, Class<?> cls2) {
        return cls2 != null && cls2.isAssignableFrom(cls);
    }

    public final boolean b(Class<?> cls, String str) {
        boolean startsWith;
        do {
            Class<? super Object> superclass = r3.getSuperclass();
            Class<? super Object> cls2 = cls;
            if (superclass == null || superclass == Object.class) {
                return false;
            }
            startsWith = superclass.getName().startsWith(str);
            cls2 = superclass;
        } while (!startsWith);
        return true;
    }

    public final Object c(Class<?> cls, JavaType javaType) {
        try {
            return f.i(cls, false);
        } catch (Throwable th) {
            StringBuilder P0 = i0.d.a.a.a.P0("Failed to create instance of `");
            P0.append(cls.getName());
            P0.append("` for handling values of type ");
            P0.append(f.t(javaType));
            P0.append(", problem: (");
            P0.append(th.getClass().getName());
            P0.append(") ");
            P0.append(th.getMessage());
            throw new IllegalStateException(P0.toString());
        }
    }

    public final Object d(String str, JavaType javaType) {
        try {
            return c(Class.forName(str), javaType);
        } catch (Throwable th) {
            StringBuilder T0 = i0.d.a.a.a.T0("Failed to find class `", str, "` for handling values of type ");
            T0.append(f.t(javaType));
            T0.append(", problem: (");
            T0.append(th.getClass().getName());
            T0.append(") ");
            T0.append(th.getMessage());
            throw new IllegalStateException(T0.toString());
        }
    }
}
