package com.instabug.library.core.plugin;

import android.net.Uri;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

@SuppressFBWarnings({"SE_BAD_FIELD"})
public class PluginPromptOption implements Serializable {
    public static final int NO_ORDER = -1;
    private String description;
    private int icon;
    private int invocationMode;
    private boolean isInitialScreenshotRequired;
    private int notificationCount;
    private OnInvocationListener onInvocationListener;
    private int order;
    private PluginPromptOption parent;
    @PromptOptionIdentifier
    private int promptOptionIdentifier;
    private ArrayList<PluginPromptOption> subOptions;
    private String title;

    public interface OnInvocationListener {
        void onInvoke(Uri uri, String... strArr);
    }

    public @interface PromptOptionIdentifier {
        public static final int ASK_QUESTION = 3;
        public static final int BUG_REPORT = 0;
        public static final int CHAT_LIST = 2;
        public static final int FEATURE_REQUEST = 5;
        public static final int FEEDBACK = 1;
    }

    public static class a implements Comparator<PluginPromptOption>, Serializable {
        public int compare(Object obj, Object obj2) {
            return ((PluginPromptOption) obj).getOrder() - ((PluginPromptOption) obj2).getOrder();
        }
    }

    public String getDescription() {
        return this.description;
    }

    public int getIcon() {
        return this.icon;
    }

    public int getInvocationMode() {
        return this.invocationMode;
    }

    public int getNotificationCount() {
        return this.notificationCount;
    }

    public int getOrder() {
        return this.order;
    }

    public PluginPromptOption getParent() {
        return this.parent;
    }

    @PromptOptionIdentifier
    public int getPromptOptionIdentifier() {
        return this.promptOptionIdentifier;
    }

    public ArrayList<PluginPromptOption> getSubOptions() {
        return this.subOptions;
    }

    public String getTitle() {
        return this.title;
    }

    public void invoke(Uri uri, String... strArr) {
        OnInvocationListener onInvocationListener2 = this.onInvocationListener;
        if (onInvocationListener2 != null) {
            onInvocationListener2.onInvoke(uri, strArr);
        }
    }

    public boolean isInitialScreenshotRequired() {
        return this.isInitialScreenshotRequired;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setIcon(int i) {
        this.icon = i;
    }

    public void setInitialScreenshotRequired(boolean z) {
        this.isInitialScreenshotRequired = z;
    }

    public void setInvocationMode(int i) {
        this.invocationMode = i;
    }

    public void setNotificationCount(int i) {
        if (i > 99) {
            this.notificationCount = 99;
        } else if (i < 0) {
            this.notificationCount = 0;
        } else {
            this.notificationCount = i;
        }
    }

    public void setOnInvocationListener(OnInvocationListener onInvocationListener2) {
        this.onInvocationListener = onInvocationListener2;
    }

    public void setOrder(int i) {
        this.order = i;
    }

    public void setParent(PluginPromptOption pluginPromptOption) {
        if (pluginPromptOption != null) {
            this.parent = pluginPromptOption;
        }
    }

    public void setPromptOptionIdentifier(@PromptOptionIdentifier int i) {
        this.promptOptionIdentifier = i;
    }

    public void setSubOptions(ArrayList<PluginPromptOption> arrayList) {
        this.subOptions = arrayList;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void invoke() {
        invoke((Uri) null, new String[0]);
    }
}
