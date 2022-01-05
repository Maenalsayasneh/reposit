package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;

public abstract class AccessorNamingStrategy {

    public static abstract class Provider implements Serializable {
    }

    public abstract String a(AnnotatedMethod annotatedMethod, String str);

    public abstract String b(AnnotatedMethod annotatedMethod, String str);

    public abstract String c(AnnotatedMethod annotatedMethod, String str);
}
