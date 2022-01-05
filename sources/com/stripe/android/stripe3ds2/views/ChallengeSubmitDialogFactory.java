package com.stripe.android.stripe3ds2.views;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeSubmitDialogBinding;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import com.stripe.android.stripe3ds2.utils.Factory0;
import i0.j.f.p.h;
import kotlin.Metadata;
import m0.c;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;", "Lcom/stripe/android/stripe3ds2/utils/Factory0;", "Landroid/app/Dialog;", "create", "()Landroid/app/Dialog;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;", "<init>", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;)V", "ChallengeSubmitDialog", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeSubmitDialogFactory.kt */
public final class ChallengeSubmitDialogFactory implements Factory0<Dialog> {
    private final Context context;
    private final UiCustomization uiCustomization;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\r\u001a\u00020\b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory$ChallengeSubmitDialog;", "Landroid/app/Dialog;", "Lm0/i;", "onStart", "()V", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;", "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeSubmitDialogBinding;", "viewBinding$delegate", "Lm0/c;", "getViewBinding", "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeSubmitDialogBinding;", "viewBinding", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeSubmitDialogFactory.kt */
    public static final class ChallengeSubmitDialog extends Dialog {
        private final UiCustomization uiCustomization;
        private final c viewBinding$delegate = h.H2(new ChallengeSubmitDialogFactory$ChallengeSubmitDialog$viewBinding$2(this));

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ChallengeSubmitDialog(Context context, UiCustomization uiCustomization2) {
            super(context);
            i.e(context, "context");
            i.e(uiCustomization2, "uiCustomization");
            this.uiCustomization = uiCustomization2;
            setCancelable(false);
            Window window = getWindow();
            if (window != null) {
                window.clearFlags(2);
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
        }

        private final StripeChallengeSubmitDialogBinding getViewBinding() {
            return (StripeChallengeSubmitDialogBinding) this.viewBinding$delegate.getValue();
        }

        public void onStart() {
            super.onStart();
            setContentView(getViewBinding().getRoot());
            CustomizeUtils customizeUtils = CustomizeUtils.INSTANCE;
            CircularProgressIndicator circularProgressIndicator = getViewBinding().progressBar;
            i.d(circularProgressIndicator, "viewBinding.progressBar");
            customizeUtils.applyProgressBarColor$3ds2sdk_release(circularProgressIndicator, this.uiCustomization);
        }
    }

    public ChallengeSubmitDialogFactory(Context context2, UiCustomization uiCustomization2) {
        i.e(context2, "context");
        i.e(uiCustomization2, "uiCustomization");
        this.context = context2;
        this.uiCustomization = uiCustomization2;
    }

    public Dialog create() {
        return new ChallengeSubmitDialog(this.context, this.uiCustomization);
    }
}
