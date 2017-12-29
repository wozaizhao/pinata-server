package com.wozaizhao.coin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private ExchangeRepository exchangeRepository;

    @RequestMapping(path = "/")
    public String root() {
        return "ok";
    }

    @RequestMapping(path = "/all")
    public @ResponseBody
    Iterable<Exchange> getAllExchanges() {
        return exchangeRepository.findAll();
    }

    @RequestMapping(path = "/getByName")
    public @ResponseBody
    Iterable<Exchange> getByName(@RequestParam(value = "name") String name) {
        return exchangeRepository.findByName(name);
    }
}
