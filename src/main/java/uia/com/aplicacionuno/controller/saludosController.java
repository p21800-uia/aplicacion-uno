package uia.com.aplicacionuno.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class saludosController
{
    @GetMapping("/saludos")
    public String saludos(){
        return "Hola UIA";
    }

}
