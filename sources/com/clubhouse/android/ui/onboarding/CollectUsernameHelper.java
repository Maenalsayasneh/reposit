package com.clubhouse.android.ui.onboarding;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.clubhouse.android.core.ui.BaseFragment;
import com.clubhouse.android.databinding.FragmentCollectUsernameBinding;
import i0.e.b.d3.k;
import i0.e.b.g3.r.c2;
import m0.n.b.i;

/* compiled from: CollectUsernameUtil.kt */
public final class CollectUsernameHelper {
    public final BaseFragment a;
    public final FragmentCollectUsernameBinding b;
    public final CollectUsernameViewModel c;

    /* compiled from: CollectUsernameUtil.kt */
    public static final class a implements TextWatcher {
        public final /* synthetic */ CollectUsernameHelper c;

        public a(CollectUsernameHelper collectUsernameHelper) {
            this.c = collectUsernameHelper;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
            if (kotlin.text.StringsKt__IndentKt.H(r2, "@", false, 2) == false) goto L_0x0026;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onTextChanged(java.lang.CharSequence r2, int r3, int r4, int r5) {
            /*
                r1 = this;
                com.clubhouse.android.ui.onboarding.CollectUsernameHelper r2 = r1.c
                com.clubhouse.android.databinding.FragmentCollectUsernameBinding r2 = r2.b
                android.widget.EditText r2 = r2.f
                int r2 = r2.length()
                r3 = 0
                java.lang.String r4 = "@"
                r5 = 1
                if (r2 < r5) goto L_0x0026
                com.clubhouse.android.ui.onboarding.CollectUsernameHelper r2 = r1.c
                com.clubhouse.android.databinding.FragmentCollectUsernameBinding r2 = r2.b
                android.widget.EditText r2 = r2.f
                android.text.Editable r2 = r2.getText()
                java.lang.String r0 = "binding.username.text"
                m0.n.b.i.d(r2, r0)
                r0 = 2
                boolean r2 = kotlin.text.StringsKt__IndentKt.H(r2, r4, r3, r0)
                if (r2 != 0) goto L_0x003c
            L_0x0026:
                com.clubhouse.android.ui.onboarding.CollectUsernameHelper r2 = r1.c
                com.clubhouse.android.databinding.FragmentCollectUsernameBinding r2 = r2.b
                android.widget.EditText r2 = r2.f
                r2.setText(r4)
                com.clubhouse.android.ui.onboarding.CollectUsernameHelper r2 = r1.c
                com.clubhouse.android.databinding.FragmentCollectUsernameBinding r2 = r2.b
                android.widget.EditText r2 = r2.f
                int r4 = r2.length()
                r2.setSelection(r4)
            L_0x003c:
                com.clubhouse.android.ui.onboarding.CollectUsernameHelper r2 = r1.c
                com.clubhouse.android.databinding.FragmentCollectUsernameBinding r2 = r2.b
                android.widget.Button r2 = r2.c
                java.lang.String r4 = "binding.nextButton"
                m0.n.b.i.d(r2, r4)
                com.clubhouse.android.ui.onboarding.CollectUsernameHelper r4 = r1.c
                com.clubhouse.android.databinding.FragmentCollectUsernameBinding r4 = r4.b
                android.widget.EditText r4 = r4.f
                int r4 = r4.length()
                if (r4 <= r5) goto L_0x0054
                r3 = r5
            L_0x0054:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                i0.e.b.d3.k.k(r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.onboarding.CollectUsernameHelper.a.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    public CollectUsernameHelper(BaseFragment baseFragment, FragmentCollectUsernameBinding fragmentCollectUsernameBinding, CollectUsernameViewModel collectUsernameViewModel) {
        i.e(baseFragment, "fragment");
        i.e(fragmentCollectUsernameBinding, "binding");
        i.e(collectUsernameViewModel, "viewModel");
        this.a = baseFragment;
        this.b = fragmentCollectUsernameBinding;
        this.c = collectUsernameViewModel;
    }

    public final void a() {
        this.b.c.setOnClickListener(new i0.e.b.g3.r.i(this));
        EditText editText = this.b.f;
        i.d(editText, "binding.username");
        k.B(editText, new CollectUsernameHelper$setUpViews$2(this));
        this.b.f.addTextChangedListener(new a(this));
    }

    public final void b(String str) {
        i.e(str, "displayedText");
        String substring = str.substring(1);
        i.d(substring, "(this as java.lang.String).substring(startIndex)");
        this.c.p(new c2(substring));
    }
}
