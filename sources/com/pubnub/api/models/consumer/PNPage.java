package com.pubnub.api.models.consumer;

public abstract class PNPage {
    public final String hash;

    public static class Next extends PNPage {
        public Next(String str) {
            super(str);
        }
    }

    public static class Previous extends PNPage {
        public Previous(String str) {
            super(str);
        }
    }

    public PNPage(String str) {
        this.hash = str;
    }

    public static Next next(String str) {
        return new Next(str);
    }

    public static Previous previous(String str) {
        return new Previous(str);
    }

    public String getHash() {
        return this.hash;
    }
}
