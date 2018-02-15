package com.wozaizhao.coin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class MainController {

    @Autowired
    private ExchangeRepository exchangeRepository;

    @Autowired
    private ExchangebasicRepository exchangebasicRepository;

    @RequestMapping(path = "/")
    public String root() {
        return "ok";
    }

    @RequestMapping(path = "/all")
    public @ResponseBody
    Iterable<Exchange> getAllExchanges() {
        return exchangeRepository.findAll();
    }

    @RequestMapping(path = "/basic")
    public @ResponseBody
    Iterable<Exchangebasic> getExchangeBasicPage(@RequestParam(value = "page") Integer page, @RequestParam(value = "size") Integer size) {
        Sort sort = new Sort(new Sort.Order(Sort.Direction.ASC, "rank"));
        return exchangebasicRepository.findAll(new PageRequest(page, size, sort));
    }


    @RequestMapping(path = "/getByName")
    public @ResponseBody
    Iterable<Exchange> getExchangeByName(@RequestParam(value = "name") String name) {
        return exchangeRepository.findByName(name);
    }

    @RequestMapping(path = "/getByRank")
    public @ResponseBody
    Iterable<Exchange> getExchangeByRank(@RequestParam(value = "rank") Integer rank) {
        return exchangeRepository.findByRank(rank);
    }


}
