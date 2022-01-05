package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import java.io.Serializable;

public interface VisibilityChecker<T extends VisibilityChecker<T>> {

    public static class Std implements VisibilityChecker<Std>, Serializable {
        public static final Std c;
        public final JsonAutoDetect.Visibility Y1;
        public final JsonAutoDetect.Visibility d;
        public final JsonAutoDetect.Visibility q;
        public final JsonAutoDetect.Visibility x;
        public final JsonAutoDetect.Visibility y;

        static {
            JsonAutoDetect.Visibility visibility = JsonAutoDetect.Visibility.PUBLIC_ONLY;
            JsonAutoDetect.Visibility visibility2 = JsonAutoDetect.Visibility.ANY;
            c = new Std(visibility, visibility, visibility2, visibility2, visibility);
        }

        public Std(JsonAutoDetect.Visibility visibility, JsonAutoDetect.Visibility visibility2, JsonAutoDetect.Visibility visibility3, JsonAutoDetect.Visibility visibility4, JsonAutoDetect.Visibility visibility5) {
            this.d = visibility;
            this.q = visibility2;
            this.x = visibility3;
            this.y = visibility4;
            this.Y1 = visibility5;
        }

        public final JsonAutoDetect.Visibility a(JsonAutoDetect.Visibility visibility, JsonAutoDetect.Visibility visibility2) {
            return visibility2 == JsonAutoDetect.Visibility.DEFAULT ? visibility : visibility2;
        }

        public Std b(JsonAutoDetect.Visibility visibility, JsonAutoDetect.Visibility visibility2, JsonAutoDetect.Visibility visibility3, JsonAutoDetect.Visibility visibility4, JsonAutoDetect.Visibility visibility5) {
            if (visibility == this.d && visibility2 == this.q && visibility3 == this.x && visibility4 == this.y && visibility5 == this.Y1) {
                return this;
            }
            return new Std(visibility, visibility2, visibility3, visibility4, visibility5);
        }

        public boolean c(AnnotatedMember annotatedMember) {
            return this.y.isVisible(annotatedMember.k());
        }

        public String toString() {
            return String.format("[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]", new Object[]{this.d, this.q, this.x, this.y, this.Y1});
        }
    }
}
