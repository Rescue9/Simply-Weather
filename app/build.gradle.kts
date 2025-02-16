
plugins {
    id("com.android.application")
    
}

android {
    namespace = "com.corridor9design.simplyweather"
    compileSdk = 33
    
    defaultConfig {
        applicationId = "com.corridor9design.simplyweather"
        minSdk = 28
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        
        vectorDrawables { 
            useSupportLibrary = true
        }
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
        
    }
    
}

dependencies {


    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")

    //swipe refresh
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
}
