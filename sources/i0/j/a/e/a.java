package i0.j.a.e;

import android.content.SharedPreferences;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.a.b;
import i0.j.a.h.c.c;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: APMConfigurationHandlerImpl */
public class a {
    public b a;
    public i0.j.a.n.a.a b = i0.j.a.g.a.i();

    public a(b bVar) {
        this.a = bVar;
    }

    public void a() {
        i0.j.a.g.a.h().a();
    }

    public void b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("ui");
        if (optJSONObject != null) {
            boolean optBoolean = optJSONObject.optBoolean("enabled", false);
            SharedPreferences.Editor editor = ((c) this.a).b;
            if (editor != null) {
                editor.putBoolean("UI_TRACE_ENABLED", optBoolean).apply();
            }
            if (!optBoolean) {
                l();
                i();
                return;
            }
            float optDouble = (float) optJSONObject.optDouble("small_drop_duration_mus", 16700.0d);
            SharedPreferences.Editor editor2 = ((c) this.a).b;
            if (editor2 != null) {
                editor2.putFloat("UI_TRACE_SMALL_DROP_THRESHOLD", optDouble).apply();
            }
            float optDouble2 = (float) optJSONObject.optDouble("large_drop_duration_mus", 250000.0d);
            SharedPreferences.Editor editor3 = ((c) this.a).b;
            if (editor3 != null) {
                editor3.putFloat("UI_TRACE_LARGE_DROP_THRESHOLD", optDouble2).apply();
            }
            long optLong = optJSONObject.optLong("limit_per_request", 500);
            SharedPreferences.Editor editor4 = ((c) this.a).b;
            if (editor4 != null) {
                editor4.putLong("KEY_UI_TRACE_LIMIT_PER_REQUEST", optLong).apply();
            }
            long optLong2 = optJSONObject.optLong("store_limit", 2500);
            SharedPreferences.Editor editor5 = ((c) this.a).b;
            if (editor5 != null) {
                editor5.putLong("KEY_UI_TRACE_STORE_LIMIT", optLong2).apply();
                return;
            }
            return;
        }
        Objects.requireNonNull(this.b);
        InstabugSDKLogger.p("Instabug - APM", "Can't parse ui traces configurations, object is null.");
        l();
        i();
    }

    public void c() {
        i0.j.a.g.a.h();
        i0.j.a.g.a.f("execution_traces_thread_executor").execute(new b(i0.j.a.g.a.r()));
    }

    public final void d(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("launches");
        if (optJSONObject != null) {
            boolean optBoolean = optJSONObject.optBoolean("enabled", false);
            SharedPreferences.Editor editor = ((c) this.a).b;
            if (editor != null) {
                editor.putBoolean("LAUNCHES_ENABLED", optBoolean).apply();
            }
            if (!optBoolean) {
                j();
                a();
                return;
            }
            long optLong = optJSONObject.optLong("limit_per_request", 500);
            SharedPreferences.Editor editor2 = ((c) this.a).b;
            if (editor2 != null) {
                editor2.putLong("LAUNCHES_PER_REQUEST_LIMIT", optLong).apply();
            }
            long optLong2 = optJSONObject.optLong("store_limit", 2500);
            SharedPreferences.Editor editor3 = ((c) this.a).b;
            if (editor3 != null) {
                editor3.putLong("LAUNCHES_STORE_LIMIT", optLong2).apply();
                return;
            }
            return;
        }
        Objects.requireNonNull(this.b);
        InstabugSDKLogger.p("Instabug - APM", "Can't parse app launches configurations, object is null.");
        j();
        a();
    }

    public void e() {
        SharedPreferences.Editor editor = ((c) this.a).b;
        if (editor != null) {
            editor.putBoolean("TRACES_ENABLED", false).apply();
        }
        SharedPreferences.Editor editor2 = ((c) this.a).b;
        if (editor2 != null) {
            editor2.putLong("TRACES_PER_REQUEST_LIMIT", 500).apply();
        }
        SharedPreferences.Editor editor3 = ((c) this.a).b;
        if (editor3 != null) {
            editor3.putLong("TRACES_STORE_LIMIT", 2500).apply();
        }
        SharedPreferences.Editor editor4 = ((c) this.a).b;
        if (editor4 != null) {
            editor4.putInt("TRACES_ATTRIBUTES_COUNT", 5).apply();
        }
    }

    public final void f(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("traces");
        if (optJSONObject != null) {
            boolean optBoolean = optJSONObject.optBoolean("enabled", false);
            SharedPreferences.Editor editor = ((c) this.a).b;
            if (editor != null) {
                editor.putBoolean("TRACES_ENABLED", optBoolean).apply();
            }
            if (!optBoolean) {
                e();
                c();
                return;
            }
            long optLong = optJSONObject.optLong("limit_per_request", 500);
            SharedPreferences.Editor editor2 = ((c) this.a).b;
            if (editor2 != null) {
                editor2.putLong("TRACES_PER_REQUEST_LIMIT", optLong).apply();
            }
            long optLong2 = optJSONObject.optLong("store_limit", 2500);
            SharedPreferences.Editor editor3 = ((c) this.a).b;
            if (editor3 != null) {
                editor3.putLong("TRACES_STORE_LIMIT", optLong2).apply();
            }
            int optInt = optJSONObject.optInt("store_attributes_limit", 5);
            SharedPreferences.Editor editor4 = ((c) this.a).b;
            if (editor4 != null) {
                editor4.putInt("TRACES_ATTRIBUTES_COUNT", optInt).apply();
                return;
            }
            return;
        }
        Objects.requireNonNull(this.b);
        InstabugSDKLogger.p("Instabug - APM", "Can't parse execution traces configurations, object is null.");
        e();
        c();
    }

    public final void g() {
        i0.j.a.g.a.h();
        i0.j.a.g.a.f("network_log_thread_executor").execute(new i0.j.a.a(new c()));
    }

    public final void h(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(SDKCoreEvent.Network.TYPE_NETWORK);
        if (optJSONObject != null) {
            boolean optBoolean = optJSONObject.optBoolean("enabled", false);
            SharedPreferences.Editor editor = ((c) this.a).b;
            if (editor != null) {
                editor.putBoolean("NETWORK_ENABLED", optBoolean).apply();
            }
            if (!optBoolean) {
                k();
                g();
            }
            long optLong = optJSONObject.optLong("limit_per_request", 500);
            SharedPreferences.Editor editor2 = ((c) this.a).b;
            if (editor2 != null) {
                editor2.putLong("NETWORK_LOGS_REQUEST_LIMIT", optLong).apply();
            }
            long optLong2 = optJSONObject.optLong("store_limit", 2500);
            SharedPreferences.Editor editor3 = ((c) this.a).b;
            if (editor3 != null) {
                editor3.putLong("NETWORK_LOGS_CACHE_LIMIT", optLong2).apply();
                return;
            }
            return;
        }
        Objects.requireNonNull(this.b);
        InstabugSDKLogger.p("Instabug - APM", "Can't parse network logs configurations, object is null.");
        k();
        g();
    }

    public final void i() {
        i0.j.a.g.a.h().b();
    }

    public final void j() {
        SharedPreferences.Editor editor = ((c) this.a).b;
        if (editor != null) {
            editor.putBoolean("LAUNCHES_ENABLED", false).apply();
        }
        SharedPreferences.Editor editor2 = ((c) this.a).b;
        if (editor2 != null) {
            editor2.putLong("LAUNCHES_PER_REQUEST_LIMIT", 500).apply();
        }
        SharedPreferences.Editor editor3 = ((c) this.a).b;
        if (editor3 != null) {
            editor3.putLong("LAUNCHES_STORE_LIMIT", 2500).apply();
        }
    }

    public final void k() {
        SharedPreferences.Editor editor = ((c) this.a).b;
        if (editor != null) {
            editor.putBoolean("NETWORK_ENABLED", false).apply();
        }
        SharedPreferences.Editor editor2 = ((c) this.a).b;
        if (editor2 != null) {
            editor2.putLong("NETWORK_LOGS_REQUEST_LIMIT", 500).apply();
        }
        SharedPreferences.Editor editor3 = ((c) this.a).b;
        if (editor3 != null) {
            editor3.putLong("NETWORK_LOGS_CACHE_LIMIT", 2500).apply();
        }
    }

    public final void l() {
        SharedPreferences.Editor editor = ((c) this.a).b;
        if (editor != null) {
            editor.putBoolean("UI_TRACE_ENABLED", false).apply();
        }
        SharedPreferences.Editor editor2 = ((c) this.a).b;
        if (editor2 != null) {
            editor2.putLong("KEY_UI_TRACE_LIMIT_PER_REQUEST", 500).apply();
        }
        SharedPreferences.Editor editor3 = ((c) this.a).b;
        if (editor3 != null) {
            editor3.putLong("KEY_UI_TRACE_STORE_LIMIT", 2500).apply();
        }
        SharedPreferences.Editor editor4 = ((c) this.a).b;
        if (editor4 != null) {
            editor4.putFloat("UI_TRACE_LARGE_DROP_THRESHOLD", 250000.0f).apply();
        }
        SharedPreferences.Editor editor5 = ((c) this.a).b;
        if (editor5 != null) {
            editor5.putFloat("UI_TRACE_SMALL_DROP_THRESHOLD", 16700.0f).apply();
        }
    }
}
