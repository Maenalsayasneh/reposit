package com.pubnub.api.models.consumer.objects_api.member;

import com.google.gson.annotations.JsonAdapter;
import com.pubnub.api.models.consumer.objects_api.util.CustomPayloadJsonInterceptor;
import com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata;
import i0.d.a.a.a;

public class PNMembers {
    @JsonAdapter(CustomPayloadJsonInterceptor.class)
    public Object custom;
    public String eTag;
    public String updated;
    private PNUUIDMetadata uuid;

    public boolean canEqual(Object obj) {
        return obj instanceof PNMembers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNMembers)) {
            return false;
        }
        PNMembers pNMembers = (PNMembers) obj;
        if (!pNMembers.canEqual(this)) {
            return false;
        }
        PNUUIDMetadata uuid2 = getUuid();
        PNUUIDMetadata uuid3 = pNMembers.getUuid();
        if (uuid2 != null ? !uuid2.equals(uuid3) : uuid3 != null) {
            return false;
        }
        Object custom2 = getCustom();
        Object custom3 = pNMembers.getCustom();
        if (custom2 != null ? !custom2.equals(custom3) : custom3 != null) {
            return false;
        }
        String updated2 = getUpdated();
        String updated3 = pNMembers.getUpdated();
        if (updated2 != null ? !updated2.equals(updated3) : updated3 != null) {
            return false;
        }
        String eTag2 = getETag();
        String eTag3 = pNMembers.getETag();
        return eTag2 != null ? eTag2.equals(eTag3) : eTag3 == null;
    }

    public Object getCustom() {
        return this.custom;
    }

    public String getETag() {
        return this.eTag;
    }

    public String getUpdated() {
        return this.updated;
    }

    public PNUUIDMetadata getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        PNUUIDMetadata uuid2 = getUuid();
        int i = 43;
        int hashCode = uuid2 == null ? 43 : uuid2.hashCode();
        Object custom2 = getCustom();
        int hashCode2 = ((hashCode + 59) * 59) + (custom2 == null ? 43 : custom2.hashCode());
        String updated2 = getUpdated();
        int hashCode3 = (hashCode2 * 59) + (updated2 == null ? 43 : updated2.hashCode());
        String eTag2 = getETag();
        int i2 = hashCode3 * 59;
        if (eTag2 != null) {
            i = eTag2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNMembers(uuid=");
        P0.append(getUuid());
        P0.append(", custom=");
        P0.append(getCustom());
        P0.append(", updated=");
        P0.append(getUpdated());
        P0.append(", eTag=");
        P0.append(getETag());
        P0.append(")");
        return P0.toString();
    }
}
