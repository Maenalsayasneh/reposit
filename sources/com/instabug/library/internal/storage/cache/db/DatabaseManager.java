package com.instabug.library.internal.storage.cache.db;

import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteOpenHelper;
import com.instabug.library.Instabug;
import i0.j.e.l0.k.a.b.a;

public class DatabaseManager {
    private static SQLiteDatabaseWrapper databaseWrapper;
    private static DatabaseManager instance;

    @SuppressLint({"RESOURCE_LEAK"})
    public static synchronized DatabaseManager getInstance() {
        DatabaseManager databaseManager;
        Class<DatabaseManager> cls = DatabaseManager.class;
        synchronized (cls) {
            if (instance == null) {
                if (Instabug.getApplicationContext() != null) {
                    init(new a(Instabug.getApplicationContext()));
                } else {
                    throw new IllegalStateException(cls.getSimpleName() + " is not initialized, call init(..) method first.");
                }
            }
            databaseManager = instance;
        }
        return databaseManager;
    }

    public static synchronized void init(SQLiteOpenHelper sQLiteOpenHelper) {
        synchronized (DatabaseManager.class) {
            if (instance == null) {
                instance = new DatabaseManager();
                databaseWrapper = new SQLiteDatabaseWrapper(sQLiteOpenHelper);
            }
        }
    }

    @SuppressLint({"ERADICATE_FIELD_NOT_NULLABLE"})
    public static synchronized void tearDown() {
        synchronized (DatabaseManager.class) {
            SQLiteDatabaseWrapper sQLiteDatabaseWrapper = databaseWrapper;
            if (sQLiteDatabaseWrapper != null) {
                sQLiteDatabaseWrapper.close();
                databaseWrapper = null;
            }
            instance = null;
        }
    }

    public synchronized SQLiteDatabaseWrapper openDatabase() {
        databaseWrapper.open();
        return databaseWrapper;
    }
}
