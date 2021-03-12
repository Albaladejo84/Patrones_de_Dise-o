package app;

import java.time.Instant;

import Ejercicio1.Habitacion;
import Ejercicio1.Planta;
import Ejercicio1.UnidadHospitalaria;
import Ejercicio2.AlumnoET;
import Ejercicio2.AlumnoGC;
import Ejercicio3.Alumno;
import Ejercicio3.MasterSistemasInformacion;

public class main {

	public static void main(String[] args) {
		//probarSingleton();
		//probarComposite();
		probarPlantilla();

	}
	private static void probarPlantilla() {
		AlumnoET pedro = new AlumnoET("Pedro", "Capitan", 4, 5, 4);
		AlumnoGC chema = new AlumnoGC("Chema", "Comandante", 2, 8, 5);
		System.out.println(pedro.getNotaFinal());
		System.out.println(chema.getNotaFinal());
		
		
	}
	private static void probarComposite() {
		Planta planta1 = new Planta(1);
		UnidadHospitalaria UD1 = new UnidadHospitalaria("Unidad 1");
		Instant fecha1 = Instant.now();
		Habitacion uno = new Habitacion("001", "Pedro", "Albaladejo", "551645666", fecha1 , true);
		UD1.agragarHabitacion(uno);
		planta1.agregarUnidad(UD1);
		System.out.println(planta1.getPacientesCovid());
		System.out.println(planta1.getHabitaciones());
		System.out.println(UD1.getHabitaciones());
		
	}
	public static void probarSingleton() {
		Alumno alumno1 = new Alumno("Pedro");
		Alumno alumno2 = new Alumno("Carlos");
		MasterSistemasInformacion EIE = MasterSistemasInformacion.crearMaster();
		EIE.apuntarse(alumno1);
		EIE.apuntarse(alumno2);
		EIE.quejarse(alumno1, "El examen es dificil");
		EIE.quejarse(alumno1, "Es mucho contenido");
		EIE.quejarse(alumno2, "Hace calor");
		EIE.quejarse(alumno2, "El examen es muuuuuy dificil");
		
		System.out.println(EIE.consultarAlumnos());
		System.out.println(EIE.consultarQuejas());
	}

}
