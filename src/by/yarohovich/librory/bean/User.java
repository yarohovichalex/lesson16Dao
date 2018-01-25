package by.yarohovich.librory.bean;

public class User extends Entity {
	private String login;
	private String poss;
	private boolean role;
	
	public User() {
		super();
	}
	public User(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPoss() {
		return poss;
	}
	public void setPoss(String poss) {
		this.poss = poss;
	}
	public boolean isRole() {
		return role;
	}
	public void setRole(boolean role) {
		this.role = role;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((poss == null) ? 0 : poss.hashCode());
		result = prime * result + (role ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (poss == null) {
			if (other.poss != null)
				return false;
		} else if (!poss.equals(other.poss))
			return false;
		if (role != other.role)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [login=" + login + ", poss=" + poss + ", role=" + role + "]";
	}	
	
}
