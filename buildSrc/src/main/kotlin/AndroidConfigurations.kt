import com.android.build.gradle.BaseExtension
import org.gradle.api.artifacts.dsl.DependencyHandler

fun BaseExtension.common() {
    compileSdkVersion(Versions.compileSdkVersion)
    defaultConfig {
        applicationId = "com.wadada.daggersample"
        minSdkVersion(Versions.minSdkVersion)
        targetSdkVersion(Versions.targetSdkVersion)
        versionCode = Versions.versionCode
        versionName = Versions.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

fun DependencyHandler.implementation(dependency: Any) {
    add("implementation", dependency)
}

fun DependencyHandler.testImplementation(dependency: Any) {
    add("testImplementation", dependency)
}

fun DependencyHandler.kapt(dependency: Any) {
    add("kapt", dependency)
}

fun DependencyHandler.common() {
    implementation(Deps.Kotlin.kotlinStdlib)
    implementation(Deps.AndroidX.appCompat)
    implementation(Deps.AndroidX.coreKtx)

    testImplementation(Deps.Testing.jUnit)
    testImplementation(Deps.Testing.testRunner)
    testImplementation(Deps.Testing.espresso)
}

fun DependencyHandler.app() {
    implementation(Deps.AndroidX.constraintLayout)

    // Dagger
    implementation(Deps.Dagger.dagger)
    kapt(Deps.Dagger.daggerCompiler)
}