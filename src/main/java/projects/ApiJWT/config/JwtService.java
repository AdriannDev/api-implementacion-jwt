package projects.ApiJWT.config;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import projects.ApiJWT.model.User;

import java.security.Key;

public class JwtService {

    private Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    private long expirationTime = 21600000;

    public String getToken(User user) {

    }


    public boolean isTokenValid(String token, UserDetails userDetails) {
        return false;
    }
}
