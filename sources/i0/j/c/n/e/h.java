package i0.j.c.n.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.instabug.chat.ChatPlugin;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.cache.ReadQueueCacheManager;
import com.instabug.chat.e.b;
import com.instabug.chat.e.c;
import com.instabug.chat.e.d;
import com.instabug.chat.e.e;
import com.instabug.chat.eventbus.ChatTriggeringEventBus;
import com.instabug.chat.settings.AttachmentTypesState;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.ScreenRecordingEventBus;
import com.instabug.library.core.ui.BasePresenter;
import com.instabug.library.internal.InstabugMediaProjectionIntent;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.cache.CacheChangedListener;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.internal.video.InternalScreenRecordHelper;
import com.instabug.library.internal.video.RequestPermissionActivity;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.user.UserManagerWrapper;
import com.instabug.library.util.FileUtils;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.VideoManipulationUtils;
import h0.o.a.k;
import i0.j.c.h.l;
import i0.j.c.i.c;
import io.reactivex.subjects.PublishSubject;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import k0.b.w.a;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: ChatPresenter */
public class h extends BasePresenter<c> implements b, CacheChangedListener<b>, i0.j.c.m.b {
    public PublishSubject<String> c;
    public a d;
    public a q;
    public b x;

    public h(c cVar) {
        super(cVar);
    }

    public d C(String str, com.instabug.chat.e.a aVar) {
        d v = v(str, "");
        v.b2.add(aVar);
        return v;
    }

    public com.instabug.chat.e.a G(Uri uri, String str) {
        com.instabug.chat.e.a aVar = new com.instabug.chat.e.a();
        aVar.y = "offline";
        aVar.x = str;
        aVar.d = uri.getPath();
        aVar.c = uri.getLastPathSegment();
        return aVar;
    }

