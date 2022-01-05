package i0.j.c.m;

import android.content.Context;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.e.b;
import com.instabug.chat.e.d;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: NewMessagesHandler */
public class a {
    public static a a;
    public List<b> b = new ArrayList();

    public static a d() {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    public final d a(d dVar, List<d> list) {
        for (d next : list) {
            if (dVar.c.equals(next.c)) {
                return next;
            }
        }
        return null;
    }

    public void b(b bVar) {
        if (!this.b.contains(bVar)) {
            this.b.add(bVar);
        }
    }

    public final b c(d dVar) {
        b bVar;
        if (dVar.d == null) {
            return null;
        }
        InMemoryCache<String, b> cache = ChatsCacheManager.getCache();
        if (cache != null && (bVar = cache.get(dVar.d)) != null) {
            return bVar;
        }
        InstabugSDKLogger.v(this, "No local chats match messages's chat");
        return null;
    }

    public final void e(Context context, List<d> list) {
        StringBuilder P0 = i0.d.a.a.a.P0("new messages count: ");
        P0.append(list.size());
        InstabugSDKLogger.v(this, P0.toString());
        for (d next : list) {
            StringBuilder P02 = i0.d.a.a.a.P0("new message to updating: ");
            P02.append(next.toString());
            InstabugSDKLogger.v(this, P02.toString());
            if (f(next) == null) {
                b c = c(next);
                if (c == null && next.d != null) {
                    StringBuilder P03 = i0.d.a.a.a.P0("Chat with id ");
                    P03.append(next.d);
                    P03.append(" doesn't exist, creating new one");
                    InstabugSDKLogger.v(this, P03.toString());
                    c = new b(next.d);
                    c.x = b.a.SENT;
                }
                c.q.add(next);
                InstabugSDKLogger.d(this, "Message " + next + " added to cached chat: " + c);
                InMemoryCache<String, b> cache = ChatsCacheManager.getCache();
                if (cache != null) {
                    cache.put(c.c, c);
                }
            } else if (g(next)) {
                InstabugSDKLogger.v(this, "Message:" + next + " is ready to be synced");
                try {
                    ChatsCacheManager.updateLocalMessageWithSyncedMessage(context, next);
                } catch (IOException e) {
                    StringBuilder P04 = i0.d.a.a.a.P0("Failed to update local message: ");
                    P04.append(f(next));
                    P04.append(" with synced message: ");
                    P04.append(next);
                    InstabugSDKLogger.e(this, P04.toString(), e);
                }
            }
        }
    }

    public final d f(d dVar) {
        ArrayList<d> arrayList;
        b c = c(dVar);
        if (c == null) {
            arrayList = null;
        } else {
            arrayList = c.q;
        }
        if (arrayList != null) {
            for (d next : arrayList) {
                if (next.c.equals(dVar.c)) {
                    return next;
                }
            }
        }
        return null;
    }

    public final boolean g(d dVar) {
        d f = f(dVar);
        return f != null && f.c.equals(dVar.c) && f.e2.equals(d.c.READY_TO_BE_SYNCED) && f.b2.size() == dVar.b2.size();
    }
}
