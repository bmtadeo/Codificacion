package Principal;
import Datos.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Clase principal
 * @author bmtadeo
 *
 */
public class Principal{
	
	static Scanner entrada = new Scanner(System.in);
	
	/**
	 * Metodo principal
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bienvenido al servicio de mensajeria Telegram");
		System.out.println("---------------------------------------------");
		System.out.println("Usuario1, envie un mensaje al Usuario2: ");
		String mensajeusuario=entrada.next();
		MensajeUsuario mensajeUsuario= new MensajeUsuario(mensajeusuario);
		
		String mensajeencriptado=enviarMensajeYCodificar(mensajeUsuario.getCadena());
		MensajeEncriptado mensajeEncriptado=new MensajeEncriptado(mensajeencriptado);
		System.out.println("El mensaje encriptado es: " + mensajeEncriptado.getClave());
		System.out.println();
		String mensajeDecodificado=recibirMensajeYDecodificar(mensajeEncriptado.getClave());
		System.out.println("Usuario2 ha recibido el mensaje: " + mensajeDecodificado);
		System.out.println();
		escribirMensajeEncriptadoYDesencriptado(mensajeUsuario.getCadena(),mensajeEncriptado.getClave());
		
		if(mensajeDecodificado.equals(mensajeUsuario.getCadena().toUpperCase())){
			System.out.println("Los mensajes son iguales");
		}else{
			System.out.println("Ha habido un error, no son iguales");
		}
		entrada.close();
		System.exit(0);
	}
	/**
	 * Metodo para 'enviar ' y codificar el mensaje
	 * @param s1
	 * @return mensajeCodificado
	 */
	public static String enviarMensajeYCodificar(String s1){
		StringBuilder sb= new StringBuilder();
		char[] mensaje= s1.toUpperCase().toCharArray();
		int i=0;
		while(i<mensaje.length){
			switch(mensaje[i]){
			case 'A':
				sb.append(CodigosLetrasYNumeros.A);
				break;
			case 'B':
				sb.append(CodigosLetrasYNumeros.B);
				break;
			case 'C':
				sb.append(CodigosLetrasYNumeros.C);
				break;
			case 'D':
				sb.append(CodigosLetrasYNumeros.D);
				break;
			case 'E':
				sb.append(CodigosLetrasYNumeros.E);
				break;
			case 'F':
				sb.append(CodigosLetrasYNumeros.F);
				break;
			case 'G':
				sb.append(CodigosLetrasYNumeros.G);
				break;
			case 'H':
				sb.append(CodigosLetrasYNumeros.H);
				break;
			case 'I':
				sb.append(CodigosLetrasYNumeros.I);
				break;
			case 'J':
				sb.append(CodigosLetrasYNumeros.J);
				break;
			case 'K':
				sb.append(CodigosLetrasYNumeros.K);
				break;
			case 'L':
				sb.append(CodigosLetrasYNumeros.L);
				break;
			case 'M':
				sb.append(CodigosLetrasYNumeros.M);
				break;
			case 'N':
				sb.append(CodigosLetrasYNumeros.N);
				break;
			case 'Ñ':
				sb.append(CodigosLetrasYNumeros.Ñ);
				break;
			case 'O':
				sb.append(CodigosLetrasYNumeros.O);
				break;
			case 'P':
				sb.append(CodigosLetrasYNumeros.P);
				break;
			case 'Q':
				sb.append(CodigosLetrasYNumeros.Q);
				break;
			case 'R':
				sb.append(CodigosLetrasYNumeros.R);
				break;
			case 'S':
				sb.append(CodigosLetrasYNumeros.S);
				break;
			case 'T':
				sb.append(CodigosLetrasYNumeros.T);
				break;
			case 'U':
				sb.append(CodigosLetrasYNumeros.U);
				break;
			case 'V':
				sb.append(CodigosLetrasYNumeros.V);
				break;
			case 'W':
				sb.append(CodigosLetrasYNumeros.W);
				break;
			case 'X':
				sb.append(CodigosLetrasYNumeros.X);
				break;
			case 'Y':
				sb.append(CodigosLetrasYNumeros.Y);
				break;
			case 'Z':
				sb.append(CodigosLetrasYNumeros.Z);
				break;
			case ' ':
				sb.append(CodigosLetrasYNumeros.ESPACIO);
				break;
			case '0':
				sb.append(CodigosLetrasYNumeros.NUMERO0);
				break;
			case '1':
				sb.append(CodigosLetrasYNumeros.NUMERO1);
				break;
			case '2':
				sb.append(CodigosLetrasYNumeros.NUMERO2);
				break;
			case '3':
				sb.append(CodigosLetrasYNumeros.NUMERO3);
				break;
			case '4':
				sb.append(CodigosLetrasYNumeros.NUMERO4);
				break;
			case '5':
				sb.append(CodigosLetrasYNumeros.NUMERO5);
				break;
			case '6':
				sb.append(CodigosLetrasYNumeros.NUMERO6);
				break;
			case '7':
				sb.append(CodigosLetrasYNumeros.NUMERO7);
				break;
			case '8':
				sb.append(CodigosLetrasYNumeros.NUMERO8);
				break;
			case '9':
				sb.append(CodigosLetrasYNumeros.NUMERO9);
				break;
			}
			i++;
			
		}
		String mensajeCodificado= sb.toString();
	
		return mensajeCodificado;
		
	}
	/**
	 * Metodo para 'recibir' y decodificar el mensaje
	 * @param s1
	 * @return mensajeDecodificado
	 */
	public static String recibirMensajeYDecodificar(String s1){
		StringBuilder sb= new StringBuilder();
		char[] mensaje= s1.toUpperCase().toCharArray();
		int i=0;
		while(i<mensaje.length){
			switch(mensaje[i]){
			case CodigosLetrasYNumeros.A:
				sb.append('A');
				break;
			case CodigosLetrasYNumeros.B:
				sb.append('B');
				break;
			case CodigosLetrasYNumeros.C:
				sb.append('C');
				break;
			case CodigosLetrasYNumeros.D:
				sb.append('D');
				break;
			case CodigosLetrasYNumeros.E:
				sb.append('E');
				break;
			case CodigosLetrasYNumeros.F:
				sb.append('F');
				break;
			case CodigosLetrasYNumeros.G:
				sb.append('G');
				break;
			case CodigosLetrasYNumeros.H:
				sb.append('H');
				break;
			case CodigosLetrasYNumeros.I:
				sb.append('I');
				break;
			case CodigosLetrasYNumeros.J:
				sb.append('J');
				break;
			case CodigosLetrasYNumeros.K:
				sb.append('K');
				break;
			case CodigosLetrasYNumeros.L:
				sb.append('L');
				break;
			case CodigosLetrasYNumeros.M:
				sb.append('M');
				break;
			case CodigosLetrasYNumeros.N:
				sb.append('N');
				break;
			case CodigosLetrasYNumeros.Ñ:
				sb.append('Ñ');
				break;
			case CodigosLetrasYNumeros.O:
				sb.append('O');
				break;
			case CodigosLetrasYNumeros.P:
				sb.append('P');
				break;
			case CodigosLetrasYNumeros.Q:
				sb.append('Q');
				break;
			case CodigosLetrasYNumeros.R:
				sb.append('R');
				break;
			case CodigosLetrasYNumeros.S:
				sb.append('S');
				break;
			case CodigosLetrasYNumeros.T:
				sb.append('T');
				break;
			case CodigosLetrasYNumeros.U:
				sb.append('U');
				break;
			case CodigosLetrasYNumeros.V:
				sb.append('V');
				break;
			case CodigosLetrasYNumeros.W:
				sb.append('W');
				break;
			case CodigosLetrasYNumeros.X:
				sb.append('X');
				break;
			case CodigosLetrasYNumeros.Y:
				sb.append('Y');
				break;
			case CodigosLetrasYNumeros.Z:
				sb.append('Z');
				break;
			case CodigosLetrasYNumeros.ESPACIO:
				sb.append(' ');
				break;
		    case CodigosLetrasYNumeros.NUMERO0:
		    	sb.append('0');
		    	break;
		    case CodigosLetrasYNumeros.NUMERO1:
		    	sb.append('1');
			    break;
		    case CodigosLetrasYNumeros.NUMERO2:
			    sb.append('2');
			    break;
		    case CodigosLetrasYNumeros.NUMERO3:
			    sb.append('3');
			    break;
		    case '4':
			    sb.append(CodigosLetrasYNumeros.NUMERO4);
			     break;
		    case CodigosLetrasYNumeros.NUMERO5:
			    sb.append('5');
			    break;
		    case CodigosLetrasYNumeros.NUMERO6:
			    sb.append('6');
			    break;
		    case '7':
			    sb.append(CodigosLetrasYNumeros.NUMERO7);
			    break;
	     	case CodigosLetrasYNumeros.NUMERO8:
			    sb.append('8');
			    break;
		    case CodigosLetrasYNumeros.NUMERO9:
			    sb.append('9');
			    break;
			}
			i++;
			
		}
		String mensajedecodificado= sb.toString();
		
		return mensajedecodificado;
		
	}
	/**
	 * Metodo par escribir el mensaje codificado y decodidificado en el texto
	 * @param s1
	 * @param s2
	 */
	public static void escribirMensajeEncriptadoYDesencriptado(String s1, String s2){
		String ruta= "/Users/bmtadeo/Documents/Universidad/Proyectos Programacion/Codificacion/mensajes.txt";
		File archivo = new File(ruta);
		BufferedWriter bw = null;
		if(archivo.exists()) {
			  try {
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.write("Mensaje: "+s1 +" ----> "+ " Encriptado: "+ s2);    
	            bw.flush();
	            } catch (IOException e) {
				e.printStackTrace();
			}
		      
		} else {
			try {
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.write("Los mensajes enviados son: \n");
	            bw.write("-------------------------------------\n");
	            bw.write("Mensaje: "+s1 +"---->"+ "Encriptado: "+ s2);  
			    bw.flush();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	    	
		 }
		
		
	
	}
	
	

 }

