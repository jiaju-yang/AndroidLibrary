package io.github.psychesworld.cleanarchitecture.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.github.psychesworld.cleanarchitecture.di.qualifier.ForComputation;
import io.github.psychesworld.cleanarchitecture.di.qualifier.ForIO;
import io.github.psychesworld.cleanarchitecture.domain.executor.ComputationThread;
import io.github.psychesworld.cleanarchitecture.domain.executor.ExecutionThread;
import io.github.psychesworld.cleanarchitecture.domain.executor.IOThread;
import io.github.psychesworld.cleanarchitecture.domain.executor.PostExecutionThread;
import io.github.psychesworld.cleanarchitecture.domain.executor.UIThread;

@Module
public class ThreadModule {
    @Provides
    @Singleton
    @ForIO
    ExecutionThread provideIOThread(IOThread thread) {
        return thread;
    }

    @Provides
    @Singleton
    @ForComputation
    ExecutionThread provideComputationThread(ComputationThread thread) {
        return thread;
    }

    @Provides
    @Singleton
    PostExecutionThread providePostExecutionThread(UIThread uiThread) {
        return uiThread;
    }
}
