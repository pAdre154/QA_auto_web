package ui.pages

import com.codeborne.selenide.Selenide.`$`
import utils.endpoints.EndPoint
import utils.endpoints.EndPoints

/**
* Main Microsoft page
*/

class MainPage : BasePage {
    override val url: String = EndPoints.getEndPoint(EndPoint.Main)

    private val skypeButton = `$`("#shellmenu_11")
    private val microsoftProdButton = `$`("[class=\"c-button-logo all-ms-nav\"]")

    fun openProductButtonClick() {
        microsoftProdButton.click()
    }

    fun openWebSkypeButtonClick() {
        skypeButton.click()
    }
}