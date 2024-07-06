package ui.pages

import com.codeborne.selenide.Selenide

interface BasePage {
    val url: String

    fun openPage() {
        Selenide.open(url)
    }
}