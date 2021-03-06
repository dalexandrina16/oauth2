package ml.wonwoo.springbootoauth2login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class AccessTokenController {

  @GetMapping("/")
  public OAuth2AccessToken accessToken(@RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient authorizedClient) {
    return authorizedClient.getAccessToken();
  }

  @GetMapping("/user")
  public Principal index(Principal principal) {
    return principal;
  }
}
