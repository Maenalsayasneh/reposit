package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.init.ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import h0.b.a.a;
import h0.b.a.e;
import h0.b.e.c;
import h0.o.a.k;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;", "", "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", "toolbarCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "cancelButtonCustomization", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "customize", "(Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "Lh0/o/a/k;", "activity", "Lh0/o/a/k;", "<init>", "(Lh0/o/a/k;)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: HeaderZoneCustomizer.kt */
public final class HeaderZoneCustomizer {
    public static final Companion Companion = new Companion((f) null);
    private final k activity;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer$Companion;", "", "Lh0/b/a/e;", "activity", "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", "toolbarCustomization", "Lm0/i;", "customizeStatusBar", "(Lh0/b/a/e;Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;)V", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: HeaderZoneCustomizer.kt */
    public static final class Companion {
        private Companion() {
        }

        public final void customizeStatusBar(e eVar, ToolbarCustomization toolbarCustomization) {
            i.e(eVar, "activity");
            i.e(toolbarCustomization, "toolbarCustomization");
            if (toolbarCustomization.getStatusBarColor() != null) {
                CustomizeUtils.INSTANCE.setStatusBarColor(eVar, Color.parseColor(toolbarCustomization.getStatusBarColor()));
            } else if (toolbarCustomization.getBackgroundColor() != null) {
                int parseColor = Color.parseColor(toolbarCustomization.getBackgroundColor());
                CustomizeUtils customizeUtils = CustomizeUtils.INSTANCE;
                customizeUtils.setStatusBarColor(eVar, customizeUtils.darken$3ds2sdk_release(parseColor));
            }
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public HeaderZoneCustomizer(k kVar) {
        i.e(kVar, "activity");
        this.activity = kVar;
    }

    public static /* synthetic */ ThreeDS2Button customize$default(HeaderZoneCustomizer headerZoneCustomizer, ToolbarCustomization toolbarCustomization, ButtonCustomization buttonCustomization, int i, Object obj) {
        if ((i & 1) != 0) {
            toolbarCustomization = null;
        }
        if ((i & 2) != 0) {
            buttonCustomization = null;
        }
        return headerZoneCustomizer.customize(toolbarCustomization, buttonCustomization);
    }

    public final ThreeDS2Button customize(ToolbarCustomization toolbarCustomization, ButtonCustomization buttonCustomization) {
        a supportActionBar;
        String str;
        k kVar = this.activity;
        ThreeDS2Button threeDS2Button = null;
        if (!(kVar instanceof e)) {
            kVar = null;
        }
        e eVar = (e) kVar;
        if (!(eVar == null || (supportActionBar = eVar.getSupportActionBar()) == null)) {
            i.d(supportActionBar, "appCompatActivity?.supportActionBar ?: return null");
            threeDS2Button = new ThreeDS2Button(new c((Context) this.activity, R.style.Stripe3DS2ActionBarButton), (AttributeSet) null, 0, 6, (f) null);
            boolean z = false;
            threeDS2Button.setBackgroundTintList(ColorStateList.valueOf(0));
            threeDS2Button.setButtonCustomization(buttonCustomization);
            supportActionBar.n(threeDS2Button, new a.C0015a(-2, -2, 8388629));
            supportActionBar.q(true);
            if (toolbarCustomization != null) {
                String buttonText = toolbarCustomization.getButtonText();
                if (!(buttonText == null || StringsKt__IndentKt.o(buttonText))) {
                    threeDS2Button.setText(toolbarCustomization.getButtonText());
                } else {
                    threeDS2Button.setText(R.string.stripe_3ds2_hzv_cancel_label);
                }
                String backgroundColor = toolbarCustomization.getBackgroundColor();
                if (backgroundColor != null) {
                    supportActionBar.m(new ColorDrawable(Color.parseColor(backgroundColor)));
                    Companion.customizeStatusBar(eVar, toolbarCustomization);
                }
                String headerText = toolbarCustomization.getHeaderText();
                if (headerText == null || StringsKt__IndentKt.o(headerText)) {
                    z = true;
                }
                if (!z) {
                    str = toolbarCustomization.getHeaderText();
                    i.d(str, "toolbarCustomization.headerText");
                } else {
                    str = this.activity.getString(R.string.stripe_3ds2_hzv_header_label);
                    i.d(str, "activity.getString(R.str…pe_3ds2_hzv_header_label)");
                }
                supportActionBar.u(CustomizeUtils.INSTANCE.buildStyledText(this.activity, str, toolbarCustomization));
            } else {
                supportActionBar.t(R.string.stripe_3ds2_hzv_header_label);
                threeDS2Button.setText(R.string.stripe_3ds2_hzv_cancel_label);
            }
        }
        return threeDS2Button;
    }
}
