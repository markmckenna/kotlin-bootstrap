# kotlin-bootstrap
Bootstrap project for Kotlin, suitable to be forked into a fully fledged project.

## How to Use:
* Fork this repository into your new Kotlin-based project
* Clone local with Git
* Run `./gradlew clean build` to make sure it works

## Features Supported:
* *Kotlin 0.12.613* integration
* `lib` and `app` subprojects with parent project containing shared configuration
* *Semantic versioning* structure
* Kotlin *main method* (Hello world)
* *Gradle* compile
* *JUnit* unit tests (plus a few sample passing tests)
* *AssertJ*, *Mockito* for smooth unit testing
* *JaCoCo* for test coverage measurement (reports on generated Java code, not directly on Kotlin code)
* Dependency acquisition from *jCenter*, *Maven Central*
* Generate *KDoc*, *Source deployment* packages
