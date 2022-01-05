package com.stripe.android.paymentsheet.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bB\t\b\u0010¢\u0006\u0004\b\u001a\u0010\u001cJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/SessionId;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "value", "copy", "(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/analytics/SessionId;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "<init>", "(Ljava/lang/String;)V", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: SessionId.kt */
public final class SessionId implements Parcelable {
    public static final Parcelable.Creator<SessionId> CREATOR = new Creator();
    private final String value;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<SessionId> {
        public final SessionId createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new SessionId(parcel.readString());
        }

        public final SessionId[] newArray(int i) {
            return new SessionId[i];
        }
    }

    public SessionId(String str) {
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.value = str;
    }

    public static /* synthetic */ SessionId copy$default(SessionId sessionId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionId.value;
        }
        return sessionId.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final SessionId copy(String str) {
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        return new SessionId(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SessionId) && i.a(this.value, ((SessionId) obj).value);
        }
        return true;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return a.y0(a.P0("SessionId(value="), this.value, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.value);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SessionId() {
        /*
            r2 = this;
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "UUID.randomUUID().toString()"
            m0.n.b.i.d(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.analytics.SessionId.<init>():void");
    }
}
