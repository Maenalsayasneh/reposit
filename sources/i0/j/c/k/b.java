package i0.j.c.k;

import android.content.Context;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.e.b;
import com.instabug.chat.e.d;
import com.instabug.chat.eventbus.ChatTimeUpdatedEventBus;
import com.instabug.chat.eventbus.ChatTriggeringEventBus;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.model.State;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.c.k.d.e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import k0.b.l;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MessageUploaderHelper */
public class b {
    public Context a;

    /* compiled from: MessageUploaderHelper */
    public class a implements Request.Callbacks<String, Throwable> {
        public final /* synthetic */ com.instabug.chat.e.b a;

        public a(com.instabug.chat.e.b bVar) {
            this.a = bVar;
        }

        public void onFailed(Object obj) {
            b bVar = b.this;
            StringBuilder P0 = i0.d.a.a.a.P0("Something went wrong while triggering offline chat with id: ");
            P0.append(this.a.c);
            InstabugSDKLogger.e(bVar, P0.toString(), (Throwable) obj);
        }

        public void onSucceeded(Object obj) {
            String str = (String) obj;
            if (str != null) {
                b bVar = b.this;
                StringBuilder P0 = i0.d.a.a.a.P0("triggering chat ");
                P0.append(this.a.toString());
                P0.append(" triggeredChatId: ");
                P0.append(str);
                InstabugSDKLogger.v(bVar, P0.toString());
                String str2 = this.a.c;
                ChatTriggeringEventBus.getInstance().post(new i0.j.c.g.a(str2, str));
                b bVar2 = b.this;
                InstabugSDKLogger.v(bVar2, "Updating local chat with id: " + str2 + ", with synced chat with id: " + str);
                com.instabug.chat.e.b bVar3 = this.a;
                bVar3.c = str;
                bVar3.h();
                this.a.x = b.a.LOGS_READY_TO_BE_UPLOADED;
                InMemoryCache<String, com.instabug.chat.e.b> cache = ChatsCacheManager.getCache();
                if (cache != null) {
                    cache.delete(str2);
                    com.instabug.chat.e.b bVar4 = this.a;
                    cache.put(bVar4.c, bVar4);
                }
                ChatsCacheManager.saveCacheToDisk();
                b.this.b(this.a);
            }
        }
    }

    /* renamed from: i0.j.c.k.b$b  reason: collision with other inner class name */
    /* compiled from: MessageUploaderHelper */
    public class C0166b implements Request.Callbacks<String, Throwable> {
        public final /* synthetic */ com.instabug.chat.e.d a;

        public C0166b(com.instabug.chat.e.d dVar) {
            this.a = dVar;
        }

        public void onFailed(Object obj) {
            InstabugSDKLogger.e(b.this, "Something went wrong while uploading cached message", (Throwable) obj);
        }

        public void onSucceeded(Object obj) {
            String str = (String) obj;
            if (str != null && !str.equals("") && !str.equals("null")) {
                b bVar = b.this;
                InstabugSDKLogger.v(bVar, "Send message response: " + str);
                com.instabug.chat.e.b chat = ChatsCacheManager.getChat(this.a.d);
                if (chat != null) {
                    chat.q.remove(this.a);
                    com.instabug.chat.e.d dVar = this.a;
                    dVar.c = str;
                    if (dVar.b2.size() == 0) {
                        this.a.e2 = d.c.READY_TO_BE_SYNCED;
                    } else {
                        this.a.e2 = d.c.SENT;
                    }
                    b bVar2 = b.this;
                    StringBuilder P0 = i0.d.a.a.a.P0("Caching sent message:");
                    P0.append(this.a.toString());
                    InstabugSDKLogger.v(bVar2, P0.toString());
                    chat.q.add(this.a);
                    InMemoryCache<String, com.instabug.chat.e.b> cache = ChatsCacheManager.getCache();
                    if (cache != null) {
                        cache.put(chat.c, chat);
                    }
                    ChatsCacheManager.saveCacheToDisk();
                    if (this.a.b2.size() == 0) {
                        i0.j.c.l.a.t(Calendar.getInstance(Locale.ENGLISH).getTime().getTime());
                        ChatTimeUpdatedEventBus.getInstance().post(Long.valueOf(InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds()));
                        return;
                    }
                    try {
                        b.this.c(this.a);
                    } catch (FileNotFoundException | JSONException e) {
                        b bVar3 = b.this;
                        StringBuilder P02 = i0.d.a.a.a.P0("Something went wrong while uploading messageattach attachments ");
                        P02.append(e.getMessage());
                        InstabugSDKLogger.v(bVar3, P02.toString());
                    }
                } else {
                    InstabugSDKLogger.e(this, "Chat is null so can't remove message from it");
                }
            }
        }
    }

