package i0.l.a.h;

import com.nimbusds.jose.jwk.KeyOperation;
import com.nimbusds.jose.jwk.KeyUse;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: KeyUseAndOpsConsistency */
public class b {
    public static final Map<KeyUse, Set<KeyOperation>> a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(KeyUse.c, new HashSet(Arrays.asList(new KeyOperation[]{KeyOperation.SIGN, KeyOperation.VERIFY})));
        hashMap.put(KeyUse.d, new HashSet(Arrays.asList(new KeyOperation[]{KeyOperation.ENCRYPT, KeyOperation.DECRYPT, KeyOperation.WRAP_KEY, KeyOperation.UNWRAP_KEY})));
        a = Collections.unmodifiableMap(hashMap);
    }
}
