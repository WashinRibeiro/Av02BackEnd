package com.example.produtoms.repository;
import java.util.List;
import com.example.produtoms.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository  extends MongoRepository<Produto, String> {
    
    @Query("{'descricao': {$regex: /?0/, $options: 'i'}}")
    List<Produto> obterPorNomeEmComum(String nome);
    
}