    /* compiled from: MessageUploaderHelper */
    public class c implements Request.Callbacks<Boolean, com.instabug.chat.e.d> {
        public final /* synthetic */ com.instabug.chat.e.d a;

        public c(com.instabug.chat.e.d dVar) {
            this.a = dVar;
        }

        public void onFailed(Object obj) {
            com.instabug.chat.e.d dVar = (com.instabug.chat.e.d) obj;
            b bVar = b.this;
            StringBuilder P0 = i0.d.a.a.a.P0("Something went wrong while uploading message attachments, Message: ");
            P0.append(this.a);
            InstabugSDKLogger.e(bVar, P0.toString());
        }

        public void onSucceeded(Object obj) {
            Boolean bool = (Boolean) obj;
            InstabugSDKLogger.v(b.this, "Message attachments uploaded successfully");
            com.instabug.chat.e.b chat = ChatsCacheManager.getChat(this.a.d);
            if (chat != null) {
                chat.q.remove(this.a);
                this.a.e2 = d.c.READY_TO_BE_SYNCED;
                for (int i = 0; i < this.a.b2.size(); i++) {
                    this.a.b2.get(i).y = "synced";
                }
                b bVar = b.this;
                StringBuilder P0 = i0.d.a.a.a.P0("Caching sent message:");
                P0.append(this.a.toString());
                InstabugSDKLogger.v(bVar, P0.toString());
                chat.q.add(this.a);
                InMemoryCache<String, com.instabug.chat.e.b> cache = ChatsCacheManager.getCache();
                if (cache != null) {
                    cache.put(chat.c, chat);
                }
                ChatsCacheManager.saveCacheToDisk();
                i0.j.c.l.a.t(Calendar.getInstance(Locale.ENGLISH).getTime().getTime());
                ChatTimeUpdatedEventBus.getInstance().post(Long.valueOf(InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds()));
                return;
            }
            InstabugSDKLogger.e(this, "Chat is null so can't remove message from it");
        }
    }

    /* compiled from: MessageUploaderHelper */
    public class d implements Request.Callbacks<Boolean, com.instabug.chat.e.b> {
        public final /* synthetic */ com.instabug.chat.e.b a;

        public d(com.instabug.chat.e.b bVar) {
            this.a = bVar;
        }

        public void onFailed(Object obj) {
            com.instabug.chat.e.b bVar = (com.instabug.chat.e.b) obj;
            InstabugSDKLogger.d(b.this, "Something went wrong while uploading chat logs");
        }

        public void onSucceeded(Object obj) {
            Boolean bool = (Boolean) obj;
            InstabugSDKLogger.d(b.this, "chat logs uploaded successfully, change its state");
            this.a.x = b.a.SENT;
            ChatsCacheManager.saveCacheToDisk();
        }
    }

    public b(Context context) {
        this.a = context;
    }

