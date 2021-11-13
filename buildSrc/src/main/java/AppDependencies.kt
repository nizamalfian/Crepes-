import org.gradle.api.artifacts.dsl.DependencyHandler

object AppDependencies {
    private const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    private const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    private const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    private const val androidMaterial = "com.google.android.material:material:${Versions.androidMaterial}"
    private const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    private const val junit = "junit:junit:${Versions.jUnit}"
    private const val extJunit= "androidx.test.ext:junit:${Versions.extJUnit}"
    private const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    private const val mockK = "io.mockk:mockk:${Versions.mockk}"
    private const val hamcrest = "org.hamcrest:hamcrest-all:${Versions.hamcrest}"
    private const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
    private const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"
    private const val coreTesting = "androidx.arch.core:core-testing:${Versions.androidTesting}"
    private const val mockitoInline = "org.mockito:mockito-inline:${Versions.mockitoInline}"
    private const val buildGradle = "com.android.tools.build:gradle:${Versions.buildGradle}"
    private const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    val classpathLibraries = mutableListOf<String>().apply {
        add(buildGradle)
        add(kotlinPlugin)
    }

    val appLibraries = mutableListOf<String>().apply {
        add(kotlin)
        add(coreKtx)
        add(appCompat)
        add(androidMaterial)
        add(constraintLayout)
    }

    val unitTestLibraries = mutableListOf<String>().apply {
        add(junit)
        add(mockK)
        add(hamcrest)
        add(mockito)
        add(mockitoKotlin)
        add(coreTesting)
        add(mockitoInline)
    }

    val androidTestLibraries = mutableListOf<String>().apply {
        add(extJunit)
        add(espresso)
    }
}

fun DependencyHandler.implementation(list: List<String>) {
    list.forEach { dependency ->
        add("implementation", dependency)
    }
}

fun DependencyHandler.androidTestImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("androidTestImplementation", dependency)
    }
}

fun DependencyHandler.testImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("testImplementation", dependency)
    }
}


