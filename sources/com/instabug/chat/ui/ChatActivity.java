package com.instabug.chat.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instabug.chat.ChatPlugin;
import com.instabug.chat.R;
import com.instabug.chat.ui.g.d;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library._InstabugActivity;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventPublisher;
import com.instabug.library.core.ui.BaseFragmentActivity;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.OrientationUtils;
import com.pubnub.api.builder.PubNubErrorBuilder;
import i0.j.c.n.a;
import i0.j.c.n.b;
import i0.j.c.n.c;

public class ChatActivity extends BaseFragmentActivity<a> implements _InstabugActivity, b, d.a {
    public void C(String str, com.instabug.chat.e.a aVar) {
        if (!isFinishing()) {
            getSupportFragmentManager().F();
            h0.o.a.a aVar2 = new h0.o.a.a(getSupportFragmentManager());
            int i = R.id.instabug_fragment_container;
            com.instabug.chat.ui.f.d dVar = new com.instabug.chat.ui.f.d();
            Bundle bundle = new Bundle();
            bundle.putString("chat_number", str);
            bundle.putSerializable("attachment", aVar);
            dVar.setArguments(bundle);
            aVar2.m(i, dVar, "chat_fragment", 1);
            if (getSupportFragmentManager().I(i) != null) {
                aVar2.g("chat_fragment");
            }
            aVar2.h();
        }
    }

    public void f(String str) {
        InstabugSDKLogger.v(d.class, "Chat id: " + str);
        P p = this.presenter;
        if (p != null) {
            ((a) p).f(str);
        }
    }

    public void finish() {
        P p = this.presenter;
        if (p != null) {
            ((a) p).f();
        }
        super.finish();
    }

    public int getLayout() {
        return R.layout.instabug_activity;
    }

    public void initViews() {
    }

    public com.instabug.chat.e.a m() {
        return (com.instabug.chat.e.a) getIntent().getSerializableExtra("attachment");
    }

    public void o() {
        if (!isFinishing() && !(getSupportFragmentManager().J("chats_fragment") instanceof d)) {
            h0.o.a.a aVar = new h0.o.a.a(getSupportFragmentManager());
            int i = R.id.instabug_fragment_container;
            Bundle extras = getIntent().getExtras();
            boolean z = extras != null && extras.getBoolean("compose");
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putBoolean("compose_key", z);
            dVar.setArguments(bundle);
            aVar.o(i, dVar, "chats_fragment");
            aVar.h();
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (Fragment onActivityResult : getSupportFragmentManager().O()) {
            onActivityResult.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
        if (chatPlugin != null) {
            chatPlugin.setState(1);
        }
        super.onCreate(bundle);
        OrientationUtils.handelOrientation(this);
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            i = R.style.InstabugChatLight;
        } else {
            i = R.style.InstabugChatDark;
        }
        setTheme(i);
        P cVar = new c(this);
        this.presenter = cVar;
        cVar.e(q0(getIntent()));
    }

    public void onDestroy() {
        OrientationUtils.unlockOrientation(this);
        SDKCoreEventPublisher.post(new SDKCoreEvent(SDKCoreEvent.ForegroundStatus.TYPE_FOREGROUNDS_STATUS, SDKCoreEvent.ForegroundStatus.VALUE_AVAILABLE));
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (q0(intent) == 161) {
            f(intent.getStringExtra("chat_number"));
        }
    }

    public void onStop() {
        super.onStop();
        ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
        if (chatPlugin != null && chatPlugin.getState() != 2) {
            chatPlugin.setState(0);
        }
    }

    public void q(String str) {
        if (!isFinishing()) {
            try {
                getSupportFragmentManager().F();
                h0.o.a.a aVar = new h0.o.a.a(getSupportFragmentManager());
                int i = R.id.instabug_fragment_container;
                com.instabug.chat.ui.f.d dVar = new com.instabug.chat.ui.f.d();
                Bundle bundle = new Bundle();
                bundle.putString("chat_number", str);
                dVar.setArguments(bundle);
                aVar.m(i, dVar, "chat_fragment", 1);
                if (getSupportFragmentManager().I(i) != null) {
                    aVar.g("chat_fragment");
                }
                aVar.i();
            } catch (IllegalStateException e) {
                StringBuilder P0 = i0.d.a.a.a.P0("Couldn't show Chat fragment due to ");
                P0.append(e.getMessage());
                InstabugSDKLogger.e(ChatActivity.class, P0.toString());
            }
        }
    }

    public int q0(Intent intent) {
        int intExtra = intent.getIntExtra("chat_process", -1);
        int i = PubNubErrorBuilder.PNERR_MESSAGE_TIMETOKEN_MISSING;
        if (intExtra != 161) {
            i = PubNubErrorBuilder.PNERR_MESSAGE_ACTION_TIMETOKEN_MISSING;
            if (intExtra != 162) {
                i = PubNubErrorBuilder.PNERR_PUSH_TOPIC_MISSING;
                if (intExtra != 164) {
                    return 160;
                }
            }
        }
        return i;
    }

    public String x() {
        return getIntent().getStringExtra("chat_number");
    }
}
