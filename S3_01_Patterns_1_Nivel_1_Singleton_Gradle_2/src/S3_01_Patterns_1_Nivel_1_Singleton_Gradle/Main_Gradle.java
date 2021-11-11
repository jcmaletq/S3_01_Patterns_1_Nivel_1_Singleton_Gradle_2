package S3_01_Patterns_1_Nivel_1_Singleton_Gradle;
import S3_01_Patterns_1_Nivel_1_Singleton_Gradle.Undo;
public class Main_Gradle {
/*
 * En tots els exercicis, crea un projecte Gradle amb una classe Main que demostri l'ús del patró (amb les invocacions 
 * que necessiti).
 * Singleton
 * Crea una classe que repliqui el funcionament del comando 'Undo'. Aquesta classe serà utilitzada per la classe Main, 
 * que permetrà introduir opcions per consola.
 * La classe 'Undo' ha de guardar memòria dels últims comandos introduïts, permetent afegir o eliminar comandos, 
 * així com llistar els ultimos comandos introduïts (similar al comando 'history' en Linux).
 * La classe 'Undo' ha d'implementar imprescindiblement un patró Singleton.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Undo u = Undo.getInstancia();
        u.afegir("test1");
        u.afegir("test2");
        u.afegir("test3");
        u.eliminar();   // elimina la ultima accion
        u.eliminar();   // elimina la ultima accion
        u.afegir("test4");
        u.llistar();
	}

}
