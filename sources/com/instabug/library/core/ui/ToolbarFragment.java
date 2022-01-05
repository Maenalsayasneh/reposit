package com.instabug.library.core.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.TextView;
import com.instabug.library.R;
import com.instabug.library.core.ui.BaseContract;
import com.instabug.library.core.ui.BaseContract.Presenter;
import com.instabug.library.util.SystemServiceUtils;
import h0.o.a.k;

public abstract class ToolbarFragment<P extends BaseContract.Presenter> extends InstabugBaseFragment<P> {
    public ImageButton toolbarImageButtonClose;
    public ImageButton toolbarImageButtonDone;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            k activity = ToolbarFragment.this.getActivity();
            if (activity != null) {
                SystemServiceUtils.hideInputMethod(activity);
            }
            ToolbarFragment.this.onDoneButtonClicked();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            ToolbarFragment.this.onCloseButtonClicked();
        }
    }

    private void initToolbarViews() {
        ImageButton imageButton = (ImageButton) findViewById(R.id.instabug_btn_toolbar_right);
        this.toolbarImageButtonDone = imageButton;
        if (imageButton != null) {
            imageButton.setOnClickListener(new a());
        }
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.instabug_btn_toolbar_left);
        this.toolbarImageButtonClose = imageButton2;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(new b());
        }
    }

    public abstract int getContentLayout();

    public int getLayout() {
        return R.layout.instabug_fragment_toolbar;
    }

    public abstract String getTitle();

    public abstract void initContentViews(View view, Bundle bundle);

    public void initViews(View view, Bundle bundle) {
        initToolbarViews();
        ViewStub viewStub = (ViewStub) findViewById(R.id.instabug_content);
        if (viewStub != null) {
            viewStub.setLayoutResource(getContentLayout());
            viewStub.inflate();
        }
        initContentViews(view, bundle);
        setTitle(getTitle());
    }

    public void onCloseButtonClicked() {
        k activity = getActivity();
        if (activity != null) {
            SystemServiceUtils.hideInputMethod(activity);
            activity.onBackPressed();
            return;
        }
        Log.w("ToolbarFragment", "onCloseButtonClicked can't be executed due to null getActivity() reference");
    }

    public abstract void onDoneButtonClicked();

    public void setTitle(String str) {
        TextView textView;
        if (this.rootView != null && (textView = (TextView) findViewById(R.id.instabug_fragment_title)) != null) {
            textView.setText(str);
        }
    }
}
