package i0.j.c.i;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.e.b;
import com.instabug.chat.e.d;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.internal.video.InternalScreenRecordHelper;
import com.instabug.library.internal.video.ScreenRecordingContract;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.user.UserManagerWrapper;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import k0.b.w.a;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: ExternalScreenRecordHelper */
public class c implements ScreenRecordingContract {
    public static c a;
    public String b;
    public String c;
    public a d;
    public a e;

    public static void a(c cVar, Uri uri) {
        ArrayList<d> arrayList;
        Objects.requireNonNull(cVar);
        if (uri != null) {
            String str = cVar.b;
            d dVar = new d(UserManagerWrapper.getUserName(), UserManagerWrapper.getUserEmail(), InstabugCore.getPushNotificationToken());
            dVar.d = str;
            dVar.q = "";
            dVar.Y1 = InstabugDateFormatter.getCurrentUTCTimeStampInSeconds();
            dVar.b(InstabugDateFormatter.getCurrentUTCTimeStampInSeconds());
            dVar.a(d.b.INBOUND);
            com.instabug.chat.e.a aVar = new com.instabug.chat.e.a();
            aVar.c = uri.getLastPathSegment();
            aVar.d = uri.getPath();
            aVar.x = "extra_video";
            aVar.y = "offline";
            aVar.Y1 = false;
            StringBuilder P0 = i0.d.a.a.a.P0("Adding hanging message with ID: ");
            P0.append(dVar.c);
            InstabugSDKLogger.i(cVar, P0.toString());
            cVar.c = dVar.c;
            dVar.e2 = d.c.STAY_OFFLINE;
            dVar.b2.add(aVar);
            b chat = ChatsCacheManager.getChat(str);
            if (!(chat == null || (arrayList = chat.q) == null)) {
                b.a aVar2 = chat.x;
                if (aVar2 == b.a.WAITING_ATTACHMENT_MESSAGE) {
                    chat.x = b.a.SENT;
                } else if (aVar2 != b.a.SENT) {
                    chat.x = b.a.READY_TO_BE_SENT;
                }
                arrayList.add(dVar);
                InMemoryCache<String, b> cache = ChatsCacheManager.getCache();
                if (cache != null) {
                    cache.put(chat.c, chat);
                }
            }
            b chat2 = ChatsCacheManager.getChat(cVar.b);
            if (chat2 != null) {
                ArrayList<d> arrayList2 = chat2.q;
                String str2 = cVar.c;
                for (int i = 0; i < arrayList2.size(); i++) {
                    d dVar2 = arrayList2.get(i);
                    StringBuilder P02 = i0.d.a.a.a.P0("getting message with ID: ");
                    P02.append(dVar2.c);
                    InstabugSDKLogger.d(cVar, P02.toString());
                    if (dVar2.c.equals(str2)) {
                        Iterator<com.instabug.chat.e.a> it = dVar2.b2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                com.instabug.chat.e.a next = it.next();
                                String str3 = next.x;
                                if (str3 != null && str3.equals("extra_video")) {
                                    InstabugSDKLogger.d(cVar, "Setting attachment type to Video");
                                    next.c = uri.getLastPathSegment();
                                    next.d = uri.getPath();
                                    next.Y1 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        dVar2.e2 = d.c.READY_TO_BE_SENT;
                    }
                }
                InMemoryCache<String, b> cache2 = ChatsCacheManager.getCache();
                if (cache2 != null) {
                    cache2.put(chat2.c, chat2);
                }
                InstabugSDKLogger.d(cVar, "video is encoded and updated in its message");
                Context applicationContext = Instabug.getApplicationContext();
                if (applicationContext != null) {
                    new i0.j.c.k.c(applicationContext);
                }
            } else {
                InstabugSDKLogger.e(cVar, "Hanging Chat is null and can't be updated");
            }
        }
        Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.startActivity(i0.j.c.l.a.f(currentActivity, cVar.b));
        }
    }

    public void clear() {
        a aVar = this.d;
        if (aVar != null && !aVar.isDisposed()) {
            this.d.dispose();
        }
        a aVar2 = this.e;
        if (aVar2 != null && !aVar2.isDisposed()) {
            this.e.dispose();
        }
        InternalScreenRecordHelper.getInstance().clear();
    }

    public void delete() {
        InternalScreenRecordHelper.getInstance().delete();
    }

    public Uri getAutoScreenRecordingFileUri() {
        return InternalScreenRecordHelper.getInstance().getAutoScreenRecordingFileUri();
    }

    public boolean isEnabled() {
        return InternalScreenRecordHelper.getInstance().isEnabled();
    }
}
