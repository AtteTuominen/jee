package fi.softala.jee.demo.d10.dao.webuser;

public class UsernameVarattuPoikkeus extends Exception {

	public UsernameVarattuPoikkeus() {
		super("Username on jo varattuna jollain toisella käyttäjällä tietokannassa.");
	}
}
