package i0.j.e.v0.e.j;

import com.instabug.library.model.UserAttributes;
import k0.b.y.e;

/* compiled from: AttributesRemoteDataSource */
public class g implements e<String, UserAttributes> {
    public Object apply(Object obj) throws Exception {
        UserAttributes userAttributes = new UserAttributes();
        userAttributes.fromJson((String) obj);
        return userAttributes;
    }
}
