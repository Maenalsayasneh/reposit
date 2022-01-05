package com.stripe.android.paymentsheet.analytics;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\t\b\u0016¢\u0006\u0004\b\u0012\u0010\u0014J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/DeviceId;", "", "", "component1", "()Ljava/lang/String;", "value", "copy", "(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/analytics/DeviceId;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "<init>", "(Ljava/lang/String;)V", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DeviceId.kt */
public final class DeviceId {
    private final String value;

    public DeviceId(String str) {
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.value = str;
    }

    public static /* synthetic */ DeviceId copy$default(DeviceId deviceId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceId.value;
        }
        return deviceId.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final DeviceId copy(String str) {
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        return new DeviceId(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DeviceId) && i.a(this.value, ((DeviceId) obj).value);
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
        return a.y0(a.P0("DeviceId(value="), this.value, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DeviceId() {
        /*
            r2 = this;
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "UUID.randomUUID().toString()"
            m0.n.b.i.d(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.analytics.DeviceId.<init>():void");
    }
}
