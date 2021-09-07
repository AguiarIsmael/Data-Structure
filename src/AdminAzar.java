import java.util.List;

public class AdminAzar extends Administrador {

	@Override
	public int getPos(List<Cola> colas) {
		if (colas.isEmpty())
			return -1;
		int index = (int)(Math.random()*colas.size());
		return index;
	}
}
