package ui.pages

import com.codeborne.selenide.Selenide.`$`
import utils.endpoints.EndPoint
import utils.endpoints.EndPoints

class SkypePage : BasePage {
    override val url: String = EndPoints.getEndPoint(EndPoint.Skype)

    private val openSkypeInWebDesktopButton = `$`(".btn.primaryCta")

    fun openSkypeInWebButtonClick() {
        openSkypeInWebDesktopButton.click()
    }
}
