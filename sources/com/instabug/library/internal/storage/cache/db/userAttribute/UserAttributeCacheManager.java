package com.instabug.library.internal.storage.cache.db.userAttribute;

import com.instabug.library.internal.orchestrator.ActionsOrchestrator;
import com.instabug.library.util.threading.PoolProvider;
import i0.j.e.c1.b;
import i0.j.e.l0.j.c;
import i0.j.e.l0.j.d;
import i0.j.e.t0.g;
import java.util.HashMap;
import java.util.List;

public class UserAttributeCacheManager {
    public static void delete(String str) {
        UserAttributesDbHelper.delete(str, b.C());
    }

    public static void deleteAll(int i) {
        UserAttributesDbHelper.deleteType(b.C(), i);
    }

    public static void deleteAnonymousUserAttribute() {
        UserAttributesDbHelper.deleteAnonymousData();
    }

    public static int getType(String str) {
        return UserAttributesDbHelper.getType(str, b.C());
    }

    public static void insert(String str, String str2) {
        String C = b.C();
        ActionsOrchestrator.obtainOrchestrator(PoolProvider.getUserActionsExecutor()).addWorkerThreadAction(new d(C, b.A())).addWorkerThreadAction(new c(new g(str, str2, C, !b.G(), 0, (g.a) null))).orchestrate();
    }

    public static void insertAll(List<g> list) {
        UserAttributesDbHelper.insertBulk(list);
    }

    public static String retrieve(String str) {
        return UserAttributesDbHelper.retrieve(str, b.C());
    }

    public static HashMap<String, String> retrieveAll() {
        return UserAttributesDbHelper.retrieveAll(b.C());
    }

    public static HashMap<String, String> retrieveAllSDKAttributes() {
        return UserAttributesDbHelper.retrieveAllSDKAttributes(b.C());
    }

    public static List<g> retrieveAnonymousUserAttributes() {
        return UserAttributesDbHelper.retrieveAnonymousUserAttribute();
    }

    public static void deleteAll() {
        UserAttributesDbHelper.deleteUserAttributes(b.C());
    }
}
