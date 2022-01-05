package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.d.a.a.a;
import i0.h.a.b.a.a.d.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new d();
    public Uri Y1;
    public String Z1;
    public long a2;
    public String b2;
    public final int c;
    public List<Scope> c2;
    public String d;
    public String d2;
    public String e2;
    public Set<Scope> f2 = new HashSet();
    public String q;
    public String x;
    public String y;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.c = i;
        this.d = str;
        this.q = str2;
        this.x = str3;
        this.y = str4;
        this.Y1 = uri;
        this.Z1 = str5;
        this.a2 = j;
        this.b2 = str6;
        this.c2 = list;
        this.d2 = str7;
        this.e2 = str8;
    }

    @RecentlyNullable
    public static GoogleSignInAccount J0(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (valueOf == null) {
            valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        }
        long longValue = valueOf.longValue();
        v.x(string);
        GoogleSignInAccount googleSignInAccount = r3;
        GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, (String) null, longValue, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.Z1 = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public Set<Scope> I0() {
        HashSet hashSet = new HashSet(this.c2);
        hashSet.addAll(this.f2);
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.b2.equals(this.b2) && googleSignInAccount.I0().equals(I0());
    }

    public int hashCode() {
        return I0().hashCode() + a.F(this.b2, 527, 31);
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        int i2 = this.c;
        v.J2(parcel, 1, 4);
        parcel.writeInt(i2);
        v.B2(parcel, 2, this.d, false);
        v.B2(parcel, 3, this.q, false);
        v.B2(parcel, 4, this.x, false);
        v.B2(parcel, 5, this.y, false);
        v.A2(parcel, 6, this.Y1, i, false);
        v.B2(parcel, 7, this.Z1, false);
        long j = this.a2;
        v.J2(parcel, 8, 8);
        parcel.writeLong(j);
        v.B2(parcel, 9, this.b2, false);
        v.F2(parcel, 10, this.c2, false);
        v.B2(parcel, 11, this.d2, false);
        v.B2(parcel, 12, this.e2, false);
        v.L2(parcel, G2);
    }
}
