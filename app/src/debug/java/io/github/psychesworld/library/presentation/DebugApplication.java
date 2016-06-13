package io.github.psychesworld.library.presentation;

import com.facebook.stetho.Stetho;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

public class DebugApplication extends AndroidApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        initializeStetho();
    }

    private void initializeStetho() {
        Stetho.initialize(Stetho.newInitializerBuilder(this)
                .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                .build());
    }

    @Override
    protected RefWatcher initializeRefWatcher() {
        return LeakCanary.install(this);
    }
}
