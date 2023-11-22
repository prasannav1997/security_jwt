package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class LogoutController {

    @PostMapping("/logout")
    public ResponseEntity<?> logout() {
        // Perform logout logic, such as invalidating the current token or updating the user's status.
        // For simplicity, we'll just clear the authentication context.

        SecurityContextHolder.clearContext();

        return ResponseEntity.ok("Logout successful");
    }
}

