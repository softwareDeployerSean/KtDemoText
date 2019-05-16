plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}


android {
    compileSdkVersion(28)
    defaultConfig {
        applicationId = "com.thinkwithu.www.kotlindemo"
        minSdkVersion(15)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.21")
    implementation("androidx.appcompat:appcompat:1.0.2")
    implementation("androidx.core:core-ktx:1.0.1")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("androidx.test:runner:1.1.1")
    implementation("androidx.test.espresso:espresso-core:3.1.1")
    testImplementation("junit:junit:4.12")
}

tasks {
    task("open") {
        group = "ceshi"
        println("haha")
    }
}

task("拷贝源码") {
    val codeTree = fileTree("src")
    val codeword = file("code.doc")
    codeTree.forEach {
        if (it.absolutePath.endsWith("kt")) {
            codeword.appendText(it.readText())
        }
    }
}
