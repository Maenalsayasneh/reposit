package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.Serializable;

public class PropertyMetadata implements Serializable {
    public static final PropertyMetadata c = new PropertyMetadata(Boolean.TRUE, (String) null, (Integer) null, (String) null, (a) null, (Nulls) null, (Nulls) null);
    public static final PropertyMetadata d = new PropertyMetadata(Boolean.FALSE, (String) null, (Integer) null, (String) null, (a) null, (Nulls) null, (Nulls) null);
    public static final PropertyMetadata q = new PropertyMetadata((Boolean) null, (String) null, (Integer) null, (String) null, (a) null, (Nulls) null, (Nulls) null);
    public final Integer Y1;
    public final String Z1;
    public final transient a a2;
    public Nulls b2;
    public Nulls c2;
    public final Boolean x;
    public final String y;

    public static final class a {
        public final AnnotatedMember a;
        public final boolean b;

        public a(AnnotatedMember annotatedMember, boolean z) {
            this.a = annotatedMember;
            this.b = z;
        }
    }

    public PropertyMetadata(Boolean bool, String str, Integer num, String str2, a aVar, Nulls nulls, Nulls nulls2) {
        this.x = bool;
        this.y = str;
        this.Y1 = num;
        this.Z1 = (str2 == null || str2.isEmpty()) ? null : str2;
        this.a2 = aVar;
        this.b2 = nulls;
        this.c2 = nulls2;
    }

    public static PropertyMetadata a(Boolean bool, String str, Integer num, String str2) {
        if (str != null || num != null || str2 != null) {
            return new PropertyMetadata(bool, str, num, str2, (a) null, (Nulls) null, (Nulls) null);
        }
        if (bool == null) {
            return q;
        }
        return bool.booleanValue() ? c : d;
    }

    public PropertyMetadata b(a aVar) {
        return new PropertyMetadata(this.x, this.y, this.Y1, this.Z1, aVar, this.b2, this.c2);
    }

    public PropertyMetadata c(Nulls nulls, Nulls nulls2) {
        return new PropertyMetadata(this.x, this.y, this.Y1, this.Z1, this.a2, nulls, nulls2);
    }
}
