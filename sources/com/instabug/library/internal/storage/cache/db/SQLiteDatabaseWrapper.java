package com.instabug.library.internal.storage.cache.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;

public class SQLiteDatabaseWrapper {
    public static final String TAG = "SQLiteDatabaseWrapper";
    private SQLiteDatabase database;
    private SQLiteOpenHelper databaseHelper;

    public SQLiteDatabaseWrapper(SQLiteOpenHelper sQLiteOpenHelper) {
        this.databaseHelper = sQLiteOpenHelper;
    }

    private synchronized boolean databaseInitializedAndOpen() {
        SQLiteDatabase sQLiteDatabase;
        sQLiteDatabase = this.database;
        return sQLiteDatabase != null && sQLiteDatabase.isOpen();
    }

    private synchronized void logOperationFailedWarning() {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            InstabugSDKLogger.w(TAG, "Attempted to do operation on an uninitialized database. Falling back silently");
        } else if (!sQLiteDatabase.isOpen()) {
            InstabugSDKLogger.w(TAG, "Attempted to do operation on a closed database. Falling back silently");
        } else {
            InstabugSDKLogger.w(TAG, "Failed to do database operation. Falling back silently");
        }
    }

    @SuppressLint({"ERADICATE_NULLABLE_DEREFERENCE"})
    public void beginTransaction() {
        try {
            if (databaseInitializedAndOpen()) {
                this.database.beginTransaction();
            } else {
                logOperationFailedWarning();
            }
        } catch (Exception e) {
            StringBuilder P0 = a.P0("DB transaction failed: ");
            P0.append(e.getMessage());
            InstabugSDKLogger.e(TAG, P0.toString(), e);
            logOperationFailedWarning();
        }
    }

    public synchronized void close() {
    }

    public void closeDB() {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.database = null;
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public int delete(String str, String str2, String[] strArr) {
        try {
            if (databaseInitializedAndOpen()) {
                return this.database.delete(str, str2, strArr);
            }
            logOperationFailedWarning();
            return 0;
        } catch (Exception e) {
            StringBuilder P0 = a.P0("DB deletion failed: ");
            P0.append(e.getMessage());
            InstabugSDKLogger.e(TAG, P0.toString());
            logOperationFailedWarning();
            return 0;
        }
    }

    @SuppressLint({"ERADICATE_NULLABLE_DEREFERENCE"})
    public synchronized void endTransaction() {
        try {
            if (databaseInitializedAndOpen()) {
                this.database.endTransaction();
            } else {
                logOperationFailedWarning();
            }
        } catch (Exception e) {
            InstabugSDKLogger.e(TAG, "DB end transaction not successful due to: " + e.getMessage());
            logOperationFailedWarning();
        }
        return;
    }

    @SuppressLint({"ERADICATE_NULLABLE_DEREFERENCE"})
    public void execSQL(String str) {
        try {
            if (databaseInitializedAndOpen()) {
                this.database.execSQL(str);
            } else {
                logOperationFailedWarning();
            }
        } catch (Exception e) {
            StringBuilder P0 = a.P0("DB execution a sql failed: ");
            P0.append(e.getMessage());
            InstabugSDKLogger.e(TAG, P0.toString());
            logOperationFailedWarning();
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public long insert(String str, String str2, ContentValues contentValues) {
        try {
            if (databaseInitializedAndOpen()) {
                return this.database.insert(str, str2, contentValues);
            }
            logOperationFailedWarning();
            return -1;
        } catch (Exception e) {
            StringBuilder P0 = a.P0("DB insertion failed: ");
            P0.append(e.getMessage());
            InstabugSDKLogger.e(TAG, P0.toString());
            logOperationFailedWarning();
            return -1;
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public long insertWithOnConflict(String str, String str2, ContentValues contentValues) {
        try {
            if (databaseInitializedAndOpen()) {
                return this.database.insertWithOnConflict(str, str2, contentValues, 4);
            }
            logOperationFailedWarning();
            return -1;
        } catch (Exception e) {
            StringBuilder P0 = a.P0("DB insertion with on conflict failed: ");
            P0.append(e.getMessage());
            InstabugSDKLogger.e(TAG, P0.toString(), e);
            logOperationFailedWarning();
            return -1;
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public long insertWithOnConflictReplace(String str, String str2, ContentValues contentValues) {
        try {
            if (databaseInitializedAndOpen()) {
                return this.database.insertWithOnConflict(str, str2, contentValues, 5);
            }
            logOperationFailedWarning();
            return -1;
        } catch (Exception e) {
            StringBuilder P0 = a.P0("DB insertion with on conflict replace failed: ");
            P0.append(e.getMessage());
            InstabugSDKLogger.e(TAG, P0.toString());
            logOperationFailedWarning();
            return -1;
        }
    }

    public void open() {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                this.database = this.databaseHelper.getWritableDatabase();
            }
        } catch (Exception e) {
            StringBuilder P0 = a.P0("Error while opening the DB: ");
            P0.append(e.getMessage());
            InstabugSDKLogger.e(this, P0.toString(), e);
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        try {
            if (databaseInitializedAndOpen()) {
                try {
                    return this.database.query(str, strArr, str2, strArr2, str3, str4, str5);
                } catch (Exception e) {
                    e = e;
                    StringBuilder P0 = a.P0("DB query failed: ");
                    P0.append(e.getMessage());
                    InstabugSDKLogger.e(TAG, P0.toString());
                    logOperationFailedWarning();
                    return null;
                }
            } else {
                logOperationFailedWarning();
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            StringBuilder P02 = a.P0("DB query failed: ");
            P02.append(e.getMessage());
            InstabugSDKLogger.e(TAG, P02.toString());
            logOperationFailedWarning();
            return null;
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public long queryNumEntries(String str) {
        try {
            if (databaseInitializedAndOpen()) {
                return DatabaseUtils.queryNumEntries(this.database, str);
            }
            logOperationFailedWarning();
            return -1;
        } catch (Exception e) {
            StringBuilder P0 = a.P0("DB query num entries failed: ");
            P0.append(e.getMessage());
            InstabugSDKLogger.e(TAG, P0.toString());
            logOperationFailedWarning();
            return -1;
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public Cursor rawQuery(String str, String[] strArr) {
        try {
            if (databaseInitializedAndOpen()) {
                return this.database.rawQuery(str, strArr);
            }
            logOperationFailedWarning();
            return null;
        } catch (Exception e) {
            StringBuilder P0 = a.P0("DB raw query failed: ");
            P0.append(e.getMessage());
            InstabugSDKLogger.e(TAG, P0.toString());
            logOperationFailedWarning();
            return null;
        }
    }

    @SuppressLint({"ERADICATE_NULLABLE_DEREFERENCE"})
    public void setTransactionSuccessful() {
        try {
            if (databaseInitializedAndOpen()) {
                this.database.setTransactionSuccessful();
            } else {
                logOperationFailedWarning();
            }
        } catch (Exception e) {
            StringBuilder P0 = a.P0("DB transaction not successful due to: ");
            P0.append(e.getMessage());
            InstabugSDKLogger.e(TAG, P0.toString());
            logOperationFailedWarning();
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        try {
            if (databaseInitializedAndOpen()) {
                return this.database.update(str, contentValues, str2, strArr);
            }
            logOperationFailedWarning();
            return -1;
        } catch (Exception e) {
            StringBuilder P0 = a.P0("DB update failed: ");
            P0.append(e.getMessage());
            InstabugSDKLogger.e(TAG, P0.toString());
            logOperationFailedWarning();
            return -1;
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        try {
            if (databaseInitializedAndOpen()) {
                try {
                    return this.database.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
                } catch (Exception e) {
                    e = e;
                    StringBuilder P0 = a.P0("DB query failed: ");
                    P0.append(e.getMessage());
                    InstabugSDKLogger.e(TAG, P0.toString());
                    logOperationFailedWarning();
                    return null;
                }
            } else {
                logOperationFailedWarning();
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            StringBuilder P02 = a.P0("DB query failed: ");
            P02.append(e.getMessage());
            InstabugSDKLogger.e(TAG, P02.toString());
            logOperationFailedWarning();
            return null;
        }
    }
}
