package com.instabug.chat.ui.e;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.fragment.app.FragmentManager;
import com.instabug.chat.R;
import com.instabug.library.annotation.AnnotationLayout;
import com.instabug.library.core.ui.ToolbarFragment;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.c.n.d.b;

@SuppressLint({"ERADICATE_FIELD_NOT_NULLABLE", "ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: AnnotationFragment */
public class c extends ToolbarFragment<i0.j.c.n.d.a> implements b {
    public a Y1;
    public ProgressDialog Z1;
    public String c;
    public String d;
    public String q;
    public Uri x;
    public AnnotationLayout y;

    /* compiled from: AnnotationFragment */
    public interface a {
        void c0(String str, Uri uri, String str2);

        void t0(String str, Uri uri);
    }

    public void finish() {
        ProgressDialog progressDialog = this.Z1;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.Z1.dismiss();
        }
        a aVar = this.Y1;
        if (aVar != null) {
            aVar.c0(this.d, this.x, this.q);
        }
        if (getActivity() != null) {
            h0.o.a.a aVar2 = new h0.o.a.a(getActivity().getSupportFragmentManager());
            aVar2.n(this);
            aVar2.h();
            FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
            supportFragmentManager.A(new FragmentManager.n("annotation_fragment_for_chat", -1, 1), false);
        }
    }

    public int getContentLayout() {
        return R.layout.instabug_fragment_annotation;
    }

    public String getTitle() {
        return this.c;
    }

    public void initContentViews(View view, Bundle bundle) {
        ((ImageButton) view.findViewById(com.instabug.library.R.id.instabug_btn_toolbar_right)).setImageResource(com.instabug.library.R.drawable.ibg_core_ic_send);
        AnnotationLayout annotationLayout = (AnnotationLayout) view.findViewById(com.instabug.library.R.id.annotationLayout);
        this.y = annotationLayout;
        annotationLayout.setBaseImage(this.x, (Runnable) null);
    }

    public void k() {
        if (getActivity() != null) {
            ProgressDialog progressDialog = new ProgressDialog(getActivity());
            this.Z1 = progressDialog;
            progressDialog.setCancelable(false);
            this.Z1.setMessage(getResources().getString(R.string.instabug_str_dialog_message_preparing));
            this.Z1.show();
        }
    }

    public void onCloseButtonClicked() {
        a aVar = this.Y1;
        if (aVar != null) {
            aVar.t0(this.d, this.x);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!(getActivity() == null || getActivity().getSupportFragmentManager().J("chat_fragment") == null)) {
            this.Y1 = (a) getActivity().getSupportFragmentManager().J("chat_fragment");
        }
        if (getArguments() != null) {
            this.c = getArguments().getString(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
            this.d = getArguments().getString("chat_id");
            this.q = getArguments().getString("attachment_type");
            this.x = (Uri) getArguments().getParcelable("image_uri");
        }
        this.presenter = new i0.j.c.n.d.c(this);
    }

    public void onDoneButtonClicked() {
        AnnotationLayout annotationLayout;
        P p = this.presenter;
        if (p != null && (annotationLayout = this.y) != null) {
            ((i0.j.c.n.d.a) p).O(annotationLayout.getAnnotatedBitmap(), this.x);
        }
    }
}
