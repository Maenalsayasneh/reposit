package com.fasterxml.jackson.databind.type;

import java.io.Serializable;

public final class ClassKey implements Comparable<ClassKey>, Serializable {
    public String c;
    public Class<?> d;
    public int q;

    public ClassKey() {
        this.d = null;
        this.c = null;
        this.q = 0;
    }

    public int compareTo(Object obj) {
        return this.c.compareTo(((ClassKey) obj).c);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != ClassKey.class) {
            return false;
        }
        if (((ClassKey) obj).d == this.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.q;
    }

    public String toString() {
        return this.c;
    }

    public ClassKey(Class<?> cls) {
        this.d = cls;
        String name = cls.getName();
        this.c = name;
        this.q = name.hashCode();
    }
}
