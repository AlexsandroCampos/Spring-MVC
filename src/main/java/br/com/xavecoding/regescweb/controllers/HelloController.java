package br.com.xavecoding.regescweb.controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView("hello"); //nome do arquivo html a ser renderizado/exibido
        mv.addObject("nome", "Maria");
        return mv; // o Spring vai renderizar o arquivo que está em templates/hello.html
    } 

    @GetMapping("/hello-model")
    public String hello(Model model) {
        model.addAttribute("nome", "Zezinho");
        return "hello"; // o Spring vai renderizar o arquivo que está em templates/hello.html
    } 

    @GetMapping("/hello-servlet")
    public String hello(HttpServletRequest request) {
        request.setAttribute("nome", "Alexsandro");
        return "hello"; // o Spring vai renderizar o arquivo que está em templates/hello.html
    }
}
