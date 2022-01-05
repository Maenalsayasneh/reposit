package com.instabug.featuresrequest.d;

import com.instabug.library.internal.storage.cache.Cacheable;
import java.io.Serializable;

/* compiled from: TimelineObject */
public abstract class f implements Cacheable, Serializable {
    public a c = a.COMMENT;
    public long d;

    /* compiled from: TimelineObject */
    public enum a {
        COMMENT("comment"),
        STATUS_CHANE("state_change");
        
        private final String type;

        private a(String str) {
            this.type = str;
        }

        public String toString() {
            return this.type;
        }
    }
}
