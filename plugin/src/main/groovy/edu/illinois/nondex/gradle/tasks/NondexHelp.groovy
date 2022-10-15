package edu.illinois.nondex.gradle.tasks

import org.codehaus.groovy.reflection.ReflectionUtils
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class NondexHelp extends DefaultTask {
    static final String NAME = "nondexHelp"

    void init() {
        setGroup("Nondex")
        setDescription("Displays how to use the Nondex plugin")
    }

    @TaskAction
    void printInformation() {
        println ReflectionUtils.getCallingClass(0).getResourceAsStream("/nondexHelp.txt").text
    }
}
