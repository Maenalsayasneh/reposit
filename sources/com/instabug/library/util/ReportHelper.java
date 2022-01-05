package com.instabug.library.util;

import android.annotation.SuppressLint;
import android.net.Uri;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributeCacheManager;
import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributesDbHelper;
import com.instabug.library.logging.InstabugLog;
import com.instabug.library.model.Report;
import com.instabug.library.model.State;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportHelper {
    @SuppressLint({"NULL_DEREFERENCE"})
    private static String getAppendedUserTags(List<String> list) {
        if (Instabug.getTags() != null) {
            Instabug.getTags().addAll(list);
        }
        return InstabugCore.getTagsAsString();
    }

    public static Report getReport(Report.OnReportCreatedListener onReportCreatedListener) {
        Report report = new Report();
        if (onReportCreatedListener != null) {
            onReportCreatedListener.onReportCreated(report);
        }
        return report;
    }

    private static String getUserAppendedAttributes(HashMap<String, String> hashMap) {
        for (Map.Entry next : hashMap.entrySet()) {
            UserAttributeCacheManager.insert((String) next.getKey(), (String) next.getValue());
        }
        return UserAttributesDbHelper.getSDKUserAttributes();
    }

    public static void update(State state, Report report) {
        if (state != null) {
            state.setTags(getAppendedUserTags(report.getTags()));
            state.updateConsoleLog(report.getConsoleLog());
            for (Map.Entry next : report.getFileAttachments().entrySet()) {
                Instabug.addFileAttachment((Uri) next.getKey(), (String) next.getValue());
            }
            Feature.State featureState = InstabugCore.getFeatureState(Feature.USER_DATA);
            Feature.State state2 = Feature.State.ENABLED;
            if (featureState == state2 && report.getUserData() != null) {
                state.setUserData(report.getUserData() == null ? Instabug.getUserData() : report.getUserData());
            }
            state.setUserAttributes(getUserAppendedAttributes(report.getUserAttributes()));
            if (InstabugCore.getFeatureState(Feature.INSTABUG_LOGS) == state2) {
                state.setInstabugLog(InstabugLog.getLogs());
            }
        }
    }
}
