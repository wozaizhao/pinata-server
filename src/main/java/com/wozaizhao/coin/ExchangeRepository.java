package com.wozaizhao.coin;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ExchangeRepository extends CrudRepository<Exchange, Long> {

    List<Exchange> findByName(@Param("name") String name);
    List<Exchange> findByRank(@Param("rank") Integer rank);

}
