package com.pubnub.api.models.consumer.objects_api.channel;

import com.pubnub.api.models.consumer.objects_api.PNObject;
import i0.d.a.a.a;

public class PNChannelMetadata extends PNObject {
    private String description;
    private String name;

    public PNChannelMetadata(String str, String str2, String str3) {
        super(str);
        this.name = str2;
        this.description = str3;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNChannelMetadata;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNChannelMetadata)) {
            return false;
        }
        PNChannelMetadata pNChannelMetadata = (PNChannelMetadata) obj;
        if (!pNChannelMetadata.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String name2 = getName();
        String name3 = pNChannelMetadata.getName();
        if (name2 != null ? !name2.equals(name3) : name3 != null) {
            return false;
        }
        String description2 = getDescription();
        String description3 = pNChannelMetadata.getDescription();
        return description2 != null ? description2.equals(description3) : description3 == null;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = super.hashCode();
        String name2 = getName();
        int i = 43;
        int hashCode2 = (hashCode * 59) + (name2 == null ? 43 : name2.hashCode());
        String description2 = getDescription();
        int i2 = hashCode2 * 59;
        if (description2 != null) {
            i = description2.hashCode();
        }
        return i2 + i;
    }

    public PNChannelMetadata setDescription(String str) {
        this.description = str;
        return this;
    }

    public PNChannelMetadata setName(String str) {
        this.name = str;
        return this;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNChannelMetadata(super=");
        P0.append(super.toString());
        P0.append(", name=");
        P0.append(getName());
        P0.append(", description=");
        P0.append(getDescription());
        P0.append(")");
        return P0.toString();
    }

    public PNChannelMetadata setCustom(Object obj) {
        super.setCustom(obj);
        return this;
    }

    public PNChannelMetadata(String str, String str2) {
        this(str, str2, (String) null);
    }
}
