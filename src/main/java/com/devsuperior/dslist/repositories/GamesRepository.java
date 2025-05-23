package com.devsuperior.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dslist.entities.Games;
import com.devsuperior.dslist.projections.GamesMinProjection;

public interface GamesRepository extends JpaRepository<Games,Long> {

    @Query(nativeQuery = true , value = """
        SELECT tb_game.id, tb_game.title, tb_game.game_year AS year, tb_game.img_url AS imgUrl,
        tb_game.short_description AS shortDescription, tb_belonging.position
        FROM tb_game
        INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
        WHERE tb_belonging.game_list_id = :game_list_id
        ORDER BY tb_belonging.position
        """)
    List<GamesMinProjection> searchByList(Long game_list_id);
    
}
