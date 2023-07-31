package Modelo;

import Vista.InOut;
import java.text.DecimalFormat;

public class Competencia {

    InOut ob = new InOut();
    DecimalFormat formato = new DecimalFormat("#.0");
    private Jugador team1[];// array tipo jugador para el equipo 1.
    private Jugador team2[]; // array tipo jugador para el equipo 2.
    private Remdimiento R[]; //array de rendimientos de jugador, este se llenara 
    private int c;                   //en cada prueba
    private float prom1 = 0;  //acumula el promedio sumado del team1
    private float prom2 = 0;  //acumula el promedio sumado del team2

    public Competencia(int cj) {
        this.c = cj;
        team1 = new Jugador[cj];
        team2 = new Jugador[cj];
    }//costructor de la clase

//metodo para cargar los equipos
    public void cargarEquipos() {
        String n, n2;
        int cc, cc2;

        ob.mostrarResultado("LLENAR EQUIPO 1:");
        for (int i = 0; i < c; i++) {
            do {
                n = ob.solicitarNombre("Ingrese el nombre del Jugador" + (i + 1));
            } while ("".equals(n) || " ".equals(n));//condicional
            do {
                cc = ob.solicitarEntero("Ingrese CC del Jugador " + (i + 1));
            } while (cc <= 0 //|| !validarCC(i, cc)
                    );//condicional
            Jugador obj1 = new Jugador(n, cc, inicializarRem()); //inicializar el objeto tipo jugador y pasarle los datos
            team1[i] = obj1; // meter objetos al array de objetos
        }
        ob.mostrarResultado("LLENAR EQUIPO 2:");
        for (int j = 0; j < c; j++) {
            do {
                n2 = ob.solicitarNombre("Ingrese el nombre del Jugador" + (j + 1));
            } while ("".equals(n2) || " ".equals(n2));//condicional
            do {
                cc2 = ob.solicitarEntero("Ingrese CC del Jugador " + (j + 1));
            } while (cc2 <= 0  //!validarCC(j, cc2)
                    );//condicional
            Jugador obj2 = new Jugador(n2, cc2, inicializarRem()); //inicializar el objeto tipo jugador y pasarle los datos
            team2[j] = obj2;// meter objetos al array de objetos
        }
    }
//metodo que inicializa el array de rendimientos en 0

    public Remdimiento[] inicializarRem() {
        float p1;
        R = new Remdimiento[3];
        for (int i = 0; i < 3; i++) {
            p1 = 0; //llenar el array de ceros

            R[i] = new Remdimiento(p1); //daler valores al array de rendimientos
        }

        return R;
    }
//metodo para mostrar los jugadores y sus rendimientos

    public void mostarTodo() {

        Remdimiento aux[]; //vector auxiliar para recorrer el vector interno

        String me = "Equipo 1:\n";
        for (int i = 0; i < c; i++) {
            me += "Nombre: " + team1[i].getName() + "   Id: " + team1[i].getCc() + "\n";
            aux = new Remdimiento[3]; // darle al aux un array de rendimientos
            aux = team1[i].getRem(); //asignarle al aux el array de rediminetos
            me += "PUNTAJES:\n";
            for (int j = 0; j < 3; j++) {
                me += "=> " + aux[j].getP1() + "\n";//imprimir
            }

        }
        ob.mostrarResultado(me);//mostrar

        Remdimiento aux2[];//vector auxiliar para recorrer el vector interno

        String me2 = "Equipo 2:\n";
        for (int i = 0; i < c; i++) {
            me2 += "Nombre: " + team2[i].getName() + "   Id: " + team2[i].getCc() + "\n";
            aux2 = new Remdimiento[3];// darle al aux un array de rendimientos
            aux2 = team2[i].getRem();//asignarle al aux el array de rediminetos
            me2 += "PUNTAJES:\n";
            for (int j = 0; j < 3; j++) {
                me2 += "=> " + aux2[j].getP1() + "\n";//imprimir
            }

        }

        ob.mostrarResultado(me2);//mostrar

    }
//metodo que llena la primera posicion de rendimientos de cada jugador

