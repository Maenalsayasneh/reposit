package com.instabug.library.internal.contentprovider;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import androidx.annotation.Keep;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import i0.j.e.l0.h.a;

@Keep
public class InstabugContentProvider extends a {
    private void initApplicationProvider(Application application) {
        if (i0.j.e.l0.d.a.a == null) {
            i0.j.e.l0.d.a.a = new i0.j.e.l0.d.a(application);
        }
    }

    private void initTrackingDelegate(Application application) {
        InstabugInternalTrackingDelegate.init(application);
    }

    private void initialize(Context context) {
        if (context instanceof Application) {
            Application application = (Application) context;
            initTrackingDelegate(application);
            initApplicationProvider(application);
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            Application application2 = (Application) applicationContext;
            initTrackingDelegate(application2);
            initApplicationProvider(application2);
        }
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        initialize(context);
    }
}
