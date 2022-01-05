package com.instabug.library.user;

import com.instabug.library.internal.storage.cache.db.InstabugDBInsertionListener;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import i0.d.a.a.a;
import i0.j.e.c1.b;
import i0.j.e.c1.c;
import java.util.UUID;

public class UserManagerWrapper {
    public static void getUUIDAsync(InstabugDBInsertionListener<String> instabugDBInsertionListener) {
        String mD5Uuid = SettingsManager.getInstance().getMD5Uuid();
        StringBuilder P0 = a.P0("getUUID: ");
        P0.append(b.t());
        InstabugSDKLogger.v("UserManager", P0.toString());
        if ((mD5Uuid == null || mD5Uuid.isEmpty()) && ((mD5Uuid = SettingsManager.getInstance().getUuid()) == null || mD5Uuid.isEmpty())) {
            mD5Uuid = UUID.randomUUID().toString();
            InstabugSDKLogger.v("UserManager", "new randomly generated UUID: " + mD5Uuid);
            SettingsManager.getInstance().setUuid(mD5Uuid);
        }
        PoolProvider.postIOTask(new c(mD5Uuid, instabugDBInsertionListener));
    }

    public static String getUserEmail() {
        return b.E();
    }

    public static String getUserName() {
        return b.F();
    }

    public static String getUserUUID() {
        return b.C();
    }
}
