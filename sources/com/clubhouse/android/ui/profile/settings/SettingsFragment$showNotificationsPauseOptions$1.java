package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.android.data.models.local.notification.NotificationPause;
import com.clubhouse.android.ui.actionsheet.ActionSheetBuilder;
import com.clubhouse.app.R;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: SettingsFragment.kt */
public final class SettingsFragment$showNotificationsPauseOptions$1 extends Lambda implements l<ActionSheetBuilder, i> {
    public final /* synthetic */ SettingsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsFragment$showNotificationsPauseOptions$1(SettingsFragment settingsFragment) {
        super(1);
        this.c = settingsFragment;
    }

    public Object invoke(Object obj) {
        ActionSheetBuilder actionSheetBuilder = (ActionSheetBuilder) obj;
        m0.n.b.i.e(actionSheetBuilder, "$this$actionSheet");
        actionSheetBuilder.a = this.c.getString(R.string.pause_notifications);
        NotificationPause[] values = NotificationPause.values();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 6; i++) {
            NotificationPause notificationPause = values[i];
            if (notificationPause.getLabel() != null) {
                arrayList.add(notificationPause);
            }
        }
        SettingsFragment settingsFragment = this.c;
        ArrayList arrayList2 = new ArrayList(h.K(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Boolean.valueOf(actionSheetBuilder.a(new SettingsFragment$showNotificationsPauseOptions$1$2$1(settingsFragment, (NotificationPause) it.next()))));
        }
        final SettingsFragment settingsFragment2 = this.c;
        AnonymousClass3 r02 = new a<i>() {
            public Object invoke() {
                SettingsFragment.this.N0().t.setChecked(false);
                return i.a;
            }
        };
        m0.n.b.i.e(r02, "<set-?>");
        actionSheetBuilder.d = r02;
        return i.a;
    }
}
