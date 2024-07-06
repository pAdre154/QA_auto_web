plugins {
    kotlin("jvm") version "2.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    //selenide
    val selenideVersion = "7.3.3"
    implementation("com.codeborne:selenide:$selenideVersion")

    //selenium
    val seleniumVersion = "4.22.0"
    implementation("org.seleniumhq.selenium:selenium-java:$seleniumVersion")
    implementation("org.seleniumhq.selenium:selenium-chrome-driver:$seleniumVersion")
    implementation("org.seleniumhq.selenium:selenium-api:$seleniumVersion")

    //WebDriverManager
    val webDriverManagerVersion = "5.9.1"
    implementation("io.github.bonigarcia:webdrivermanager:$webDriverManagerVersion")

    // JUnit
    val jUnitVersion = "5.8.1"
    testImplementation("org.junit.jupiter:junit-jupiter-api:$jUnitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$jUnitVersion")

    //Dotenv
    val dotenvVersion = "6.4.1"
    implementation("io.github.cdimascio:dotenv-kotlin:$dotenvVersion")
}

tasks.test {
    useJUnitPlatform()
}