package i0.j.e.l0.k.a.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.logging.InstabugLog;
import com.instabug.library.util.InstabugSDKLogger;

/* compiled from: InstabugDbHelper */
public class a extends SQLiteOpenHelper {
    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public a(Context context) {
        super(context, "instabug.db", (SQLiteDatabase.CursorFactory) null, 25);
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(InstabugDbContract.AnnouncementEntry.DROP_TABLE);
        sQLiteDatabase.execSQL(InstabugDbContract.AnnouncementAssetsEntry.DROP_TABLE);
    }

    public final void b(SQLiteDatabase sQLiteDatabase) {
        i0.d.a.a.a.h(sQLiteDatabase, InstabugDbContract.SurveyEntry.DROP_TABLE, InstabugDbContract.UserInteractions.DROP_TABLE, InstabugDbContract.UserAttributesEntry.DROP_TABLE, InstabugDbContract.UserEntity.DROP_TABLE);
    }

    @Deprecated
    public final void e(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 > i) {
            if (i2 > 16 && i <= 16) {
                try {
                    sQLiteDatabase.execSQL(InstabugDbContract.AnnouncementEntry.ALTER_TABLE_UPGRADE_16);
                } catch (SQLException e) {
                    a(sQLiteDatabase);
                    InstabugLog.e("Migration of schema v. 16 failed with the error: " + e.getMessage());
                }
            }
            if (i2 >= 15) {
                if (i < 12) {
                    b(sQLiteDatabase);
                    a(sQLiteDatabase);
                } else if (i == 12) {
                    try {
                        sQLiteDatabase.execSQL(InstabugDbContract.UserEntity.ALTER_TABLE_UPGRADE_12);
                        sQLiteDatabase.execSQL(InstabugDbContract.UserAttributesEntry.ALTER_TABLE_UPGRADE_14);
                    } catch (SQLException e2) {
                        b(sQLiteDatabase);
                        a(sQLiteDatabase);
                        InstabugLog.e("Migration of schema v. 12 failed with the error: " + e2.getMessage());
                    }
                } else if (i == 14) {
                    try {
                        sQLiteDatabase.execSQL(InstabugDbContract.UserAttributesEntry.ALTER_TABLE_UPGRADE_14);
                    } catch (SQLException e3) {
                        b(sQLiteDatabase);
                        a(sQLiteDatabase);
                        InstabugLog.e("Migration of schema v. 14 failed with the error: " + e3.getMessage());
                    }
                }
            }
        }
        i0.d.a.a.a.h(sQLiteDatabase, InstabugDbContract.NetworkLogEntry.SQL_DELETE_ENTRIES, InstabugDbContract.InstabugLogEntry.DROP_QUERY_INSTABUG_LOG, InstabugDbContract.UserEventEntry.DROP_TABLE, InstabugDbContract.SDKEventEntry.DROP_TABLE);
        i0.d.a.a.a.h(sQLiteDatabase, InstabugDbContract.SDKApiEntry.DROP_TABLE, InstabugDbContract.AttachmentEntry.DROP_TABLE, InstabugDbContract.CrashEntry.DROP_TABLE, InstabugDbContract.BugEntry.DROP_TABLE);
        i0.d.a.a.a.h(sQLiteDatabase, InstabugDbContract.FeatureRequestEntry.DROP_TABLE, InstabugDbContract.ExecutionTracesEntry.DROP_TABLE_QUERY, InstabugDbContract.ExecutionTracesAttributesEntry.DROP_TABLE_QUERY, InstabugDbContract.AppLaunchEntry.DROP_TABLE_QUERY);
        sQLiteDatabase.execSQL(InstabugDbContract.AppLaunchAttributesEntry.DROP_TABLE_QUERY);
        sQLiteDatabase.execSQL(InstabugDbContract.APMNetworkLogEntry.DROP_TABLE_QUERY);
        sQLiteDatabase.execSQL(InstabugDbContract.APMUiTraceEntry.DROP_TABLE_QUERY);
        onCreate(sQLiteDatabase);
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        new i0.j.e.l0.k.a.b.b.a().b(sQLiteDatabase);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        e(sQLiteDatabase, i, i2);
        i0.j.c.l.a.u(sQLiteDatabase, i, i2);
        onCreate(sQLiteDatabase);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        e(sQLiteDatabase, i, i2);
        if (i >= 17 || i2 > 17) {
            try {
                InstabugSDKLogger.i("MigrationEngine", "Migrating database from v" + i + " to v" + i2);
                switch (i2) {
                    case 14:
                        if (i != 12) {
                            i0.j.c.l.a.u(sQLiteDatabase, i, i2);
                            break;
                        } else {
                            sQLiteDatabase.execSQL("ALTER TABLE user ADD COLUMN last_seen INTEGER DEFAULT 0");
                            break;
                        }
                    case 15:
                        i0.j.c.l.a.M(sQLiteDatabase, i, i2);
                        break;
                    case 16:
                        i0.j.c.l.a.O(sQLiteDatabase, i, i2);
                        break;
                    case 18:
                        i0.j.c.l.a.P(sQLiteDatabase, i, i2);
                        break;
                    case 19:
                        i0.j.c.l.a.Q(sQLiteDatabase, i, i2);
                        break;
                    case 20:
                        i0.j.c.l.a.R(sQLiteDatabase, i, i2);
                        break;
                    case 21:
                        i0.j.c.l.a.S(sQLiteDatabase, i, i2);
                        break;
                    case 22:
                        i0.j.c.l.a.U(sQLiteDatabase, i, i2);
                        break;
                    case 23:
                        i0.j.c.l.a.V(sQLiteDatabase, i, i2);
                        break;
                    case 24:
                        i0.j.c.l.a.W(sQLiteDatabase, i, i2);
                        break;
                    case 25:
                        i0.j.c.l.a.L(sQLiteDatabase, i, i2);
                        break;
                    default:
                        i0.j.c.l.a.u(sQLiteDatabase, i, i2);
                        break;
                }
            } catch (Exception e) {
                InstabugSDKLogger.e("MigrationEngine", e.getClass().getSimpleName(), e);
                i0.j.c.l.a.u(sQLiteDatabase, i, i2);
            }
        }
        onCreate(sQLiteDatabase);
    }
}
