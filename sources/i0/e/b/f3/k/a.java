package i0.e.b.f3.k;

import android.content.SharedPreferences;
import com.clubhouse.android.shared.preferences.Key;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptySet;
import m0.n.b.i;

/* compiled from: AbstractSharedPreferences.kt */
public abstract class a {
    public final SharedPreferences a;

    public a(SharedPreferences sharedPreferences) {
        i.e(sharedPreferences, "sharedPreferences");
        this.a = sharedPreferences;
    }

    public static String c(a aVar, Key key, String str, int i, Object obj) {
        int i2 = i & 2;
        Objects.requireNonNull(aVar);
        i.e(key, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        try {
            return aVar.a.getString(aVar.e(key), (String) null);
        } catch (Exception e) {
            v0.a.a.d.e(e, key + " was not a String", new Object[0]);
            return null;
        }
    }

    public static Set d(a aVar, Key key, Set set, int i, Object obj) {
        EmptySet emptySet = (i & 2) != 0 ? EmptySet.c : null;
        i.e(key, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        i.e(emptySet, "default");
        try {
            Set<String> stringSet = aVar.a.getStringSet(aVar.e(key), emptySet);
            if (stringSet == null) {
                return emptySet;
            }
            return stringSet;
        } catch (Exception e) {
            v0.a.a.d.e(e, key + " was not a String Set", new Object[0]);
            return emptySet;
        }
    }

    public final boolean a(Key key, boolean z) {
        i.e(key, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        try {
            return this.a.getBoolean(e(key), z);
        } catch (Exception e) {
            v0.a.a.d.e(e, key + " was not an Int", new Object[0]);
            return z;
        }
    }

    public final long b(Key key, long j) {
        i.e(key, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        try {
            return this.a.getLong(e(key), j);
        } catch (Exception e) {
            v0.a.a.d.e(e, key + " was not an Long", new Object[0]);
            return j;
        }
    }

    public String e(Key key) {
        i.e(key, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        if (this.a.contains(key.asString())) {
            return key.asString();
        }
        return null;
    }

    public String f(Key key) {
        i.e(key, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        return key.asString();
    }

    public final void g(Key key, boolean z) {
        i.e(key, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        SharedPreferences.Editor edit = this.a.edit();
        i.d(edit, "editor");
        edit.putBoolean(f(key), z);
        edit.apply();
    }

    public final void h(Key key, long j) {
        i.e(key, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        SharedPreferences.Editor edit = this.a.edit();
        i.d(edit, "editor");
        edit.putLong(f(key), j);
        edit.apply();
    }

    public final void i(Key key, String str) {
        i.e(key, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        SharedPreferences.Editor edit = this.a.edit();
        i.d(edit, "editor");
        edit.putString(f(key), str);
        edit.apply();
    }

    public final void j(Key key, Set<String> set) {
        i.e(key, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        i.e(set, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        SharedPreferences.Editor edit = this.a.edit();
        i.d(edit, "editor");
        edit.putStringSet(f(key), set);
        edit.apply();
    }
}