    public void I(com.instabug.chat.e.a aVar) {
        String str = aVar.x;
        if (str != null && aVar.d != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -831439762:
                    if (str.equals("image_gallery")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 93166550:
                    if (str.equals("audio")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1698911340:
                    if (str.equals("extra_image")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 1710800780:
                    if (str.equals("extra_video")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 1830389646:
                    if (str.equals("video_gallery")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            if (c2 == 0 || c2 == 1) {
                WeakReference<V> weakReference = this.view;
                if (weakReference != null) {
                    c cVar = (c) weakReference.get();
                    if (i0.j.c.l.b.a().d) {
                        L(C(this.x.c, aVar));
                    } else if (cVar != null) {
                        cVar.G(Uri.fromFile(new File(aVar.d)), aVar.x);
                    }
                }
            } else {
                L(C(this.x.c, aVar));
            }
        }
    }

    public void J(Intent intent) {
        WeakReference<V> weakReference = this.view;
        if (weakReference != null) {
            c cVar = (c) weakReference.get();
            if (c.a == null) {
                c.a = new c();
            }
            c cVar2 = c.a;
            String str = this.x.c;
            cVar2.b = str;
            InternalScreenRecordHelper.getInstance().init();
            a aVar = cVar2.d;
            if (aVar == null || aVar.isDisposed()) {
                cVar2.d = ScreenRecordingEventBus.getInstance().subscribe(new i0.j.c.i.a(cVar2));
            }
            cVar2.e = ChatTriggeringEventBus.getInstance().subscribe(new i0.j.c.i.b(cVar2, str));
            this.x.x = b.a.WAITING_ATTACHMENT_MESSAGE;
            if (cVar != null) {
                cVar.finishActivity();
            }
            ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
            if (chatPlugin != null) {
                chatPlugin.setState(2);
            }
        }
    }

    public void K(int i, int i2, Intent intent) {
        Pair<String, String> fileNameAndSize;
        Class<ChatPlugin> cls = ChatPlugin.class;
        c cVar = (c) this.view.get();
        if (cVar != null) {
            k activity = ((Fragment) cVar.getViewContext()).getActivity();
            if (i == 161) {
                if (!(i2 != -1 || intent == null || intent.getData() == null || activity == null || cVar.getViewContext() == null || ((Fragment) cVar.getViewContext()).getContext() == null || (fileNameAndSize = AttachmentsUtility.getFileNameAndSize(((Fragment) cVar.getViewContext()).getContext(), intent.getData())) == null)) {
                    String str = null;
                    Object obj = fileNameAndSize.first;
                    String str2 = (String) obj;
                    if (obj != null) {
                        str = FileUtils.getExtension(str2);
                    }
                    Object obj2 = fileNameAndSize.second;
                    String str3 = obj2 != null ? (String) obj2 : "0";
                    if (str == null) {
                        InstabugSDKLogger.e("ChatPresenter", "file extension is null");
                    } else if (FileUtils.isImageExtension(str)) {
                        n();
                        File fileFromContentProvider = AttachmentsUtility.getFileFromContentProvider(((Fragment) cVar.getViewContext()).getContext(), intent.getData(), str2);
                        if (fileFromContentProvider != null) {
                            I(G(Uri.fromFile(fileFromContentProvider), "image_gallery"));
                        }
                    } else if (FileUtils.isVideoExtension(str)) {
                        try {
                            if ((Long.parseLong(str3) / 1024) / 1024 > 50) {
                                cVar.n();
                                InstabugSDKLogger.e("ChatPresenter", "video size exceeded the limit");
                                ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(cls);
                                if (chatPlugin != null) {
                                    chatPlugin.setState(1);
                                }
                            } else {
                                File fileFromContentProvider2 = AttachmentsUtility.getFileFromContentProvider(((Fragment) cVar.getViewContext()).getContext(), intent.getData(), str2);
                                if (fileFromContentProvider2 == null) {
                                    InstabugSDKLogger.e("ChatPresenter", "video file is null");
                                } else if (VideoManipulationUtils.extractVideoDuration(fileFromContentProvider2.getPath()) > 60000) {
                                    cVar.d();
                                    InstabugSDKLogger.e("ChatPresenter", "video length exceeded the limit");
                                    if (fileFromContentProvider2.delete()) {
                                        InstabugSDKLogger.v("ChatPresenter", "file deleted");
                                    }
                                } else {
                                    n();
                                    I(k(Uri.fromFile(fileFromContentProvider2)));
                                }
                            }
                        } catch (Exception e) {
                            InstabugSDKLogger.e("ChatPresenter", e.getMessage(), e);
                        }
                    }
                }
                ChatPlugin chatPlugin2 = (ChatPlugin) InstabugCore.getXPlugin(cls);
                if (chatPlugin2 != null) {
                    chatPlugin2.setState(1);
                }
            } else if (i != 2030) {
                if (i == 3890 && i2 == -1 && intent != null) {
                    InstabugMediaProjectionIntent.setMediaProjectionIntent(intent);
                    J(intent);
                }
            } else if (intent != null && intent.getBooleanExtra(RequestPermissionActivity.KEY_IS_PERMISSION_GRANDTED, false)) {
                u();
            }
        }
    }

    public void L(d dVar) {
        c cVar;
        StringBuilder P0 = i0.d.a.a.a.P0("chat id: ");
        P0.append(dVar.d);
        InstabugSDKLogger.v(h.class, P0.toString());
        this.x.q.add(dVar);
        b bVar = this.x;
        if (bVar.d == null) {
            bVar.x = b.a.SENT;
        }
        InMemoryCache<String, b> cache = ChatsCacheManager.getCache();
        if (cache != null) {
            b bVar2 = this.x;
            cache.put(bVar2.c, bVar2);
            ChatsCacheManager.saveCacheToDisk();
        }
        WeakReference<V> weakReference = this.view;
        if (weakReference != null && (cVar = (c) weakReference.get()) != null && ((Fragment) cVar.getViewContext()).getContext() != null) {
            new i0.j.c.k.c(((Fragment) cVar.getViewContext()).getContext());
        }
    }

    public void a() {
        if (SettingsManager.getInstance().isScreenshotByMediaProjectionEnabled()) {
            c cVar = (c) this.view.get();
            if (cVar != null) {
                cVar.f();
                return;
            }
            return;
        }
        u();
    }

    public List<com.instabug.chat.e.c> c(List<d> list) {
        ArrayList<e> arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (d next : list) {
            ArrayList<com.instabug.chat.e.a> arrayList3 = next.b2;
            if (arrayList3 != null && arrayList3.size() > 0) {
                Iterator<com.instabug.chat.e.a> it = next.b2.iterator();
                while (it.hasNext()) {
                    com.instabug.chat.e.a next2 = it.next();
                    com.instabug.chat.e.c cVar = new com.instabug.chat.e.c();
                    cVar.a = next.q;
                    cVar.b = next.y;
                    cVar.g = next.Y1;
                    cVar.c = next2.q;
                    cVar.d = next2.d;
                    cVar.h = next.c();
                    StringBuilder P0 = i0.d.a.a.a.P0("type");
                    P0.append(next2.a());
                    InstabugSDKLogger.i(this, P0.toString());
                    String str = next2.x;
                    if (str != null) {
                        str.hashCode();
                        char c2 = 65535;
                        switch (str.hashCode()) {
                            case -831439762:
                                if (str.equals("image_gallery")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case 93166550:
                                if (str.equals("audio")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 100313435:
                                if (str.equals("image")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case 112202875:
                                if (str.equals("video")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 1698911340:
                                if (str.equals("extra_image")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                            case 1710800780:
                                if (str.equals("extra_video")) {
                                    c2 = 5;
                                    break;
                                }
                                break;
                            case 1830389646:
                                if (str.equals("video_gallery")) {
                                    c2 = 6;
                                    break;
                                }
                                break;
                        }
                        switch (c2) {
                            case 0:
                            case 2:
                            case 4:
                                cVar.e = c.b.IMAGE;
                                break;
                            case 1:
                                cVar.e = c.b.AUDIO;
                                cVar.f = c.a.NONE;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                cVar.e = c.b.VIDEO;
                                break;
                        }
                    }
                    arrayList2.add(cVar);
                }
            }
            if (!TextUtils.isEmpty(next.q)) {
                com.instabug.chat.e.c cVar2 = new com.instabug.chat.e.c();
                cVar2.a = next.q;
                cVar2.b = next.y;
                cVar2.g = next.Y1;
                cVar2.h = next.c();
                cVar2.e = c.b.MESSAGE;
                ArrayList<e> arrayList4 = next.c2;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    cVar2.i = next.c2;
                }
                arrayList2.add(cVar2);
            } else if (!next.c() && (arrayList = next.c2) != null && arrayList.size() > 0) {
                com.instabug.chat.e.c cVar3 = new com.instabug.chat.e.c();
                cVar3.a = next.q;
                cVar3.b = next.y;
                cVar3.g = next.Y1;
                cVar3.h = next.c();
                cVar3.e = c.b.MESSAGE;
                cVar3.i = next.c2;
                arrayList2.add(cVar3);
            }
        }
        return arrayList2;
    }

    public b d() {
        return this.x;
    }

    public void g() {
        CacheManager.getInstance().unSubscribe(ChatsCacheManager.CHATS_MEMORY_CACHE_KEY, this);
        i0.j.c.m.a.d().b.remove(this);
        if (l(this.q)) {
            this.q.dispose();
        }
        if (l(this.d)) {
            this.d.dispose();
        }
    }

    public void i(String str) {
        c cVar;
        c cVar2;
        this.x = m(str);
        WeakReference<V> weakReference = this.view;
        if (!(weakReference == null || (cVar2 = (c) weakReference.get()) == null)) {
            if (ChatsCacheManager.getValidChats().size() > 0) {
                cVar2.u();
            } else {
                cVar2.I();
            }
        }
        WeakReference<V> weakReference2 = this.view;
        if (!(weakReference2 == null || (cVar = (c) weakReference2.get()) == null)) {
            AttachmentTypesState l = i0.j.c.l.a.l();
            if (l.isScreenshotEnabled() || l.isImageFromGalleryEnabled() || l.isScreenRecordingEnabled()) {
                cVar.h();
            } else {
                cVar.g();
            }
        }
        r(this.x);
        p(this.x);
    }

    public com.instabug.chat.e.a k(Uri uri) {
        com.instabug.chat.e.a aVar = new com.instabug.chat.e.a();
        aVar.y = "offline";
        aVar.x = "video_gallery";
        aVar.d = uri.getPath();
        aVar.Y1 = true;
        return aVar;
    }

    public final boolean l(a aVar) {
        return aVar != null && !aVar.isDisposed();
    }

    @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public final b m(String str) {
        if (ChatsCacheManager.getCache() == null || ChatsCacheManager.getChat(str) == null) {
            return new b();
        }
        return ChatsCacheManager.getChat(str);
    }

    public void n() {
        b bVar = this.x;
        if (bVar.x == b.a.WAITING_ATTACHMENT_MESSAGE) {
            bVar.x = b.a.READY_TO_BE_SENT;
        }
        PublishSubject<String> publishSubject = new PublishSubject<>();
        this.c = publishSubject;
        this.d = publishSubject.e(300, TimeUnit.MILLISECONDS).s(k0.b.v.a.a.a()).t(new f(this), k0.b.z.b.a.e, k0.b.z.b.a.c, k0.b.z.b.a.d);
        CacheManager.getInstance().subscribe(ChatsCacheManager.CHATS_MEMORY_CACHE_KEY, this);
        i0.j.c.m.a d2 = i0.j.c.m.a.d();
        if (!d2.b.contains(this)) {
            d2.b.add(this);
        }
        if (!l(this.q)) {
            this.q = ChatTriggeringEventBus.getInstance().subscribe(new g(this));
        }
    }

    public void o() {
        ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
        if (chatPlugin != null && chatPlugin.getAppContext() != null && this.x != null) {
            InstabugSDKLogger.v(com.instabug.chat.ui.f.d.class, "pick image from gallery");
            chatPlugin.setState(2);
            this.x.x = b.a.WAITING_ATTACHMENT_MESSAGE;
            c cVar = (c) this.view.get();
            if (cVar != null) {
                cVar.t();
            }
        }
    }

    public void onCacheInvalidated() {
        StringBuilder P0 = i0.d.a.a.a.P0("Chats cache was invalidated, Time: ");
        P0.append(System.currentTimeMillis());
        InstabugSDKLogger.d(this, P0.toString());
    }

    public void onCachedItemAdded(Object obj) {
        t(((b) obj).c);
    }

    public void onCachedItemRemoved(Object obj) {
        t(((b) obj).c);
    }

    public void onCachedItemUpdated(Object obj, Object obj2) {
        b bVar = (b) obj;
        t(((b) obj2).c);
    }

    public List<d> onNewMessagesReceived(List<d> list) {
        c cVar;
        WeakReference<V> weakReference = this.view;
        if (!(weakReference == null || (cVar = (c) weakReference.get()) == null || ((Fragment) cVar.getViewContext()).getActivity() == null)) {
            for (d next : list) {
                String str = next.d;
                if (str != null && str.equals(this.x.c)) {
                    list.remove(next);
                    l.a().e(((Fragment) cVar.getViewContext()).getActivity());
                    p(this.x);
                }
            }
        }
        return list;
    }

    public void p(b bVar) {
        for (int size = bVar.q.size() - 1; size >= 0; size--) {
            bVar.q.get(size).Z1 = true;
        }
        if (ChatsCacheManager.getCache() != null) {
            ChatsCacheManager.getCache().put(bVar.c, bVar);
        }
    }

    public final void r(b bVar) {
        c cVar;
        ArrayList<d> arrayList = bVar.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (!arrayList.get(size).c() && !arrayList.get(size).Z1) {
                    i0.j.c.f.c cVar2 = new i0.j.c.f.c();
                    cVar2.c = arrayList.get(size).d;
                    cVar2.q = arrayList.get(size).c;
                    cVar2.d = InstabugDateFormatter.getCurrentUTCTimeStampInSeconds();
                    ReadQueueCacheManager.getInstance().add(cVar2);
                    break;
                }
            } else {
                break;
            }
        }
        Collections.sort(bVar.q, new d.a());
        WeakReference<V> weakReference = this.view;
        if (weakReference != null && (cVar = (c) weakReference.get()) != null) {
            cVar.c(bVar.q);
            cVar.w();
        }
    }

    public final void t(String str) {
        if (str.equals(this.x.c)) {
            this.c.b(str);
        }
    }

    public void u() {
        c cVar;
        SettingsManager.getInstance().setProcessingForeground(false);
        ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
        if (chatPlugin != null && chatPlugin.getAppContext() != null && this.x != null) {
            InstabugSDKLogger.v(com.instabug.chat.ui.f.d.class, "take extra screenshot");
            chatPlugin.setState(2);
            this.x.x = b.a.WAITING_ATTACHMENT_MESSAGE;
            if (i0.j.c.j.a.a == null) {
                i0.j.c.j.a.a = new i0.j.c.j.a();
            }
            i0.j.c.j.a aVar = i0.j.c.j.a.a;
            Context appContext = chatPlugin.getAppContext();
            String str = this.x.c;
            Objects.requireNonNull(aVar);
            aVar.b = new WeakReference<>(appContext);
            aVar.d = str;
            aVar.c.init(aVar);
            WeakReference<V> weakReference = this.view;
            if (weakReference != null && (cVar = (c) weakReference.get()) != null) {
                cVar.finishActivity();
            }
        }
    }

    public d v(String str, String str2) {
        d dVar = new d(UserManagerWrapper.getUserName(), UserManagerWrapper.getUserEmail(), InstabugCore.getPushNotificationToken());
        dVar.d = str;
        dVar.q = str2;
        dVar.Y1 = InstabugDateFormatter.getCurrentUTCTimeStampInSeconds();
        dVar.b(InstabugDateFormatter.getCurrentUTCTimeStampInSeconds());
        dVar.a(d.b.INBOUND);
        dVar.x = InstabugCore.getIdentifiedUsername();
        dVar.e2 = d.c.READY_TO_BE_SENT;
        return dVar;
    }

    public void c() {
        InMemoryCache<String, b> cache;
        b bVar = this.x;
        if (bVar != null && bVar.q.size() == 0 && this.x.x != b.a.WAITING_ATTACHMENT_MESSAGE && (cache = ChatsCacheManager.getCache()) != null) {
            cache.delete(this.x.c);
        }
    }
}
