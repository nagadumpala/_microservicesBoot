/**
 * 
 */
package com.example.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.domain.Player;
import com.example.domain.Team;

/**
 * @author naga
 *
 */
@RestResource(path="/players", rel="players")
public interface PlayerDao extends CrudRepository<Player, Long>{

}