    public void a() throws IOException, JSONException {
        List<com.instabug.chat.e.b> offlineChats = ChatsCacheManager.getOfflineChats();
        StringBuilder P0 = i0.d.a.a.a.P0("Found ");
        P0.append(offlineChats.size());
        P0.append(" offline chats in cache");
        InstabugSDKLogger.v(this, P0.toString());
        for (com.instabug.chat.e.b next : ChatsCacheManager.getOfflineChats()) {
            b.a aVar = next.x;
            if (aVar == null || !aVar.equals(b.a.READY_TO_BE_SENT) || next.q.size() <= 0) {
                b.a aVar2 = next.x;
                if (aVar2 != null && aVar2.equals(b.a.LOGS_READY_TO_BE_UPLOADED)) {
                    StringBuilder P02 = i0.d.a.a.a.P0("chat: ");
                    P02.append(next.toString());
                    P02.append(" already uploaded but has unsent logs, uploading now");
                    InstabugSDKLogger.d(this, P02.toString());
                    b(next);
                }
            } else {
                InstabugSDKLogger.v(this, "Uploading offline Chat: " + next);
                i0.j.c.k.d.d a2 = i0.j.c.k.d.d.a();
                Context context = this.a;
                State state = next.d;
                a aVar3 = new a(next);
                Objects.requireNonNull(a2);
                InstabugSDKLogger.v(a2, "trigger chat");
                Request buildRequest = a2.b.buildRequest(context, Request.Endpoint.TRIGGER_CHAT, Request.RequestMethod.Post);
                if (state != null) {
                    ArrayList<State.StateItem> stateItems = state.getStateItems();
                    for (int i = 0; i < state.getStateItems().size(); i++) {
                        String key = stateItems.get(i).getKey();
                        Object value = stateItems.get(i).getValue();
                        if (!(key == null || value == null)) {
                            InstabugSDKLogger.v(a2, "Chat State Key: " + key + ", Chat State value: " + value);
                            buildRequest.addRequestBodyParameter(key, value);
                        }
                    }
                }
                a2.b.doRequest(buildRequest).c(new i0.j.c.k.d.a(aVar3));
            }
        }
    }

    public final void b(com.instabug.chat.e.b bVar) {
        StringBuilder P0 = i0.d.a.a.a.P0("START uploading all logs related to this chat id = ");
        P0.append(bVar.c);
        InstabugSDKLogger.d(this, P0.toString());
        i0.j.c.k.d.d a2 = i0.j.c.k.d.d.a();
        Context context = this.a;
        d dVar = new d(bVar);
        Objects.requireNonNull(a2);
        try {
            Request buildRequest = a2.b.buildRequest(context, Request.Endpoint.CHAT_LOGS, Request.RequestMethod.Post);
            buildRequest.setEndpoint(buildRequest.getEndpoint().replaceAll(":chat_token", bVar.c));
            State state = bVar.d;
            if (state != null) {
                Iterator<State.StateItem> it = state.getLogsItems().iterator();
                while (it.hasNext()) {
                    State.StateItem next = it.next();
                    if (next.getKey() != null && !next.getKey().equals(State.KEY_VISUAL_USER_STEPS) && !next.getKey().equals(State.KEY_SESSIONS_PROFILER) && next.getValue() != null) {
                        buildRequest.addRequestBodyParameter(next.getKey(), next.getValue());
                    }
                }
            }
            a2.b.doRequest(buildRequest).c(new e(dVar, bVar));
        } catch (JSONException e) {
            StringBuilder P02 = i0.d.a.a.a.P0("uploading chat logs got Json error: ");
            P02.append(e.getMessage());
            InstabugSDKLogger.d(a2, P02.toString());
            dVar.onFailed(bVar);
        }
    }

