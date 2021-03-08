package app;

import clases.Alumno;
import clases.ChatEIE;
import clases.Profesor;
import clases.SistemaNotificacion;
import clases.UsuarioChat;

public class main {

	public static void main(String[] args) {
		ChatEIE chatCurso = new ChatEIE("DIM-43");
		UsuarioChat pedro = new Alumno("Pedro", "CURSO DIM 43");
		UsuarioChat pablo = new Alumno("Pablo", "CURSO DIM 43");
		
		System.out.println(chatCurso.toString());
		
		SistemaNotificacion.agregarSuscriptor(pedro, chatCurso);
		SistemaNotificacion.agregarSuscriptor(pablo, chatCurso);
		
		chatCurso.enviarMensaje(pedro, "Hola a todos");
		
		UsuarioChat marcos = new Profesor("Marcos", "Informática");
		SistemaNotificacion.agregarSuscriptor(marcos, chatCurso);
		
		chatCurso.enviarMensaje(marcos, "Mañana hay examen");

	}

}
