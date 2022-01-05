package com.instabug.library.core.ui;

import android.annotation.SuppressLint;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import com.instabug.library.Instabug;
import com.instabug.library.R;
import com.instabug.library.core.ui.BaseContract;
import com.instabug.library.core.ui.BaseContract.Presenter;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

@SuppressFBWarnings({"UUF_UNUSED_PUBLIC_OR_PROTECTED_FIELD"})
public abstract class BaseToolbarActivity<P extends BaseContract.Presenter> extends BaseFragmentActivity<P> {
    public Toolbar toolbar;

    @SuppressLint({"NULL_DEREFERENCE"})
    private void initToolbar() {
        Toolbar toolbar2 = (Toolbar) findViewById(R.id.instabug_toolbar);
        this.toolbar = toolbar2;
        if (toolbar2 != null) {
            toolbar2.setBackgroundColor(Instabug.getPrimaryColor());
            setSupportActionBar(this.toolbar);
            getSupportActionBar().p(true);
            this.toolbar.setNavigationIcon(R.drawable.ibg_core_ic_close);
        }
    }

    public abstract int getContentLayout();

    public int getLayout() {
        return R.layout.instabug_toolbar_activity;
    }

    public abstract void initContentViews();

    public void initViews() {
        initToolbar();
        ViewStub viewStub = (ViewStub) findViewById(R.id.instabug_content);
        viewStub.setLayoutResource(getContentLayout());
        viewStub.inflate();
        initContentViews();
    }
}
