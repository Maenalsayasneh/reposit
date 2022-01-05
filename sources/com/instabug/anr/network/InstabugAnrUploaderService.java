package com.instabug.anr.network;

import android.content.ContentValues;
import android.content.Context;
import com.instabug.anr.f.d;
import com.instabug.anr.f.e;
import com.instabug.anr.f.f;
import com.instabug.library.Instabug;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.internal.storage.operation.DeleteUriDiskOperation;
import com.instabug.library.model.Attachment;
import com.instabug.library.network.InstabugNetworkBasedBackgroundService;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import k0.b.l;
import org.json.JSONException;

public class InstabugAnrUploaderService extends InstabugNetworkBasedBackgroundService {
    public static final /* synthetic */ int c = 0;

    public class a implements Request.Callbacks<Boolean, com.instabug.anr.e.a> {
        public final /* synthetic */ com.instabug.anr.e.a a;

        public a(com.instabug.anr.e.a aVar) {
            this.a = aVar;
        }

        public void onFailed(Object obj) {
            com.instabug.anr.e.a aVar = (com.instabug.anr.e.a) obj;
            InstabugSDKLogger.d("InstabugAnrUploaderService", "Something went wrong while uploading ANR logs");
        }

        public void onSucceeded(Object obj) {
            Boolean bool = (Boolean) obj;
            InstabugSDKLogger.d("InstabugAnrUploaderService", "ANR logs uploaded successfully, change its state");
            this.a.e = 3;
            ContentValues contentValues = new ContentValues();
            contentValues.put(InstabugDbContract.AnrEntry.COLUMN_ANR_UPLOAD_STATE, 3);
            com.instabug.anr.d.a.a(this.a.a, contentValues);
            try {
                InstabugAnrUploaderService instabugAnrUploaderService = InstabugAnrUploaderService.this;
                com.instabug.anr.e.a aVar = this.a;
                int i = InstabugAnrUploaderService.c;
                instabugAnrUploaderService.a(aVar);
            } catch (JSONException unused) {
                InstabugAnrUploaderService instabugAnrUploaderService2 = InstabugAnrUploaderService.this;
                StringBuilder P0 = i0.d.a.a.a.P0("Error happened while uploading ANR: ");
                P0.append(this.a.a);
                P0.append("attachments.");
                InstabugSDKLogger.e(instabugAnrUploaderService2, P0.toString());
            }
        }
    }

    public class b implements Request.Callbacks<Boolean, com.instabug.anr.e.a> {
        public final /* synthetic */ com.instabug.anr.e.a a;

        public b(com.instabug.anr.e.a aVar) {
            this.a = aVar;
        }

        public void onFailed(Object obj) {
            com.instabug.anr.e.a aVar = (com.instabug.anr.e.a) obj;
            InstabugSDKLogger.e("InstabugAnrUploaderService", "Something went wrong while uploading ANR attachments");
        }

        /* JADX INFO: finally extract failed */
        public void onSucceeded(Object obj) {
            Boolean bool = (Boolean) obj;
            InstabugSDKLogger.d("InstabugAnrUploaderService", "Anr attachments uploaded successfully, deleting ANR");
            String str = this.a.a;
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            String[] strArr = {str};
            openDatabase.beginTransaction();
            try {
                openDatabase.delete(InstabugDbContract.AnrEntry.TABLE_NAME, "anr_id=? ", strArr);
                openDatabase.setTransactionSuccessful();
                openDatabase.endTransaction();
                openDatabase.close();
                Context applicationContext = Instabug.getApplicationContext();
                if (applicationContext == null || this.a.g.getUri() == null) {
                    StringBuilder P0 = i0.d.a.a.a.P0("unable to delete state file for ANR with id: ");
                    P0.append(this.a.a);
                    P0.append("due to null context reference");
                    InstabugSDKLogger.i(this, P0.toString());
                    return;
                }
                StringBuilder P02 = i0.d.a.a.a.P0("attempting to delete state file for ANR with id: ");
                P02.append(this.a.a);
                InstabugSDKLogger.d("InstabugAnrUploaderService", P02.toString());
                DiskUtils.with(applicationContext).deleteOperation(new DeleteUriDiskOperation(this.a.g.getUri())).executeAsync(new com.instabug.anr.f.b());
            } catch (Throwable th) {
                openDatabase.endTransaction();
                openDatabase.close();
                throw th;
            }
        }
    }

