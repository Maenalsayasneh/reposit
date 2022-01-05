package i0.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import m0.n.b.i;

/* compiled from: Prefs.kt */
public final class d implements c {
    public final SharedPreferences a;

    public d(Context context) {
        i.f(context, "context");
        this.a = context.getSharedPreferences("[com.afollestad.assent-prefs]", 0);
    }

    public void a(String str, Object obj) {
        i.f(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        i.f(obj, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        SharedPreferences.Editor edit = this.a.edit();
        if (obj instanceof String) {
            edit.putString(str, (String) obj);
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Integer) {
            edit.putInt(str, ((Number) obj).intValue());
        } else if (obj instanceof Long) {
            edit.putLong(str, ((Number) obj).longValue());
        } else if (obj instanceof Float) {
            edit.putFloat(str, ((Number) obj).floatValue());
        } else {
            throw new IllegalStateException(("Cannot put value " + obj + " in shared preferences.").toString());
        }
        edit.apply();
    }

    public <T> T get(String str) {
        i.f(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        SharedPreferences sharedPreferences = this.a;
        i.b(sharedPreferences, "sharedPrefs");
        T t = sharedPreferences.getAll().get(str);
        if (!(t instanceof Object)) {
            return null;
        }
        return t;
    }
}
