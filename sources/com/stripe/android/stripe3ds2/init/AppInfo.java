package com.stripe.android.stripe3ds2.init;

import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0004J\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/AppInfo;", "", "", "component1", "()Ljava/lang/String;", "", "component2", "()I", "sdkAppId", "version", "copy", "(Ljava/lang/String;I)Lcom/stripe/android/stripe3ds2/init/AppInfo;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSdkAppId", "I", "getVersion", "<init>", "(Ljava/lang/String;I)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AppInfo.kt */
public final class AppInfo {
    private final String sdkAppId;
    private final int version;

    public AppInfo(String str, int i) {
        i.e(str, "sdkAppId");
        this.sdkAppId = str;
        this.version = i;
    }

    public static /* synthetic */ AppInfo copy$default(AppInfo appInfo, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = appInfo.sdkAppId;
        }
        if ((i2 & 2) != 0) {
            i = appInfo.version;
        }
        return appInfo.copy(str, i);
    }

    public final String component1() {
        return this.sdkAppId;
    }

    public final int component2() {
        return this.version;
    }

    public final AppInfo copy(String str, int i) {
        i.e(str, "sdkAppId");
        return new AppInfo(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppInfo)) {
            return false;
        }
        AppInfo appInfo = (AppInfo) obj;
        return i.a(this.sdkAppId, appInfo.sdkAppId) && this.version == appInfo.version;
    }

    public final String getSdkAppId() {
        return this.sdkAppId;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.sdkAppId;
        return Integer.hashCode(this.version) + ((str != null ? str.hashCode() : 0) * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("AppInfo(sdkAppId=");
        P0.append(this.sdkAppId);
        P0.append(", version=");
        return a.u0(P0, this.version, ")");
    }
}
