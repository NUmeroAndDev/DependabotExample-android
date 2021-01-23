package dependencies

object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.0-alpha04"

    const val junit = "junit:junit:4.13"

    const val material = "com.google.android.material:material:1.1.0"

    object Kotlin {
        private const val version = "1.4.21"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    }

    object Coroutines {
        private const val version = "1.4.2"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
    }

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:1.2.0-rc01"
        const val core = "androidx.core:core-ktx:1.5.0-alpha01"
        const val constraint = "androidx.constraintlayout:constraintlayout:2.0.4"

        object Navigation {
            private const val version = "2.3.2"
            const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
            const val ui = "androidx.navigation:navigation-ui-ktx:$version"
        }
    }
}