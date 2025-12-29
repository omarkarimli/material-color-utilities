plugins {
  kotlin("multiplatform") version "1.8.10"
}

group = "com.omarkarimli"
version = "1.0.0-alpha01"

repositories {
  mavenCentral()
}

kotlin {
  jvm()

  ios()
  iosSimulatorArm64()

  sourceSets {
    val commonMain by getting
    val commonTest by getting

    val jvmMain by getting {
      dependsOn(commonMain)
    }

    val iosSimulatorArm64Main by getting
    val iosMain by getting {
      dependsOn(commonMain)
      iosSimulatorArm64Main.dependsOn(this)
    }
  }
}
