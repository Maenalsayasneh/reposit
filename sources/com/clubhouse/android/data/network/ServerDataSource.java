package com.clubhouse.android.data.network;

import android.content.Context;
import com.clubhouse.android.data.models.remote.request.UpdateNotificationsRequest;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.models.remote.response.error.ErrorResponse;
import com.clubhouse.android.shared.Result;
import com.clubhouse.android.shared.auth.UserManager;
import i0.e.b.b3.b.b;
import m0.l.c;
import m0.n.b.i;
import q0.f0;
import t0.h;

/* compiled from: ServerDataSource.kt */
public final class ServerDataSource extends AbstractDataSource {
    public final b e;
    public final UserManager f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServerDataSource(b bVar, UserManager userManager, h<f0, ErrorResponse> hVar, Context context) {
        super(hVar, context);
        i.e(bVar, "clubhouseApi");
        i.e(userManager, "userManager");
        i.e(hVar, "converter");
        i.e(context, "context");
        this.e = bVar;
        this.f = userManager;
    }

    public final Object c(UpdateNotificationsRequest updateNotificationsRequest, c<? super Result<EmptySuccessResponse>> cVar) {
        return a(new ServerDataSource$updateNotifications$2(this, updateNotificationsRequest, (c<? super ServerDataSource$updateNotifications$2>) null), cVar);
    }
}
