package i0.j.b;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instabug.bug.OnSdkDismissedCallback$DismissType;
import com.instabug.bug.model.a;
import com.instabug.library.Feature;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.orchestrator.ActionsOrchestrator;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.cache.AttachmentsDbHelper;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.internal.storage.operation.WriteStateToFileDiskOperation;
import com.instabug.library.internal.video.InternalAutoScreenRecorderHelper;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.State;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import com.instabug.library.visualusersteps.VisualUserStepsHelper;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;

/* compiled from: LiveBugManager */
public class f {
    public static f a;
    public volatile a b;
    public boolean c;
    public OnSdkDismissedCallback$DismissType d = OnSdkDismissedCallback$DismissType.CANCEL;

    public static void b(f fVar, Context context, State state) throws JSONException, IOException {
        if (fVar.b != null) {
            state.setUri(DiskUtils.with(context).writeOperation(new WriteStateToFileDiskOperation(DiskUtils.createStateTextFile(context), state.toJson())).execute());
            if (InstabugCore.getFeatureState(Feature.REPRO_STEPS) == Feature.State.ENABLED && InstabugCore.isReproStepsScreenshotEnabled() && fVar.b.c != null) {
                VisualUserStepsHelper.getVisualUserStepsFileObservable(context, fVar.b.c).t(new d(fVar), new e(), k0.b.z.b.a.c, k0.b.z.b.a.d);
            }
            a aVar = fVar.b;
            aVar.Y1 = a.C0094a.READY_TO_BE_SENT;
            synchronized (i0.j.b.k.a.class) {
                if (aVar.c == null) {
                    InstabugSDKLogger.e("BugReportsDbHelper", "Couldn't save the bug to DB because its ID is null");
                    return;
                }
                SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
                openDatabase.beginTransaction();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("id", aVar.c);
                    contentValues.put(InstabugDbContract.BugEntry.COLUMN_MESSAGE, aVar.x);
                    contentValues.put(InstabugDbContract.BugEntry.COLUMN_BUG_STATE, aVar.Y1.name());
                    String str = aVar.d;
                    if (str != null) {
                        contentValues.put("temporary_server_token", str);
                    }
                    contentValues.put("type", aVar.q);
                    contentValues.put(InstabugDbContract.BugEntry.COLUMN_CATEGORIES_LIST, aVar.d().toString());
                    String str2 = aVar.Z1;
                    if (str2 != null) {
                        contentValues.put(InstabugDbContract.BugEntry.COLUMN_VIEW_HIERARCHY, str2);
                    }
                    if (!(aVar.getState() == null || aVar.getState().getUri() == null)) {
                        contentValues.put("state", aVar.getState().getUri().toString());
                    }
                    for (Attachment next : aVar.b()) {
                        long insert = AttachmentsDbHelper.insert(next, aVar.c);
                        if (insert != -1) {
                            next.setId(insert);
                        }
                    }
                    openDatabase.insert(InstabugDbContract.BugEntry.TABLE_NAME, (String) null, contentValues);
                    openDatabase.setTransactionSuccessful();
                } finally {
                    openDatabase.endTransaction();
                    openDatabase.close();
                }
            }
        }
    }

    public static synchronized f g() {
        f fVar;
        synchronized (f.class) {
            if (a == null) {
                a = new f();
            }
            fVar = a;
        }
        return fVar;
    }

    public void a(Context context, Uri uri, String str, Attachment.Type type) {
        Uri uri2;
        if (this.b != null) {
            if (type == Attachment.Type.GALLERY_VIDEO) {
                uri2 = AttachmentsUtility.getNewFileAttachmentUri(context, uri, str, 50.0d);
            } else {
                uri2 = AttachmentsUtility.getNewFileAttachmentUri(context, uri, str);
            }
            if (uri2 != null) {
                this.b.a(uri2, type, false);
                d(context);
            }
        }
    }

    public void c(Context context) {
        if (this.b == null) {
            a aVar = new a(System.currentTimeMillis() + "", (State) null, a.C0094a.IN_PROGRESS);
            Objects.requireNonNull(i0.j.b.n.a.a());
            if (InternalAutoScreenRecorderHelper.getInstance().isEnabled()) {
                Objects.requireNonNull(i0.j.b.n.a.a());
                Uri autoScreenRecordingFileUri = InternalAutoScreenRecorderHelper.getInstance().getAutoScreenRecordingFileUri();
                Objects.requireNonNull(i0.j.b.n.a.a());
                InternalAutoScreenRecorderHelper.getInstance().clear();
                if (autoScreenRecordingFileUri != null) {
                    Attachment attachment = new Attachment();
                    attachment.setName(autoScreenRecordingFileUri.getLastPathSegment());
                    attachment.setLocalPath(autoScreenRecordingFileUri.getPath());
                    attachment.setType(Attachment.Type.AUTO_SCREEN_RECORDING_VIDEO);
                    aVar.b().add(attachment);
                }
            }
            aVar.a2 = InstabugCore.getFeatureState(Feature.VIEW_HIERARCHY_V2) == Feature.State.ENABLED;
            this.b = aVar;
            this.c = false;
            this.d = OnSdkDismissedCallback$DismissType.CANCEL;
            ActionsOrchestrator.obtainOrchestrator(PoolProvider.newBackgroundExecutor()).addWorkerThreadAction(new j(context)).orchestrate();
        }
    }

    public void d(Context context) {
        h0.s.a.a.a(context).c(new Intent("refresh.attachments"));
    }

    public void e() {
        this.c = true;
        this.d = OnSdkDismissedCallback$DismissType.ADD_ATTACHMENT;
        h();
    }

    public void f() {
        if (!(this.b == null || this.b.b() == null)) {
            for (Attachment next : this.b.b()) {
                if (next.getLocalPath() != null) {
                    DiskUtils.deleteFile(next.getLocalPath());
                }
            }
        }
        this.b = null;
    }

    public final void h() {
        i0.j.b.s.a h = i0.j.b.s.a.h();
        if (h.f() != null && g().d != null && g().b != null) {
            h.f().call(i.a(g().d), i.b(g().b.q));
        }
    }
}
