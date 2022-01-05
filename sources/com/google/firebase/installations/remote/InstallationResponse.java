package com.google.firebase.installations.remote;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class InstallationResponse {

    public enum ResponseCode {
        OK,
        BAD_CONFIG
    }

    public abstract TokenResult a();

    public abstract String b();

    public abstract String c();

    public abstract ResponseCode d();

    public abstract String e();
}