    public final void c(com.instabug.chat.e.d dVar) throws JSONException, FileNotFoundException {
        String str;
        StringBuilder P0 = i0.d.a.a.a.P0("Found ");
        P0.append(dVar.b2.size());
        P0.append(" attachments related to message: ");
        P0.append(dVar.q);
        InstabugSDKLogger.v(this, P0.toString());
        i0.j.c.k.d.d a2 = i0.j.c.k.d.d.a();
        Context context = this.a;
        c cVar = new c(dVar);
        Objects.requireNonNull(a2);
        StringBuilder P02 = i0.d.a.a.a.P0("Uploading message attachments, Message: ");
        P02.append(dVar.q);
        InstabugSDKLogger.v(a2, P02.toString());
        ArrayList arrayList = new ArrayList(dVar.b2.size());
        for (int i = 0; i < dVar.b2.size(); i++) {
            com.instabug.chat.e.a aVar = dVar.b2.get(i);
            StringBuilder P03 = i0.d.a.a.a.P0("Uploading attachment with type: ");
            P03.append(aVar.x);
            InstabugSDKLogger.v(a2, P03.toString());
            Request buildRequest = a2.b.buildRequest(context, Request.Endpoint.ADD_MESSAGE_ATTACHMENT, Request.RequestMethod.Post, NetworkManager.RequestType.MULTI_PART);
            if (!(buildRequest.getEndpoint() == null || aVar.x == null || aVar.c == null || aVar.d == null || aVar.a() == null || dVar.d == null)) {
                buildRequest.setEndpoint(buildRequest.getEndpoint().replaceAll(":chat_number", dVar.d));
                buildRequest.setEndpoint(buildRequest.getEndpoint().replaceAll(":message_id", String.valueOf(dVar.c)));
                buildRequest.addParameter("metadata[file_type]", aVar.x);
                if (aVar.x.equals("audio") && (str = aVar.Z1) != null) {
                    buildRequest.addParameter("metadata[duration]", str);
                }
                buildRequest.setFileToUpload(new Request.FileToUpload("file", aVar.c, aVar.d, aVar.a()));
                InstabugSDKLogger.v(a2, "Uploading attachment with name: " + aVar.c + " path: " + aVar.d + " file type: " + aVar.a());
                File file = new File(aVar.d);
                if (!file.exists() || file.length() <= 0) {
                    StringBuilder P04 = i0.d.a.a.a.P0("Skipping attachment file of type ");
                    P04.append(aVar.x);
                    P04.append(" because it's either not found or empty file");
                    InstabugSDKLogger.e(a2, P04.toString());
                } else {
                    aVar.y = "synced";
                    arrayList.add(a2.b.doRequest(buildRequest));
                }
            }
        }
        l.r(arrayList, 1).c(new i0.j.c.k.d.c(cVar, dVar));
    }

    public void d(List<com.instabug.chat.e.d> list) throws IOException, JSONException {
        StringBuilder P0 = i0.d.a.a.a.P0("Found ");
        P0.append(list.size());
        P0.append(" offline messages in cache");
        InstabugSDKLogger.v(this, P0.toString());
        for (int i = 0; i < list.size(); i++) {
            com.instabug.chat.e.d dVar = list.get(i);
            d.c cVar = dVar.e2;
            if (cVar == d.c.READY_TO_BE_SENT) {
                StringBuilder P02 = i0.d.a.a.a.P0("Uploading message: ");
                P02.append(list.get(i));
                InstabugSDKLogger.v(this, P02.toString());
                i0.j.c.k.d.d a2 = i0.j.c.k.d.d.a();
                Context context = this.a;
                C0166b bVar = new C0166b(dVar);
                Objects.requireNonNull(a2);
                InstabugSDKLogger.v(a2, "Sending message");
                Request buildRequest = a2.b.buildRequest(context, Request.Endpoint.SEND_MESSAGE, Request.RequestMethod.Post);
                buildRequest.setEndpoint(buildRequest.getEndpoint().replaceAll(":chat_number", dVar.d));
                buildRequest.addParameter(InstabugDbContract.BugEntry.COLUMN_MESSAGE, new JSONObject().put("body", (Object) dVar.q).put("messaged_at", dVar.Y1).put("email", (Object) dVar.g2).put("name", (Object) dVar.f2).put(State.KEY_PUSH_TOKEN, (Object) dVar.h2));
                a2.b.doRequest(buildRequest).c(new i0.j.c.k.d.b(bVar));
            } else if (cVar == d.c.SENT) {
                StringBuilder P03 = i0.d.a.a.a.P0("Uploading message's attachments : ");
                P03.append(list.get(i));
                InstabugSDKLogger.v(this, P03.toString());
                try {
                    c(dVar);
                } catch (FileNotFoundException | JSONException e) {
                    StringBuilder P04 = i0.d.a.a.a.P0("Something went wrong while uploading message attachments ");
                    P04.append(e.getMessage());
                    InstabugSDKLogger.v(this, P04.toString());
                }
            }
        }
    }
}
