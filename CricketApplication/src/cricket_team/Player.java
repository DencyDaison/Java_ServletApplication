package cricket_team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.face.bo.PlayerBO;
import com.face.dao.PlayerDAO;
import com.face.dao.SkillDAO;
import com.face.utility.MySQLConnUtils;

public class Player {
	String player;
	String country;
	String skill;
	String team;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Player(){
		
	}
	public Player(String player, String country, String skill, String team) {
		super();
		this.player = player;
		this.country = country;
		this.skill = skill;
		this.team = team;
	}
	public void getplayer() {
		// TODO Auto-generated method stub
		PlayerBO pbo=new PlayerBO();
		pbo.setPlayer(player);
		pbo.setCountry(country);
		pbo.setSkill(skill);
		pbo.setTeam(team);
		
		MySQLConnUtils conn=new MySQLConnUtils();
		
		try {
			Skill s=new Skill(skill);
			Team t=new Team(team);
			int skillId=s.getSkillName(conn.getConnection());
			int teamId=t.getTeamId(conn.getConnection());
			PlayerDAO.createPlayer(conn.getConnection(),pbo,skillId,teamId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void list() throws SQLException, Exception {
		MySQLConnUtils conn=new MySQLConnUtils();
		// TODO Auto-generated method stub
		//List<Player>getAllPlayerDetails();
		PlayerDAO.getAllPlayerDetails(conn.getConnection());
	}
	
	
	public void searchplayer() throws SQLException, Exception {
		MySQLConnUtils conn=new MySQLConnUtils();
		System.out.println("enter the skill");
		skill=br.readLine();
		PlayerDAO.getplayerdetails(conn.getConnection(),skill);
	}
	
}
