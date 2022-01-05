package com.instabug.featuresrequest.ui.a;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Patterns;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.d.d;
import com.instabug.featuresrequest.ui.FeaturesRequestActivity;
import com.instabug.featuresrequest.ui.custom.DynamicToolbarFragment;
import com.instabug.featuresrequest.ui.custom.f;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.KeyboardUtils;
import i0.j.d.d.a.c;
import i0.j.d.h.a.e;
import i0.j.d.h.a.g;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: AddCommentFragment */
public class b extends DynamicToolbarFragment<g> implements i0.j.d.h.a.a {
    public TextInputEditText Y1;
    public TextInputEditText Z1;
    public TextInputEditText a2;
    public View b2;
    public g c;
    public View c2;
    public long d;
    public View d2;
    public ProgressDialog e2;
    public TextView f2;
    public TextView g2;
    public TextInputLayout q;
    public TextInputLayout x;
    public TextInputLayout y;

    /* compiled from: AddCommentFragment */
    public class a implements f.a {
        public a() {
        }

        public void a() {
            i0.j.d.h.a.a aVar = b.this.c.d;
            if (aVar != null) {
                aVar.onCloseButtonClicked();
            }
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.a.b$b  reason: collision with other inner class name */
    /* compiled from: AddCommentFragment */
    public class C0103b implements f.a {
        public C0103b() {
        }

        public void a() {
            i0.j.d.h.a.a aVar = b.this.c.d;
            if (aVar != null) {
                aVar.N();
            }
        }
    }

    public final void A0(Boolean bool) {
        if (this.g2 == null) {
            return;
        }
        if (bool.booleanValue()) {
            this.g2.setEnabled(true);
            this.g2.setTextColor(getResources().getColor(17170443));
            return;
        }
        this.g2.setEnabled(false);
        this.g2.setTextColor(getResources().getColor(17170432));
    }

    public final boolean I0() {
        TextInputEditText textInputEditText;
        if (!(this.y == null || this.d2 == null || (textInputEditText = this.a2) == null || textInputEditText.getText() == null)) {
            if (TextUtils.isEmpty(this.a2.getText().toString()) || !Patterns.EMAIL_ADDRESS.matcher(this.a2.getText().toString()).matches()) {
                J0(true, this.y, this.d2, getResources().getString(R.string.feature_request_str_add_comment_valid_email));
                this.a2.requestFocus();
            } else {
                J0(false, this.y, this.d2, (String) null);
                return true;
            }
        }
        return false;
    }

    public final void J0(boolean z, TextInputLayout textInputLayout, View view, String str) {
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

    /* JADX WARNING: type inference failed for: r0v10, types: [i0.j.d.h.a.g, i0.j.d.d.a.d] */
    public void N() {
        TextInputEditText textInputEditText;
        TextInputEditText textInputEditText2;
        boolean z = false;
        if (!(getContext() == null || (textInputEditText2 = this.Y1) == null || this.b2 == null)) {
            if (textInputEditText2.getText() == null || !TextUtils.isEmpty(this.Y1.getText().toString())) {
                J0(false, this.q, this.b2, (String) null);
                z = true;
            } else {
                J0(true, this.q, this.b2, getResources().getString(R.string.feature_request_str_add_comment_comment_empty));
                this.q.requestFocus();
                this.b2.setBackgroundColor(h0.i.b.a.getColor(getContext(), R.color.ib_fr_add_comment_error));
            }
        }
        if (z) {
            if ((!this.c.m() || I0()) && (textInputEditText = this.Y1) != null && this.Z1 != null && this.a2 != null) {
                if (textInputEditText.getText() == null || this.Z1.getText() == null || this.a2.getText() == null) {
                    InstabugSDKLogger.e(this, "comment text is null");
                    return;
                }
                ? r02 = this.c;
                d dVar = new d(this.d, this.Y1.getText().toString(), this.Z1.getText().toString(), this.a2.getText().toString());
                i0.j.d.h.a.a aVar = r02.d;
                if (aVar != null) {
                    InstabugCore.setEnteredUsername(aVar.g());
                    InstabugCore.setEnteredEmail(r02.d.t());
                    r02.d.b0();
                }
                c cVar = r02.c;
                if (cVar != null) {
                    try {
                        i0.j.d.g.a.d.a().c(cVar.b, dVar, new i0.j.d.d.a.b(r02));
                    } catch (JSONException e) {
                        InstabugSDKLogger.e(cVar, e.getMessage() != null ? e.getMessage() : "something went wrong while trying to add new comment", e);
                    }
                }
            }
        }
    }

    public void addToolbarActionButtons() {
        this.toolbarActionButtons.add(new f(-1, R.string.feature_request_str_post_comment, new C0103b(), f.b.TEXT));
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void b0() {
        ProgressDialog progressDialog = this.e2;
        if (progressDialog != null) {
            if (!progressDialog.isShowing()) {
                this.e2.show();
            }
        } else if (getActivity() != null) {
            ProgressDialog progressDialog2 = new ProgressDialog(getActivity());
            this.e2 = progressDialog2;
            progressDialog2.setCancelable(false);
            this.e2.setMessage(getResources().getString(R.string.feature_request_str_adding_your_comment));
            ProgressBar progressBar = new ProgressBar(getActivity(), (AttributeSet) null, 16842871);
            progressBar.getIndeterminateDrawable().setColorFilter(Instabug.getPrimaryColor(), PorterDuff.Mode.MULTIPLY);
            this.e2.setIndeterminateDrawable(progressBar.getIndeterminateDrawable());
            this.e2.show();
        }
    }

    public void f(String str) {
        TextInputEditText textInputEditText = this.a2;
        if (textInputEditText != null) {
            textInputEditText.setText(str);
        }
    }

    public String g() {
        TextInputEditText textInputEditText = this.Z1;
        return (textInputEditText == null || textInputEditText.getText() == null) ? "" : this.Z1.getText().toString();
    }

    public int getContentLayout() {
        return R.layout.ib_fr_add_comment_fragment;
    }

    public String getTitle() {
        return getString(R.string.feature_request_comments);
    }

    public f getToolbarCloseActionButton() {
        return new f(R.drawable.ibg_core_ic_close, R.string.close, new a(), f.b.ICON);
    }

    public void i(String str) {
        TextInputEditText textInputEditText = this.Z1;
        if (textInputEditText != null) {
            textInputEditText.setText(str);
        }
    }

    public void initContentViews(View view, Bundle bundle) {
        this.q = (TextInputLayout) view.findViewById(R.id.feature_request_comment_text_input_layout);
        this.x = (TextInputLayout) view.findViewById(R.id.feature_request_name_text_input_layout);
        this.y = (TextInputLayout) view.findViewById(R.id.feature_request_email_text_input_layout);
        this.Y1 = (TextInputEditText) view.findViewById(R.id.feature_request_comment_edittext_layout);
        TextInputLayout textInputLayout = this.q;
        textInputLayout.setHint((CharSequence) getString(R.string.add_feature) + "*");
        this.Z1 = (TextInputEditText) view.findViewById(R.id.feature_request_name_edittext_layout);
        this.a2 = (TextInputEditText) view.findViewById(R.id.feature_request_email_edittext_layout);
        this.b2 = view.findViewById(R.id.feature_requests_comment_text_underline);
        this.c2 = view.findViewById(R.id.feature_requests_name_text_underline);
        this.d2 = view.findViewById(R.id.feature_requests_email_text_underline);
        this.f2 = (TextView) view.findViewById(R.id.feature_request_email_disclaimer);
        i0.j.c.l.a.I(this.q, Instabug.getPrimaryColor());
        i0.j.c.l.a.I(this.x, Instabug.getPrimaryColor());
        i0.j.c.l.a.I(this.y, Instabug.getPrimaryColor());
        TextInputEditText textInputEditText = this.Y1;
        if (textInputEditText != null) {
            textInputEditText.setOnFocusChangeListener(new i0.j.d.h.a.b(this));
            TextInputEditText textInputEditText2 = this.Z1;
            if (textInputEditText2 != null) {
                textInputEditText2.setOnFocusChangeListener(new i0.j.d.h.a.c(this));
                TextInputEditText textInputEditText3 = this.a2;
                if (textInputEditText3 != null) {
                    textInputEditText3.setOnFocusChangeListener(new i0.j.d.h.a.d(this));
                    this.a2.addTextChangedListener(new e(this));
                    this.Y1.addTextChangedListener(new i0.j.d.h.a.f(this));
                }
            }
        }
        g gVar = this.c;
        i0.j.d.h.a.a aVar = gVar.d;
        if (aVar != null) {
            aVar.i(InstabugCore.getEnteredUsername());
            gVar.d.f(InstabugCore.getEnteredEmail());
        }
        g gVar2 = this.c;
        if (gVar2.d != null) {
            Objects.requireNonNull(i0.j.d.e.a.d());
            if (i0.j.d.e.b.a().c) {
                gVar2.d.j(true);
            } else {
                gVar2.d.j(false);
            }
        }
        this.g2 = (TextView) findTextViewByTitle(R.string.feature_request_str_post_comment);
        A0(Boolean.FALSE);
    }

    public void j(boolean z) {
        TextInputLayout textInputLayout = this.y;
        if (textInputLayout != null) {
            if (z) {
                textInputLayout.setHint((CharSequence) getString(R.string.feature_requests_new_email) + "*");
                return;
            }
            textInputLayout.setHint((CharSequence) getString(R.string.feature_requests_new_email));
        }
    }

    public void m() {
        if (getActivity() != null && (getActivity() instanceof FeaturesRequestActivity)) {
            Iterator<Fragment> it = ((FeaturesRequestActivity) getActivity()).getSupportFragmentManager().O().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Fragment next = it.next();
                if (next instanceof com.instabug.featuresrequest.ui.c.a) {
                    com.instabug.featuresrequest.ui.c.a aVar = (com.instabug.featuresrequest.ui.c.a) next;
                    com.instabug.featuresrequest.d.b bVar = aVar.q;
                    if (bVar != null && aVar.presenter != null) {
                        bVar.b2++;
                        aVar.I0(bVar);
                        ((i0.j.d.h.c.c) aVar.presenter).k(aVar.q.c);
                    }
                }
            }
            getActivity().onBackPressed();
        }
    }

    public void n0() {
        ProgressDialog progressDialog = this.e2;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.e2.dismiss();
        }
    }

    public void onClick(View view) {
    }

    public void onCloseButtonClicked() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = new g(this);
        if (getArguments() != null) {
            this.d = getArguments().getLong("featureId");
        }
    }

    public void onStop() {
        super.onStop();
        if (getActivity() != null) {
            KeyboardUtils.hide(getActivity());
        }
    }

    public String t() {
        TextInputEditText textInputEditText = this.a2;
        return (textInputEditText == null || textInputEditText.getText() == null) ? "" : this.a2.getText().toString();
    }

    public void y0() {
        if (getActivity() != null) {
            Toast.makeText(getActivity(), R.string.feature_request_str_add_comment_error, 1).show();
        }
    }
}
