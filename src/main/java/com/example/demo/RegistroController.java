package com.example.demo;

import com.example.demo.Entities.User;
import com.example.demo.Entities.UserBody;
import com.example.demo.service.IUserService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Objects;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class RegistroController {

    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody UserBody userData) {
        // Accede a los datos recibidos en formato JSON
        String gmail = userData.getGmail();
        String password = userData.getPassword();
        String name = userData.getName();
        String surname = userData.getSurname();
        System.out.println(gmail);
        System.out.println(password);
        // Realiza las validaciones de los campos
        if (gmail == "" || gmail == null ||
                password == "" || password == null ||
                name == "" || name == null ||
                surname == "" || surname == null) {
            // Crear un objeto JSON de error
            return new ResponseEntity<>("{\"message\":\"Datos incorrectos\",\"status\":\"error\"}",
                    HttpStatus.BAD_REQUEST);
        }
        
        // Realiza la lógica de registro con los datos
        userService.guardarCliente(new User(gmail, password, name, surname));

        // Crear un objeto JSON de éxito
        return new ResponseEntity<>("{\"message\":\"Registro exitoso\",\"status\":\"success\"}", HttpStatus.OK);
    }
}