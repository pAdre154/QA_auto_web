package utils.endpoints

class EndPoints {
    companion object {
        private val environmentType = EnvironmentType.Prod

        fun getEndPoint(endPoint: EndPoint) : String {
            return when(environmentType) {
                EnvironmentType.Prod -> { prodLinks[endPoint] ?: "" }
                EnvironmentType.PreProd -> { preProdLinks[endPoint] ?: "" }
            }
        }
    }
}

enum class EndPoint {
    Main,
    Skype
}

private enum class EnvironmentType {
    Prod,
    PreProd
}

private val prodLinks: Map<EndPoint, String> = mapOf(
    EndPoint.Main to "https://www.microsoft.com/",
    EndPoint.Skype to "https://www.skype.com/"
)

private val preProdLinks: Map<EndPoint, String> = emptyMap()