package io.github.psychesworld.library.presentation;

import com.squareup.leakcanary.RefWatcher;

public class ReleaseApplication extends AndroidApplication {
    @Override
    protected RefWatcher initializeRefWatcher() {
        return RefWatcher.DISABLED;
    }
}
