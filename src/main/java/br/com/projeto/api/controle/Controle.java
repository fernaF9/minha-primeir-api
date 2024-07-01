package br.com.projeto.api.controle;

import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.modelo.Pessoa;
import br.com.projeto.api.modelo.pessoa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class Controle {

    @GetMapping("")
    public String mensagem() {
        return "hello world";
    }
        @GetMapping("/boas/{nome}")
        public String boas(@PathVariable String nome) {
            return "seja bem vindo(a)" + nome;
    }
       
  