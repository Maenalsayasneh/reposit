package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeModel;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001BI\b\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b;\u0010<J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÀ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006HÀ\u0003¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\r\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\f\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u000eHÀ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0012\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0015\u0010\u0004J`\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0004J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b)\u0010$J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b.\u0010/R\u0019\u0010\u001d\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u00100\u001a\u0004\b1\u0010\u0004R\u001c\u0010\u0019\u001a\u00020\u00068\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u00102\u001a\u0004\b3\u0010\bR\u001c\u0010\u001a\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\b4\u0010\u0004R\u001c\u0010\u001c\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001c\u00100\u001a\u0004\b5\u0010\u0004R\u001c\u0010\u001e\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001e\u00100\u001a\u0004\b6\u0010\u0004R\u001c\u0010\u001b\u001a\u00020\u000e8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u00107\u001a\u0004\b8\u0010\u0010R\u001c\u0010\u0017\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u00100\u001a\u0004\b9\u0010\u0004R\u001c\u0010\u0018\u001a\u00020\u00068\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u00102\u001a\u0004\b:\u0010\b¨\u0006="}, d2 = {"Lcom/stripe/android/EphemeralKey;", "Lcom/stripe/android/model/StripeModel;", "", "component1$payments_core_release", "()Ljava/lang/String;", "component1", "", "component2$payments_core_release", "()J", "component2", "component3$payments_core_release", "component3", "component4$payments_core_release", "component4", "", "component5$payments_core_release", "()Z", "component5", "component6$payments_core_release", "component6", "component7", "component8$payments_core_release", "component8", "objectId", "created", "expires", "id", "isLiveMode", "objectType", "secret", "type", "copy", "(Ljava/lang/String;JJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/EphemeralKey;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSecret", "J", "getExpires$payments_core_release", "getId$payments_core_release", "getObjectType$payments_core_release", "getType$payments_core_release", "Z", "isLiveMode$payments_core_release", "getObjectId$payments_core_release", "getCreated$payments_core_release", "<init>", "(Ljava/lang/String;JJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: EphemeralKey.kt */
public final class EphemeralKey implements StripeModel {
    public static final Parcelable.Creator<EphemeralKey> CREATOR = new Creator();
    private final long created;
    private final long expires;
    private final String id;
    private final boolean isLiveMode;
    private final String objectId;
    private final String objectType;
    private final String secret;
    private final String type;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<EphemeralKey> {
        public final EphemeralKey createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new EphemeralKey(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final EphemeralKey[] newArray(int i) {
            return new EphemeralKey[i];
        }
    }

    public EphemeralKey(String str, long j, long j2, String str2, boolean z, String str3, String str4, String str5) {
        i.e(str, "objectId");
        i.e(str2, "id");
        i.e(str3, "objectType");
        i.e(str4, "secret");
        i.e(str5, "type");
        this.objectId = str;
        this.created = j;
        this.expires = j2;
        this.id = str2;
        this.isLiveMode = z;
        this.objectType = str3;
        this.secret = str4;
        this.type = str5;
    }

    public static /* synthetic */ EphemeralKey copy$default(EphemeralKey ephemeralKey, String str, long j, long j2, String str2, boolean z, String str3, String str4, String str5, int i, Object obj) {
        EphemeralKey ephemeralKey2 = ephemeralKey;
        int i2 = i;
        return ephemeralKey.copy((i2 & 1) != 0 ? ephemeralKey2.objectId : str, (i2 & 2) != 0 ? ephemeralKey2.created : j, (i2 & 4) != 0 ? ephemeralKey2.expires : j2, (i2 & 8) != 0 ? ephemeralKey2.id : str2, (i2 & 16) != 0 ? ephemeralKey2.isLiveMode : z, (i2 & 32) != 0 ? ephemeralKey2.objectType : str3, (i2 & 64) != 0 ? ephemeralKey2.secret : str4, (i2 & 128) != 0 ? ephemeralKey2.type : str5);
    }

    public final String component1$payments_core_release() {
        return this.objectId;
    }

    public final long component2$payments_core_release() {
        return this.created;
    }

    public final long component3$payments_core_release() {
        return this.expires;
    }

    public final String component4$payments_core_release() {
        return this.id;
    }

    public final boolean component5$payments_core_release() {
        return this.isLiveMode;
    }

    public final String component6$payments_core_release() {
        return this.objectType;
    }

    public final String component7() {
        return this.secret;
    }

    public final String component8$payments_core_release() {
        return this.type;
    }

    public final EphemeralKey copy(String str, long j, long j2, String str2, boolean z, String str3, String str4, String str5) {
        i.e(str, "objectId");
        String str6 = str2;
        i.e(str6, "id");
        String str7 = str3;
        i.e(str7, "objectType");
        String str8 = str4;
        i.e(str8, "secret");
        String str9 = str5;
        i.e(str9, "type");
        return new EphemeralKey(str, j, j2, str6, z, str7, str8, str9);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EphemeralKey)) {
            return false;
        }
        EphemeralKey ephemeralKey = (EphemeralKey) obj;
        return i.a(this.objectId, ephemeralKey.objectId) && this.created == ephemeralKey.created && this.expires == ephemeralKey.expires && i.a(this.id, ephemeralKey.id) && this.isLiveMode == ephemeralKey.isLiveMode && i.a(this.objectType, ephemeralKey.objectType) && i.a(this.secret, ephemeralKey.secret) && i.a(this.type, ephemeralKey.type);
    }

    public final long getCreated$payments_core_release() {
        return this.created;
    }

    public final long getExpires$payments_core_release() {
        return this.expires;
    }

    public final String getId$payments_core_release() {
        return this.id;
    }

    public final String getObjectId$payments_core_release() {
        return this.objectId;
    }

    public final String getObjectType$payments_core_release() {
        return this.objectType;
    }

    public final String getSecret() {
        return this.secret;
    }

    public final String getType$payments_core_release() {
        return this.type;
    }

    public int hashCode() {
        String str = this.objectId;
        int i = 0;
        int hashCode = (Long.hashCode(this.expires) + ((Long.hashCode(this.created) + ((str != null ? str.hashCode() : 0) * 31)) * 31)) * 31;
        String str2 = this.id;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isLiveMode;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str3 = this.objectType;
        int hashCode3 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.secret;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.type;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final boolean isLiveMode$payments_core_release() {
        return this.isLiveMode;
    }

    public String toString() {
        StringBuilder P0 = a.P0("EphemeralKey(objectId=");
        P0.append(this.objectId);
        P0.append(", created=");
        P0.append(this.created);
        P0.append(", expires=");
        P0.append(this.expires);
        P0.append(", id=");
        P0.append(this.id);
        P0.append(", isLiveMode=");
        P0.append(this.isLiveMode);
        P0.append(", objectType=");
        P0.append(this.objectType);
        P0.append(", secret=");
        P0.append(this.secret);
        P0.append(", type=");
        return a.y0(P0, this.type, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.objectId);
        parcel.writeLong(this.created);
        parcel.writeLong(this.expires);
        parcel.writeString(this.id);
        parcel.writeInt(this.isLiveMode ? 1 : 0);
        parcel.writeString(this.objectType);
        parcel.writeString(this.secret);
        parcel.writeString(this.type);
    }
}
