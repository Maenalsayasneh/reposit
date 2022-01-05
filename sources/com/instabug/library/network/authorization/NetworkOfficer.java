package com.instabug.library.network.authorization;

public class NetworkOfficer {
    public static final /* synthetic */ int a = 0;

    static {
        try {
            System.loadLibrary("ibg-native");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static native String getAppSecret();

    public static native String getClientId();
}
