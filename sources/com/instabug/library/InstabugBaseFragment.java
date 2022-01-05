package com.instabug.library;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;

public abstract class InstabugBaseFragment extends Fragment {
    private Activity activity;
    private boolean isStateRestored;
    private View view;

    public abstract void consumeNewInstanceSavedArguments();

    public abstract int getLayout();

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public Activity getPreservedActivity() {
        StringBuilder P0 = a.P0("Returning preserved activity ");
        P0.append(this.activity);
        InstabugSDKLogger.v(this, P0.toString());
        return this.activity;
    }

    public abstract String getTitle();

    public boolean isStateRestored() {
        return this.isStateRestored;
    }

    public void onAttach(Activity activity2) {
        super.onAttach(activity2);
        this.activity = activity2;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InstabugSDKLogger.v(this, "onCreateView called");
        if (getArguments() != null) {
            StringBuilder P0 = a.P0("Arguments found, calling consumeNewInstanceSavedArguments with ");
            P0.append(getArguments());
            InstabugSDKLogger.v(this, P0.toString());
            consumeNewInstanceSavedArguments();
        }
        this.isStateRestored = false;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InstabugSDKLogger.v(this, "onCreateView called");
        this.view = layoutInflater.inflate(getLayout(), viewGroup, false);
        setTitle(getTitle());
        return this.view;
    }

    public void onPause() {
        super.onPause();
        InstabugSDKLogger.v(this, "onPause called, calling saveState");
    }

    public void onResume() {
        super.onResume();
        InstabugSDKLogger.v(this, "onResume called, calling saveState");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InstabugSDKLogger.v(this, "onSaveInstanceState called, calling saveState");
        saveState(bundle);
    }

    public void onViewCreated(View view2, Bundle bundle) {
        InstabugSDKLogger.v(this, "onViewCreated called");
        super.onViewCreated(view2, bundle);
        if (bundle != null) {
            InstabugSDKLogger.v(this, "savedInstanceState found, calling restoreState");
            restoreState(bundle);
            this.isStateRestored = true;
        }
    }

    public abstract void restoreState(Bundle bundle);

    public abstract void saveState(Bundle bundle);

    public void setTitle(String str) {
        View view2 = this.view;
        if (view2 == null) {
            InstabugSDKLogger.v(this, "Calling setTitle before inflating the view! Ignoring call");
            return;
        }
        TextView textView = (TextView) view2.findViewById(R.id.instabug_fragment_title);
        if (textView != null) {
            InstabugSDKLogger.v(this, "Setting fragment title to \"" + str + "\"");
            textView.setText(str);
            return;
        }
        InstabugSDKLogger.v(this, "instabug_fragment_title wasn't found, make sure your layout.xml contains it");
    }
}
