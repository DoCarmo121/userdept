package com.devsuperior.userdept.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
    /*
    Ela é construída de forma que fornece seus próprios métodos de pesquisa,
    como também métodos capazes de salvar e remover listas de objetos do
    banco de dados.
    */
}
