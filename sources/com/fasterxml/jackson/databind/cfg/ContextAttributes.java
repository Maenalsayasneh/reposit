package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

public abstract class ContextAttributes {

    public static class Impl extends ContextAttributes implements Serializable {
        public static final Impl c = new Impl(Collections.emptyMap());
        public static final Object d = new Object();
        public final Map<?, ?> q;
        public transient Map<Object, Object> x;

        public Impl(Map<?, ?> map) {
            this.q = map;
            this.x = null;
        }

        public Impl(Map<?, ?> map, Map<Object, Object> map2) {
            this.q = map;
            this.x = map2;
        }
    }
}
