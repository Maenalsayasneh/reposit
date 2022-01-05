package com.instabug.crash.network;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.instabug.crash.c.a;
import com.instabug.crash.d.c;
import com.instabug.crash.e.d;
import com.instabug.crash.e.e;
import com.instabug.crash.e.f;
import com.instabug.library.Instabug;
import com.instabug.library.internal.storage.AttachmentManager;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.cache.AttachmentsDbHelper;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.operation.DeleteUriDiskOperation;
import com.instabug.library.internal.video.InstabugVideoUtils;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.State;
import com.instabug.library.network.InstabugNetworkBasedBackgroundService;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import k0.b.l;
import org.json.JSONException;

public class InstabugCrashesUploaderService extends InstabugNetworkBasedBackgroundService {
    public static final /* synthetic */ int c = 0;

    public class a implements Request.Callbacks<Boolean, com.instabug.crash.c.a> {
        public final /* synthetic */ com.instabug.crash.c.a a;

        public a(com.instabug.crash.c.a aVar) {
            this.a = aVar;
        }

        public void onFailed(Object obj) {
            com.instabug.crash.c.a aVar = (com.instabug.crash.c.a) obj;
            InstabugSDKLogger.d("InstabugCrashesUploaderService", "Something went wrong while uploading crash logs");
        }

        public void onSucceeded(Object obj) {
            Boolean bool = (Boolean) obj;
            InstabugSDKLogger.d("InstabugCrashesUploaderService", "crash logs uploaded successfully, change its state");
            com.instabug.crash.c.a aVar = this.a;
            a.C0101a aVar2 = a.C0101a.ATTACHMENTS_READY_TO_BE_UPLOADED;
            aVar.Y1 = aVar2;
            ContentValues contentValues = new ContentValues();
            contentValues.put(InstabugDbContract.CrashEntry.COLUMN_CRASH_STATE, aVar2.name());
            i0.j.c.l.a.D(this.a.c, contentValues);
            try {
                InstabugCrashesUploaderService instabugCrashesUploaderService = InstabugCrashesUploaderService.this;
                com.instabug.crash.c.a aVar3 = this.a;
                int i = InstabugCrashesUploaderService.c;
                instabugCrashesUploaderService.a(aVar3);
            } catch (FileNotFoundException | JSONException e) {
                StringBuilder P0 = i0.d.a.a.a.P0("Something went wrong while uploading crash attachments e: ");
                P0.append(e.getMessage());
                InstabugSDKLogger.e("InstabugCrashesUploaderService", P0.toString());
            }
        }
    }

    public class b implements Request.Callbacks<Boolean, com.instabug.crash.c.a> {
        public final /* synthetic */ com.instabug.crash.c.a a;

        public b(com.instabug.crash.c.a aVar) {
            this.a = aVar;
        }

        public void onFailed(Object obj) {
            com.instabug.crash.c.a aVar = (com.instabug.crash.c.a) obj;
            InstabugSDKLogger.e("InstabugCrashesUploaderService", "Something went wrong while uploading crash attachments");
        }

        public void onSucceeded(Object obj) {
            Boolean bool = (Boolean) obj;
            InstabugSDKLogger.d("InstabugCrashesUploaderService", "Crash attachments uploaded successfully, deleting crash");
            i0.j.c.l.a.F(this.a.c);
            Context applicationContext = Instabug.getApplicationContext();
            if (applicationContext == null || this.a.y.getUri() == null) {
                StringBuilder P0 = i0.d.a.a.a.P0("unable to delete state file for crash with id: ");
                P0.append(this.a.c);
                P0.append("due to null context reference");
                InstabugSDKLogger.i(this, P0.toString());
            } else {
                StringBuilder P02 = i0.d.a.a.a.P0("attempting to delete state file for crash with id: ");
                P02.append(this.a.c);
                InstabugSDKLogger.d("InstabugCrashesUploaderService", P02.toString());
                DiskUtils.with(applicationContext).deleteOperation(new DeleteUriDiskOperation(this.a.y.getUri())).executeAsync(new com.instabug.crash.e.b());
            }
            InstabugCrashesUploaderService.b(InstabugCrashesUploaderService.this);
        }
    }

    public static void b(InstabugCrashesUploaderService instabugCrashesUploaderService) {
        Objects.requireNonNull(instabugCrashesUploaderService);
        Calendar instance = Calendar.getInstance(Locale.ENGLISH);
        StringBuilder P0 = i0.d.a.a.a.P0("Updating last_crash_time to ");
        P0.append(instance.getTime());
        InstabugSDKLogger.d("InstabugCrashesUploaderService", P0.toString());
        com.instabug.crash.d.a a2 = com.instabug.crash.d.a.a();
        long time = instance.getTime().getTime();
        synchronized (a2) {
            if (c.a() != null) {
                c.a().b.edit().putLong("last_crash_time", time).apply();
            }
        }
    }

