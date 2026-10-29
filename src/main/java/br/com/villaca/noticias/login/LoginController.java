package br.com.villaca.noticias.login;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginService service;

    public LoginController(LoginService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> login(
            @RequestBody LoginDTO dto) {

        if (service.autenticar(dto)) {
            return ResponseEntity.ok("Login realizado com sucesso");
        }

        return ResponseEntity.status(401)
                .body("Login ou senha inválidos");
    }
}