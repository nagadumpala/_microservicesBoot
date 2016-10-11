/**
 * 
 */
package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author naga
 *
 */
@XmlRootElement
@Entity
public class Player {
	@Id
	@GeneratedValue
	Long id;
	String name;
	String position;
	
	public Player(){
		
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	public Player(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}
	
}
