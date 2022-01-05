package com.stripe.android.view;

import android.app.Activity;
import androidx.appcompat.app.AlertController;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.R;
import h0.b.a.d;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/stripe/android/view/AlertDisplayer;", "", "", "message", "Lm0/i;", "show", "(Ljava/lang/String;)V", "DefaultAlertDisplayer", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AlertDisplayer.kt */
public interface AlertDisplayer {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/view/AlertDisplayer$DefaultAlertDisplayer;", "Lcom/stripe/android/view/AlertDisplayer;", "", "message", "Lm0/i;", "show", "(Ljava/lang/String;)V", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AlertDisplayer.kt */
    public static final class DefaultAlertDisplayer implements AlertDisplayer {
        private final Activity activity;

        public DefaultAlertDisplayer(Activity activity2) {
            i.e(activity2, "activity");
            this.activity = activity2;
        }

        public void show(String str) {
            i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            if (!this.activity.isFinishing()) {
                d.a aVar = new d.a(this.activity, R.style.AlertDialogStyle);
                AlertController.b bVar = aVar.a;
                bVar.f = str;
                bVar.k = true;
                aVar.d(17039370, AlertDisplayer$DefaultAlertDisplayer$show$1.INSTANCE);
                aVar.a().show();
            }
        }
    }

    void show(String str);
}
