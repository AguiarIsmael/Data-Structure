import java.util.*;

public class ColaCompuesta extends Cola {
	
	private Administrador admA, admR;
	
	protected List<Cola> colas;
	
	public ColaCompuesta(Administrador admA, Administrador admR) {
		super();
		this.colas = new ArrayList<Cola>();
		this.admA = admA;
		this.admR = admR;
	}
	
	@Override
	public ColaTerminal masElem() {
		ColaTerminal c1 = null;
		ColaTerminal aux = null;
		for (Cola c : colas) {
			aux = c.masElem();
			if (aux != null)
				if(c1 == null || c1.getTotalElem() < aux.getTotalElem())
					c1 = aux;
		}
		return c1;
	}
	
	@Override
	public int getTotalElem() {
		int total = 0;
		for (Cola c : colas) {
			total += c.getTotalElem();
		}
		return total;
	}

	@Override
	public int getCantColaT() {
		int total = 0;
		for (Cola c : colas) {
			total += c.getCantColaT();
		}
		return total;
	}
	
	@Override
	public void agregar(Object obj) {
		int index = admA.getPos(colas);
		if (index > -1)
			colas.get(index).agregar(obj);
	}
	
	@Override
	public Object recuperar() {
		int index = admR.getPos(colas);
		if (index > -1)
			return colas.get(index).recuperar();
		return null;
	}
	
	public void setAdminAgregar(Administrador admA) {
		this.admA = admA;
	}
	
	public void setAdminRecuperar(Administrador admR) {
		this.admR = admR;
	}
	
	public void agregarCola(Cola c) {
		colas.add(c);
	}
}