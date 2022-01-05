package com.stripe.android.networking;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeModel;
import i0.d.a.a.a;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0007\b\b\u0018\u0000 62\u00020\u0001:\u00016B)\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b4\u00105J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\r\u001a\u00020\nHÀ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\nHÀ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u0011\u001a\u00020\nHÀ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0005HÀ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\fJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0016\u001a\u00020\n8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b+\u0010\fR\u001c\u0010\u0018\u001a\u00020\u00058\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b-\u0010\u0013R\u001c\u0010\u0017\u001a\u00020\n8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010*\u001a\u0004\b.\u0010\fR\u001c\u0010\u0015\u001a\u00020\n8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0015\u0010*\u001a\u0004\b/\u0010\fR\u001f\u00103\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n008F@\u0006¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00067"}, d2 = {"Lcom/stripe/android/networking/FraudDetectionData;", "Lcom/stripe/android/model/StripeModel;", "Lorg/json/JSONObject;", "toJson", "()Lorg/json/JSONObject;", "", "currentTime", "", "isExpired", "(J)Z", "", "component1$payments_core_release", "()Ljava/lang/String;", "component1", "component2$payments_core_release", "component2", "component3$payments_core_release", "component3", "component4$payments_core_release", "()J", "component4", "guid", "muid", "sid", "timestamp", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/stripe/android/networking/FraudDetectionData;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMuid$payments_core_release", "J", "getTimestamp$payments_core_release", "getSid$payments_core_release", "getGuid$payments_core_release", "", "getParams", "()Ljava/util/Map;", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FraudDetectionData.kt */
public final class FraudDetectionData implements StripeModel {
    public static final Parcelable.Creator<FraudDetectionData> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    private static final String KEY_GUID = "guid";
    private static final String KEY_MUID = "muid";
    private static final String KEY_SID = "sid";
    public static final String KEY_TIMESTAMP = "timestamp";
    private static final long TTL = TimeUnit.MINUTES.toMillis(30);
    private final String guid;
    private final String muid;
    private final String sid;
    private final long timestamp;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/networking/FraudDetectionData$Companion;", "", "", "KEY_GUID", "Ljava/lang/String;", "KEY_MUID", "KEY_SID", "KEY_TIMESTAMP", "", "TTL", "J", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: FraudDetectionData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<FraudDetectionData> {
        public final FraudDetectionData createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new FraudDetectionData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        public final FraudDetectionData[] newArray(int i) {
            return new FraudDetectionData[i];
        }
    }

    public FraudDetectionData(String str, String str2, String str3, long j) {
        i.e(str, KEY_GUID);
        i.e(str2, KEY_MUID);
        i.e(str3, KEY_SID);
        this.guid = str;
        this.muid = str2;
        this.sid = str3;
        this.timestamp = j;
    }

    public static /* synthetic */ FraudDetectionData copy$default(FraudDetectionData fraudDetectionData, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fraudDetectionData.guid;
        }
        if ((i & 2) != 0) {
            str2 = fraudDetectionData.muid;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = fraudDetectionData.sid;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = fraudDetectionData.timestamp;
        }
        return fraudDetectionData.copy(str, str4, str5, j);
    }

    public final String component1$payments_core_release() {
        return this.guid;
    }

    public final String component2$payments_core_release() {
        return this.muid;
    }

    public final String component3$payments_core_release() {
        return this.sid;
    }

    public final long component4$payments_core_release() {
        return this.timestamp;
    }

    public final FraudDetectionData copy(String str, String str2, String str3, long j) {
        i.e(str, KEY_GUID);
        i.e(str2, KEY_MUID);
        i.e(str3, KEY_SID);
        return new FraudDetectionData(str, str2, str3, j);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FraudDetectionData)) {
            return false;
        }
        FraudDetectionData fraudDetectionData = (FraudDetectionData) obj;
        return i.a(this.guid, fraudDetectionData.guid) && i.a(this.muid, fraudDetectionData.muid) && i.a(this.sid, fraudDetectionData.sid) && this.timestamp == fraudDetectionData.timestamp;
    }

    public final String getGuid$payments_core_release() {
        return this.guid;
    }

    public final String getMuid$payments_core_release() {
        return this.muid;
    }

    public final Map<String, String> getParams() {
        return g.N(new Pair(KEY_GUID, this.guid), new Pair(KEY_MUID, this.muid), new Pair(KEY_SID, this.sid));
    }

    public final String getSid$payments_core_release() {
        return this.sid;
    }

    public final long getTimestamp$payments_core_release() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.guid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.muid;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.sid;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return Long.hashCode(this.timestamp) + ((hashCode2 + i) * 31);
    }

    public final boolean isExpired(long j) {
        return j - this.timestamp > TTL;
    }

    public final JSONObject toJson() {
        JSONObject put = new JSONObject().put(KEY_GUID, (Object) this.guid).put(KEY_MUID, (Object) this.muid).put(KEY_SID, (Object) this.sid).put("timestamp", this.timestamp);
        i.d(put, "JSONObject()\n           …KEY_TIMESTAMP, timestamp)");
        return put;
    }

    public String toString() {
        StringBuilder P0 = a.P0("FraudDetectionData(guid=");
        P0.append(this.guid);
        P0.append(", muid=");
        P0.append(this.muid);
        P0.append(", sid=");
        P0.append(this.sid);
        P0.append(", timestamp=");
        P0.append(this.timestamp);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.guid);
        parcel.writeString(this.muid);
        parcel.writeString(this.sid);
        parcel.writeLong(this.timestamp);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FraudDetectionData(String str, String str2, String str3, long j, int i, f fVar) {
        this(str, str2, str3, (i & 8) != 0 ? 0 : j);
    }
}
