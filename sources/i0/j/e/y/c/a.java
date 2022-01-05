package i0.j.e.y.c;

import android.annotation.SuppressLint;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instabug.library.core.ui.BaseContract;
import com.instabug.library.core.ui.BaseContract.Presenter;
import com.instabug.library.util.InstabugSDKLogger;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

@SuppressFBWarnings({"UUF_UNUSED_PUBLIC_OR_PROTECTED_FIELD"})
/* compiled from: BaseDialogFragment */
public abstract class a<P extends BaseContract.Presenter> extends DialogFragment implements BaseContract.View<DialogFragment> {
    public P presenter;
    public View rootView;

    public <T extends View> T findViewById(int i) {
        View view = this.rootView;
        if (view == null) {
            return null;
        }
        return view.findViewById(i);
    }

    public void finishActivity() {
        getActivity().finish();
    }

    public abstract int getLayout();

    public DialogFragment getViewContext() {
        return this;
    }

    public abstract void initViews(View view, Bundle bundle);

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void onCreate(Bundle bundle) {
        InstabugSDKLogger.d(this, "onCreate called");
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!(getDialog() == null || getDialog().getWindow() == null)) {
            getDialog().getWindow().requestFeature(1);
        }
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

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void onViewCreated(View view, Bundle bundle) {
        InstabugSDKLogger.d(this, "onViewCreated called");
        super.onViewCreated(view, bundle);
    }
}
