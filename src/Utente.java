
public class Utente {
    private String nome;
    private String cognome;
    private String email;
    private String username;
    private String password;
    private int eta;
    private int ruolo;
    
    public Utente(String n, String c, String e, String u, String p, int eta, int r) {
    	setNome(n);
        setCognome(c);
        setEmail(e);
        setUsername(u);
        setPassword(p);
        this.setEta(eta);
        setRuolo(r);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public int getRuolo() {
		return ruolo;
	}

	public void setRuolo(int ruolo) {
		this.ruolo = ruolo;
	}
}
