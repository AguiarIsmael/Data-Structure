import java.util.*;

public class AdminMasElementos extends Administrador {

	@Override
	public int getPos(List<Cola> colas) {
		
		int masCant = 0;
		int index = -1;
		int aux = 0;
		for(int i = 0; i < colas.size(); i++) {
			aux = colas.get(i).getTotalElem();
			if(aux > masCant) {
				index = i;
				masCant = aux;
			}
		}
		return index;
	}
}