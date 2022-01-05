package i0.b.a;

import i0.b.a.o;
import java.util.List;

/* compiled from: ControllerHelper */
public abstract class h<T extends o> {
    public abstract void resetAutoModels();

    public void setControllerToStageTo(t<?> tVar, T t) {
        tVar.e = t;
    }

    public void validateModelHashCodesHaveNotChanged(T t) {
        List<? extends t<?>> list = t.getAdapter().h.f;
        for (int i = 0; i < list.size(); i++) {
            ((t) list.get(i)).C("Model has changed since it was added to the controller.", i);
        }
    }
}
