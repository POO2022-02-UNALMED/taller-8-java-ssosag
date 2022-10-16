package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;

	public Portero(String nombre, int edad, short goles, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = goles;
		this.dorsal = dorsal;
	}
	
	@Override
	public String toString() {
		return super.toString() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
	}

	@Override
	public int compareTo(Futbolista o) {
		Portero p = (Portero) o;
		return Math.abs(p.golesRecibidos - this.golesRecibidos);
	}

	@Override
	public boolean jugarConLasManos() {
		return true;
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}
	
}