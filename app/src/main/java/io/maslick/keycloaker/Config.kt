package io.maslick.keycloaker

object Config {
    const val clientId = "barkoder-frontend"
    const val baseUrl = "https://sso.fortivoice-cloud.net/auth/realms/chat.vanaaa.ca/protocol/openid-connect"
    const val authenticationCodeUrl = "$baseUrl/auth"
    const val redirectUri = "maslick://oauthresponse"
}