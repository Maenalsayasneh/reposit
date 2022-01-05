package com.pubnub.api.endpoints.objects_api.utils;

import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;

public class PNSortKey {
    private final Dir dir;
    private final Key key;

    public enum Dir {
        ASC("asc"),
        DESC("desc");
        
        /* access modifiers changed from: private */
        public final String dir;

        private Dir(String str) {
            this.dir = str;
        }

        public String getDir() {
            return this.dir;
        }
    }

    public enum Key {
        ID("id"),
        NAME("name"),
        UPDATED(SDKCoreEvent.Feature.VALUE_UPDATED);
        
        /* access modifiers changed from: private */
        public final String fieldName;

        private Key(String str) {
            this.fieldName = str;
        }

        public String getFieldName() {
            return this.fieldName;
        }
    }

    private PNSortKey(Key key2, Dir dir2) {
        this.key = key2;
        this.dir = dir2;
    }

    public static PNSortKey asc(Key key2) {
        return new PNSortKey(key2, Dir.ASC);
    }

    public static PNSortKey desc(Key key2) {
        return new PNSortKey(key2, Dir.DESC);
    }

    public static PNSortKey of(Key key2, Dir dir2) {
        return new PNSortKey(key2, dir2);
    }

    public Dir getDir() {
        return this.dir;
    }

    public Key getKey() {
        return this.key;
    }

    public String toSortParameter() {
        return this.key.fieldName + ":" + this.dir.dir;
    }

    public static PNSortKey of(Key key2) {
        return new PNSortKey(key2, Dir.ASC);
    }
}
