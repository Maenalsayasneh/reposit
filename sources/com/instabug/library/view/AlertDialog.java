package com.instabug.library.view;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.instabug.library.Instabug;
import com.instabug.library.R;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.e.y.c.a;

public class AlertDialog extends a implements View.OnClickListener {
    public String message;
    private OnAlertViewsClickListener onAlertViewsClickListener;
    public TextView tvMessage;
    public TextView tvNo;
    public TextView tvYes;

    public interface OnAlertViewsClickListener {
        void onPositiveButtonClicked();
    }

    public int getLayout() {
        return R.layout.instabug_alert_dialog;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public String getMessage() {
        TextView textView = this.tvMessage;
        return String.valueOf(textView != null ? textView.getText() : null);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void initViews(View view, Bundle bundle) {
        this.tvMessage = (TextView) view.findViewById(R.id.tvMessage);
        this.tvYes = (TextView) view.findViewById(R.id.btnYes);
        this.tvNo = (TextView) view.findViewById(R.id.btnNo);
        TextView textView = this.tvYes;
        if (textView != null) {
            textView.setTextColor(Instabug.getPrimaryColor());
            this.tvYes.setOnClickListener(this);
        }
        TextView textView2 = this.tvNo;
        if (textView2 != null) {
            textView2.setTextColor(Instabug.getPrimaryColor());
            this.tvNo.setOnClickListener(this);
        }
        if (bundle != null) {
            this.message = bundle.getString(InstabugDbContract.BugEntry.COLUMN_MESSAGE, this.message);
        }
        TextView textView3 = this.tvMessage;
        if (textView3 != null) {
            textView3.setText(this.message);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btnYes) {
            OnAlertViewsClickListener onAlertViewsClickListener2 = this.onAlertViewsClickListener;
            if (onAlertViewsClickListener2 != null) {
                onAlertViewsClickListener2.onPositiveButtonClicked();
            }
        } else if (id == R.id.btnNo) {
            dismiss();
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString(InstabugDbContract.BugEntry.COLUMN_MESSAGE, this.message);
    }

    public void setMessage(String str) {
        TextView textView = this.tvMessage;
        if (textView != null) {
            textView.setText(str);
        }
        this.message = str;
    }

    public void setOnAlertViewsClickListener(OnAlertViewsClickListener onAlertViewsClickListener2) {
        this.onAlertViewsClickListener = onAlertViewsClickListener2;
    }
}
