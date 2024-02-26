plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.exampledemo"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.exampledemo"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
    dataBinding {
        enable = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    implementation("androidx.navigation:navigation-fragment:2.7.6")
    implementation("androidx.navigation:navigation-ui:2.7.6")

    implementation("androidx.recyclerview:recyclerview:1.2.1")

    implementation("androidx.room:room-runtime:2.5.2")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    annotationProcessor("androidx.room:room-compiler:2.5.2")

    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1")

    implementation("android.arch.lifecycle:extensions:1.1.1")

    implementation("io.reactivex.rxjava2:rxjava:2.1.1")
    implementation("io.reactivex.rxjava2:rxandroid:2.1.1")

    implementation("com.github.bumptech.glide:glide:4.9.0")

    implementation("androidx.palette:palette:1.0.0")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}