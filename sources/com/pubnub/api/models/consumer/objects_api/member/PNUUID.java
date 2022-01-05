package com.pubnub.api.models.consumer.objects_api.member;

import com.google.gson.annotations.JsonAdapter;
import com.pubnub.api.models.consumer.objects_api.util.CustomPayloadJsonInterceptor;
import java.util.HashMap;
import java.util.Map;

public abstract class PNUUID {
    private final UUIDId uuid;

    public static class JustUUID extends PNUUID {
        public JustUUID(UUIDId uUIDId) {
            super(uUIDId);
        }

        public boolean canEqual(Object obj) {
            return obj instanceof JustUUID;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof JustUUID) && ((JustUUID) obj).canEqual(this) && super.equals(obj);
        }

        public int hashCode() {
            return super.hashCode();
        }
    }

    public static class UUIDId {
        private String id;

        public UUIDId(String str) {
            this.id = str;
        }

        public boolean canEqual(Object obj) {
            return obj instanceof UUIDId;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UUIDId)) {
                return false;
            }
            UUIDId uUIDId = (UUIDId) obj;
            if (!uUIDId.canEqual(this)) {
                return false;
            }
            String id2 = getId();
            String id3 = uUIDId.getId();
            return id2 != null ? id2.equals(id3) : id3 == null;
        }

        public String getId() {
            return this.id;
        }

        public int hashCode() {
            String id2 = getId();
            return 59 + (id2 == null ? 43 : id2.hashCode());
        }
    }

    public static class UUIDWithCustom extends PNUUID {
        @JsonAdapter(CustomPayloadJsonInterceptor.class)
        private final Object custom;

        public UUIDWithCustom(UUIDId uUIDId, Object obj) {
            super(uUIDId);
            this.custom = obj;
        }

        public boolean canEqual(Object obj) {
            return obj instanceof UUIDWithCustom;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UUIDWithCustom)) {
                return false;
            }
            UUIDWithCustom uUIDWithCustom = (UUIDWithCustom) obj;
            if (!uUIDWithCustom.canEqual(this) || !super.equals(obj)) {
                return false;
            }
            Object custom2 = getCustom();
            Object custom3 = uUIDWithCustom.getCustom();
            return custom2 != null ? custom2.equals(custom3) : custom3 == null;
        }

        public Object getCustom() {
            return this.custom;
        }

        public int hashCode() {
            int hashCode = super.hashCode();
            Object custom2 = getCustom();
            return (hashCode * 59) + (custom2 == null ? 43 : custom2.hashCode());
        }
    }

    public PNUUID(UUIDId uUIDId) {
        this.uuid = uUIDId;
    }

    public static PNUUID uuid(String str) {
        return new JustUUID(new UUIDId(str));
    }

    public static PNUUID uuidWithCustom(String str, Map<String, Object> map) {
        return new UUIDWithCustom(new UUIDId(str), new HashMap(map));
    }

    public UUIDId getUuid() {
        return this.uuid;
    }
}
