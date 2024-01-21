plugins {
    kotlin("android") version "1.5.21"
    kotlin("android.extensions") version "1.1.0"
    id("com.android.application") version "7.1.3"
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "io.codemagic.androidquicksample"
        minSdkVersion(16)
        targetSdkVersion(30)
    }

    buildTypes {
        release {
            minifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("androidx.compose.ui:ui:$compose_version")
    implementation("androidx.compose.material:material:$compose_version")
    implementation("androidx.activity:activity-compose:1.3.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.5.21")
}
