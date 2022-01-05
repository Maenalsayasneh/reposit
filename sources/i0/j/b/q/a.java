package i0.j.b.q;

import android.content.ContentValues;
import android.content.Context;
import com.instabug.bug.model.a;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.internal.storage.operation.DeleteUriDiskOperation;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.State;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.StringUtility;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k0.b.l;
import org.json.JSONException;

/* compiled from: BugUploaderHelper */
public class a {
    public Context a;

    /* renamed from: i0.j.b.q.a$a  reason: collision with other inner class name */
    /* compiled from: BugUploaderHelper */
    public class C0160a implements Request.Callbacks<String, Throwable> {
        public final /* synthetic */ com.instabug.bug.model.a a;

        public C0160a(com.instabug.bug.model.a aVar) {
            this.a = aVar;
        }

        public void onFailed(Object obj) {
            Throwable th = (Throwable) obj;
            InstabugSDKLogger.d("BugUploaderHelper", "Something went wrong while uploading bug");
        }

        public void onSucceeded(Object obj) {
            String str = (String) obj;
            InstabugSDKLogger.d("BugUploaderHelper", "Bug uploaded successfully, setting bug TemporaryServerToken equal " + str);
            com.instabug.bug.model.a aVar = this.a;
            aVar.d = str;
            a.C0094a aVar2 = a.C0094a.LOGS_READY_TO_BE_UPLOADED;
            aVar.Y1 = aVar2;
            ContentValues contentValues = new ContentValues();
            if (str != null) {
                contentValues.put("temporary_server_token", str);
            }
            contentValues.put(InstabugDbContract.BugEntry.COLUMN_BUG_STATE, aVar2.name());
            String str2 = this.a.c;
            if (str2 != null) {
                i0.j.b.k.a.b(str2, contentValues);
            }
            a.this.c(this.a);
        }
    }

    /* compiled from: BugUploaderHelper */
    public class b implements Request.Callbacks<Boolean, com.instabug.bug.model.a> {
        public final /* synthetic */ com.instabug.bug.model.a a;

        public b(com.instabug.bug.model.a aVar) {
            this.a = aVar;
        }

        public void onFailed(Object obj) {
            com.instabug.bug.model.a aVar = (com.instabug.bug.model.a) obj;
            InstabugSDKLogger.d("BugUploaderHelper", "Something went wrong while uploading bug logs");
        }

        public void onSucceeded(Object obj) {
            Boolean bool = (Boolean) obj;
            InstabugSDKLogger.d("BugUploaderHelper", "Bug logs uploaded successfully, change its state");
            com.instabug.bug.model.a aVar = this.a;
            if (aVar.c == null) {
                InstabugSDKLogger.e("BugUploaderHelper", "Couldn't update the bug's state because its ID is null");
                return;
            }
            a.C0094a aVar2 = a.C0094a.ATTACHMENTS_READY_TO_BE_UPLOADED;
            aVar.Y1 = aVar2;
            ContentValues contentValues = new ContentValues();
            contentValues.put(InstabugDbContract.BugEntry.COLUMN_BUG_STATE, aVar2.name());
            i0.j.b.k.a.b(this.a.c, contentValues);
            try {
                a.this.b(this.a);
            } catch (JSONException e) {
                StringBuilder P0 = i0.d.a.a.a.P0("Something went wrong while uploading bug attachments e: ");
                P0.append(e.getMessage());
                InstabugSDKLogger.e("BugUploaderHelper", P0.toString());
            }
        }
    }

    /* compiled from: BugUploaderHelper */
    public class c implements Request.Callbacks<Boolean, com.instabug.bug.model.a> {
        public final /* synthetic */ com.instabug.bug.model.a a;

        public c(com.instabug.bug.model.a aVar) {
            this.a = aVar;
        }

        public void onFailed(Object obj) {
            com.instabug.bug.model.a aVar = (com.instabug.bug.model.a) obj;
            InstabugSDKLogger.d("BugUploaderHelper", "Something went wrong while uploading bug attachments");
        }

