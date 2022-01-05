package com.instabug.library.model;

import android.content.Context;
import android.net.Uri;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.logging.InstabugLog;
import com.instabug.library.util.StringUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Report {
    private ArrayList<a> consoleLogs = new ArrayList<>();
    private HashMap<Uri, String> fileAttachments = new HashMap<>();
    private ArrayList<String> tags = new ArrayList<>();
    private HashMap<String, String> userAttributes = new HashMap<>();
    private String userData;

    public interface OnReportCreatedListener {
        void onReportCreated(Report report);
    }

    public void addFileAttachment(Uri uri, String str) {
        this.fileAttachments.put(uri, str);
    }

    public void addTag(String... strArr) {
        Collections.addAll(this.tags, strArr);
    }

    public void appendToConsoleLogs(String str) {
        a aVar = new a();
        aVar.c = str;
        aVar.d = System.currentTimeMillis();
        this.consoleLogs.add(aVar);
    }

    public ArrayList<a> getConsoleLog() {
        return this.consoleLogs;
    }

    public HashMap<Uri, String> getFileAttachments() {
        return this.fileAttachments;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public HashMap<String, String> getUserAttributes() {
        return this.userAttributes;
    }

    public String getUserData() {
        return this.userData;
    }

    public void logDebug(String str) {
        if (InstabugCore.getFeatureState(Feature.INSTABUG_LOGS) == Feature.State.ENABLED) {
            InstabugLog.d(str);
        }
    }

    public void logError(String str) {
        if (InstabugCore.getFeatureState(Feature.INSTABUG_LOGS) == Feature.State.ENABLED) {
            InstabugLog.e(str);
        }
    }

    public void logInfo(String str) {
        if (InstabugCore.getFeatureState(Feature.INSTABUG_LOGS) == Feature.State.ENABLED) {
            InstabugLog.i(str);
        }
    }

    public void logVerbose(String str) {
        if (InstabugCore.getFeatureState(Feature.INSTABUG_LOGS) == Feature.State.ENABLED) {
            InstabugLog.v(str);
        }
    }

    public void logWarn(String str) {
        if (InstabugCore.getFeatureState(Feature.INSTABUG_LOGS) == Feature.State.ENABLED) {
            InstabugLog.w(str);
        }
    }

    public void setUserAttribute(String str, String str2) {
        this.userAttributes.put(str, str2);
    }

    public void setUserData(String str) {
        this.userData = StringUtility.trimString(str, 1000);
    }

    public void addFileAttachment(byte[] bArr, String str) {
        Uri uriFromBytes;
        Context applicationContext = Instabug.getApplicationContext();
        if (applicationContext != null && AttachmentsUtility.isValidSize((double) bArr.length, 5.0d) && (uriFromBytes = AttachmentsUtility.getUriFromBytes(applicationContext, bArr, str)) != null) {
            this.fileAttachments.put(uriFromBytes, str);
        }
    }
}
