package edu.illinois.nondex.gradle.internal;

import org.gradle.api.internal.tasks.testing.JvmTestExecutionSpec;
import org.gradle.api.internal.tasks.testing.TestExecuter;
import org.gradle.api.internal.tasks.testing.TestResultProcessor;

public class NondexTestExecuter implements TestExecuter<JvmTestExecutionSpec> {

    private final TestExecuter<JvmTestExecutionSpec> delegate;
    private int seed;


    public NondexTestExecuter(TestExecuter<JvmTestExecutionSpec> delegate) {
        this.delegate = delegate;
    }
    @Override
    public void execute(JvmTestExecutionSpec jvmTestExecutionSpec, TestResultProcessor testResultProcessor) {
    }

    @Override
    public void stopNow() {
        delegate.stopNow();
    }
}
