package com.produtos.apiqcline.repository;

import com.produtos.apiqcline.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Produto findById(long id);
}