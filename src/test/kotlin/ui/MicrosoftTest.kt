package ui

import org.junit.jupiter.api.Test
import ui.pages.MainPage
import ui.pages.SkypePage

class MicrosoftTest : BaseUITestClass() {

    @Test
    fun openWebSkypeLogin() {
        val mainPage = MainPage()
        mainPage.openPage()
        mainPage.openProductButtonClick()
        mainPage.openWebSkypeButtonClick()

        val skypePage = SkypePage()
        skypePage.openSkypeInWebButtonClick()
    }
}