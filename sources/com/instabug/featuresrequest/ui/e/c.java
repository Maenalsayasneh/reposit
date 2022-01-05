package com.instabug.featuresrequest.ui.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.ui.FeaturesRequestActivity;
import com.instabug.featuresrequest.ui.custom.DynamicToolbarFragment;
import com.instabug.featuresrequest.ui.custom.e;
import com.instabug.featuresrequest.ui.custom.f;
import com.instabug.library.Instabug;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.KeyboardUtils;
import com.instabug.library.view.AlertDialog;
import i0.j.d.h.f.d;
import i0.j.d.h.f.g;
import i0.j.d.h.f.h;
import i0.j.d.h.f.i;
import java.util.Iterator;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: AddNewFeatureFragment */
public class c extends DynamicToolbarFragment<i> implements i0.j.d.h.f.a, View.OnClickListener, AlertDialog.OnAlertViewsClickListener {
    public static final /* synthetic */ int c = 0;
    public TextInputEditText Y1;
    public TextInputEditText Z1;
    public TextInputEditText a2;
    public TextInputEditText b2;
    public View c2;
    public TextInputLayout d;
    public View d2;
    public View e2;
    public View f2;
    public RelativeLayout g2;
    public TextView h2;
    public AlertDialog i2;
    public TextView j2;
    public TextInputLayout q;
    public TextInputLayout x;
    public TextInputLayout y;

    /* compiled from: AddNewFeatureFragment */
    public class a implements f.a {
        public a() {
        }

        public void a() {
            c cVar = c.this;
            if ((cVar.Y1.getText() != null && !cVar.Y1.getText().toString().isEmpty()) || (cVar.Z1.getText() != null && !cVar.Z1.getText().toString().isEmpty()) || ((cVar.a2.getText() != null && !cVar.a2.getText().toString().isEmpty()) || (cVar.b2.getText() != null && !cVar.b2.getText().toString().isEmpty()))) {
                if (cVar.getActivity() != null && cVar.getFragmentManager() != null) {
                    cVar.i2.show(cVar.getActivity().getFragmentManager(), "alert");
                }
            } else if (cVar.getActivity() != null) {
                cVar.getActivity().onBackPressed();
            }
        }
    }