    public final void a(com.instabug.crash.c.a aVar) throws JSONException, FileNotFoundException {
        StringBuilder P0 = i0.d.a.a.a.P0("Found ");
        P0.append(aVar.x.size());
        P0.append(" attachments related to crash: ");
        P0.append(aVar.q);
        InstabugSDKLogger.d("InstabugCrashesUploaderService", P0.toString());
        f a2 = f.a();
        b bVar = new b(aVar);
        Objects.requireNonNull(a2);
        InstabugSDKLogger.d("CrashesService", "Uploading Crash attachments");
        ArrayList arrayList = new ArrayList(aVar.x.size());
        for (int i = 0; i < aVar.x.size(); i++) {
            Attachment attachment = aVar.x.get(i);
            if (AttachmentsUtility.decryptAttachmentAndUpdateDb(attachment)) {
                Request buildRequest = a2.b.buildRequest((Context) this, Request.Endpoint.ADD_CRASH_ATTACHMENT, Request.RequestMethod.Post, NetworkManager.RequestType.MULTI_PART);
                buildRequest.setEndpoint(buildRequest.getEndpoint().replaceAll(":crash_token", aVar.d));
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
                        InstabugSDKLogger.w("CrashesService", P02.toString());
                    } else {
                        attachment.setAttachmentState(Attachment.AttachmentState.SYNCED);
                        arrayList.add(a2.b.doRequest(buildRequest));
                    }
                } else {
                    StringBuilder P03 = i0.d.a.a.a.P0("Skipping attachment file of type ");
                    P03.append(attachment.getType());
                    P03.append(" because it's either not found or empty file");
                    InstabugSDKLogger.w("CrashesService", P03.toString());
                }
            } else {
                StringBuilder P04 = i0.d.a.a.a.P0("Skipping attachment file of type ");
                P04.append(attachment.getType());
                P04.append(" because it was not decrypted successfully");
                InstabugSDKLogger.w("CrashesService", P04.toString());
            }
        }
        l.r(arrayList, 1).c(new d(aVar, bVar));
    }

    public final void c(com.instabug.crash.c.a aVar) {
        StringBuilder P0 = i0.d.a.a.a.P0("START uploading all logs related to this crash id = ");
        P0.append(aVar.c);
        InstabugSDKLogger.d("InstabugCrashesUploaderService", P0.toString());
        f a2 = f.a();
        a aVar2 = new a(aVar);
        Objects.requireNonNull(a2);
        try {
            Request b2 = a2.b(this, aVar);
            a2.b.doRequest(b2).c(new e(aVar2, aVar));
        } catch (JSONException e) {
            StringBuilder P02 = i0.d.a.a.a.P0("uploading crash logs got Json error: ");
            P02.append(e.getMessage());
            InstabugSDKLogger.d("CrashesService", P02.toString());
            aVar2.onFailed(aVar);
        }
    }

    public void runBackgroundTask() throws Exception {
        if (SettingsManager.getInstance().autoScreenRecordingEnabled()) {
            int autoScreenRecordingMaxDuration = SettingsManager.getInstance().autoScreenRecordingMaxDuration();
            Iterator it = ((ArrayList) i0.j.c.l.a.q(getApplicationContext())).iterator();
            while (it.hasNext()) {
                com.instabug.crash.c.a aVar = (com.instabug.crash.c.a) it.next();
                if (aVar.Y1 == a.C0101a.WAITING_FOR_SCREEN_RECORDING_TO_BE_TRIMMED) {
                    Iterator<Attachment> it2 = aVar.x.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Attachment next = it2.next();
                        if (next.isEncrypted()) {
                            next.setEncrypted(AttachmentsUtility.decryptAttachmentAndUpdateDb(next));
                        }
                        if (next.getType() != null && next.getType().toString().equalsIgnoreCase(Attachment.Type.AUTO_SCREEN_RECORDING_VIDEO.toString()) && next.getLocalPath() != null) {
                            File startTrim = InstabugVideoUtils.startTrim(new File(next.getLocalPath()), AttachmentManager.getAutoScreenRecordingFile(getApplicationContext()), autoScreenRecordingMaxDuration);
                            Uri fromFile = Uri.fromFile(startTrim);
                            if (fromFile.getLastPathSegment() != null) {
                                next.setName(fromFile.getLastPathSegment());
                            }
                            if (fromFile.getPath() != null) {
                                next.setLocalPath(fromFile.getPath());
                            }
                            InstabugSDKLogger.d("InstabugCrashesUploaderService", "auto screen recording trimmed");
                            a.C0101a aVar2 = a.C0101a.READY_TO_BE_SENT;
                            aVar.Y1 = aVar2;
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(InstabugDbContract.CrashEntry.COLUMN_CRASH_STATE, aVar2.name());
                            i0.j.c.l.a.D(aVar.c, contentValues);
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("local_path", startTrim.getPath());
                            AttachmentsDbHelper.update(next.getId(), contentValues2);
                        }
                    }
                }
            }
        }
        if (getApplicationContext() != null) {
            List<com.instabug.crash.c.a> q = i0.j.c.l.a.q(getApplicationContext());
            StringBuilder P0 = i0.d.a.a.a.P0("Found ");
            ArrayList arrayList = (ArrayList) q;
            P0.append(arrayList.size());
            P0.append(" crashes in cache");
            InstabugSDKLogger.d("InstabugCrashesUploaderService", P0.toString());
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                com.instabug.crash.c.a aVar3 = (com.instabug.crash.c.a) it3.next();
                if (aVar3.Y1.equals(a.C0101a.READY_TO_BE_SENT)) {
                    StringBuilder P02 = i0.d.a.a.a.P0("Uploading crash: ");
                    P02.append(aVar3.toString());
                    InstabugSDKLogger.d("InstabugCrashesUploaderService", P02.toString());
                    f a2 = f.a();
                    com.instabug.crash.e.a aVar4 = new com.instabug.crash.e.a(this, aVar3);
                    Objects.requireNonNull(a2);
                    StringBuilder P03 = i0.d.a.a.a.P0("Reporting crash with crash message: ");
                    P03.append(aVar3.q);
                    InstabugSDKLogger.d("CrashesService", P03.toString());
                    Request buildRequest = a2.b.buildRequest((Context) this, Request.Endpoint.REPORT_CRASH, Request.RequestMethod.Post);
                    String str = aVar3.q;
                    if (str != null && str.contains("InstabugSDK-v: ")) {
                        buildRequest.addRequestBodyParameter("application_token", "b1a9630002b2cbdfbfecd942744b9018");
                    }
                    ArrayList<State.StateItem> stateItems = aVar3.y.getStateItems();
                    if (stateItems != null && stateItems.size() > 0) {
                        for (int i = 0; i < stateItems.size(); i++) {
                            StringBuilder P04 = i0.d.a.a.a.P0("Crash State Key: ");
                            P04.append(stateItems.get(i).getKey());
                            P04.append(", Crash State value: ");
                            P04.append(stateItems.get(i).getValue());
                            InstabugSDKLogger.d("CrashesService", P04.toString());
                            if (stateItems.get(i).getKey() != null) {
                                buildRequest.addRequestBodyParameter(stateItems.get(i).getKey(), stateItems.get(i).getValue());
                            }
                        }
                    }
                    buildRequest.addRequestBodyParameter(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, aVar3.q);
                    buildRequest.addRequestBodyParameter(InstabugDbContract.CrashEntry.COLUMN_HANDLED, Boolean.valueOf(aVar3.Z1));
                    List<Attachment> list = aVar3.x;
                    if (list != null && list.size() > 0) {
                        buildRequest.addRequestBodyParameter("attachments_count", Integer.valueOf(aVar3.x.size()));
                    }
                    a2.b.doRequest(buildRequest).c(new com.instabug.crash.e.c(aVar3, aVar4));
                } else if (aVar3.Y1.equals(a.C0101a.LOGS_READY_TO_BE_UPLOADED)) {
                    StringBuilder P05 = i0.d.a.a.a.P0("crash: ");
                    P05.append(aVar3.toString());
                    P05.append(" already uploaded but has unsent logs, uploading now");
                    InstabugSDKLogger.d("InstabugCrashesUploaderService", P05.toString());
                    c(aVar3);
                } else if (aVar3.Y1.equals(a.C0101a.ATTACHMENTS_READY_TO_BE_UPLOADED)) {
                    StringBuilder P06 = i0.d.a.a.a.P0("crash: ");
                    P06.append(aVar3.toString());
                    P06.append(" already uploaded but has unsent attachments, uploading now");
                    InstabugSDKLogger.d("InstabugCrashesUploaderService", P06.toString());
                    a(aVar3);
                }
            }
        }
    }
}