    public final void a(com.instabug.anr.e.a aVar) throws JSONException {
        StringBuilder P0 = i0.d.a.a.a.P0("Found ");
        P0.append(aVar.d.size());
        P0.append(" attachments related to ANR: ");
        P0.append(aVar.b);
        InstabugSDKLogger.d("InstabugAnrUploaderService", P0.toString());
        f a2 = f.a();
        b bVar = new b(aVar);
        Objects.requireNonNull(a2);
        InstabugSDKLogger.d("AnrsService", "Uploading Anr attachments");
        ArrayList arrayList = new ArrayList(aVar.d.size());
        for (int i = 0; i < aVar.d.size(); i++) {
            Attachment attachment = aVar.d.get(i);
            if (AttachmentsUtility.decryptAttachmentAndUpdateDb(attachment)) {
                Request buildRequest = a2.b.buildRequest((Context) this, Request.Endpoint.ADD_CRASH_ATTACHMENT, Request.RequestMethod.Post, NetworkManager.RequestType.MULTI_PART);
                buildRequest.setEndpoint(buildRequest.getEndpoint().replaceAll(":crash_token", aVar.f));
                buildRequest.addParameter("metadata[file_type]", attachment.getType());
                if (attachment.getType() == Attachment.Type.AUDIO) {
                    buildRequest.addParameter("metadata[duration]", attachment.getDuration());
                }
                if (!(attachment.getName() == null || attachment.getLocalPath() == null)) {
                    buildRequest.setFileToUpload(new Request.FileToUpload("file", attachment.getName(), attachment.getLocalPath(), attachment.getFileType()));
                }
                if (attachment.getLocalPath() != null) {
                    File file = new File(attachment.getLocalPath());
                    if (!file.exists() || file.length() <= 0) {
                        StringBuilder P02 = i0.d.a.a.a.P0("Skipping attachment file of type ");
                        P02.append(attachment.getType());
                        P02.append(" because it's either not found or empty file");
                        InstabugSDKLogger.w("AnrsService", P02.toString());
                    } else {
                        attachment.setAttachmentState(Attachment.AttachmentState.SYNCED);
                        arrayList.add(a2.b.doRequest(buildRequest));
                    }
                } else {
                    StringBuilder P03 = i0.d.a.a.a.P0("Skipping attachment file of type ");
                    P03.append(attachment.getType());
                    P03.append(" because it's either not found or empty file");
                    InstabugSDKLogger.w("AnrsService", P03.toString());
                }
            } else {
                StringBuilder P04 = i0.d.a.a.a.P0("Skipping attachment file of type ");
                P04.append(attachment.getType());
                P04.append(" because it was not decrypted successfully");
                InstabugSDKLogger.w("AnrsService", P04.toString());
            }
        }
        l.r(arrayList, 1).c(new e(aVar, bVar));
    }

