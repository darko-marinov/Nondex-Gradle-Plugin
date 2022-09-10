package edu.illinois.nondex.gradle.tasks

import org.gradle.api.tasks.testing.Test

class NondexTest extends Test {
    static final String NAME = "nondexTest"

    void init() {
        setDescription("Test with NonDex")
        setGroup("NonDex")

        testLogging {
            exceptionFormat 'full'
        }
    }
}