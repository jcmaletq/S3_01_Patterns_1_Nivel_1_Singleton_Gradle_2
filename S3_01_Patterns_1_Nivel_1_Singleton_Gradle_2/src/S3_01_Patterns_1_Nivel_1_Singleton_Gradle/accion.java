package S3_01_Patterns_1_Nivel_1_Singleton_Gradle;
/*
 * estas acciones dependen del sistema, solo estan para 
 * contemplar las acciones
 */
public class accion {
  protected String accion;

  public accion(String cad) {
	// TODO Auto-generated constructor stub
	  // se debería comprobar si la accione es valida y llamar a la acción
	  accion = cad;
}
  public accion(String cad, String cad1 ) {
	// TODO Auto-generated constructor stub
	  // se debería comprobar si la accione es valida y llamar a la acción
	  accion = cad+cad1;
}

  @Override
public String toString() {
	return "" + accion;
}


	
}
