package com.pubnub.api.models.consumer.objects_api.uuid;

import com.pubnub.api.models.consumer.objects_api.PNObject;
import i0.d.a.a.a;

public class PNUUIDMetadata extends PNObject {
    private String email;
    private String externalId;
    private String name;
    private String profileUrl;

    public PNUUIDMetadata() {
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNUUIDMetadata;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNUUIDMetadata)) {
            return false;
        }
        PNUUIDMetadata pNUUIDMetadata = (PNUUIDMetadata) obj;
        if (!pNUUIDMetadata.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String name2 = getName();
        String name3 = pNUUIDMetadata.getName();
        if (name2 != null ? !name2.equals(name3) : name3 != null) {
            return false;
        }
        String email2 = getEmail();
        String email3 = pNUUIDMetadata.getEmail();
        if (email2 != null ? !email2.equals(email3) : email3 != null) {
            return false;
        }
        String externalId2 = getExternalId();
        String externalId3 = pNUUIDMetadata.getExternalId();
        if (externalId2 != null ? !externalId2.equals(externalId3) : externalId3 != null) {
            return false;
        }
        String profileUrl2 = getProfileUrl();
        String profileUrl3 = pNUUIDMetadata.getProfileUrl();
        return profileUrl2 != null ? profileUrl2.equals(profileUrl3) : profileUrl3 == null;
    }

    public String getEmail() {
        return this.email;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public String getName() {
        return this.name;
    }

    public String getProfileUrl() {
        return this.profileUrl;
    }

    public int hashCode() {
        int hashCode = super.hashCode();
        String name2 = getName();
        int i = 43;
        int hashCode2 = (hashCode * 59) + (name2 == null ? 43 : name2.hashCode());
        String email2 = getEmail();
        int hashCode3 = (hashCode2 * 59) + (email2 == null ? 43 : email2.hashCode());
        String externalId2 = getExternalId();
        int hashCode4 = (hashCode3 * 59) + (externalId2 == null ? 43 : externalId2.hashCode());
        String profileUrl2 = getProfileUrl();
        int i2 = hashCode4 * 59;
        if (profileUrl2 != null) {
            i = profileUrl2.hashCode();
        }
        return i2 + i;
    }

    public PNUUIDMetadata setEmail(String str) {
        this.email = str;
        return this;
    }

    public PNUUIDMetadata setExternalId(String str) {
        this.externalId = str;
        return this;
    }

    public PNUUIDMetadata setName(String str) {
        this.name = str;
        return this;
    }

    public PNUUIDMetadata setProfileUrl(String str) {
        this.profileUrl = str;
        return this;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNUUIDMetadata(super=");
        P0.append(super.toString());
        P0.append(", name=");
        P0.append(getName());
        P0.append(", email=");
        P0.append(getEmail());
        P0.append(", externalId=");
        P0.append(getExternalId());
        P0.append(", profileUrl=");
        P0.append(getProfileUrl());
        P0.append(")");
        return P0.toString();
    }

    public PNUUIDMetadata(String str, String str2) {
        super(str);
        this.name = str2;
    }

    public PNUUIDMetadata setCustom(Object obj) {
        super.setCustom(obj);
        return this;
    }
}
