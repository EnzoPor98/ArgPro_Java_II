package Clase1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Enzo Portillo.
 */
public class Incripcion {

    public static void main(String[] args) {
        // CREAMOS LISTAS DE MATERIAS Y ALUMNOS.
        List<Materia> materias = new ArrayList<>();
        List<Alumno> alumnos = new ArrayList<>();

        // CARGAMOS LA LISTA DE MATERIAS.
        materias.add(new Materia("Matematica I"));
        materias.add(new Materia("Lengua I"));
        materias.add(new Materia("Ciencias I"));
        materias.add(new Materia("Matematica II"));
        materias.add(new Materia("Lengua II"));
        materias.add(new Materia("Ciencias II"));

        // CARGAMOS LAS MATERIAS CORRELATIVAS CORRESPONDIENTES.
        materias.get(3).setCorrelativas(materias.get(0));
        materias.get(4).setCorrelativas(materias.get(1));
        materias.get(5).setCorrelativas(materias.get(2));

        // CARGAMOS LA LISTA DE ALUMNOS.
        alumnos.add(new Alumno("Enzo Portillo", "12123123"));
        alumnos.add(new Alumno("Ariel Portillo", "45456456"));
        alumnos.add(new Alumno("Juan Portillo", "78789789"));

        // CARGAMOS MATERIAS APROBADAS DE ENZO PORTILLO.
        alumnos.get(0).setAprobadas(materias.get(0));
        alumnos.get(0).setAprobadas(materias.get(1));
        alumnos.get(0).setAprobadas(materias.get(2));

        // CARGAMOS MATERIAS APROBADAS DE ARIEL PORTILLO.
        alumnos.get(1).setAprobadas(materias.get(0));
        alumnos.get(1).setAprobadas(materias.get(1));

        // CARGAMOS MATERIAS APROBADAS DE JUAN PORTILLO.
        alumnos.get(2).setAprobadas(materias.get(0));
        alumnos.get(2).setAprobadas(materias.get(3));

        //----------------------------------------------------------------------
        //----------------------- SISTEMA DE INSCRIPCIÓN -----------------------
        //----------------------------------------------------------------------
        Scanner inInt = new Scanner(System.in);
        Scanner inString = new Scanner(System.in);
        Alumno alumnoSelec = null;
        Materia materiaSelec = null;
        boolean identificar = true;
        boolean inscripcion = true;

        System.out.println("******************************************");
        System.out.println("* ¡Bienvenido al sistema de inscripción! *");
        System.out.println("******************************************");

        System.out.println("");

        while (identificar) {
            // PEDIMOS DNI PARA ACCEDER A LOS DATOS DEL ALUMNO.
            System.out.println("Escribe tu DNI para ingresar o presiona ENTER para finalizar...");
            System.out.print("Escribe aquí ---> ");
            String dni = inString.nextLine();

            for (Alumno alumno : alumnos) {
                if (alumno.getDni().equals(dni)) {
                    alumnoSelec = alumno;
                }
            }

            System.out.println("");

            //SI EL DNI ES INCRORRECTO VOLVEMOS A PEDIRLO.
            if (alumnoSelec != null) {
                identificar = false;
                System.out.println("¡Hola, " + alumnoSelec.getNombre() + "!");
            } else if (dni.equals("")) {
                identificar = false;
                inscripcion = false;
                System.out.println("El programa ha finalizado.");
            } else {
                System.out.println("El DNI ingresado es incorrecto, intentelo nuevamente.");
            }
        }

        System.out.println("");

        while (inscripcion) {
            // PEDIMOS LA MATERIA A LA QUE DESEA INSCRIBIRSE, LA GUARDAMOS EN 
            // UNA VARIABLE Y COMPROBAMOS SI PUEDE O NO INSCRIBIRSE.
            System.out.println("¿En qué materia deseas inscribirte?");
            System.out.println("[1.Matemática I][2.Lengua I][3.Ciencias I]");
            System.out.println("[4.Matemática II][5.Lengua II][6.Ciencias II]");
            System.out.print("Coloque su opción aquí ---> ");
            int opcion = inInt.nextInt() - 1;
            materiaSelec = materias.get(opcion);

            System.out.println("");

            System.out.println("Seleccionaste: [" + materiaSelec.getNombre() + "]");

            if (aprobada(alumnoSelec, materiaSelec)) {
                System.out.println("¡Inscripción realizada exitosamente!");
            } else if (!aprobada(alumnoSelec, materiaSelec)) {
                System.out.println("Lo siento, no puedes inscribirte a esta materia.");
            }

            System.out.println("");

            boolean finalizar = false;
            while (!finalizar) {
                // PREGUNTAMOS SI QUIERE INSCRIBIRSE A OTRA MATERIA Y REPETIMOS.
                System.out.println("¿Deseas inscribirte a otra materia?");
                System.out.println("[1.Si][2.No]");
                System.out.print("Coloque su opción aquí ---> ");
                opcion = inInt.nextInt();

                System.out.println("");

                if (opcion == 1) {
                    finalizar = true;
                } else if (opcion == 2) {
                    finalizar = true;
                    inscripcion = false;
                    System.out.println("Programa finalizado.");
                } else {
                    System.out.println("La opción no está disponible, intentelo nuevamente.");
                }

                System.out.println("");
            }
        }
    }

    // ESTE MÉTODO PERMITE O NIEGA LA INSCRIPCIÓN A LAS MATERIAS.
    public static boolean aprobada(Alumno alumno, Materia materia) {
        // PEDIMOS LAS MATERIAS APROBADAS Y LAS CORRELATIVAS DE LA MATERIA A LA
        // QUE EL ALUMNO SE QUIERE INSCRIBIR. GUARDAMOS AMBAS LISTAS DE MATERIAS.
        boolean inscribir = true, correlatividad = false;
        List<Materia> aprobadas = alumno.getAprobadas();
        List<Materia> correlativas = materia.getCorrelativas();

        // COMPROBAMOS QUE LA MATERIA A INSCRIBIRSE NO ESTÉ EN LA LISTA DE
        // MATERIAS APROBADAS DEL ALUMNO. SE INSCRIBIRÁ UNA SOLA VEZ GRACIAS A
        // LA VARIABLE INSCRIPTO DE LA CLASE MATERIA.
        for (Materia aprobada : aprobadas) {
            if (aprobada.getNombre().equals(materia.getNombre())) {
                inscribir = false;
            } else if (materia.isInscripto()) {
                inscribir = false;
            }
        }

        // COMPROBAMOS LA LISTA DE CORRELATIVAS DE LA MATERIA. SI LAS MATERIAS
        // CORRELATIVAS ESTÁN EN LA LISTA DE MATERIAS APROBADAS DEL ALUMNO,
        // ESTE PODRÁ INSCRIBIRSE A LA MATERIA.
        if (correlativas.isEmpty()) {
            correlatividad = true;
        } else {
            for (Materia aprobada : aprobadas) {
                for (Materia correlativa : correlativas) {
                    if (correlativa.getNombre().equals(aprobada.getNombre())) {
                        correlatividad = true;
                    }
                }
            }
        }

        if (inscribir && correlatividad) {
            materia.setinscripto(true);
            return true;
        } else {
            return false;
        }
    }
}
