package com.pubnub.api.models.consumer.objects_api;

import com.google.gson.annotations.JsonAdapter;
import com.pubnub.api.models.consumer.objects_api.util.CustomPayloadJsonInterceptor;
import i0.d.a.a.a;

public class PNObject {
    @JsonAdapter(CustomPayloadJsonInterceptor.class)
    public Object custom;
    public String eTag;
    public String id;
    public String updated;

    public PNObject(String str) {
        this.id = str;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNObject;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNObject)) {
            return false;
        }
        PNObject pNObject = (PNObject) obj;
        if (!pNObject.canEqual(this)) {
            return false;
        }
        String id2 = getId();
        String id3 = pNObject.getId();
        return id2 != null ? id2.equals(id3) : id3 == null;
    }

    public Object getCustom() {
        return this.custom;
    }

    public String getETag() {
        return this.eTag;
    }

    public String getId() {
        return this.id;
    }

    public String getUpdated() {
        return this.updated;
    }

    public int hashCode() {
        String id2 = getId();
        return 59 + (id2 == null ? 43 : id2.hashCode());
    }

    public PNObject setCustom(Object obj) {
        this.custom = obj;
        return this;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNObject(id=");
        P0.append(getId());
        P0.append(", custom=");
        P0.append(getCustom());
        P0.append(", updated=");
        P0.append(getUpdated());
        P0.append(", eTag=");
        P0.append(getETag());
        P0.append(")");
        return P0.toString();
    }

    public PNObject() {
    }
}
