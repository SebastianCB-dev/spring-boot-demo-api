package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api")
public class RegistroController {

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody User userData) {
        // Accede a los datos recibidos en formato JSON
        String gmail = userData.getGmail();
        String password = userData.getPassword();
        System.out.println(gmail);
        System.out.println(password);
        // Realiza las validaciones de los campos
        if (gmail == null || password == null || gmail == "" || password == "") {
            // Crear un objeto JSON de error
            return new ResponseEntity<>("{\"message\":\"Datos incorrectos\",\"status\":\"error\"}", HttpStatus.BAD_REQUEST);
        }

        // Realiza la lógica de registro con los datos
        // ...

        // Crear un objeto JSON de éxito
        return new ResponseEntity<>("{\"message\":\"Registro exitoso\",\"status\":\"success\"}", HttpStatus.OK);
    }
}