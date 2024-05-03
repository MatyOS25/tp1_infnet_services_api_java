package org.example.firstapiinf.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class OperacoesController {

    @GetMapping("/alomundo")
    String aloMundo(){
        return "Teste";
    }

    private int somar(int num1, int num2){
        return num1 + num2;
    }

    private int subtrair(int num1, int num2){
        return num1 - num2;
    }

    private int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    private int dividir(int num1, int num2){
        return num1 / num2;
    }

    private int exponenciacao(int num1, int num2){
        int init = num1;
        for (int i = 1; i < num2; i++){
            num1 = num1 * init;
        }
        return num1;
    }

    @GetMapping("/somar/{num1}/{num2}")
    public int getSomar(@PathVariable int num1, @PathVariable int num2){
        return somar(num1, num2);
    }
    @PostMapping("/somar")
    public int postSomar(@RequestParam int num1, @RequestParam int num2){
        return somar(num1, num2);
    }

    @GetMapping("/subtrair/{num1}/{num2}")
    public int getSubtrair(@PathVariable int num1, @PathVariable int num2){
        return subtrair(num1, num2);
    }

    @PostMapping("/subtrair")
    public int postSubtrair(@RequestParam int num1, @RequestParam int num2){
        return subtrair(num1, num2);
    }

    @GetMapping("/multiplicar/{num1}/{num2}")
    public int getMultiplicar(@PathVariable int num1, @PathVariable int num2){
        return multiplicar(num1, num2);
    }

    @PostMapping("/multiplicar")
    public int postMultiplicar(@RequestParam int num1, @RequestParam int num2){
        return multiplicar(num1, num2);
    }

    @GetMapping("/dividir/{num1}/{num2}")
    public int getDividir(@PathVariable int num1, @PathVariable int num2){
        return dividir(num1, num2);
    }

    @PostMapping("/dividir")
    public int postDividir(@RequestParam int num1, @RequestParam int num2){
        return dividir(num1, num2);
    }

    @GetMapping("/exponenciacao/{num1}/{num2}")
    public int getExponenciacao(@PathVariable int num1, @PathVariable int num2){
        return exponenciacao(num1, num2);
    }

    @PostMapping("/exponenciacao")
    public int postExponenciacao(@RequestParam int num1, @RequestParam int num2){
        return exponenciacao(num1, num2);
    }


}
