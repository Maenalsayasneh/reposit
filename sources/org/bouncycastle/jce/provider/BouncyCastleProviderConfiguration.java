package org.bouncycastle.jce.provider;

import java.security.Permission;
import java.security.spec.DSAParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import s0.a.b.j;
import s0.a.b.k0.h;
import s0.a.b.k0.p;
import s0.a.c.n.b;
import s0.a.d.e.e;

public class BouncyCastleProviderConfiguration implements ProviderConfiguration {
    private static Permission BC_ADDITIONAL_EC_CURVE_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.ADDITIONAL_EC_PARAMETERS);
    private static Permission BC_DH_LOCAL_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.THREAD_LOCAL_DH_DEFAULT_PARAMS);
    private static Permission BC_DH_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.DH_DEFAULT_PARAMS);
    private static Permission BC_EC_CURVE_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.ACCEPTABLE_EC_CURVES);
    private static Permission BC_EC_LOCAL_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.THREAD_LOCAL_EC_IMPLICITLY_CA);
    private static Permission BC_EC_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.EC_IMPLICITLY_CA);
    private volatile Set acceptableNamedCurves = new HashSet();
    private volatile Map additionalECParameters = new HashMap();
    private volatile Object dhDefaultParams;
    private ThreadLocal dhThreadSpec = new ThreadLocal();
    private volatile e ecImplicitCaParams;
    private ThreadLocal ecThreadSpec = new ThreadLocal();

    public Set getAcceptableNamedCurves() {
        return Collections.unmodifiableSet(this.acceptableNamedCurves);
    }

    public Map getAdditionalECParameters() {
        return Collections.unmodifiableMap(this.additionalECParameters);
    }

    public DHParameterSpec getDHDefaultParameters(int i) {
        Object obj = this.dhThreadSpec.get();
        if (obj == null) {
            obj = this.dhDefaultParams;
        }
        if (obj instanceof DHParameterSpec) {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) obj;
            if (dHParameterSpec.getP().bitLength() == i) {
                return dHParameterSpec;
            }
        } else if (obj instanceof DHParameterSpec[]) {
            DHParameterSpec[] dHParameterSpecArr = (DHParameterSpec[]) obj;
            for (int i2 = 0; i2 != dHParameterSpecArr.length; i2++) {
                if (dHParameterSpecArr[i2].getP().bitLength() == i) {
                    return dHParameterSpecArr[i2];
                }
            }
        }
        h hVar = (h) j.c(j.a.a, i);
        if (hVar != null) {
            return new b(hVar);
        }
        return null;
    }

    public DSAParameterSpec getDSADefaultParameters(int i) {
        p pVar = (p) j.c(j.a.b, i);
        if (pVar != null) {
            return new DSAParameterSpec(pVar.q, pVar.d, pVar.c);
        }
        return null;
    }

    public e getEcImplicitlyCa() {
        e eVar = (e) this.ecThreadSpec.get();
        return eVar != null ? eVar : this.ecImplicitCaParams;
    }

    public void setParameter(String str, Object obj) {
        ThreadLocal threadLocal;
        SecurityManager securityManager = System.getSecurityManager();
        if (str.equals(ConfigurableProvider.THREAD_LOCAL_EC_IMPLICITLY_CA)) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_EC_LOCAL_PERMISSION);
            }
            e convertSpec = ((obj instanceof e) || obj == null) ? (e) obj : EC5Util.convertSpec((ECParameterSpec) obj);
            if (convertSpec == null) {
                threadLocal = this.ecThreadSpec;
            } else {
                this.ecThreadSpec.set(convertSpec);
                return;
            }
        } else if (str.equals(ConfigurableProvider.EC_IMPLICITLY_CA)) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_EC_PERMISSION);
            }
            if ((obj instanceof e) || obj == null) {
                this.ecImplicitCaParams = (e) obj;
                return;
            } else {
                this.ecImplicitCaParams = EC5Util.convertSpec((ECParameterSpec) obj);
                return;
            }
        } else if (str.equals(ConfigurableProvider.THREAD_LOCAL_DH_DEFAULT_PARAMS)) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_DH_LOCAL_PERMISSION);
            }
            if ((obj instanceof DHParameterSpec) || (obj instanceof DHParameterSpec[]) || obj == null) {
                threadLocal = this.dhThreadSpec;
                if (obj != null) {
                    threadLocal.set(obj);
                    return;
                }
            } else {
                throw new IllegalArgumentException("not a valid DHParameterSpec");
            }
        } else if (str.equals(ConfigurableProvider.DH_DEFAULT_PARAMS)) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_DH_PERMISSION);
            }
            if ((obj instanceof DHParameterSpec) || (obj instanceof DHParameterSpec[]) || obj == null) {
                this.dhDefaultParams = obj;
                return;
            }
            throw new IllegalArgumentException("not a valid DHParameterSpec or DHParameterSpec[]");
        } else if (str.equals(ConfigurableProvider.ACCEPTABLE_EC_CURVES)) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_EC_CURVE_PERMISSION);
            }
            this.acceptableNamedCurves = (Set) obj;
            return;
        } else if (str.equals(ConfigurableProvider.ADDITIONAL_EC_PARAMETERS)) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_ADDITIONAL_EC_CURVE_PERMISSION);
            }
            this.additionalECParameters = (Map) obj;
            return;
        } else {
            return;
        }
        threadLocal.remove();
    }
}
