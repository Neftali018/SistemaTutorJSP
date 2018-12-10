package controller;
import include.TemasCurso;
import model.modeloTemasCurso;
import java.util.ArrayList;


public class controladorTemasCurso {

    public boolean insertTemasCurso(TemasCurso temas_curso){
       modeloTemasCurso temasCurso1 = new modeloTemasCurso();
        return temasCurso1.insertTemasCurso(temas_curso);
    }

    public ArrayList<TemasCurso> obtenerTemasCurso(){
        modeloTemasCurso temasCurso = new modeloTemasCurso();
        return temasCurso.obtenerTemasCurso();
    }


    public ArrayList<TemasCurso> obtenerTemaCurso(int id_temas){
        modeloTemasCurso temasCurso = new modeloTemasCurso();
        return temasCurso.obtenerTemaCurso(id_temas);
    }

    public boolean actualizarTemasCurso(TemasCurso temasCurso){
        modeloTemasCurso temasCurso1 = new modeloTemasCurso();
        return temasCurso1.actualizarTemasCurso(temasCurso);
    }

    public boolean borrarTemasCurso(int id_temas){
        modeloTemasCurso temasCurso = new modeloTemasCurso();
        return temasCurso.borrarTemasCurso(id_temas);
    }
    /*
    public static void main(String[] args){
        controladorTemasCurso cc = new controladorTemasCurso();
       System.out.println(cc.insertTemasCurso(new TemasCurso(003, "Matematicas", 001)));

        //listar todos los elementos de la tabla
        ArrayList<TemasCurso> temasCursos = new ArrayList<TemasCurso>();
        temasCursos = cc.obtenerTemasCurso();
        for (int a=0;a<temasCursos.size();a++){
            System.out.println("id: "+ temasCursos.get(a).getId_temas());
            System.out.println("Nombre Tema "+ temasCursos.get(a).getNombre_tema());
            System.out.println("IDCurso "+ temasCursos.get(a).getId_curso());
            System.out.println();
        }

        //listar un elemento de la tabla por su llave primaria
        ArrayList<TemasCurso> temasCursos1 = new ArrayList<TemasCurso>();
        temasCursos = cc.obtenerTemaCurso(001);

        for (int b=0;b<temasCursos.size();b++){
            System.out.println("IdTemas: "+ temasCursos.get(b).getId_temas());
            System.out.println("Nombre tema: "+ temasCursos.get(b).getNombre_tema());
            System.out.println("Id curso: "+ temasCursos.get(b).getId_curso());
            System.out.println();
        }
        //modidificar un elemento
        System.out.println(cc.actualizarTemasCurso(new TemasCurso(001, "Porras", 001 )));

        //modificar un elemento
        System.out.println(cc.borrarTemasCurso(002));
    }
    */
}
