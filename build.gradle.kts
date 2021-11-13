buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        AppDependencies.classpathLibraries.forEach {
            classpath(it)
        }
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
