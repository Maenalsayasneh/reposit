package i0.h.c;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R;
import h0.b0.v;
import i0.h.a.b.c.i.k;
import i0.h.a.b.c.i.q0;
import i0.h.a.b.c.m.d;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: FirebaseOptions */
public final class h {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        v.C(!d.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static h a(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Objects.requireNonNull(context, "null reference");
        Resources resources = context.getResources();
        String resourcePackageName = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        int identifier = resources.getIdentifier("google_app_id", "string", resourcePackageName);
        String str7 = null;
        if (identifier == 0) {
            str = null;
        } else {
            str = resources.getString(identifier);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int identifier2 = resources.getIdentifier("google_api_key", "string", resourcePackageName);
        if (identifier2 == 0) {
            str2 = null;
        } else {
            str2 = resources.getString(identifier2);
        }
        int identifier3 = resources.getIdentifier("firebase_database_url", "string", resourcePackageName);
        if (identifier3 == 0) {
            str3 = null;
        } else {
            str3 = resources.getString(identifier3);
        }
        int identifier4 = resources.getIdentifier("ga_trackingId", "string", resourcePackageName);
        if (identifier4 == 0) {
            str4 = null;
        } else {
            str4 = resources.getString(identifier4);
        }
        int identifier5 = resources.getIdentifier("gcm_defaultSenderId", "string", resourcePackageName);
        if (identifier5 == 0) {
            str5 = null;
        } else {
            str5 = resources.getString(identifier5);
        }
        int identifier6 = resources.getIdentifier("google_storage_bucket", "string", resourcePackageName);
        if (identifier6 == 0) {
            str6 = null;
        } else {
            str6 = resources.getString(identifier6);
        }
        int identifier7 = resources.getIdentifier("project_id", "string", resourcePackageName);
        if (identifier7 != 0) {
            str7 = resources.getString(identifier7);
        }
        return new h(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!v.c0(this.b, hVar.b) || !v.c0(this.a, hVar.a) || !v.c0(this.c, hVar.c) || !v.c0(this.d, hVar.d) || !v.c0(this.e, hVar.e) || !v.c0(this.f, hVar.f) || !v.c0(this.g, hVar.g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public String toString() {
        k kVar = new k(this, (q0) null);
        kVar.a("applicationId", this.b);
        kVar.a("apiKey", this.a);
        kVar.a("databaseUrl", this.c);
        kVar.a("gcmSenderId", this.e);
        kVar.a("storageBucket", this.f);
        kVar.a("projectId", this.g);
        return kVar.toString();
    }
}
