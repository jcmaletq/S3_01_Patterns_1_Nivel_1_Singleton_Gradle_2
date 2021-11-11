package S3_01_Patterns_1_Nivel_1_Singleton_Gradle;

import java.util.*;
import S3_01_Patterns_1_Nivel_1_Singleton_Gradle.accion;
public class Undo {
protected List<accion> lista_com = new ArrayList<>();
protected List<String> lista_hist = new ArrayList<>();
private static Undo instancia;
/*
 * La classe 'Undo' ha de guardar memòria dels últims comandos introduïts, permetent afegir o eliminar comandos, 
 * així com llistar els ultimos comandos introduïts (similar al comando 'history' en Linux).
 */
private Undo() {
	}
public static Undo getInstancia() {
	if (instancia == null) { instancia = new Undo();}
	return instancia;
}
public void afegir(String com) {
 //   System.out.println("paso por afegir "+com);
    accion coma = new accion("ejecuta ",com); 
    lista_hist.add(coma.toString());
    lista_com.add(coma);
}
public void eliminar() {
	String des = lista_com.get(lista_com.size()-1).toString();
	des = des.replace ( "ejecuta ","");
	accion coma = new accion ("deshace ",des);
//	System.out.println("paso por eliminar el ultimo: " + 
//			lista_com.get(lista_com.size()-1));
	lista_hist.add("deshecho : " + des);
	lista_com.remove(lista_com.size()-1);
	
}
public void llistar() {
	System.out.println("listado de acciones definitivas");
	lista_com.forEach(
			(n) -> System.out.println(n));
	System.out.println("listado de historicos de todas las acciones ejecutadas ");
	lista_hist.forEach(
			(n) -> System.out.println(n));	
}
}
