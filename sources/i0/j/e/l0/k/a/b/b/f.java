package i0.j.e.l0.k.a.b.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.settings.SettingsManager;
import i0.d.a.a.a;
import org.json.JSONArray;

/* compiled from: Migration_17_18 */
public class f implements b {
    public void a(SQLiteDatabase sQLiteDatabase) {
        String str;
        StringBuilder P0 = a.P0("ALTER TABLE session_table ADD COLUMN os TEXT DEFAULT \"SDK Level ");
        P0.append(InstabugDeviceProperties.getCurrentOSLevel());
        P0.append("\"");
        sQLiteDatabase.execSQL(P0.toString());
        sQLiteDatabase.execSQL("ALTER TABLE session_table ADD COLUMN device TEXT DEFAULT \"" + InstabugDeviceProperties.getDeviceType() + "\"");
        sQLiteDatabase.execSQL("ALTER TABLE session_table ADD COLUMN sdk_version TEXT DEFAULT \"10.4.3\"");
        Context applicationContext = Instabug.getApplicationContext();
        if (applicationContext == null) {
            str = null;
        } else {
            str = InstabugDeviceProperties.getAppVersion(applicationContext);
        }
        sQLiteDatabase.execSQL("ALTER TABLE session_table ADD COLUMN app_version TEXT DEFAULT \"" + str + "\"");
        boolean isFeatureEnabled = InstabugCore.isFeatureEnabled(Feature.CRASH_REPORTING);
        sQLiteDatabase.execSQL("ALTER TABLE session_table ADD COLUMN crash_reporting_enabled INTEGER DEFAULT " + (isFeatureEnabled ? 1 : 0));
        sQLiteDatabase.execSQL("ALTER TABLE session_table ADD COLUMN sync_status INTEGER DEFAULT 0");
        String appToken = SettingsManager.getInstance().getAppToken();
        sQLiteDatabase.execSQL("ALTER TABLE session_table ADD COLUMN app_token TEXT DEFAULT \"" + appToken + "\"");
        String jSONArray = new JSONArray().toString();
        sQLiteDatabase.execSQL("ALTER TABLE session_table ADD COLUMN user_attributes_keys TEXT DEFAULT \"" + jSONArray + "\"");
        sQLiteDatabase.execSQL("ALTER TABLE session_table ADD COLUMN user_events_keys TEXT DEFAULT \"" + jSONArray + "\"");
        sQLiteDatabase.execSQL("ALTER TABLE session_table ADD COLUMN users_page_enabled INTEGER DEFAULT 1");
    }
}
