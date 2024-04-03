package service;

import java.util.Collection;
import java.util.HashMap;


public class EmpleadosService {
	HashMap<Integer,String> empleados = new HashMap<Integer, String>();
	
	public boolean agregarEmpleado(int cod_empleado, String empleado) {		
		if(!empleados.containsKey(cod_empleado)) {
			empleados.put(cod_empleado, empleado);
			return true;
		}
		return false;
	}
	
	public String buscarEmpleado(int num_empleado) {
		String nombre_empleado = empleados.get(num_empleado);
		return nombre_empleado;
	}
	
	public String eliminarEmpleado(int num_empleado) {
		String empleado_borrado = empleados.remove(num_empleado);
		return empleado_borrado;
	}
	
	public String [] mostrarEmpleados() {		
		Collection<String> todos = empleados.values();
		return todos.toArray(new String[0]); // forma extraña pero más corta para convertir una Collection en un array. Pasando un array vacío del tipo que queremos.
	//	String [] todos_los_empleados = new String[empleados.size()];
	/*
	 * int contador = 0; for(String n:todos) { todos[contador] = n; contador++; }
	 * return todos;
	 */
		
	}

}
