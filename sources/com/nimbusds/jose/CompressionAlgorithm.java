package com.nimbusds.jose;

import java.io.Serializable;

public final class CompressionAlgorithm implements Serializable {
    public static final CompressionAlgorithm c = new CompressionAlgorithm("DEF");
    public final String d;

    public CompressionAlgorithm(String str) {
        this.d = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof CompressionAlgorithm) && this.d.equals(obj.toString());
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        return this.d;
    }
}
