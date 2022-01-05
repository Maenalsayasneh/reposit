package com.pubnub.api.models.consumer.access_manager.v3;

public class UUIDGrant extends PNResource<UUIDGrant> {
    private UUIDGrant() {
    }

    public static UUIDGrant id(String str) {
        UUIDGrant uUIDGrant = new UUIDGrant();
        uUIDGrant.resourceName = str;
        return uUIDGrant;
    }

    public static UUIDGrant pattern(String str) {
        UUIDGrant uUIDGrant = new UUIDGrant();
        uUIDGrant.resourcePattern = str;
        return uUIDGrant;
    }

    public UUIDGrant delete() {
        return (UUIDGrant) super.delete();
    }

    public UUIDGrant get() {
        return (UUIDGrant) super.get();
    }

    public UUIDGrant update() {
        return (UUIDGrant) super.update();
    }
}
