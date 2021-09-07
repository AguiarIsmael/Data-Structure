import java.util.*;

public class ColaTerminal extends Cola {

	protected String name;
	private List<Object> list;

	public ColaTerminal(String n) {
		this.name = n;
		this.list = new ArrayList<Object>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String n) {
		this.name = n;
	}

	@Override
	public void agregar(Object obj) {
		list.add(obj);
	}
	
	@Override
	public Object recuperar() {
		if(!list.isEmpty())
			return list.remove(0);
		return null;
	}

	@Override
	public int getTotalElem() {
		return list.size();
	}

	@Override
	public ColaTerminal masElem() {
		return this;
	}

	@Override
	public int getCantColaT() {
		return 1;
	}
}