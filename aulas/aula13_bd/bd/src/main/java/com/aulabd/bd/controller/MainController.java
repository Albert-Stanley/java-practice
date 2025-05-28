package com.aulabd.bd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.aulabd.bd.model.Cliente;
import com.aulabd.bd.model.ClienteService;

@Controller
public class MainController {

    @Autowired
    ApplicationContext ctx;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/sucesso")
    public String sucesso(){
        return "sucesso";
    }

    @GetMapping("/formulario")
    public String form(Model model){
        //QUERO UM CLIENTE VAZIO NA INICIALIZACAO DO FORM
        model.addAttribute("cliente", new Cliente());
        return "formulario";
    }

    @PostMapping("/cadastro")
    public String cadastro(Model model, @ModelAttribute Cliente cli){
        ClienteService cs = ctx.getBean(ClienteService.class);
        cs.inserirCliente(cli);
        return "redirect:sucesso";
    }

}
