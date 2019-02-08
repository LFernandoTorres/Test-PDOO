package com.unid201920 ;

import org.springframework.stereotype.Controller ;
import org.springframework.web.bind.annotation.RequestMapping ;

import javax.servlet.http.HttpServletRequest ;
import org.springframework.ui.Model ;

@Controller
public class HelloWorldController {

    @RequestMapping( "/showForm" )
    public String showForm() {
        return "helloworld-form" ;
    }

    @RequestMapping( "/processForm" )
    public String processForm() {
        return "helloworld" ;
    }

    @RequestMapping( "/processFormVersion2" )
    public String letsShoutDude( HttpServletRequest request, Model model ) {

        // Leer el parámetro requerido desde el formulario HTML
        String theName = request.getParameter( "studentName" ) ;

        // Convertir los datos a MAYÚSCULAS
        theName = theName.toUpperCase() ;

        // Crear mensaje
        String result = "Yo! "+ theName ;

        // Agregar mensaje al Modelo
        model.addAttribute( "message", result ) ;

        return "helloworld" ;
    }

}
