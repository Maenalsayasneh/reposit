package com.instabug.library.core.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instabug.library.core.ui.BaseContract;
import com.instabug.library.core.ui.BaseContract.Presenter;
import com.instabug.library.util.InstabugSDKLogger;

public abstract class InstabugBaseFragment<P extends BaseContract.Presenter> extends Fragment implements BaseContract.View<Fragment> {
    public P presenter;
    public View rootView;

    @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public <T extends View> T findViewById(int i) {
        View view = this.rootView;
        if (view == null) {
            return null;
        }
        return view.findViewById(i);
    }

    public void finishActivity() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public abstract int getLayout();

    public Fragment getViewContext() {
        return this;
    }

    public abstract void initViews(View view, Bundle bundle);

    public void onCreate(Bundle bundle) {
        InstabugSDKLogger.d(this, "onCreate called");
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InstabugSDKLogger.d(this, "onCreateView called");
        View inflate = layoutInflater.inflate(getLayout(), viewGroup, false);
        this.rootView = inflate;
        initViews(inflate, bundle);
        return this.rootView;
    }

    public void onDestroyView() {
        InstabugSDKLogger.d(this, "onDestroyView called");
        this.rootView = null;
        super.onDestroyView();
    }

    public void onStart() {
        InstabugSDKLogger.d(this, "onStart called");
        super.onStart();
    }

    public void onStop() {
        InstabugSDKLogger.d(this, "onStop called");
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        InstabugSDKLogger.d(this, "onViewCreated called");
        super.onViewCreated(view, bundle);
    }
}
