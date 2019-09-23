object Versions {
    const val compileSdkVersion = 29
    const val minSdkVersion = 21
    const val targetSdkVersion = 29

    const val versionCode = 1
    const val versionName = "1.0.0"

    const val androidxVersion = "1.1.0"

    const val kotlinVersion = "1.3.50"
    const val gradleVersion = "3.5.0"

    const val espressoVersion = "3.2.0"
    const val androidxTestVersion = "1.2.0"
    const val junitVersion = "4.12"

    const val constraintVersion = "1.1.3"

    const val daggerVersion = "2.24"
}

object Deps {
    object Kotlin {
        const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
        const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlinVersion}"
    }
    object Gradle {
        const val gradle = "com.android.tools.build:gradle:${Versions.gradleVersion}"
    }
    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.androidxVersion}"
        const val coreKtx = "androidx.core:core-ktx:${Versions.androidxVersion}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintVersion}"
    }
    object Dagger {
        const val dagger = "com.google.dagger:dagger:${Versions.daggerVersion}"
        const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.daggerVersion}"
    }
    object Testing {
        const val jUnit = "junit:junit:${Versions.junitVersion}"
        const val testRunner = "androidx.test:runner:${Versions.androidxTestVersion}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"
    }
}