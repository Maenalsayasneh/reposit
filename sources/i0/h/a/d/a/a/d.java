package i0.h.a.d.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;
import i0.h.a.d.a.d.a;
import i0.h.a.d.a.e.f;
import i0.h.a.d.a.g.c;

public final class d extends c<InstallState> {
    public d(Context context) {
        super(new f("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    public final void a(Context context, Intent intent) {
        Intent intent2 = intent;
        if (!context.getPackageName().equals(intent2.getStringExtra("package.name"))) {
            this.a.b(3, "ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", new Object[]{intent2.getStringExtra("package.name")});
            return;
        }
        this.a.b(3, "List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.a.b(3, "Key: %s; value: %s", new Object[]{str, intent.getExtras().get(str)});
        }
        f fVar = this.a;
        fVar.b(3, "List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        fVar.b(3, "Key: %s; value: %s", new Object[]{"install.status", Integer.valueOf(intent2.getIntExtra("install.status", 0))});
        fVar.b(3, "Key: %s; value: %s", new Object[]{"error.code", Integer.valueOf(intent2.getIntExtra("error.code", 0))});
        a aVar = new a(intent2.getIntExtra("install.status", 0), intent2.getLongExtra("bytes.downloaded", 0), intent2.getLongExtra("total.bytes.to.download", 0), intent2.getIntExtra("error.code", 0), intent2.getStringExtra("package.name"));
        this.a.b(3, "ListenerRegistryBroadcastReceiver.onReceive: %s", new Object[]{aVar});
        c(aVar);
    }
}
