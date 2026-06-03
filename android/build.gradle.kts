plugins {
    id("com.android.library")
}

group = "com.markosyan.flutter_zxing"
version = "1.0"

android {
    namespace = "com.markosyan.flutter_zxing"

    compileSdk = 37
    ndkVersion = "30.0.14904198"

    externalNativeBuild {
        cmake {
            path = file("../src/CMakeLists.txt")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    defaultConfig {
        minSdk = 24

        externalNativeBuild {
            cmake {
                arguments += listOf(
                    "-DANDROID_SUPPORT_FLEXIBLE_PAGE_SIZES=ON"
                )
            }
        }
    }
}

repositories {
    google()
    mavenCentral()
}