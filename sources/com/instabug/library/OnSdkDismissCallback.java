package com.instabug.library;

import com.google.android.gms.recaptcha.RecaptchaActionType;

public interface OnSdkDismissCallback {

    public enum DismissType {
        SUBMIT,
        CANCEL,
        ADD_ATTACHMENT
    }

    public enum ReportType {
        BUG("bug"),
        FEEDBACK("feedback"),
        QUESTION("question"),
        OTHER(RecaptchaActionType.OTHER);
        
        private final String name;

        private ReportType(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    void call(DismissType dismissType, ReportType reportType);
}
