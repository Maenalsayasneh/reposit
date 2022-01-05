package com.nimbusds.jose;

import java.io.Serializable;

public final class JOSEObjectType implements Serializable {
    public final String c;

    public JOSEObjectType(String str) {
        this.c = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof JOSEObjectType) && this.c.equalsIgnoreCase(((JOSEObjectType) obj).c);
    }

    public int hashCode() {
        return this.c.toLowerCase().hashCode();
    }

    public String toString() {
        return this.c;
    }
}
