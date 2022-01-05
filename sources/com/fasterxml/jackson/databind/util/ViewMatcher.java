package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

public class ViewMatcher implements Serializable {
    public static final ViewMatcher c = new ViewMatcher();

    public static final class Multi extends ViewMatcher implements Serializable {
        public final Class<?>[] d;

        public Multi(Class<?>[] clsArr) {
            this.d = clsArr;
        }

        public boolean a(Class<?> cls) {
            for (Class<?> cls2 : this.d) {
                if (cls == cls2 || cls2.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class Single extends ViewMatcher {
        public final Class<?> d;

        public Single(Class<?> cls) {
            this.d = cls;
        }

        public boolean a(Class<?> cls) {
            Class<?> cls2 = this.d;
            return cls == cls2 || cls2.isAssignableFrom(cls);
        }
    }

    public boolean a(Class<?> cls) {
        return false;
    }
}
