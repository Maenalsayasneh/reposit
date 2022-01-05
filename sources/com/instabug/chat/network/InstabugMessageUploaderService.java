package com.instabug.chat.network;

import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.library.network.InstabugNetworkBasedBackgroundService;
import i0.j.c.k.b;

public class InstabugMessageUploaderService extends InstabugNetworkBasedBackgroundService {
    public static final /* synthetic */ int c = 0;

    public void runBackgroundTask() throws Exception {
        b bVar = new b(this);
        bVar.a();
        bVar.d(ChatsCacheManager.getOfflineMessages());
    }
}
