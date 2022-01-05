package i0.c.a;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import i0.d.a.a.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Utils */
public class r {
    public static final String a = "i0.c.a.r";

    public static boolean a(Context context, String str) {
        try {
            if (Integer.parseInt(Activity.class.getMethod("checkSelfPermission", new Class[]{String.class}).invoke(context, new Object[]{str}).toString()) == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static JSONObject b(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject.length() == 0) {
            return new JSONObject();
        }
        try {
            jSONArray = jSONObject.names();
        } catch (ArrayIndexOutOfBoundsException e) {
            k.a.a(a, e.toString());
            jSONArray = null;
        }
        int length = jSONArray != null ? jSONArray.length() : 0;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.optString(i);
        }
        try {
            return new JSONObject(jSONObject, strArr);
        } catch (JSONException e2) {
            k.a.a(a, e2.toString());
            return null;
        }
    }

    public static SharedPreferences c(Context context, String str) {
        StringBuilder T0 = a.T0("com.amplitude.api.", str, ".");
        T0.append(context.getPackageName());
        return context.getSharedPreferences(T0.toString(), 4);
    }

    public static boolean d(String str) {
        return str == null || str.length() == 0;
    }

    public static String e(String str) {
        if (d(str)) {
            str = "$default_instance";
        }
        return str.toLowerCase();
    }
}
