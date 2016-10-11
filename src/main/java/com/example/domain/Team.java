/**
 * 
 */
package com.example.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author naga
 *
 */
@XmlRootElement
@Entity
public class Team {

	@javax.persistence.Id
	@GeneratedValue
	Long id;
	
	String name;
	String position;
	String mascot;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="teamId")
	Set<Player> players;
	
	public Team(){
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Team [name=" + name + ", position=" + position + ", mascot="
				+ mascot + ", players=" + players + "]";
	}
	
	public Team(String name, String position, String mascot, Set<Player> players) {
		super();
		this.name = name;
		this.position = position;
		this.mascot = mascot;
		this.players = players;
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
	/**
	 * @return the mascot
	 */
	public String getMascot() {
		return mascot;
	}
	/**
	 * @param mascot the mascot to set
	 */
	public void setMascot(String mascot) {
		this.mascot = mascot;
	}
	/**
	 * @return the players
	 */
	public Set<Player> getPlayers() {
		return players;
	}
	/**
	 * @param players the players to set
	 */
	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	
	
}
