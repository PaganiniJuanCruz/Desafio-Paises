
import java.util.*;
import java.util.stream.Collectors;

public class Paises {

	public static void main(String[] args) {
		
		List<Pais> listaPaises = new ArrayList<Pais>();
		
		//Agrego los paises
		listaPaises.add(new Pais (1, "Argentina", 54));
		listaPaises.add(new Pais (2, "Colombia", 57));
		listaPaises.add(new Pais (3, "Bolivia", 591));
		listaPaises.add(new Pais (4, "Venezuela", 58));
		
		List<Integer>listaCodigos = (List<Integer>) listaPaises.stream()
		
				//FILTRO LOS CODIGOS DE AREA Y LOS PONGO EN UNA COLECCION
		.filter(p -> p.getCodArea() > 1 )
		.map(x -> x.getCodArea())
		.collect(Collectors.toList());
		
		System.out.println("Los codigos de area de los paises en la lista son: "+ listaCodigos);
	}

}
