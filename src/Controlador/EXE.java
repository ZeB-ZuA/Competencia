package Controlador;

import Modelo.Competencia;
import Vista.InOut;

public class EXE {

    public static void main(String[] args) {
        InOut ob = new InOut();//inicialiar la entrada y salida de datos
        int ce;
        do {
            ce = ob.solicitarEntero("Ingrese la cantidad de"
                    + " jugadores por equipo: ");// soliciar la cantidad de jugadores por equipo
        } while (ce <= 0);                       // con este valor se inicializa todo el objto tipo competencia
        Competencia ob1 = new Competencia(ce);
        //llamar metodos de la clase competencia
        ob1.cargarEquipos();
        ob.mostrarResultado("ESTOS SON LOS MIEMBROS INSCRITOS.");
        ob1.mostarTodo();
        ob.mostrarResultado("PRUEBA 1       DIFICULTAD: FACIL\nDESCRIPCION: los jugadores tendran que crear un CONDOR desde 0");
        ob1.pruebaFacil();
        ob.mostrarResultado("CARGANDO RESULTADOS DE LA PRUEBA 1....");
        ob1.mostarTodo();
        ob.mostrarResultado("PRUEBA 2       DIFICULTAD: NORMAL\nDESCRIPCION: los jugadores tendran que hacer un desbordamiento de una pila de matricez");
        ob1.pruebaNormal();
        ob.mostrarResultado("CARGANDO RESULTADOS DE LA PRUEBA 2....");
        ob1.mostarTodo();
        ob.mostrarResultado("PRUEBA 1       DIFICULTAD: DIFICIL\nDESCRIPCION: los jugadores tendran que pasar POO con 5.0");
        ob1.pruebaDificil();
        ob.mostrarResultado("CARGANDO RESULTADOS DE LA PRUEBA 3....");
        ob1.mostarTodo();
        ob.mostrarResultado("PROMEDIOS DE LOS EQUIPOS EN LA ETAPA DE SELECCION");
        ob1.PromTeam1();
        ob1.PromTeam2();
        ob.mostrarResultado("PROMEDIOS DE JUGADORES INDIVIDUALES");
        ob1.mostrarPromsInd1();
        ob1.mostrarPromsInd2();
        ob1.ganador();

    }

}
