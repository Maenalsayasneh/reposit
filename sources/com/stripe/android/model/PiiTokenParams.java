package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.Token;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0003\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u00198V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/PiiTokenParams;", "Lcom/stripe/android/model/TokenParams;", "", "component1", "()Ljava/lang/String;", "personalId", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/PiiTokenParams;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "", "getTypeDataParams", "()Ljava/util/Map;", "typeDataParams", "<init>", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PiiTokenParams.kt */
public final class PiiTokenParams extends TokenParams {
    public static final Parcelable.Creator<PiiTokenParams> CREATOR = new Creator();
    private final String personalId;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<PiiTokenParams> {
        public final PiiTokenParams createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new PiiTokenParams(parcel.readString());
        }

        public final PiiTokenParams[] newArray(int i) {
            return new PiiTokenParams[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PiiTokenParams(String str) {
        super(Token.Type.Pii, (Set) null, 2, (f) null);
        i.e(str, "personalId");
        this.personalId = str;
    }

    private final String component1() {
        return this.personalId;
    }

    public static /* synthetic */ PiiTokenParams copy$default(PiiTokenParams piiTokenParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = piiTokenParams.personalId;
        }
        return piiTokenParams.copy(str);
    }

    public final PiiTokenParams copy(String str) {
        i.e(str, "personalId");
        return new PiiTokenParams(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PiiTokenParams) && i.a(this.personalId, ((PiiTokenParams) obj).personalId);
        }
        return true;
    }

    public Map<String, Object> getTypeDataParams() {
        return h.S2(new Pair("personal_id_number", this.personalId));
    }

    public int hashCode() {
        String str = this.personalId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return a.y0(a.P0("PiiTokenParams(personalId="), this.personalId, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.personalId);
    }
}
