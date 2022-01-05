package com.clubhouse.android.ui.onboarding;

import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.clubhouse.app.R;
import i0.d.a.a.a;
import i0.e.b.g3.r.u2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__IndentKt;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: WaitlistFragment.kt */
public final class WaitlistFragment$invalidate$1 extends Lambda implements l<u2, i> {
    public final /* synthetic */ WaitlistFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaitlistFragment$invalidate$1(WaitlistFragment waitlistFragment) {
        super(1);
        this.c = waitlistFragment;
    }

    public Object invoke(Object obj) {
        u2 u2Var = (u2) obj;
        m0.n.b.i.e(u2Var, "state");
        WaitlistFragment waitlistFragment = this.c;
        k<Object>[] kVarArr = WaitlistFragment.Z1;
        FrameLayout frameLayout = waitlistFragment.N0().b;
        m0.n.b.i.d(frameLayout, "binding.loading");
        frameLayout.setVisibility(u2Var.b ? 0 : 8);
        String str = u2Var.a;
        if (str == null || StringsKt__IndentKt.o(str)) {
            this.c.N0().d.setText(this.c.getString(R.string.spot_reserved));
        } else {
            TextView textView = this.c.N0().d;
            Resources resources = this.c.getResources();
            m0.n.b.i.d(resources, "resources");
            Object[] objArr = {u2Var.a};
            ArrayList i1 = a.i1(resources, "<this>", objArr, "rawArgs", 1);
            for (int i = 0; i < 1; i++) {
                Object obj2 = objArr[i];
                if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    obj2 = a.p0(str2, "<this>", str2, 63);
                }
                i1.add(obj2);
            }
            String string = resources.getString(R.string.username_reserved);
            m0.n.b.i.d(string, "getString(id)");
            Object[] array = i1.toArray(new Object[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Object[] copyOf = Arrays.copyOf(array, array.length);
            String format = String.format(string, Arrays.copyOf(copyOf, copyOf.length));
            m0.n.b.i.d(format, "java.lang.String.format(format, *args)");
            Spanned fromHtml = Html.fromHtml(format, 63);
            m0.n.b.i.d(fromHtml, "fromHtml(\n            String.format(getString(id), *args.toTypedArray()),\n            HtmlCompat.FROM_HTML_MODE_COMPACT\n        )");
            textView.setText(fromHtml);
        }
        return i.a;
    }
}
