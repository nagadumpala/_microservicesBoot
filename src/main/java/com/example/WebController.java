/**
 * 
 */
package com.example;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.TeamDao;
import com.example.domain.Player;
import com.example.domain.Team;

/**
 * @author naga
 *
 */
@RestController
public class WebController {

	@Autowired
	TeamDao teamDao;	

	
	@RequestMapping("/hi/{name}")
	public Team hiThere( @PathVariable String name)
	{
		return teamDao.findByName(name);
	}
	
//	@RequestMapping("/hi")
//	public @ResponseBody String hiThere()
//	{
//		return "hello";
//	}

/*	@RequestMapping("/hi/{name}")
	public String hiThere(Map model, @PathVariable String name )
	{
		model.put("name", name);
		return "hello";
	}
*/
	
}
