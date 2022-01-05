package com.pubnub.api.models.consumer.objects_api.membership;

import com.google.gson.annotations.JsonAdapter;
import com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata;
import com.pubnub.api.models.consumer.objects_api.util.CustomPayloadJsonInterceptor;
import com.pubnub.api.utils.UnwrapSingleField;
import i0.d.a.a.a;
import java.util.Objects;
import lombok.NonNull;

public class PNMembership {
    @NonNull
    private PNChannelMetadata channel;
    @JsonAdapter(CustomPayloadJsonInterceptor.class)
    public Object custom;
    public String eTag;
    public String updated;
    @JsonAdapter(UnwrapSingleField.class)
    public String uuid;

    public PNMembership(@NonNull PNChannelMetadata pNChannelMetadata) {
        Objects.requireNonNull(pNChannelMetadata, "channel is marked @NonNull but is null");
        this.channel = pNChannelMetadata;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNMembership;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNMembership)) {
            return false;
        }
        PNMembership pNMembership = (PNMembership) obj;
        if (!pNMembership.canEqual(this)) {
            return false;
        }
        PNChannelMetadata channel2 = getChannel();
        PNChannelMetadata channel3 = pNMembership.getChannel();
        if (channel2 != null ? !channel2.equals(channel3) : channel3 != null) {
            return false;
        }
        Object custom2 = getCustom();
        Object custom3 = pNMembership.getCustom();
        if (custom2 != null ? !custom2.equals(custom3) : custom3 != null) {
            return false;
        }
        String uuid2 = getUuid();
        String uuid3 = pNMembership.getUuid();
        if (uuid2 != null ? !uuid2.equals(uuid3) : uuid3 != null) {
            return false;
        }
        String updated2 = getUpdated();
        String updated3 = pNMembership.getUpdated();
        if (updated2 != null ? !updated2.equals(updated3) : updated3 != null) {
            return false;
        }
        String eTag2 = getETag();
        String eTag3 = pNMembership.getETag();
        return eTag2 != null ? eTag2.equals(eTag3) : eTag3 == null;
    }

    @NonNull
    public PNChannelMetadata getChannel() {
        return this.channel;
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

    public String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        PNChannelMetadata channel2 = getChannel();
        int i = 43;
        int hashCode = channel2 == null ? 43 : channel2.hashCode();
        Object custom2 = getCustom();
        int hashCode2 = ((hashCode + 59) * 59) + (custom2 == null ? 43 : custom2.hashCode());
        String uuid2 = getUuid();
        int hashCode3 = (hashCode2 * 59) + (uuid2 == null ? 43 : uuid2.hashCode());
        String updated2 = getUpdated();
        int hashCode4 = (hashCode3 * 59) + (updated2 == null ? 43 : updated2.hashCode());
        String eTag2 = getETag();
        int i2 = hashCode4 * 59;
        if (eTag2 != null) {
            i = eTag2.hashCode();
        }
        return i2 + i;
    }

    public PNMembership setChannel(@NonNull PNChannelMetadata pNChannelMetadata) {
        Objects.requireNonNull(pNChannelMetadata, "channel is marked @NonNull but is null");
        this.channel = pNChannelMetadata;
        return this;
    }

    public PNMembership setCustom(Object obj) {
        this.custom = obj;
        return this;
    }

    public PNMembership setETag(String str) {
        this.eTag = str;
        return this;
    }

    public PNMembership setUpdated(String str) {
        this.updated = str;
        return this;
    }

    public PNMembership setUuid(String str) {
        this.uuid = str;
        return this;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNMembership(channel=");
        P0.append(getChannel());
        P0.append(", custom=");
        P0.append(getCustom());
        P0.append(", uuid=");
        P0.append(getUuid());
        P0.append(", updated=");
        P0.append(getUpdated());
        P0.append(", eTag=");
        P0.append(getETag());
        P0.append(")");
        return P0.toString();
    }
}