    /* compiled from: AddNewFeatureFragment */
    public class b implements f.a {
        public b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = (i0.j.d.h.f.i) r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a() {
            /*
                r2 = this;
                com.instabug.featuresrequest.ui.e.c r0 = com.instabug.featuresrequest.ui.e.c.this
                int r1 = com.instabug.featuresrequest.ui.e.c.c
                P r0 = r0.presenter
                if (r0 == 0) goto L_0x003a
                i0.j.d.h.f.i r0 = (i0.j.d.h.f.i) r0
                i0.j.d.h.f.a r1 = r0.c
                if (r1 == 0) goto L_0x003a
                java.lang.String r1 = r1.c()
                if (r1 == 0) goto L_0x003a
                i0.j.d.e.a r1 = i0.j.d.e.a.d()
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x002f
                i0.j.d.h.f.a r1 = r0.c
                java.lang.String r1 = r1.M()
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x002b
                goto L_0x002f
            L_0x002b:
                r0.g()
                goto L_0x003a
            L_0x002f:
                i0.j.d.h.f.a r1 = r0.c
                java.lang.String r1 = r1.W()
                if (r1 == 0) goto L_0x003a
                r0.g()
            L_0x003a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.featuresrequest.ui.e.c.b.a():void");
        }
    }

    public final void A0(Boolean bool) {
        if (this.j2 == null) {
            return;
        }
        if (bool.booleanValue()) {
            this.j2.setEnabled(true);
            this.j2.setTextColor(getResources().getColor(17170443));
            return;
        }
        this.j2.setEnabled(false);
        this.j2.setTextColor(getResources().getColor(17170432));
    }

    public final void I0(boolean z, TextInputLayout textInputLayout, View view, String str) {
        if (getContext() != null) {
            if (z) {
                textInputLayout.setErrorEnabled(true);
                textInputLayout.setError(str);
                Context context = getContext();
                int i = R.color.ib_fr_add_comment_error;
                i0.j.c.l.a.I(textInputLayout, h0.i.b.a.getColor(context, i));
                view.setBackgroundColor(h0.i.b.a.getColor(getContext(), i));
                return;
            }
            i0.j.c.l.a.I(textInputLayout, Instabug.getPrimaryColor());
            textInputLayout.setError((CharSequence) null);
            if (textInputLayout.getEditText() == null || !textInputLayout.getEditText().isFocused()) {
                view.setBackgroundColor(AttrResolver.getColor(getContext(), R.attr.ib_fr_add_comment_edit_text_underline_color));
            } else {
                view.setBackgroundColor(Instabug.getPrimaryColor());
            }
            textInputLayout.setErrorEnabled(false);
        }
    }

    public String M() {
        if (this.b2.getText() == null) {
            return "";
        }
        return this.b2.getText().toString();
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public String W() {
        if (!(this.y == null || this.f2 == null)) {
            if (this.b2.getText() == null || this.b2.getText().toString().trim().isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(this.b2.getText().toString()).matches()) {
                I0(true, this.y, this.f2, getString(R.string.feature_request_str_add_comment_valid_email));
                this.b2.requestFocus();
            } else {
                this.b2.setError((CharSequence) null);
                I0(false, this.y, this.f2, (String) null);
                return this.b2.getText().toString();
            }
        }
        return null;
    }

    public void addToolbarActionButtons() {
        this.toolbarActionButtons.add(new f(R.drawable.ibg_fr_shape_add_feat_button, R.string.feature_requests_new_positive_button, new b(), f.b.TEXT));
    }

    public String c() {
        if (!(this.d == null || this.c2 == null)) {
            TextInputEditText textInputEditText = this.Y1;
            if (textInputEditText == null || textInputEditText.getText() == null || this.Y1.getText().toString().trim().isEmpty()) {
                I0(true, this.d, this.c2, getString(R.string.feature_requests_new_err_msg_required));
                this.Y1.requestFocus();
            } else {
                I0(false, this.d, this.c2, (String) null);
                return this.Y1.getText().toString();
            }
        }
        return null;
    }

    public void f(String str) {
        this.b2.setText(str);
    }

    public void f0() {
        if (getActivity() != null) {
            FeaturesRequestActivity featuresRequestActivity = (FeaturesRequestActivity) getActivity();
            featuresRequestActivity.onBackPressed();
            Iterator<Fragment> it = featuresRequestActivity.getSupportFragmentManager().O().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Fragment next = it.next();
                if (next instanceof com.instabug.featuresrequest.ui.d.c) {
                    com.instabug.featuresrequest.ui.d.c cVar = (com.instabug.featuresrequest.ui.d.c) next;
                    ViewPager viewPager = cVar.y;
                    if (viewPager != null) {
                        viewPager.setCurrentItem(1);
                    }
                    ((com.instabug.featuresrequest.ui.d.f.b) cVar.q.a(0)).q0();
                    ((com.instabug.featuresrequest.ui.d.g.b) cVar.q.a(1)).q0();
                }
            }
            new e().P0(featuresRequestActivity.getSupportFragmentManager(), "thanks_dialog_fragment");
        }
    }

    public int getContentLayout() {
        return R.layout.ib_fr_new_feature_fragment;
    }

    public String getTitle() {
        return getString(R.string.feature_requests_new_appbar_title);
    }

    public f getToolbarCloseActionButton() {
        return new f(R.drawable.ibg_core_ic_close, R.string.close, new a(), f.b.ICON);
    }

    public void i(String str) {
        this.a2.setText(str);
    }

    public void initContentViews(View view, Bundle bundle) {
        RelativeLayout relativeLayout;
        if (this.i2 == null) {
            AlertDialog alertDialog = new AlertDialog();
            this.i2 = alertDialog;
            alertDialog.setMessage(getString(R.string.feature_request_close_dialog_message));
            this.i2.setOnAlertViewsClickListener(this);
        }
        this.g2 = (RelativeLayout) view.findViewById(R.id.relativeLayout_new_feature);
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.input_layout_title);
        this.d = textInputLayout;
        textInputLayout.setHint((CharSequence) getString(R.string.feature_requests_new_title) + "*");
        this.q = (TextInputLayout) view.findViewById(R.id.input_layout_description);
        this.x = (TextInputLayout) view.findViewById(R.id.name_text_input_layout);
        TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(R.id.email_text_input_layout);
        this.y = textInputLayout2;
        textInputLayout2.setHint((CharSequence) getString(R.string.feature_requests_new_email) + "*");
        this.Y1 = (TextInputEditText) view.findViewById(R.id.input_title);
        this.Z1 = (TextInputEditText) view.findViewById(R.id.input_description);
        this.a2 = (TextInputEditText) view.findViewById(R.id.input_name);
        this.b2 = (TextInputEditText) view.findViewById(R.id.input_email);
        this.c2 = view.findViewById(R.id.title_underline);
        this.d2 = view.findViewById(R.id.description_underline);
        this.e2 = view.findViewById(R.id.name_underline);
        this.f2 = view.findViewById(R.id.email_underline);
        this.h2 = (TextView) view.findViewById(R.id.txtBottomHint);
        i0.j.c.l.a.I(this.d, Instabug.getPrimaryColor());
        i0.j.c.l.a.I(this.q, Instabug.getPrimaryColor());
        i0.j.c.l.a.I(this.x, Instabug.getPrimaryColor());
        i0.j.c.l.a.I(this.y, Instabug.getPrimaryColor());
        this.presenter = new i(this);
        this.Y1.setOnFocusChangeListener(new i0.j.d.h.f.b(this));
        this.Z1.setOnFocusChangeListener(new i0.j.d.h.f.c(this));
        this.a2.setOnFocusChangeListener(new d(this));
        this.b2.setOnFocusChangeListener(new i0.j.d.h.f.e(this));
        this.b2.addTextChangedListener(new i0.j.d.h.f.f(this));
        this.Y1.addTextChangedListener(new g(this));
        if (bundle == null && (relativeLayout = this.toolbar) != null) {
            relativeLayout.post(new h(this));
        }
        this.j2 = (TextView) findTextViewByTitle(R.string.feature_requests_new_positive_button);
        A0(Boolean.FALSE);
        i iVar = (i) this.presenter;
        if (iVar.c == null) {
            return;
        }
        if (i0.j.d.e.a.d().c()) {
            iVar.c.j(true);
        } else {
            iVar.c.j(false);
        }
    }

    public void j(boolean z) {
        if (z) {
            TextInputLayout textInputLayout = this.y;
            textInputLayout.setHint((CharSequence) getString(R.string.feature_requests_new_email) + "*");
            return;
        }
        this.y.setHint((CharSequence) getString(R.string.feature_requests_new_email));
    }

    public void onClick(View view) {
    }

    public void onPositiveButtonClicked() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
            this.i2.dismiss();
        }
    }

    public void onStop() {
        super.onStop();
        if (getActivity() != null) {
            KeyboardUtils.hide(getActivity());
        }
    }

    public void q(String str) {
    }

    public String s() {
        if (this.a2.getText() == null) {
            return "";
        }
        return this.a2.getText().toString();
    }

    public void u() {
        if (getActivity() != null) {
            FeaturesRequestActivity featuresRequestActivity = (FeaturesRequestActivity) getActivity();
            FragmentManager supportFragmentManager = featuresRequestActivity.getSupportFragmentManager();
            com.instabug.featuresrequest.ui.custom.b bVar = new com.instabug.featuresrequest.ui.custom.b();
            featuresRequestActivity.c = bVar;
            bVar.P0(supportFragmentManager, "progress_dialog_fragment");
        }
    }

    public String w() {
        if (this.Z1.getText() == null) {
            return "";
        }
        return this.Z1.getText().toString();
    }

    public void x() {
        com.instabug.featuresrequest.ui.custom.b bVar;
        if (getActivity() != null && (bVar = ((FeaturesRequestActivity) getActivity()).c) != null) {
            bVar.J0(false, false);
        }
    }
}
