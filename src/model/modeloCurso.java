package model;

import include.Curso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class modeloCurso extends conexion {
    public boolean insertCurso (Curso curso){
        PreparedStatement pst = null;
        boolean flag = false;
        try{
            String consulta ="INSERT INTO Curso (id_curso, nombre_curso, nivel)VALUES (?,?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1,curso.getId_curso());
            pst.setString(2,curso.getNombre_curso());
            pst.setString(3,curso.getNivel());

            if (pst.executeUpdate()== 1){
                flag = true;
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            try {
                if ( getConection() !=null) getConection().close();
                if (pst !=null) pst.close();
            }catch (Exception e){

            }
            return flag;
        }
    }
    public ArrayList<Curso> obtenerCurso(){
        ArrayList<Curso> curso = new ArrayList<Curso>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT id_curso, nombre_curso, nivel FROM curso";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()){
                curso.add(new Curso(rs.getInt("id_curso"),
                        rs.getString("nombre_curso"),
                        rs.getString("nivel")));
            }
        }catch (Exception e){

        }finally {
            try {
                if (getConection() !=null)getConection().close();
                if (pst !=null)pst.close();
                if (rs !=null)rs.close();
            }catch (Exception e){

            }
        }
        return curso;
    }

    public ArrayList<Curso> obtenerCursos(int id_curso){
        ArrayList<Curso> curso = new ArrayList<Curso>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta ="SELECT id_curso, nombre_curso, nivel FROM curso WHERE id_curso = ?";
            pst = getConection().prepareCall(consulta);
            pst.setInt(1, id_curso);
            rs = pst.executeQuery();
            while (rs.next()){
                curso.add(new Curso(rs.getInt("id_curso"),
                        rs.getString("nombre_curso"),
                        rs.getString("nivel")));

            }
        }catch (Exception e) {
            System.out.println(e.getMessage());

        }finally {
            try {
                if (getConection() !=null)getConection().close();
                if (pst !=null)pst.close();
                if (rs !=null)rs.close();
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return curso;
    }
    public boolean actualizarCurso(Curso curso){
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta = "UPDATE curso SET id_curso = ?, nombre_curso = ?, nivel = ? WHERE id_curso = ? ";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1,curso.getId_curso());
            pst.setString(2,curso.getNombre_curso());
            pst.setString(3,curso.getNivel());
            pst.setInt(4,curso.getId_curso());

            if (pst.executeUpdate() == 1){
                flag = true;
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null)pst.close();
            }catch (Exception a){
                System.out.println(a.getMessage());
            }
        }
        return flag;
    }
    public boolean eliminarCurso(int id_curso){
        PreparedStatement pst =null;
        boolean flag = false;
        try {
            String consulta ="DELETE FROM curso WHERE id_curso = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, id_curso);

            if (pst.executeUpdate() == 1){
                flag = true;
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            try {
                if (getConection() != null)getConection().close();
                if (pst !=null)pst.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return flag;
    }
}

