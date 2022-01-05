package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.InternCache;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import i0.d.a.a.a;
import i0.f.a.b.f;
import java.io.Serializable;
import java.lang.annotation.Annotation;

public class PropertyName implements Serializable {
    public static final PropertyName c = new PropertyName("", (String) null);
    public static final PropertyName d = new PropertyName(new String(""), (String) null);
    public final String q;
    public final String x;
    public f y;

    public PropertyName(String str) {
        Annotation[] annotationArr = i0.f.a.c.t.f.a;
        this.q = str == null ? "" : str;
        this.x = null;
    }

    public static PropertyName a(String str) {
        if (str == null || str.isEmpty()) {
            return c;
        }
        return new PropertyName(InternCache.c.a(str), (String) null);
    }

    public static PropertyName b(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 != null || !str.isEmpty()) {
            return new PropertyName(InternCache.c.a(str), str2);
        }
        return c;
    }

    public boolean c() {
        return !this.q.isEmpty();
    }

    public PropertyName d() {
        String a;
        if (!this.q.isEmpty() && (a = InternCache.c.a(this.q)) != this.q) {
            return new PropertyName(a, this.x);
        }
        return this;
    }

    public boolean e() {
        return this.x == null && this.q.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != PropertyName.class) {
            return false;
        }
        PropertyName propertyName = (PropertyName) obj;
        String str = this.q;
        if (str == null) {
            if (propertyName.q != null) {
                return false;
            }
        } else if (!str.equals(propertyName.q)) {
            return false;
        }
        String str2 = this.x;
        if (str2 != null) {
            return str2.equals(propertyName.x);
        }
        if (propertyName.x == null) {
            return true;
        }
        return false;
    }

    public f f(MapperConfig<?> mapperConfig) {
        f fVar = this.y;
        if (fVar == null) {
            if (mapperConfig == null) {
                fVar = new SerializedString(this.q);
            } else {
                fVar = new SerializedString(this.q);
            }
            this.y = fVar;
        }
        return fVar;
    }

    public PropertyName g(String str) {
        if (str == null) {
            str = "";
        }
        if (str.equals(this.q)) {
            return this;
        }
        return new PropertyName(str, this.x);
    }

    public int hashCode() {
        String str = this.x;
        if (str == null) {
            return this.q.hashCode();
        }
        return str.hashCode() ^ this.q.hashCode();
    }

    public String toString() {
        if (this.x == null) {
            return this.q;
        }
        StringBuilder P0 = a.P0("{");
        P0.append(this.x);
        P0.append("}");
        P0.append(this.q);
        return P0.toString();
    }

    public PropertyName(String str, String str2) {
        Annotation[] annotationArr = i0.f.a.c.t.f.a;
        this.q = str == null ? "" : str;
        this.x = str2;
    }
}