    public final void b(com.instabug.anr.e.a aVar) {
        StringBuilder P0 = i0.d.a.a.a.P0("START uploading all logs related to this ANR id = ");
        P0.append(aVar.a);
        InstabugSDKLogger.d("InstabugAnrUploaderService", P0.toString());
        f a2 = f.a();
        a aVar2 = new a(aVar);
        Objects.requireNonNull(a2);
        try {
            Request b2 = a2.b(this, aVar);
            a2.b.doRequest(b2).c(new d(aVar2, aVar));
        } catch (JSONException e) {
            StringBuilder P02 = i0.d.a.a.a.P0("uploading ANR logs got Json error: ");
            P02.append(e.getMessage());
            InstabugSDKLogger.d("AnrsService", P02.toString());
            aVar2.onFailed(aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ce, code lost:
        if (r13 == null) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e7, code lost:
        if (r13 == null) goto L_0x00ec;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void runBackgroundTask() throws java.lang.Exception {
        /*
            r14 = this;
            android.content.Context r0 = r14.getApplicationContext()
            if (r0 != 0) goto L_0x0008
            goto L_0x023f
        L_0x0008:
            android.content.Context r0 = r14.getApplicationContext()
            java.lang.Class<com.instabug.anr.d.a> r1 = com.instabug.anr.d.a.class
            monitor-enter(r1)
            com.instabug.library.internal.storage.cache.db.DatabaseManager r2 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()     // Catch:{ all -> 0x0249 }
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r2 = r2.openDatabase()     // Catch:{ all -> 0x0249 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0249 }
            r12.<init>()     // Catch:{ all -> 0x0249 }
            r13 = 0
            java.lang.String r4 = "anrs_table"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r10 = "anr_id ASC"
            r11 = 0
            r3 = r2
            android.database.Cursor r13 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            if (r13 == 0) goto L_0x00ce
            boolean r3 = r13.moveToFirst()     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            if (r3 == 0) goto L_0x00ce
        L_0x0034:
            com.instabug.anr.e.a r3 = new com.instabug.anr.e.a     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            r3.<init>()     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            java.lang.String r4 = "anr_id"
            int r4 = r13.getColumnIndex(r4)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            java.lang.String r4 = r13.getString(r4)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            r3.a = r4     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            java.lang.String r4 = "anr_main_thread_data"
            int r4 = r13.getColumnIndex(r4)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            java.lang.String r4 = r13.getString(r4)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            r3.b = r4     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            java.lang.String r4 = "anr_rest_of_threads_data"
            int r4 = r13.getColumnIndex(r4)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            java.lang.String r4 = r13.getString(r4)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            r3.c = r4     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            java.lang.String r4 = "anr_upload_state"
            int r4 = r13.getColumnIndex(r4)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            int r4 = r13.getInt(r4)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            r3.e = r4     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            java.lang.String r4 = "temporary_server_token"
            int r4 = r13.getColumnIndex(r4)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            java.lang.String r4 = r13.getString(r4)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            r3.f = r4     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            java.lang.String r4 = "long_message"
            int r4 = r13.getColumnIndex(r4)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            java.lang.String r4 = r13.getString(r4)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            r3.h = r4     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            java.lang.String r4 = r3.a     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            java.util.ArrayList r4 = com.instabug.library.internal.storage.cache.AttachmentsDbHelper.retrieve(r4, r2)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            java.util.concurrent.CopyOnWriteArrayList r5 = new java.util.concurrent.CopyOnWriteArrayList     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            r3.d = r5     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            java.lang.String r4 = "state"
            int r4 = r13.getColumnIndex(r4)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            java.lang.String r4 = r13.getString(r4)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            if (r4 == 0) goto L_0x00c5
            com.instabug.library.model.State r5 = new com.instabug.library.model.State     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            r5.<init>()     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            r5.setUri(r4)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            com.instabug.library.internal.storage.DiskUtils r6 = com.instabug.library.internal.storage.DiskUtils.with(r0)     // Catch:{ OutOfMemoryError -> 0x00bd }
            com.instabug.library.internal.storage.operation.ReadStateFromFileDiskOperation r7 = new com.instabug.library.internal.storage.operation.ReadStateFromFileDiskOperation     // Catch:{ OutOfMemoryError -> 0x00bd }
            r7.<init>(r4)     // Catch:{ OutOfMemoryError -> 0x00bd }
            com.instabug.library.internal.storage.executor.ReadOperationExecutor r4 = r6.readOperation(r7)     // Catch:{ OutOfMemoryError -> 0x00bd }
            java.lang.String r4 = r4.execute()     // Catch:{ OutOfMemoryError -> 0x00bd }
            r5.fromJson(r4)     // Catch:{ OutOfMemoryError -> 0x00bd }
            r3.g = r5     // Catch:{ OutOfMemoryError -> 0x00bd }
            goto L_0x00c5
        L_0x00bd:
            r4 = move-exception
            java.lang.String r5 = "AnrReportsDbHelper"
            java.lang.String r6 = "Retrieving ANR state throws OOM"
            com.instabug.library.util.InstabugSDKLogger.e(r5, r6, r4)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
        L_0x00c5:
            r12.add(r3)     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            boolean r3 = r13.moveToNext()     // Catch:{ IOException -> 0x00df, JSONException -> 0x00d4 }
            if (r3 != 0) goto L_0x0034
        L_0x00ce:
            if (r13 == 0) goto L_0x00ec
            goto L_0x00e9
        L_0x00d1:
            r0 = move-exception
            goto L_0x0240
        L_0x00d4:
            r0 = move-exception
            java.lang.String r3 = "AnrReportsDbHelper"
            java.lang.String r4 = "retrieve: "
            com.instabug.library.util.InstabugSDKLogger.e(r3, r4, r0)     // Catch:{ all -> 0x00d1 }
            if (r13 == 0) goto L_0x00ec
            goto L_0x00e9
        L_0x00df:
            r0 = move-exception
            java.lang.String r3 = "AnrReportsDbHelper"
            java.lang.String r4 = "retrieve: "
            com.instabug.library.util.InstabugSDKLogger.e(r3, r4, r0)     // Catch:{ all -> 0x00d1 }
            if (r13 == 0) goto L_0x00ec
        L_0x00e9:
            r13.close()     // Catch:{ all -> 0x0249 }
        L_0x00ec:
            r2.close()     // Catch:{ all -> 0x0249 }
            monitor-exit(r1)
            java.lang.String r0 = "Found "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            int r1 = r12.size()
            r0.append(r1)
            java.lang.String r1 = " ANRs in cache"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "InstabugAnrUploaderService"
            com.instabug.library.util.InstabugSDKLogger.d(r1, r0)
            java.util.Iterator r0 = r12.iterator()
        L_0x010f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x023f
            java.lang.Object r1 = r0.next()
            com.instabug.anr.e.a r1 = (com.instabug.anr.e.a) r1
            int r2 = r1.e
            r3 = 1
            if (r2 != r3) goto L_0x01f9
            java.lang.String r2 = "Uploading anr: "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            java.lang.String r3 = r1.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "InstabugAnrUploaderService"
            com.instabug.library.util.InstabugSDKLogger.d(r3, r2)
            com.instabug.anr.f.f r2 = com.instabug.anr.f.f.a()
            com.instabug.anr.f.a r3 = new com.instabug.anr.f.a
            r3.<init>(r14, r1)
            com.instabug.library.network.NetworkManager r4 = r2.b
            com.instabug.library.network.Request$Endpoint r5 = com.instabug.library.network.Request.Endpoint.REPORT_ANR
            com.instabug.library.network.Request$RequestMethod r6 = com.instabug.library.network.Request.RequestMethod.Post
            com.instabug.library.network.Request r4 = r4.buildRequest((android.content.Context) r14, (com.instabug.library.network.Request.Endpoint) r5, (com.instabug.library.network.Request.RequestMethod) r6)
            com.instabug.library.model.State r5 = r1.g
            java.lang.String r6 = "AnrsService"
            if (r5 == 0) goto L_0x01b4
            java.util.ArrayList r5 = r5.getStateItems()
            if (r5 == 0) goto L_0x01b4
            int r7 = r5.size()
            if (r7 <= 0) goto L_0x01b4
            r7 = 0
        L_0x015c:
            int r8 = r5.size()
            if (r7 >= r8) goto L_0x01b4
            java.lang.String r8 = "Anr State Key: "
            java.lang.StringBuilder r8 = i0.d.a.a.a.P0(r8)
            java.lang.Object r9 = r5.get(r7)
            com.instabug.library.model.State$StateItem r9 = (com.instabug.library.model.State.StateItem) r9
            java.lang.String r9 = r9.getKey()
            r8.append(r9)
            java.lang.String r9 = ", Anr State value: "
            r8.append(r9)
            java.lang.Object r9 = r5.get(r7)
            com.instabug.library.model.State$StateItem r9 = (com.instabug.library.model.State.StateItem) r9
            java.lang.Object r9 = r9.getValue()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.instabug.library.util.InstabugSDKLogger.d(r6, r8)
            java.lang.Object r8 = r5.get(r7)
            com.instabug.library.model.State$StateItem r8 = (com.instabug.library.model.State.StateItem) r8
            java.lang.String r8 = r8.getKey()
            if (r8 == 0) goto L_0x01b1
            java.lang.Object r8 = r5.get(r7)
            com.instabug.library.model.State$StateItem r8 = (com.instabug.library.model.State.StateItem) r8
            java.lang.String r8 = r8.getKey()
            java.lang.Object r9 = r5.get(r7)
            com.instabug.library.model.State$StateItem r9 = (com.instabug.library.model.State.StateItem) r9
            java.lang.Object r9 = r9.getValue()
            r4.addRequestBodyParameter(r8, r9)
        L_0x01b1:
            int r7 = r7 + 1
            goto L_0x015c
        L_0x01b4:
            java.lang.String r5 = r1.b
            java.lang.String r7 = "title"
            r4.addRequestBodyParameter(r7, r5)
            java.lang.String r5 = r1.c
            java.lang.String r7 = "threads_details"
            r4.addRequestBodyParameter(r7, r5)
            java.lang.String r5 = r1.h
            java.lang.String r7 = "ANR_message"
            r4.addRequestBodyParameter(r7, r5)
            java.util.List<com.instabug.library.model.Attachment> r5 = r1.d
            if (r5 == 0) goto L_0x01e2
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x01e2
            java.util.List<com.instabug.library.model.Attachment> r5 = r1.d
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r7 = "attachments_count"
            r4.addRequestBodyParameter(r7, r5)
        L_0x01e2:
            java.lang.String r5 = r4.getRequestBody()
            com.instabug.library.util.InstabugSDKLogger.d(r6, r5)
            com.instabug.anr.f.c r5 = new com.instabug.anr.f.c
            r5.<init>(r2, r1, r3)
            com.instabug.library.network.NetworkManager r1 = r2.b
            k0.b.l r1 = r1.doRequest(r4)
            r1.c(r5)
            goto L_0x010f
        L_0x01f9:
            r3 = 2
            if (r2 != r3) goto L_0x021c
            java.lang.String r2 = "ANR: "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            java.lang.String r3 = r1.toString()
            r2.append(r3)
            java.lang.String r3 = " already uploaded but has unsent logs, uploading now"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "InstabugAnrUploaderService"
            com.instabug.library.util.InstabugSDKLogger.d(r3, r2)
            r14.b(r1)
            goto L_0x010f
        L_0x021c:
            r3 = 3
            if (r2 != r3) goto L_0x010f
            java.lang.String r2 = "ANR: "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            java.lang.String r3 = r1.toString()
            r2.append(r3)
            java.lang.String r3 = " already uploaded but has unsent attachments, uploading now"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "InstabugAnrUploaderService"
            com.instabug.library.util.InstabugSDKLogger.d(r3, r2)
            r14.a(r1)
            goto L_0x010f
        L_0x023f:
            return
        L_0x0240:
            if (r13 == 0) goto L_0x0245
            r13.close()     // Catch:{ all -> 0x0249 }
        L_0x0245:
            r2.close()     // Catch:{ all -> 0x0249 }
            throw r0     // Catch:{ all -> 0x0249 }
        L_0x0249:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.anr.network.InstabugAnrUploaderService.runBackgroundTask():void");
    }
}
