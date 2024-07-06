package ui

import com.codeborne.selenide.Configuration
import com.codeborne.selenide.Selenide
import io.github.bonigarcia.wdm.WebDriverManager
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach

abstract class BaseUITestClass {
    private fun setUp() {
        WebDriverManager.chromedriver().setup()
        Configuration.browser = "chrome"
        Configuration.webdriverLogsEnabled = true
        Configuration.browserSize = "1920x1080"
        Configuration.headless = false
    }

    @BeforeEach
    fun init() {
        setUp()
    }

    @AfterEach
    fun tearDown() {
        Selenide.closeWebDriver()
    }
}
