# Nondex-Gradle-Plugin
To use the plugin, add the following in your build.gradle:
## Groovy
```
plugins {
  id 'edu.illinois.nondexGradle' version '2.1.1'
}
```
## Kotlin
```
plugins {
  id("edu.illinois.nondexGradle") version "2.1.1"
}
```

The NonDex tasks are based off of Gradle's test task. As such, it is recommended to use the same configurations as the default test task by modifying the build.gradle as follows:
## Before
```
test {
  useJUnitPlatform()
}
```
## After
```
tasks.withType(Test) {
  useJUnitPlatform()
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

If you want to have NonDex for Maven project or learn more about NonDex, please visit the [NonDex repository](https://github.com/TestingResearchIllinois/NonDex).


