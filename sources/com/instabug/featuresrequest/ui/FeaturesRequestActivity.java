package com.instabug.featuresrequest.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.instabug.featuresrequest.FeaturesRequestPlugin;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.ui.custom.b;
import com.instabug.featuresrequest.ui.d.c;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library._InstabugActivity;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventPublisher;
import com.instabug.library.util.LocaleUtils;
import h0.o.a.a;
import h0.o.a.k;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
public class FeaturesRequestActivity extends k implements _InstabugActivity {
    public b c;

    public void j(boolean z) {
        FeaturesRequestPlugin featuresRequestPlugin = (FeaturesRequestPlugin) InstabugCore.getXPlugin(FeaturesRequestPlugin.class);
        if (featuresRequestPlugin == null) {
            return;
        }
        if (z) {
            featuresRequestPlugin.setState(1);
            return;
        }
        featuresRequestPlugin.setState(0);
        SDKCoreEventPublisher.post(new SDKCoreEvent(SDKCoreEvent.ForegroundStatus.TYPE_FOREGROUNDS_STATUS, SDKCoreEvent.ForegroundStatus.VALUE_AVAILABLE));
    }

    public void onCreate(Bundle bundle) {
        int i;
        LocaleUtils.setLocale(this, Instabug.getLocale(this));
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            i = R.style.IbFrLight;
        } else {
            i = R.style.IbFrDark;
        }
        setTheme(i);
        super.onCreate(bundle);
        setContentView(R.layout.instabug_activity);
        if (bundle == null) {
            a aVar = new a(getSupportFragmentManager());
            aVar.o(R.id.instabug_fragment_container, new c(), (String) null);
            aVar.h();
        }
        j(true);
    }

    public void onDestroy() {
        super.onDestroy();
        j(false);
    }
}
