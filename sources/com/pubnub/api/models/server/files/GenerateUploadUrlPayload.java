package com.pubnub.api.models.server.files;

import i0.d.a.a.a;

public class GenerateUploadUrlPayload {
    private final String name;

    public GenerateUploadUrlPayload(String str) {
        this.name = str;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof GenerateUploadUrlPayload;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GenerateUploadUrlPayload)) {
            return false;
        }
        GenerateUploadUrlPayload generateUploadUrlPayload = (GenerateUploadUrlPayload) obj;
        if (!generateUploadUrlPayload.canEqual(this)) {
            return false;
        }
        String name2 = getName();
        String name3 = generateUploadUrlPayload.getName();
        return name2 != null ? name2.equals(name3) : name3 == null;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        String name2 = getName();
        return 59 + (name2 == null ? 43 : name2.hashCode());
    }

    public String toString() {
        StringBuilder P0 = a.P0("GenerateUploadUrlPayload(name=");
        P0.append(getName());
        P0.append(")");
        return P0.toString();
    }
}
