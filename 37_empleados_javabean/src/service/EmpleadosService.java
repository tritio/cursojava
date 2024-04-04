package service;

import java.util.Collection;
import java.util.HashMap;

import model.Empleado;


public class EmpleadosService {
	HashMap<Integer,Empleado> empleados = new HashMap<Integer, Empleado>();
	
	public boolean agregarEmpleado(Empleado empleado) {		
		if(!empleados.containsKey(empleado.getCodigo())) {
			empleados.put(empleado.getCodigo(), empleado);
			return true;
		}
		return false;
	}
	
	public Empleado buscarEmpleado(int num_empleado) {
		Empleado nombre_empleado = empleados.get(num_empleado);
		return nombre_empleado;
	}
	
	public Empleado eliminarEmpleado(int num_empleado) {
		Empleado empleado_borrado = empleados.remove(num_empleado);
		return empleado_borrado;
	}
	
	public Empleado [] mostrarEmpleados() {		
		Collection<Empleado> todos = empleados.values();
		return todos.toArray(new Empleado[0]); // forma extraña pero más corta para convertir una Collection en un array. Pasando un array vacío del tipo que queremos.
		
	}

}
