package i0.n.b;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.sinch.metadata.collector.BasicBatteryLevelCollector;
import com.sinch.metadata.collector.BasicNetworkInfoCollector;
import com.sinch.metadata.collector.sim.BasicSimStateCollector;
import com.sinch.metadata.collector.sim.ReflectionSafeSimCardInfoCollector;
import com.sinch.metadata.model.DeviceMetadata;
import com.sinch.metadata.model.PermissionsMetadata;
import com.sinch.metadata.model.PhoneMetadata;
import com.sinch.metadata.model.network.NetworkInfo;
import com.sinch.metadata.model.sim.SimState;
import com.sinch.verification.utils.permission.Permission;
import i0.j.f.p.h;
import java.util.List;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: AndroidMetadataFactory.kt */
public final class a implements i0.n.c.c.a<PhoneMetadata> {
    public final Context a;
    public final String b;
    public final String c;

    public a(Context context, String str, String str2) {
        i.e(context, "context");
        i.e(str, "sdk");
        i.e(str2, "sdkFlavor");
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    public Object create() {
        PhoneMetadata.Companion companion = PhoneMetadata.Companion;
        String str = this.b;
        String str2 = this.c;
        ReflectionSafeSimCardInfoCollector reflectionSafeSimCardInfoCollector = new ReflectionSafeSimCardInfoCollector(this.a);
        BasicSimStateCollector basicSimStateCollector = new BasicSimStateCollector(this.a);
        Context context = this.a;
        i.e(context, "context");
        Context context2 = this.a;
        i.e(context2, "context");
        BasicNetworkInfoCollector basicNetworkInfoCollector = new BasicNetworkInfoCollector(this.a);
        BasicBatteryLevelCollector basicBatteryLevelCollector = new BasicBatteryLevelCollector(this.a);
        Objects.requireNonNull(companion);
        i.e(str, "sdk");
        i.e(str2, "sdkFlavor");
        i.e(reflectionSafeSimCardInfoCollector, "simCardInfoCollector");
        i.e(basicSimStateCollector, "simsStateCollector");
        i.e(basicNetworkInfoCollector, "networkInfoCollector");
        i.e(basicBatteryLevelCollector, "batteryLevelCollector");
        String str3 = Build.VERSION.RELEASE;
        i.d(str3, "Build.VERSION.RELEASE");
        String str4 = Build.MODEL;
        i.d(str4, "Build.MODEL");
        String str5 = Build.DEVICE;
        i.d(str5, "Build.DEVICE");
        String str6 = Build.MANUFACTURER;
        i.d(str6, "Build.MANUFACTURER");
        DeviceMetadata deviceMetadata = new DeviceMetadata(str4, str5, str6);
        List list = (List) reflectionSafeSimCardInfoCollector.a();
        SimState simState = (SimState) basicSimStateCollector.a();
        Resources resources = context.getResources();
        i.d(resources, "context.resources");
        Configuration configuration = resources.getConfiguration();
        i.d(configuration, "context.resources.configuration");
        boolean z = false;
        String locale = configuration.getLocales().get(0).toString();
        i.d(locale, "if (ApiLevelUtils.isApi2…n.locale\n    }.toString()");
        boolean t2 = h.t2(context2, Permission.READ_PHONE_STATE);
        boolean t22 = h.t2(context2, Permission.READ_CALL_LOG);
        boolean t23 = h.t2(context2, Permission.CALL_PHONE);
        boolean t24 = h.t2(context2, Permission.READ_SMS);
        boolean t25 = h.t2(context2, Permission.RECEIVE_SMS);
        boolean t26 = h.t2(context2, Permission.ACCESS_NETWORK_STATE);
        if (h.t2(context2, Permission.ACCESS_COARSE_LOCATION) || h.t2(context2, Permission.ACCESS_FINE_LOCATION)) {
            z = true;
        }
        return new PhoneMetadata(str3, (String) null, str, str2, deviceMetadata, list, simState, locale, new PermissionsMetadata(t2, t22, t23, t24, t25, t26, z), (NetworkInfo) basicNetworkInfoCollector.a(), (String) basicBatteryLevelCollector.a(), 2);
    }
}