    public void pruebaFacil() {
        Remdimiento aux[];//vector auxiliar para recorrer el vector interno

        for (int i = 0; i < c; i++) {
            aux = new Remdimiento[3];// darle al aux un array de rendimientos
            aux = team1[i].getRem();//asignarle al aux el array de rediminetos
            for (int j = 0; j < 1; j++) {
                aux[j].setP1((int) (Math.random() * 10 + 1)); //a todos los jugores de team1 en la primera calificacion
            }                                                 // darle un valor random entre 1 y 10

        }
        Remdimiento aux2[];//vector auxiliar para recorrer el vector interno
        for (int i = 0; i < c; i++) {
            aux2 = new Remdimiento[3];;// darle al aux un array de rendimientos
            aux2 = team2[i].getRem();//asignarle al aux el array de rediminetos
            for (int j = 0; j < 1; j++) {
                aux2[j].setP1((int) (Math.random() * 10 + 1));//a todos los jugores de team1 en la primera calificacion
                                                              // darle un valor random entre 1 y 10
            }
        }

    }
//metodo que llena la segunda posicion de rendimientos de cada jugador
    public void pruebaNormal() {
        Remdimiento aux[];
        for (int i = 0; i < c; i++) {
            aux = new Remdimiento[3];
            aux = team1[i].getRem();
            for (int j = 1; j < 2; j++) {
                aux[j].setP1((int) (Math.random() * 15 + 1)); // lo mismo pero en la segunda puntuacion y de 1 a 15
            }

        }
        Remdimiento aux2[];
        for (int i = 0; i < c; i++) {
            aux2 = new Remdimiento[3];
            aux2 = team2[i].getRem();
            for (int j = 1; j < 2; j++) {
                aux2[j].setP1((int) (Math.random() * 15 + 1));
            }
        }

    }
//metodo que llena la tercera posicion de rendimientos de cada jugador
    public void pruebaDificil() {
        Remdimiento aux[];
        for (int i = 0; i < c; i++) {
            aux = new Remdimiento[3];
            aux = team1[i].getRem();
            for (int j = 2; j < 3; j++) {
                aux[j].setP1((int) (Math.random() * 20 + 1));// lo mismo pero en la segunda puntuacion y de 1 a 15
            }

        }
        Remdimiento aux2[];
        for (int i = 0; i < c; i++) {
            aux2 = new Remdimiento[3];
            aux2 = team2[i].getRem();
            for (int j = 2; j < 3; j++) {
                aux2[j].setP1((int) (Math.random() * 20 + 1));
            }
        }

    }
//saca los promedio generales e individuales de la prueba de seleccion para el equipo 1
    public void PromTeam1() {
        float prom = 0; //inicia el acumulador
        Remdimiento aux[];//vector auxiliar para recorrer el vector interno
        for (int i = 0; i < c; i++) {
            aux = new Remdimiento[3];// darle al aux un array de rendimientos
            aux = team1[i].getRem(); //asignarle al aux el array de rediminetos
            for (int j = 0; j < 3; j++) {
                prom = prom + aux[j].getP1(); //acumular el rendimiento de todo el equipo
            }

        }

        ob.mostrarResultado("El promedio total del equipo 1 en la fase de seleccion es=> " + prom / (3 * c));//el acumilador dividido por el numero de puntuaciones totales

    }
//saca los promedio generales e individuales de la prueba de seleccion para el equipo 2
//aplica todo lo del anterior
    public void PromTeam2() {
        float prom = 0;
        Remdimiento aux[];
        for (int i = 0; i < c; i++) {
            aux = new Remdimiento[3];
            aux = team2[i].getRem();
            for (int j = 0; j < 3; j++) {
                prom = prom + aux[j].getP1();
            }

        }

        ob.mostrarResultado("El promedio total del equipo 2 en la fase de seleccion es=> " + prom / (3 * c));

    }
//funcion que saca el promedio de las 3 pruebas de cada jugador el equipo 1

