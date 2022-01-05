package com.pubnub.api.managers.token_manager;

public class TokenManager {
    private volatile String token = null;

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
