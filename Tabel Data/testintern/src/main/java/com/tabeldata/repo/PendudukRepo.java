package com.tabeldata.repo;

import com.tabeldata.entity.Penduduk;

import org.springframework.data.repository.CrudRepository;

public interface PendudukRepo extends CrudRepository<Penduduk, Long>{
    
}
