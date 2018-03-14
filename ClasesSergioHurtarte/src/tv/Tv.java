package tv;

public class Tv {
	private int nCanal = 1;
	private int nivelVol = 10;
	private boolean estado = false;

	public Tv() {
		super();
		this.nCanal = nCanal;
		this.nivelVol = nivelVol;
		this.estado = estado;
	}

	public int getnCanal() {
		return nCanal;
	}

	public void setnCanal(int nCanal) {
		this.nCanal = nCanal;
	}

	public int getNivelVol() {
		return nivelVol;
	}

	public void setNivelVol(int nivelVol) {
		this.nivelVol = nivelVol;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String Power() {
		if (estado == false) {
			estado = true;

			return "El tv esta ensendido en el canal " + nCanal;

		} else {
			estado = false;

			return "El tv esta apagado";
		}
		
	}

	public String subirCanal() {

		if (estado == true) {

			if (nCanal == 50) {
				nCanal = 1;

			} else {
				nCanal++;

			}
			return "Canal " + nCanal;
		} else {

			return "El tv esta apagado";
		}

	}

	public String bajarCanal() {

		if (estado == true) {

			if (nCanal == 1) {
				nCanal = 50;

			} else {
				nCanal--;

			}
			return "Canal " + nCanal;
		} else {

			return "El tv esta apagado";
		}

	}

	public String subirVol() {

		if (estado == true) {

			if (nivelVol == 25) {
				nivelVol = 25;

			} else {
				nivelVol++;

			}
			return "Volumen " + nivelVol;
		} else {

			return "El tv esta apagado";
		}

	}

	public String bajarVol() {

		if (estado == true) {

			if (nivelVol == 1) {
				nivelVol = 1;

			} else {
				nivelVol--;

			}
			return "Volumen " + nivelVol;
		} else {

			return "El tv esta apagado";
		}

	}

}