    public float promIndividuales1(int pos1, int pos2) {
        Remdimiento aux[];
        float prom = 0; //esta funcion recibira una posicion y la posicion siguiente 
        for (int i = pos1; i < pos2; i++) { //con tal de que solo haya uno de diferencia entre el uno y el otro
            aux = new Remdimiento[3];
            aux = team1[i].getRem();  //accedemos a vector de rendimiento de esa poscion de vector del rendimiento
            for (int k = 0; k < 3; k++) {
                prom = prom + aux[k].getP1(); //acumular

            }

        }

        return prom / 3; //devolver el promedio agarando el acumulador y dividiendo por la cantidad de prubebas (3)
    }
//funcion que saca el promedio de las 3 pruebas de cada jugador el equipo 2
//aplica lo mismo de la anterior
    public float promIndividuales2(int pos1, int pos2) {
        Remdimiento aux[];
        float prom = 0;
        for (int i = pos1; i < pos2; i++) {
            aux = new Remdimiento[3];
            aux = team2[i].getRem();
            for (int k = 0; k < 3; k++) {
                prom = prom + aux[k].getP1();

            }

        }

        return prom / 3;
    }
//metodo que suma los promedios de cada jugador del equipo 1

    public void mostrarPromsInd1() {
        int pos2 = 1;
        String me = "EQUIPO 1\n";
        float prom = 0;
        for (int pos1 = 0; pos1 < team1.length; pos1++) {
            me = me + "El promedio Individual del jugador " + (pos1 + 1) + " es => " + promIndividuales1(pos1, pos2) + "\n";

            prom = promIndividuales1(pos1, pos2);
            team1[pos1].setRenprom(prom);
            pos2++;
            prom1 = prom1 + prom;
        }
        ob.mostrarResultado(me);
        ob.mostrarResultado("Promedio total del equipo 1 => " + prom1);
    }
//metodo que suma los promedios de cada jugador del equipo 2

    public void mostrarPromsInd2() {
        int pos2 = 1;
        String me = "EQUIPO 2\n";
        float prom = 0;
        for (int pos1 = 0; pos1 < team2.length; pos1++) {
            me = me + "El promedio Individual del jugador " + (pos1 + 1) + " es => " + promIndividuales1(pos1, pos2) + "\n";
            prom = promIndividuales2(pos1, pos2);
            team2[pos1].setRenprom(prom);
            pos2++;
            prom2 = prom2 + prom;
        }
        ob.mostrarResultado(me);
        ob.mostrarResultado("Promedio total del equipo 2 => " + prom2);
    }
//metodo para determinar el ganador

    public void ganador() {
        float mayor = 0;
        int pos = 0;
        String me = "RECUENTO FINAL EQUIPO 1:\n";
        for (int i = 0; i < c; i++) {
            me = me + "Jugador => " + team1[i].getName() + "     promedio => " + team1[i].getRenprom() + "\n";
        }
        ob.mostrarResultado(me); //mostrar info
        String me2 = "RECUENTO FINAL EQUIPO 2:\n";
        for (int i = 0; i < c; i++) {
            me2 = me2 + "Jugador => " + team2[i].getName() + "     promedio => " + team2[i].getRenprom() + "\n";
        }
        ob.mostrarResultado(me2); //mostrar info

        ob.mostrarResultado("CALCULANDO GANADOR");

        if (prom1 > prom2) { //determinar ganador
            ob.mostrarResultado("EL EQUIPO 1 A GANADO LA COMPETENCIA");
            for (int i = 0; i < team1.length; i++) {
                if (mayor < team1[i].getRenprom()) { //sacar el objeto con mayor rendimento
                    mayor = team1[i].getRenprom();
                    pos = i;
                }
            }
            ob.mostrarResultado("EL MVP DEL EQUIPO 1 FUE:\nNombre: " + team1[pos].getName() + "\nCC: " + team1[pos].getCc());
        } else {
            ob.mostrarResultado("EL EQUIPO 2 A GANADO LA COMPETENCIA");
            for (int i = 0; i < team2.length; i++) {
                if (mayor < team2[i].getRenprom()) {
                    mayor = team2[i].getRenprom();
                    pos = i;
                }
            }
            ob.mostrarResultado("EL MVP DEL EQUIPO 2 FUE:\nNombre: " + team2[pos].getName() + "\nCC: " + team2[pos].getCc());
        }

    }
//funcion para que no se repitan los condicionales

    public boolean validarCC(int pos, int id) {
        boolean est = true;

        if (pos == 0) {
            return true;
        } else {
            for (int a = 0; a < pos; a++) {
                if (id == team1[a].getCc() || id == team2[a].getCc()) {
                    est = false;
                }
            }
            return est;
        }
    }

}
