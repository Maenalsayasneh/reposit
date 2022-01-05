package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u0000 '2\u00020\u0001:\u0001'B/\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0003\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0004J)\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n0\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010$R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$¨\u0006("}, d2 = {"Lcom/stripe/android/AppInfo;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "toUserAgent$payments_core_release", "toUserAgent", "", "createClientHeaders$payments_core_release", "()Ljava/util/Map;", "createClientHeaders", "name", "version", "url", "partnerId", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/AppInfo;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AppInfo.kt */
public final class AppInfo implements Parcelable {
    public static final Parcelable.Creator<AppInfo> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    private final String name;
    private final String partnerId;
    private final String url;
    private final String version;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/AppInfo$Companion;", "", "", "name", "version", "url", "partnerId", "Lcom/stripe/android/AppInfo;", "create", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/AppInfo;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AppInfo.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ AppInfo create$default(Companion companion, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            return companion.create(str, str2, str3, str4);
        }

        public final AppInfo create(String str) {
            return create$default(this, str, (String) null, (String) null, (String) null, 14, (Object) null);
        }

        public final AppInfo create(String str, String str2) {
            return create$default(this, str, str2, (String) null, (String) null, 12, (Object) null);
        }

        public final AppInfo create(String str, String str2, String str3) {
            return create$default(this, str, str2, str3, (String) null, 8, (Object) null);
        }

        public final AppInfo create(String str, String str2, String str3, String str4) {
            i.e(str, "name");
            return new AppInfo(str, str2, str3, str4);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<AppInfo> {
        public final AppInfo createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new AppInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final AppInfo[] newArray(int i) {
            return new AppInfo[i];
        }
    }

    public AppInfo(String str, String str2, String str3, String str4) {
        i.e(str, "name");
        this.name = str;
        this.version = str2;
        this.url = str3;
        this.partnerId = str4;
    }

    private final String component1() {
        return this.name;
    }

    private final String component2() {
        return this.version;
    }

    private final String component3() {
        return this.url;
    }

    private final String component4() {
        return this.partnerId;
    }

    public static /* synthetic */ AppInfo copy$default(AppInfo appInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = appInfo.version;
        }
        if ((i & 4) != 0) {
            str3 = appInfo.url;
        }
        if ((i & 8) != 0) {
            str4 = appInfo.partnerId;
        }
        return appInfo.copy(str, str2, str3, str4);
    }

    public static final AppInfo create(String str) {
        return Companion.create$default(Companion, str, (String) null, (String) null, (String) null, 14, (Object) null);
    }

    public static final AppInfo create(String str, String str2) {
        return Companion.create$default(Companion, str, str2, (String) null, (String) null, 12, (Object) null);
    }

    public static final AppInfo create(String str, String str2, String str3) {
        return Companion.create$default(Companion, str, str2, str3, (String) null, 8, (Object) null);
    }

    public static final AppInfo create(String str, String str2, String str3, String str4) {
        return Companion.create(str, str2, str3, str4);
    }

    public final AppInfo copy(String str, String str2, String str3, String str4) {
        i.e(str, "name");
        return new AppInfo(str, str2, str3, str4);
    }

    public final Map<String, Map<String, String>> createClientHeaders$payments_core_release() {
        return h.S2(new Pair("application", g.N(new Pair("name", this.name), new Pair("version", this.version), new Pair("url", this.url), new Pair("partner_id", this.partnerId))));
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppInfo)) {
            return false;
        }
        AppInfo appInfo = (AppInfo) obj;
        return i.a(this.name, appInfo.name) && i.a(this.version, appInfo.version) && i.a(this.url, appInfo.url) && i.a(this.partnerId, appInfo.partnerId);
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.version;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.url;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.partnerId;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("AppInfo(name=");
        P0.append(this.name);
        P0.append(", version=");
        P0.append(this.version);
        P0.append(", url=");
        P0.append(this.url);
        P0.append(", partnerId=");
        return a.y0(P0, this.partnerId, ")");
    }

    public final String toUserAgent$payments_core_release() {
        String str;
        String[] strArr = new String[3];
        strArr[0] = this.name;
        String str2 = this.version;
        String str3 = null;
        if (str2 != null) {
            str = '/' + str2;
        } else {
            str = null;
        }
        strArr[1] = str;
        String str4 = this.url;
        if (str4 != null) {
            str3 = " (" + str4 + ')';
        }
        strArr[2] = str3;
        return g.E(g.M(strArr), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.name);
        parcel.writeString(this.version);
        parcel.writeString(this.url);
        parcel.writeString(this.partnerId);
    }
}
