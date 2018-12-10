package controller;

import include.Curso;
import model.modeloCurso;

import java.util.ArrayList;

public class controladorCurso {

    public boolean insertCurso(Curso curso){
        modeloCurso curso1 = new modeloCurso();
        return  curso1.insertCurso(curso);
    }

    public ArrayList<Curso> obtenerCurso(){
        modeloCurso curso = new modeloCurso();
        return curso.obtenerCurso();
    }

    public ArrayList<Curso> obtenerCursos (int id_curso){
        modeloCurso curso = new modeloCurso();
        return curso.obtenerCursos(id_curso);
    }
    public boolean actualizarCurso(Curso curso){
        modeloCurso curso1 = new modeloCurso();
        return curso1.actualizarCurso(curso);
    }
    public boolean eliminarCurso(int id_curso){
        modeloCurso curso = new modeloCurso();
        return curso.eliminarCurso(id_curso);
    }
/*
    public static void main(String[] args) {
        controladorCurso cc = new controladorCurso();
        //Agregar un nuevo elemento
       System.out.println(cc.insertCurso(new Curso(002, "Biologia", "7")));



        //listar todos los elementos de la tabla
        ArrayList<Curso> curso = new ArrayList<Curso>();
        curso = cc.obtenerCurso();
        for (int a = 0; a < curso.size(); a++) {
            System.out.println("Curso: " + curso.get(a).getId_curso());
            System.out.println("Nombre_Curso: " + curso.get(a).getNombre_curso());
            System.out.println("Nivel: " + curso.get(a).getNivel());
            System.out.println();
        }
        //Listar un elemento de la tabla por su llave primaria

        ArrayList<Curso> cursos = new ArrayList<Curso>();
        curso = cc.obtenerCursos(001);

        for (int b = 0; b < curso.size(); b++) {
            System.out.println("Curso: " + curso.get(b).getId_curso());
            System.out.println("Nombre Curso: " + curso.get(b).getNombre_curso());
            System.out.println("Nivel: " + curso.get(b).getNivel());
            System.out.println();
        }
        //Modificar un elemento
        System.out.println(cc.actualizarCurso(new Curso(001, "EnglishCar", "10")));

        //Modificar un elemento
        System.out.println(cc.eliminarCurso(002));

    }
*/

}
