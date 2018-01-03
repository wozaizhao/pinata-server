package com.wozaizhao.coin;

import org.springframework.beans.factory.annotation.Autowired;
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
    private ExchangelogRepository exchangelogRepository;


    @RequestMapping(path = "/")
    public String root() {
        return "ok";
    }

    @RequestMapping(path = "/all")
    public @ResponseBody
    Iterable<Exchange> getAllExchanges() {
        return exchangeRepository.findAll();
    }

    private Iterable<Exchangelog> getAllLog() {
        return exchangelogRepository.findAll();
    }

    @RequestMapping(path = "/getByName")
    public @ResponseBody
    Iterable<Exchange> getByName(@RequestParam(value = "name") String name) {
        return exchangeRepository.findByName(name);
    }

    @RequestMapping(path = "/getByRank")
    public @ResponseBody
    Iterable<Exchange> getByRank(@RequestParam(value = "rank") Integer rank) {
        return exchangeRepository.findByRank(rank);
    }

    @RequestMapping(path = "/getlatest")
    public @ResponseBody
    Iterable<Exchange> getLatest() {
        ArrayList<Exchangelog> logs = (ArrayList<Exchangelog>) getAllLog();
        Integer len = logs.size();
        Exchangelog latest = logs.get(len - 1);
        return exchangeRepository.findByTimestampBetween(latest.getStart(), latest.getEnd());
    }


    //获取交易所概况数据
    //表格：按最近一次排名，排名、（LOGO）、名字、过去24小时交易量、网址、排名曲线、交易量曲线

}
