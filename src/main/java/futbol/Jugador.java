package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short goles, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = goles;
		this.dorsal = dorsal;
	}
	
	public Jugador() {
		super();
		golesMarcados = 289;
		dorsal = 7;
	}

	@Override
	public int compareTo(Futbolista o) {
		return Math.abs(o.getEdad() - this.getEdad());
	}

	@Override
	public boolean jugarConLasManos() {
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}
	
}
