import java.util.List;

public class AdminIntercalado extends Administrador {

	private int index;
	@Override
	public int getPos(List<Cola> colas) {
		if (colas.isEmpty())
			return -1;
		if(index >= colas.size())
			index = 0;
		int aux = index;
		index++;
		return aux;
	}
}
