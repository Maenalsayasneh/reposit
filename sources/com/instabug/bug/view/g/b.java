package com.instabug.bug.view.g;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.instabug.library.R;
import com.instabug.library.core.ui.InstabugBaseFragment;

/* compiled from: DisclaimerDetailsFragment */
public class b extends InstabugBaseFragment {
    public static final /* synthetic */ int c = 0;
    public TextView d;

    public int getLayout() {
        return R.layout.instabug_lyt_disclaimer_details;
    }

    public void initViews(View view, Bundle bundle) {
        a aVar;
        TextView textView;
        this.d = (TextView) findViewById(R.id.instabug_disclaimer_details);
        if (getArguments() != null && (aVar = (a) getArguments().getSerializable("disclaimer")) != null && (textView = this.d) != null) {
            textView.setText(String.valueOf(aVar.d));
        }
    }
}
