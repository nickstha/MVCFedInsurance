package fedinsurance;

public class Subordinates {
	String teamID = "N/A";
	String teamName = "n/a";
	Supervisor teamSupervisor;
	Arraylist[Employee] subordinateEmployees;
	
	
	public String getTeamID() {
		return this.teamID;
	}
	public void setTeamID(String anID ) {
		this.teamID = anID ;
	}
	
	public String getTeamName() {
		return this.teamName;
	}
	public void setTeamName(String aName ) {
		this.teamName = aName ;
	}
	
	public Supervisor getSupervisor() {
		return this.supervisor;
	}
	public void setSupervisor(Employee aSupervisor ) {
		this.supervisor = aSupervisor ;
	}
	
	public ArrayList[Employee] getSubordinateEmployees() {
		return this.supervisor;
	}
	public void setSubordinateEmployees(Arraylist[Employee] aGroupOfEmployees ) {
		this.subordinateEmployees = aGroupOfEmployees ;
	}
	


}