        public void onSucceeded(Object obj) {
            Boolean bool = (Boolean) obj;
            InstabugSDKLogger.d("BugUploaderHelper", "Bug attachments uploaded successfully, deleting bug");
            if (!(this.a.getState() == null || this.a.getState().getUri() == null)) {
                StringBuilder P0 = i0.d.a.a.a.P0("attempting to delete state file for bug with id: ");
                P0.append(this.a.c);
                InstabugSDKLogger.i("BugUploaderHelper", P0.toString());
                DiskUtils.with(a.this.a).deleteOperation(new DeleteUriDiskOperation(this.a.getState().getUri())).executeAsync(new b());
            }
            String str = this.a.c;
            if (str != null) {
                synchronized (i0.j.b.k.a.class) {
                    SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
                    String[] strArr = {str};
                    openDatabase.beginTransaction();
                    try {
                        openDatabase.delete(InstabugDbContract.BugEntry.TABLE_NAME, "id=? ", strArr);
                        openDatabase.setTransactionSuccessful();
                    } finally {
                        openDatabase.endTransaction();
                        openDatabase.close();
                    }
                }
            }
        }
    }

    public a(Context context) {
        this.a = context;
    }

    public void a() throws IOException, JSONException {
        List<com.instabug.bug.model.a> a2 = i0.j.b.k.a.a(this.a);
        StringBuilder P0 = i0.d.a.a.a.P0("Found ");
        ArrayList arrayList = (ArrayList) a2;
        P0.append(arrayList.size());
        P0.append(" bugs in cache");
        InstabugSDKLogger.d("BugUploaderHelper", P0.toString());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.instabug.bug.model.a aVar = (com.instabug.bug.model.a) it.next();
            if (aVar.Y1.equals(a.C0094a.READY_TO_BE_SENT)) {
                StringBuilder P02 = i0.d.a.a.a.P0("Uploading bug: ");
                P02.append(aVar.toString());
                InstabugSDKLogger.d("BugUploaderHelper", P02.toString());
                f a3 = f.a();
                Context context = this.a;
                C0160a aVar2 = new C0160a(aVar);
                Objects.requireNonNull(a3);
                StringBuilder P03 = i0.d.a.a.a.P0("Reporting a bug with message: ");
                P03.append(aVar.x);
                InstabugSDKLogger.d("BugsService", P03.toString());
                Request buildRequest = a3.b.buildRequest(context, Request.Endpoint.REPORT_BUG, Request.RequestMethod.Post);
                a3.c = buildRequest;
                if (aVar.getState() != null) {
                    ArrayList<State.StateItem> stateItems = aVar.getState().getStateItems();
                    for (int i = 0; i < stateItems.size(); i++) {
                        String key = stateItems.get(i).getKey();
                        Object value = stateItems.get(i).getValue();
                        if (!(key == null || value == null)) {
                            InstabugSDKLogger.d("BugsService", "Bug State Key: " + key + ", Bug State value: " + value);
                            buildRequest.addRequestBodyParameter(key, value);
                        }
                    }
                }
                a3.c.addRequestBodyParameter(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, aVar.x);
                a3.c.addRequestBodyParameter("attachments_count", Integer.valueOf(aVar.b().size()));
                a3.c.addRequestBodyParameter("categories", StringUtility.toCommaSeparated(aVar.d2));
                Request request = a3.c;
                a3.c = request;
                a3.b.doRequest(request).c(new c(aVar2, context));
            } else if (aVar.Y1.equals(a.C0094a.LOGS_READY_TO_BE_UPLOADED)) {
                StringBuilder P04 = i0.d.a.a.a.P0("Bug: ");
                P04.append(aVar.toString());
                P04.append(" already uploaded but has unsent logs, uploading now");
                InstabugSDKLogger.d("BugUploaderHelper", P04.toString());
                c(aVar);
            } else if (aVar.Y1.equals(a.C0094a.ATTACHMENTS_READY_TO_BE_UPLOADED)) {
                StringBuilder P05 = i0.d.a.a.a.P0("Bug: ");
                P05.append(aVar.toString());
                P05.append(" already uploaded but has unsent attachments, uploading now");
                InstabugSDKLogger.d("BugUploaderHelper", P05.toString());
                b(aVar);
            }
        }
    }

    public final void b(com.instabug.bug.model.a aVar) throws JSONException {
        StringBuilder P0 = i0.d.a.a.a.P0("Found ");
        P0.append(aVar.b().size());
        P0.append(" attachments related to bug: ");
        P0.append(aVar.x);
        InstabugSDKLogger.d("BugUploaderHelper", P0.toString());
        f a2 = f.a();
        Context context = this.a;
        c cVar = new c(aVar);
        Objects.requireNonNull(a2);
        InstabugSDKLogger.d("BugsService", "Uploading Bug attachments");
        ArrayList arrayList = new ArrayList(aVar.b().size());
        for (int i = 0; i < aVar.b().size(); i++) {
            Attachment attachment = aVar.b().get(i);
            boolean decryptAttachmentAndUpdateDb = AttachmentsUtility.decryptAttachmentAndUpdateDb(attachment);
            if (!(attachment.getLocalPath() == null || attachment.getName() == null)) {
                File file = new File(attachment.getLocalPath());
                if (decryptAttachmentAndUpdateDb && file.exists() && file.length() > 0) {
                    Request buildRequest = a2.b.buildRequest(context, Request.Endpoint.ADD_BUG_ATTACHMENT, Request.RequestMethod.Post, NetworkManager.RequestType.MULTI_PART);
                    String endpoint = buildRequest.getEndpoint();
                    if (endpoint != null) {
                        String str = aVar.d;
                        if (str != null) {
                            endpoint = endpoint.replaceAll(":bug_token", str);
                        }
                        buildRequest.setEndpoint(endpoint);
                    }
                    if (attachment.getType() != null) {
                        buildRequest.addParameter("metadata[file_type]", attachment.getType());
                        if (attachment.getType() == Attachment.Type.AUDIO && attachment.getDuration() != null) {
                            buildRequest.addParameter("metadata[duration]", attachment.getDuration());
                        }
                    }
                    attachment.setAttachmentState(Attachment.AttachmentState.SYNCED);
                    buildRequest.setFileToUpload(new Request.FileToUpload("file", attachment.getName(), attachment.getLocalPath(), attachment.getFileType()));
                    arrayList.add(a2.b.doRequest(buildRequest));
                } else if (!decryptAttachmentAndUpdateDb) {
                    StringBuilder P02 = i0.d.a.a.a.P0("Skipping attachment file of type ");
                    P02.append(attachment.getType());
                    P02.append(" because it was not decrypted successfully");
                    InstabugSDKLogger.e("BugsService", P02.toString());
                } else if (!file.exists() || file.length() <= 0) {
                    StringBuilder P03 = i0.d.a.a.a.P0("Skipping attachment file of type ");
                    P03.append(attachment.getType());
                    P03.append(" because it's either not found or empty file");
                    InstabugSDKLogger.e("BugsService", P03.toString());
                }
            }
        }
        l.r(arrayList, 1).c(new d(aVar, cVar));
    }

    public final void c(com.instabug.bug.model.a aVar) {
        StringBuilder P0 = i0.d.a.a.a.P0("START uploading all logs related to this bug id = ");
        P0.append(aVar.c);
        InstabugSDKLogger.d("BugUploaderHelper", P0.toString());
        f a2 = f.a();
        Context context = this.a;
        b bVar = new b(aVar);
        Objects.requireNonNull(a2);
        try {
            a2.b.doRequest(a2.b(context, aVar)).c(new e(bVar, aVar));
        } catch (JSONException e) {
            InstabugSDKLogger.e("BugsService", "uploading bug logs got Json error ", e);
            bVar.onFailed(aVar);
        }
    }
}
