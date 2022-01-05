package i0.h.a.b.a.a.d.b;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import i0.h.a.b.a.a.d.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public class a {
    public static final Lock a = new ReentrantLock();
    public static a b;
    public final Lock c = new ReentrantLock();
    public final SharedPreferences d;

    public a(Context context) {
        this.d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull Context context) {
        Objects.requireNonNull(context, "null reference");
        Lock lock = a;
        lock.lock();
        try {
            if (b == null) {
                b = new a(context.getApplicationContext());
            }
            a aVar = b;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            a.unlock();
            throw th;
        }
    }

    public static String f(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + str.length() + 1);
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @RecentlyNullable
    public GoogleSignInAccount b() {
        String g;
        String g2 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = g(f("googleSignInAccount", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.J0(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    @RecentlyNullable
    public GoogleSignInOptions c() {
        String g;
        String g2 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = g(f("googleSignInOptions", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.J0(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    public void d(@RecentlyNonNull GoogleSignInAccount googleSignInAccount, @RecentlyNonNull GoogleSignInOptions googleSignInOptions) {
        Objects.requireNonNull(googleSignInAccount, "null reference");
        Objects.requireNonNull(googleSignInOptions, "null reference");
        e("defaultGoogleSignInAccount", googleSignInAccount.b2);
        String str = googleSignInAccount.b2;
        String f = f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.d;
            if (str2 != null) {
                jSONObject.put("id", (Object) str2);
            }
            String str3 = googleSignInAccount.q;
            if (str3 != null) {
                jSONObject.put("tokenId", (Object) str3);
            }
            String str4 = googleSignInAccount.x;
            if (str4 != null) {
                jSONObject.put("email", (Object) str4);
            }
            String str5 = googleSignInAccount.y;
            if (str5 != null) {
                jSONObject.put("displayName", (Object) str5);
            }
            String str6 = googleSignInAccount.d2;
            if (str6 != null) {
                jSONObject.put("givenName", (Object) str6);
            }
            String str7 = googleSignInAccount.e2;
            if (str7 != null) {
                jSONObject.put("familyName", (Object) str7);
            }
            Uri uri = googleSignInAccount.Y1;
            if (uri != null) {
                jSONObject.put("photoUrl", (Object) uri.toString());
            }
            String str8 = googleSignInAccount.Z1;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", (Object) str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.a2);
            jSONObject.put("obfuscatedIdentifier", (Object) googleSignInAccount.b2);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = googleSignInAccount.c2;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, c.c);
            int i = 0;
            for (Scope scope : scopeArr) {
                jSONArray.put((Object) scope.d);
            }
            jSONObject.put("grantedScopes", (Object) jSONArray);
            jSONObject.remove("serverAuthCode");
            e(f, jSONObject.toString());
            String f2 = f("googleSignInOptions", str);
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(googleSignInOptions.a2, GoogleSignInOptions.Y1);
                ArrayList<Scope> arrayList = googleSignInOptions.a2;
                int size = arrayList.size();
                while (i < size) {
                    Scope scope2 = arrayList.get(i);
                    i++;
                    jSONArray2.put((Object) scope2.d);
                }
                jSONObject2.put("scopes", (Object) jSONArray2);
                Account account = googleSignInOptions.b2;
                if (account != null) {
                    jSONObject2.put("accountName", (Object) account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.c2);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.e2);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.d2);
                if (!TextUtils.isEmpty(googleSignInOptions.f2)) {
                    jSONObject2.put("serverClientId", (Object) googleSignInOptions.f2);
                }
                if (!TextUtils.isEmpty(googleSignInOptions.g2)) {
                    jSONObject2.put("hostedDomain", (Object) googleSignInOptions.g2);
                }
                e(f2, jSONObject2.toString());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final void e(String str, String str2) {
        this.c.lock();
        try {
            this.d.edit().putString(str, str2).apply();
        } finally {
            this.c.unlock();
        }
    }

    public final String g(String str) {
        this.c.lock();
        try {
            return this.d.getString(str, (String) null);
        } finally {
            this.c.unlock();
        }
    }
}
