package i0.j.e.l0.k.a.b.b;

import android.database.sqlite.SQLiteDatabase;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;

/* compiled from: DestructiveMigration */
public class a implements b {
    public void a(SQLiteDatabase sQLiteDatabase) {
        i0.d.a.a.a.h(sQLiteDatabase, InstabugDbContract.InstabugLogEntry.DROP_QUERY_INSTABUG_LOG, InstabugDbContract.NetworkLogEntry.SQL_DELETE_ENTRIES, InstabugDbContract.AnnouncementAssetsEntry.DROP_TABLE, InstabugDbContract.FeatureRequestEntry.DROP_TABLE);
        i0.d.a.a.a.h(sQLiteDatabase, InstabugDbContract.UserAttributesEntry.DROP_TABLE, InstabugDbContract.AnnouncementEntry.DROP_TABLE, InstabugDbContract.UserInteractions.DROP_TABLE, InstabugDbContract.AttachmentEntry.DROP_TABLE);
        i0.d.a.a.a.h(sQLiteDatabase, InstabugDbContract.UserEventEntry.DROP_TABLE, InstabugDbContract.SDKEventEntry.DROP_TABLE, InstabugDbContract.SessionEntry.DROP_TABLE, InstabugDbContract.SurveyEntry.DROP_TABLE);
        i0.d.a.a.a.h(sQLiteDatabase, InstabugDbContract.SDKApiEntry.DROP_TABLE, InstabugDbContract.UserEntity.DROP_TABLE, InstabugDbContract.CrashEntry.DROP_TABLE, InstabugDbContract.AnrEntry.DROP_TABLE);
        i0.d.a.a.a.h(sQLiteDatabase, InstabugDbContract.BugEntry.DROP_TABLE, InstabugDbContract.ExecutionTracesEntry.DROP_TABLE_QUERY, InstabugDbContract.ExecutionTracesAttributesEntry.DROP_TABLE_QUERY, InstabugDbContract.AppLaunchEntry.DROP_TABLE_QUERY);
        i0.d.a.a.a.h(sQLiteDatabase, InstabugDbContract.AppLaunchAttributesEntry.DROP_TABLE_QUERY, InstabugDbContract.APMNetworkLogEntry.DROP_TABLE_QUERY, InstabugDbContract.APMSessionEntry.DROP_TABLE, InstabugDbContract.APMSessionMetaDataEntry.DROP_TABLE_QUERY);
        i0.d.a.a.a.h(sQLiteDatabase, InstabugDbContract.APMUiTraceEntry.DROP_TABLE_QUERY, InstabugDbContract.DanglingAPMNetworkLogEntry.DROP_TABLE_QUERY, InstabugDbContract.DanglingExecutionTracesEntry.DROP_TABLE_QUERY, InstabugDbContract.DanglingExecutionTracesAttributesEntry.DROP_TABLE_QUERY);
        sQLiteDatabase.execSQL(InstabugDbContract.ExperimentsEntry.DROP_TABLE_QUERY);
        b(sQLiteDatabase);
    }

    public void b(SQLiteDatabase sQLiteDatabase) {
        i0.d.a.a.a.h(sQLiteDatabase, InstabugDbContract.BugEntry.CREATE_TABLE, InstabugDbContract.CrashEntry.CREATE_TABLE, InstabugDbContract.AnrEntry.CREATE_TABLE, InstabugDbContract.UserEntity.CREATE_TABLE);
        i0.d.a.a.a.h(sQLiteDatabase, InstabugDbContract.SDKApiEntry.CREATE_TABLE, InstabugDbContract.SurveyEntry.CREATE_TABLE, InstabugDbContract.SessionEntry.CREATE_TABLE, InstabugDbContract.SDKEventEntry.CREATE_TABLE);
        i0.d.a.a.a.h(sQLiteDatabase, InstabugDbContract.UserEventEntry.CREATE_TABLE, InstabugDbContract.AttachmentEntry.CREATE_TABLE, InstabugDbContract.UserInteractions.CREATE_TABLE, InstabugDbContract.AnnouncementEntry.CREATE_TABLE);
        i0.d.a.a.a.h(sQLiteDatabase, InstabugDbContract.UserAttributesEntry.CREATE_TABLE, InstabugDbContract.FeatureRequestEntry.CREATE_TABLE, InstabugDbContract.AnnouncementAssetsEntry.CREATE_TABLE, InstabugDbContract.NetworkLogEntry.SQL_CREATE_NETWORK_LOGS);
        i0.d.a.a.a.h(sQLiteDatabase, InstabugDbContract.InstabugLogEntry.SQL_CREATE_INSTABUG_LOGS, InstabugDbContract.ExecutionTracesEntry.CREATE_TABLE_QUERY, InstabugDbContract.ExecutionTracesAttributesEntry.CREATE_TABLE_QUERY, InstabugDbContract.AppLaunchEntry.CREATE_TABLE_QUERY);
        i0.d.a.a.a.h(sQLiteDatabase, InstabugDbContract.AppLaunchAttributesEntry.CREATE_TABLE_QUERY, InstabugDbContract.APMNetworkLogEntry.CREATE_TABLE_QUERY, InstabugDbContract.APMUiTraceEntry.CREATE_TABLE_QUERY, InstabugDbContract.APMSessionEntry.CREATE_TABLE);
        i0.d.a.a.a.h(sQLiteDatabase, InstabugDbContract.APMSessionMetaDataEntry.CREATE_TABLE_QUERY, InstabugDbContract.DanglingAPMNetworkLogEntry.CREATE_TABLE_QUERY, InstabugDbContract.DanglingExecutionTracesEntry.CREATE_TABLE_QUERY, InstabugDbContract.DanglingExecutionTracesAttributesEntry.CREATE_TABLE_QUERY);
        sQLiteDatabase.execSQL(InstabugDbContract.ExperimentsEntry.CREATE_TABLE_QUERY);
    }
}
