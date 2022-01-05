package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.a.a.d.e;
import i0.h.a.b.a.a.d.f;
import i0.h.a.b.c.g.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public class GoogleSignInOptions extends AbstractSafeParcelable implements a.d, ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new f();
    public static Comparator<Scope> Y1 = new e();
    @RecentlyNonNull
    public static final Scope c;
    @RecentlyNonNull
    public static final Scope d;
    @RecentlyNonNull
    public static final Scope q;
    @RecentlyNonNull
    public static final Scope x;
    @RecentlyNonNull
    public static final GoogleSignInOptions y;
    public final int Z1;
    public final ArrayList<Scope> a2;
    public Account b2;
    public boolean c2;
    public final boolean d2;
    public final boolean e2;
    public String f2;
    public String g2;
    public ArrayList<GoogleSignInOptionsExtensionParcelable> h2;
    public String i2;
    public Map<Integer, GoogleSignInOptionsExtensionParcelable> j2;

    static {
        Scope scope = new Scope("profile");
        c = scope;
        new Scope("email");
        Scope scope2 = new Scope("openid");
        d = scope2;
        Scope scope3 = new Scope("https://www.googleapis.com/auth/games_lite");
        q = scope3;
        Scope scope4 = new Scope("https://www.googleapis.com/auth/games");
        x = scope4;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(scope4) && hashSet.contains(scope3)) {
            hashSet.remove(scope3);
        }
        y = new GoogleSignInOptions(3, new ArrayList(hashSet), (Account) null, false, false, false, (String) null, (String) null, hashMap, (String) null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(scope4) && hashSet2.contains(scope3)) {
            hashSet2.remove(scope3);
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), (Account) null, false, false, false, (String) null, (String) null, hashMap2, (String) null);
    }

    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, String str3) {
        this.Z1 = i;
        this.a2 = arrayList;
        this.b2 = account;
        this.c2 = z;
        this.d2 = z2;
        this.e2 = z3;
        this.f2 = str;
        this.g2 = str2;
        this.h2 = new ArrayList<>(map.values());
        this.j2 = map;
        this.i2 = str3;
    }

    @RecentlyNullable
    public static GoogleSignInOptions J0(String str) throws JSONException {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        Account account = !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null;
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        String optString2 = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;
        if (jSONObject.has("hostedDomain")) {
            str2 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z, z2, z3, optString2, str2, new HashMap(), (String) null);
    }

    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> K0(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable next : list) {
            hashMap.put(Integer.valueOf(next.d), next);
        }
        return hashMap;
    }

    @RecentlyNonNull
    public ArrayList<Scope> I0() {
        return new ArrayList<>(this.a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r1.equals(r4.b2) != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        if (r3.f2.equals(r4.f2) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x007e }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.h2     // Catch:{ ClassCastException -> 0x007e }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x007e }
            if (r1 > 0) goto L_0x007e
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.h2     // Catch:{ ClassCastException -> 0x007e }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x007e }
            if (r1 <= 0) goto L_0x0017
            goto L_0x007e
        L_0x0017:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.a2     // Catch:{ ClassCastException -> 0x007e }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x007e }
            java.util.ArrayList r2 = r4.I0()     // Catch:{ ClassCastException -> 0x007e }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x007e }
            if (r1 != r2) goto L_0x007e
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.a2     // Catch:{ ClassCastException -> 0x007e }
            java.util.ArrayList r2 = r4.I0()     // Catch:{ ClassCastException -> 0x007e }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x007e }
            if (r1 != 0) goto L_0x0034
            goto L_0x007e
        L_0x0034:
            android.accounts.Account r1 = r3.b2     // Catch:{ ClassCastException -> 0x007e }
            if (r1 != 0) goto L_0x003d
            android.accounts.Account r1 = r4.b2     // Catch:{ ClassCastException -> 0x007e }
            if (r1 != 0) goto L_0x007e
            goto L_0x0045
        L_0x003d:
            android.accounts.Account r2 = r4.b2     // Catch:{ ClassCastException -> 0x007e }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x007e }
            if (r1 == 0) goto L_0x007e
        L_0x0045:
            java.lang.String r1 = r3.f2     // Catch:{ ClassCastException -> 0x007e }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x007e }
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r4.f2     // Catch:{ ClassCastException -> 0x007e }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x007e }
            if (r1 == 0) goto L_0x007e
            goto L_0x0060
        L_0x0056:
            java.lang.String r1 = r3.f2     // Catch:{ ClassCastException -> 0x007e }
            java.lang.String r2 = r4.f2     // Catch:{ ClassCastException -> 0x007e }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x007e }
            if (r1 == 0) goto L_0x007e
        L_0x0060:
            boolean r1 = r3.e2     // Catch:{ ClassCastException -> 0x007e }
            boolean r2 = r4.e2     // Catch:{ ClassCastException -> 0x007e }
            if (r1 != r2) goto L_0x007e
            boolean r1 = r3.c2     // Catch:{ ClassCastException -> 0x007e }
            boolean r2 = r4.c2     // Catch:{ ClassCastException -> 0x007e }
            if (r1 != r2) goto L_0x007e
            boolean r1 = r3.d2     // Catch:{ ClassCastException -> 0x007e }
            boolean r2 = r4.d2     // Catch:{ ClassCastException -> 0x007e }
            if (r1 != r2) goto L_0x007e
            java.lang.String r1 = r3.i2     // Catch:{ ClassCastException -> 0x007e }
            java.lang.String r4 = r4.i2     // Catch:{ ClassCastException -> 0x007e }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x007e }
            if (r4 == 0) goto L_0x007e
            r4 = 1
            return r4
        L_0x007e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int i3;
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.a2;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Scope scope = arrayList2.get(i5);
            i5++;
            arrayList.add(scope.d);
        }
        Collections.sort(arrayList);
        Account account = this.b2;
        int hashCode = (arrayList.hashCode() + 31) * 31;
        if (account == null) {
            i = 0;
        } else {
            i = account.hashCode();
        }
        int i6 = hashCode + i;
        String str = this.f2;
        int i7 = i6 * 31;
        if (str == null) {
            i3 = 0;
        } else {
            i3 = str.hashCode();
        }
        int i8 = ((((((i7 + i3) * 31) + (this.e2 ? 1 : 0)) * 31) + (this.c2 ? 1 : 0)) * 31) + (this.d2 ? 1 : 0);
        String str2 = this.i2;
        int i9 = i8 * 31;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i9 + i4;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        int i3 = this.Z1;
        v.J2(parcel, 1, 4);
        parcel.writeInt(i3);
        v.F2(parcel, 2, I0(), false);
        v.A2(parcel, 3, this.b2, i, false);
        boolean z = this.c2;
        v.J2(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.d2;
        v.J2(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.e2;
        v.J2(parcel, 6, 4);
        parcel.writeInt(z3 ? 1 : 0);
        v.B2(parcel, 7, this.f2, false);
        v.B2(parcel, 8, this.g2, false);
        v.F2(parcel, 9, this.h2, false);
        v.B2(parcel, 10, this.i2, false);
        v.L2(parcel, G2);
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
    public static final class a {
        public Set<Scope> a = new HashSet();
        public boolean b;
        public boolean c;
        public boolean d;
        public String e;
        public Account f;
        public String g;
        public Map<Integer, GoogleSignInOptionsExtensionParcelable> h = new HashMap();
        public String i;

        public a() {
        }

        @RecentlyNonNull
        public final GoogleSignInOptions a() {
            if (this.a.contains(GoogleSignInOptions.x)) {
                Set<Scope> set = this.a;
                Scope scope = GoogleSignInOptions.q;
                if (set.contains(scope)) {
                    this.a.remove(scope);
                }
            }
            if (this.d && (this.f == null || !this.a.isEmpty())) {
                this.a.add(GoogleSignInOptions.d);
            }
            return new GoogleSignInOptions(3, new ArrayList(this.a), this.f, this.d, this.b, this.c, this.e, this.g, this.h, this.i);
        }

        public a(@RecentlyNonNull GoogleSignInOptions googleSignInOptions) {
            this.a = new HashSet(googleSignInOptions.a2);
            this.b = googleSignInOptions.d2;
            this.c = googleSignInOptions.e2;
            this.d = googleSignInOptions.c2;
            this.e = googleSignInOptions.f2;
            this.f = googleSignInOptions.b2;
            this.g = googleSignInOptions.g2;
            this.h = GoogleSignInOptions.K0(googleSignInOptions.h2);
            this.i = googleSignInOptions.i2;
        }
    }
}
