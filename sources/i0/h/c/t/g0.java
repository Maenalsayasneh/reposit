package i0.h.c.t;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import i0.d.a.a.a;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public class g0 {
    public final Bundle a;

    public g0(Bundle bundle) {
        this.a = new Bundle(bundle);
    }

    public static boolean f(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String h(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean a(String str) {
        String e = e(str);
        return "1".equals(e) || Boolean.parseBoolean(e);
    }

    public Integer b(String str) {
        String e = e(str);
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(e));
        } catch (NumberFormatException unused) {
            String h = h(str);
            StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 38 + String.valueOf(e).length());
            a.s(sb, "Couldn't parse value of ", h, "(", e);
            sb.append(") into an int");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public JSONArray c(String str) {
        String e = e(str);
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        try {
            return new JSONArray(e);
        } catch (JSONException unused) {
            String h = h(str);
            StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 50 + String.valueOf(e).length());
            a.s(sb, "Malformed JSON for key ", h, ": ", e);
            sb.append(", falling back to default");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public String d(Resources resources, String str, String str2) {
        String[] strArr;
        String e = e(str2);
        if (!TextUtils.isEmpty(e)) {
            return e;
        }
        String e2 = e(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(e2)) {
            return null;
        }
        int identifier = resources.getIdentifier(e2, "string", str);
        if (identifier == 0) {
            String h = h(str2.concat("_loc_key"));
            StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 49 + str2.length());
            sb.append(h);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        JSONArray c = c(str2.concat("_loc_args"));
        if (c == null) {
            strArr = null;
        } else {
            int length = c.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = c.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e3) {
            String h2 = h(str2);
            String arrays = Arrays.toString(strArr);
            StringBuilder sb2 = new StringBuilder(String.valueOf(h2).length() + 58 + String.valueOf(arrays).length());
            a.s(sb2, "Missing format argument for ", h2, ": ", arrays);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString(), e3);
            return null;
        }
    }

    public String e(String str) {
        String str2;
        Bundle bundle = this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                str2 = str;
            } else {
                str2 = str.replace("gcm.n.", "gcm.notification.");
            }
            if (this.a.containsKey(str2)) {
                str = str2;
            }
        }
        return bundle.getString(str);
    }

    public Bundle g() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
