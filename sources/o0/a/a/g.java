package o0.a.a;

import android.net.Uri;
import java.util.Objects;
import m0.r.t.a.r.m.a1.a;
import net.openid.appauth.AuthorizationServiceDiscovery;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AuthorizationServiceConfiguration */
public class g {
    public final Uri a;
    public final Uri b;
    public final Uri c;
    public final Uri d;
    public final AuthorizationServiceDiscovery e;

    public g(Uri uri, Uri uri2) {
        Objects.requireNonNull(uri);
        this.a = uri;
        Objects.requireNonNull(uri2);
        this.b = uri2;
        this.d = null;
        this.c = null;
        this.e = null;
    }

    public static g a(JSONObject jSONObject) throws JSONException {
        a.z0(jSONObject, "json object cannot be null");
        if (jSONObject.has("discoveryDoc")) {
            try {
                return new g(new AuthorizationServiceDiscovery(jSONObject.optJSONObject("discoveryDoc")));
            } catch (AuthorizationServiceDiscovery.MissingArgumentException e2) {
                StringBuilder P0 = i0.d.a.a.a.P0("Missing required field in discovery doc: ");
                P0.append(e2.c);
                throw new JSONException(P0.toString());
            }
        } else {
            a.x0(jSONObject.has("authorizationEndpoint"), "missing authorizationEndpoint");
            a.x0(jSONObject.has("tokenEndpoint"), "missing tokenEndpoint");
            return new g(a.Z1(jSONObject, "authorizationEndpoint"), a.Z1(jSONObject, "tokenEndpoint"), a.a2(jSONObject, "registrationEndpoint"), a.a2(jSONObject, "endSessionEndpoint"));
        }
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        a.Y2(jSONObject, "authorizationEndpoint", this.a.toString());
        a.Y2(jSONObject, "tokenEndpoint", this.b.toString());
        Uri uri = this.d;
        if (uri != null) {
            a.Y2(jSONObject, "registrationEndpoint", uri.toString());
        }
        Uri uri2 = this.c;
        if (uri2 != null) {
            a.Y2(jSONObject, "endSessionEndpoint", uri2.toString());
        }
        AuthorizationServiceDiscovery authorizationServiceDiscovery = this.e;
        if (authorizationServiceDiscovery != null) {
            a.Z2(jSONObject, "discoveryDoc", authorizationServiceDiscovery.k);
        }
        return jSONObject;
    }

    public g(Uri uri, Uri uri2, Uri uri3, Uri uri4) {
        Objects.requireNonNull(uri);
        this.a = uri;
        Objects.requireNonNull(uri2);
        this.b = uri2;
        this.d = uri3;
        this.c = uri4;
        this.e = null;
    }

    public g(AuthorizationServiceDiscovery authorizationServiceDiscovery) {
        a.z0(authorizationServiceDiscovery, "docJson cannot be null");
        this.e = authorizationServiceDiscovery;
        this.a = (Uri) authorizationServiceDiscovery.a(AuthorizationServiceDiscovery.b);
        this.b = (Uri) authorizationServiceDiscovery.a(AuthorizationServiceDiscovery.c);
        this.d = (Uri) authorizationServiceDiscovery.a(AuthorizationServiceDiscovery.f);
        this.c = (Uri) authorizationServiceDiscovery.a(AuthorizationServiceDiscovery.d);
    }
}
