# Nondex-Gradle-Plugin
To use the plugin, add the following in your build.gradle(.kts):
## Groovy
```
plugins {
  id 'edu.illinois.nondexGradle' version '2.1.7'
}
```
Apply it to subjects (if any, optional):
```
subprojects {
  apply plugin: 'edu.illinois.nondex'
}
```
## Kotlin
```
plugins {
  id("edu.illinois.nondexGradle") version "2.1.7"
}
```
Apply it to subjects (if any, optional):
```
subprojects {
  apply(plugin = "edu.illinois.nondex")
}
```

The NonDex tasks are based off of Gradle's test task. As such, it is recommended to use the same configurations as the default test task by modifying the build.gradle as follows:
## Before
```
test {
  ...
}
```
## After
```
tasks.withType(Test) {
  ...
}
```
If you do not want to configure all the tasks that extend the Gradle Test task or if you want to configure the NonDex in a different way, you can specify the configurations for each individual NonDex task as needed.

To find if you have potential flaky tests, run:
```
./gradlew nondexTest
```

To debug sources of non-determinism in your code that were found by NonDex, run:
```
./gradlew nondexDebug
```

To get more information on the task options, run:
```
./gradlew help --task nondexTest
```

If you want to run NonDex on Maven projects or learn more about NonDex, please visit the [NonDex repository](https://github.com/TestingResearchIllinois/NonDex).


