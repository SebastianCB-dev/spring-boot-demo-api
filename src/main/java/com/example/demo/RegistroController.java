package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class RegistroController {

    @PostMapping("/register")
    @ResponseBody
    public String registrar() {
        // Lógica para procesar la solicitud de registro
        return "Registro exitoso"; // Puedes personalizar la respuesta según tus necesidades
    }
}