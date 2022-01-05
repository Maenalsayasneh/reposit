package com.instabug.bug.view.actionList.service;

import com.instabug.library.network.InstabugNetworkBasedBackgroundService;
import com.instabug.library.util.TaskDebouncer;
import i0.j.b.t.d.a.a;

public class ReportCategoriesService extends InstabugNetworkBasedBackgroundService {
    public static final /* synthetic */ int c = 0;
    public TaskDebouncer d = new TaskDebouncer(3000);

    public void runBackgroundTask() {
        this.d.debounce((Runnable) new a(this));
    }
}
