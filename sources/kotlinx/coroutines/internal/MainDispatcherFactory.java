package kotlinx.coroutines.internal;

import java.util.List;
import n0.a.l1;

/* compiled from: MainDispatcherFactory.kt */
public interface MainDispatcherFactory {
    l1 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
