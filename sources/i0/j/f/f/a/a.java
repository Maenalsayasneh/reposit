package i0.j.f.f.a;

import android.content.ContentValues;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.f.c.i;
import org.json.JSONException;

/* compiled from: UserInteractionDbHelper */
public class a {
    public static ContentValues a(i iVar) throws JSONException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("survey_id", Long.valueOf(iVar.c));
        String str = iVar.d;
        if (str == null) {
            str = "null";
        }
        contentValues.put("uuid", str);
        contentValues.put(InstabugDbContract.UserInteractions.COLUMN_USER_INTERACTION_ON_TYPE, Integer.valueOf(iVar.x));
        contentValues.put("surveyTargeting", iVar.q.toJson());
        contentValues.put("answered", Integer.valueOf(iVar.y ? 1 : 0));
        contentValues.put("dismissed_at", Long.valueOf(iVar.Y1));
        contentValues.put("shown_at", Long.valueOf(iVar.Z1));
        contentValues.put("isCancelled", Integer.valueOf(iVar.a2 ? 1 : 0));
        contentValues.put("attemptCount", Integer.valueOf(iVar.b2));
        contentValues.put("eventIndex", Integer.valueOf(iVar.c2));
        contentValues.put("shouldShowAgain", Integer.valueOf(iVar.f2 ? 1 : 0));
        contentValues.put("sessionCounter", Integer.valueOf(iVar.e2));
        contentValues.put(InstabugDbContract.UserInteractions.COLUMN_ALREADY_SHOWN, Integer.valueOf(iVar.d2 ? 1 : 0));
        return contentValues;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r4 = r4.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(com.instabug.survey.f.c.i r4) {
        /*
            if (r4 == 0) goto L_0x0016
            long r0 = r4.c
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0016
            java.lang.String r4 = r4.d
            if (r4 == 0) goto L_0x0016
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0016
            r4 = 1
            goto L_0x0017
        L_0x0016:
            r4 = 0
        L_0x0017:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.f.a.a.b(com.instabug.survey.f.c.i):boolean");
    }

    public static synchronized long c(i iVar) {
        long update;
        Class<a> cls = a.class;
        synchronized (cls) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            String[] strArr = {String.valueOf(iVar.c), iVar.d, String.valueOf(iVar.x)};
            try {
                openDatabase.beginTransaction();
                update = (long) openDatabase.update(InstabugDbContract.UserInteractions.TABLE_NAME, a(iVar), "survey_id=? AND uuid=? AND action_on_type=?", strArr);
                openDatabase.setTransactionSuccessful();
                InstabugSDKLogger.d(cls, "survey user interaction with survey id: " + iVar.c + " and uuid: " + iVar.d + " has been updated ");
                openDatabase.endTransaction();
                openDatabase.close();
            } catch (JSONException e) {
                try {
                    InstabugSDKLogger.e(cls, "survey updating failed due to " + e.getMessage());
                    return -1;
                } finally {
                    openDatabase.endTransaction();
                    openDatabase.close();
                }
            }
        }
        return update;
    }
}
