package Inheritance;

public class IPLTeam {
	public void Play() {
		System.out.println("Teams are playing cricket");
	}

}

class CSK extends IPLTeam {
	public void Play() {
		System.out.println("Captain of CSK is MS Dhoni");
	}
}

class RCB extends IPLTeam {
	public void Play() {
		System.out.println("Captain of RCB is Faf Du-Plesi");
	}

	public static void main(String args[]) {
		RCB rc = new RCB();
		rc.Play();
		CSK cs = new CSK();
		cs.Play();

	}

}
