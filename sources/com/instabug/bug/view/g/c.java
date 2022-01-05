package com.instabug.bug.view.g;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.instabug.library.Feature;
import com.instabug.library.R;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.ui.InstabugBaseFragment;
import com.instabug.library.model.State;
import com.instabug.library.util.SystemServiceUtils;
import i0.j.b.f;
import i0.j.b.t.e;
import java.util.ArrayList;

/* compiled from: DisclaimerFragment */
public class c extends InstabugBaseFragment {
    public e c;
    public i0.j.b.t.h.a d;
    public ListView q;
    public b x;
    public CharSequence y = "";

    /* compiled from: DisclaimerFragment */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            b bVar;
            i0.j.b.t.h.a aVar = c.this.d;
            if (aVar != null) {
                a aVar2 = aVar.d.get(i);
                if (aVar2.q && (bVar = c.this.x) != null) {
                    bVar.c0(aVar2);
                }
            }
        }
    }

    /* compiled from: DisclaimerFragment */
    public interface b {
        void c0(a aVar);
    }

    public int getLayout() {
        return R.layout.instabug_lyt_disclaimer;
    }

    public void initViews(View view, Bundle bundle) {
        i0.j.b.t.h.a aVar;
        State state;
        if (getActivity() != null) {
            SystemServiceUtils.hideInputMethod(getActivity());
        }
        if (getContext() != null) {
            Context context = getContext();
            ArrayList arrayList = new ArrayList();
            com.instabug.bug.model.a aVar2 = f.g().b;
            if (!(aVar2 == null || aVar2.getState() == null || (state = aVar2.getState()) == null)) {
                if (state.getAppPackageName() != null) {
                    i0.h.a.b.c.m.b.h(new a(State.KEY_APP_PACKAGE_NAME, state.getAppPackageName()), arrayList);
                }
                if (state.getAppVersion() != null) {
                    i0.h.a.b.c.m.b.h(new a("app_version", state.getAppVersion()), arrayList);
                }
                if (state.getBatteryState() != null) {
                    i0.h.a.b.c.m.b.h(new a("BATTERY", state.getBatteryLevel() + "%, " + state.getBatteryState()), arrayList);
                }
                if (state.getCarrier() != null) {
                    i0.h.a.b.c.m.b.h(new a("carrier", state.getCarrier()), arrayList);
                }
                Feature.State featureState = InstabugCore.getFeatureState(Feature.CONSOLE_LOGS);
                Feature.State state2 = Feature.State.ENABLED;
                boolean z = false;
                if (featureState == state2) {
                    a aVar3 = new a(State.KEY_CONSOLE_LOG, state.getConsoleLog().toString());
                    aVar3.q = true;
                    i0.h.a.b.c.m.b.h(aVar3, arrayList);
                }
                if (state.getCurrentView() != null) {
                    i0.h.a.b.c.m.b.h(new a(State.KEY_CURRENT_VIEW, state.getCurrentView()), arrayList);
                }
                if (state.getScreenDensity() != null) {
                    i0.h.a.b.c.m.b.h(new a(State.KEY_DENSITY, state.getScreenDensity()), arrayList);
                }
                if (state.getDevice() != null) {
                    i0.h.a.b.c.m.b.h(new a("device", state.getDevice()), arrayList);
                }
                i0.h.a.b.c.m.b.h(new a(State.KEY_DEVICE_ROOTED, String.valueOf(state.isDeviceRooted())), arrayList);
                i0.h.a.b.c.m.b.h(new a("duration", String.valueOf(state.getDuration())), arrayList);
                if (state.getUserEmail() != null) {
                    i0.h.a.b.c.m.b.h(new a("email", state.getUserEmail()), arrayList);
                }
                if (state.getInstabugLog() != null) {
                    a aVar4 = new a(State.KEY_INSTABUG_LOG, state.getInstabugLog());
                    aVar4.q = true;
                    i0.h.a.b.c.m.b.h(aVar4, arrayList);
                }
                if (state.getLocale() != null) {
                    i0.h.a.b.c.m.b.h(new a(State.KEY_LOCALE, state.getLocale()), arrayList);
                }
                i0.h.a.b.c.m.b.h(new a("MEMORY", (((float) state.getUsedMemory()) / 1000.0f) + "/" + (((float) state.getTotalMemory()) / 1000.0f) + " GB"), arrayList);
                if (state.getNetworkLogs() != null) {
                    a aVar5 = new a(State.KEY_NETWORK_LOGS, state.getNetworkLogs());
                    aVar5.q = true;
                    i0.h.a.b.c.m.b.h(aVar5, arrayList);
                }
                if (state.getScreenOrientation() != null) {
                    i0.h.a.b.c.m.b.h(new a("orientation", state.getScreenOrientation()), arrayList);
                }
                if (state.getOS() != null) {
                    i0.h.a.b.c.m.b.h(new a("os", state.getOS()), arrayList);
                }
                i0.h.a.b.c.m.b.h(new a(State.KEY_REPORTED_AT, String.valueOf(state.getReportedAt())), arrayList);
                if (state.getScreenSize() != null) {
                    i0.h.a.b.c.m.b.h(new a(State.KEY_SCREEN_SIZE, state.getScreenSize()), arrayList);
                }
                if (state.getSdkVersion() != null) {
                    i0.h.a.b.c.m.b.h(new a("sdk_version", state.getSdkVersion()), arrayList);
                }
                i0.h.a.b.c.m.b.h(new a("STORAGE", (((float) state.getUsedStorage()) / 1000.0f) + "/" + (((float) state.getTotalStorage()) / 1000.0f) + " GB"), arrayList);
                if (state.getUserAttributes() != null) {
                    a aVar6 = new a("user_attributes", state.getUserAttributes());
                    aVar6.q = true;
                    i0.h.a.b.c.m.b.h(aVar6, arrayList);
                }
                if (state.getUserData() != null) {
                    a aVar7 = new a(State.KEY_USER_DATA, state.getUserData());
                    aVar7.q = true;
                    i0.h.a.b.c.m.b.h(aVar7, arrayList);
                }
                if (InstabugCore.getFeatureState(Feature.TRACK_USER_STEPS) == state2) {
                    a aVar8 = new a(State.KEY_USER_STEPS, state.getUserSteps().toString());
                    aVar8.q = true;
                    i0.h.a.b.c.m.b.h(aVar8, arrayList);
                }
                if (InstabugCore.getFeatureState(Feature.REPRO_STEPS) == state2) {
                    z = true;
                }
                if (z) {
                    a aVar9 = new a(State.KEY_VISUAL_USER_STEPS, state.getVisualUserSteps());
                    aVar9.q = true;
                    i0.h.a.b.c.m.b.h(aVar9, arrayList);
                }
                if (state.getWifiSSID() != null) {
                    i0.h.a.b.c.m.b.h(new a(State.KEY_WIFI_SSID, state.getWifiSSID()), arrayList);
                }
                i0.h.a.b.c.m.b.h(new a(State.KEY_WIFI_STATE, String.valueOf(state.isWifiEnable())), arrayList);
            }
            this.d = new i0.j.b.t.h.a(context, arrayList);
        }
        ListView listView = (ListView) findViewById(R.id.instabug_disclaimer_list);
        this.q = listView;
        if (!(listView == null || (aVar = this.d) == null)) {
            listView.setAdapter(aVar);
            this.q.setOnItemClickListener(new a());
        }
        e eVar = this.c;
        if (eVar != null) {
            this.y = eVar.l();
            this.c.f(getString(R.string.ib_str_report_data));
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (getActivity() instanceof e) {
            try {
                this.x = (b) context;
                this.c = (e) getContext();
            } catch (ClassCastException unused) {
                throw new ClassCastException(context.toString() + " must implement DisclaimerFragment.Callbacks");
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public void onDestroy() {
        super.onDestroy();
        e eVar = this.c;
        if (eVar != null) {
            eVar.f(String.valueOf(this.y));
        }
    }

    public void onDetach() {
        super.onDetach();
        this.c = null;
    }
}
