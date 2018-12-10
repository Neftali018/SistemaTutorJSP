package model;
import include.TemasCurso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class modeloTemasCurso extends conexion {
    public boolean insertTemasCurso (TemasCurso temas_curso){
       PreparedStatement pst = null;
       boolean flag = false;
       try {
           String consulta ="INSERT INTO temas_curso (id_temas, nombre_tema, id_curso)VALUES (?,?,?)";
           pst = getConection().prepareStatement(consulta);
           pst.setInt(1,temas_curso.getId_temas());
           pst.setString(2,temas_curso.getNombre_tema());
           pst.setInt(3,temas_curso.getId_curso());

           if (pst.executeUpdate()== 1){
               flag = true;
           }
       }catch (Exception ex){
           System.out.println(ex.getMessage());
       }finally {
           try {
               if (getConection() !=null) getConection().close();
               if (pst !=null) pst.close();
           }catch (Exception e){

           }
           return flag;
       }

    }
    public ArrayList<TemasCurso> obtenerTemasCurso(){
        ArrayList<TemasCurso> temasCursos = new ArrayList<TemasCurso>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT id_temas, nombre_tema, id_curso FROM temas_curso";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()){
                temasCursos.add(new TemasCurso(rs.getInt("id_temas"),
                        rs.getString("nombre_tema"),
                        rs.getInt("id_curso")));
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
        return temasCursos;
    }

    public ArrayList<TemasCurso> obtenerTemaCurso(int id_temas) {
        ArrayList<TemasCurso> temasCursos = new ArrayList<TemasCurso>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT id_temas, nombre_tema, id_curso FROM temas_curso WHERE id_temas = ?";
            pst = getConection().prepareCall(consulta);
            pst.setInt(1, id_temas);
            rs = pst.executeQuery();
            while (rs.next()) {
                temasCursos.add(new TemasCurso(rs.getInt("id_temas"),
                        rs.getString("nombre_tema"),
                        rs.getInt("id_curso")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return temasCursos;
    }
    public boolean actualizarTemasCurso(TemasCurso temasCurso){
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta = "UPDATE temas_curso SET id_temas = ?, nombre_tema = ?, id_curso = ? WHERE id_temas = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1,temasCurso.getId_temas());
            pst.setString(2,temasCurso.getNombre_tema());
            pst.setInt(3,temasCurso.getId_curso());
            pst.setInt(4,temasCurso.getId_temas());

            if (pst.executeUpdate() == 1){
                flag = true;
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            try {
                if (getConection() !=null)getConection().close();
                if (pst !=null)pst.close();
            }catch (Exception a){
                System.out.println(a.getMessage());
            }
        }
        return flag;
    }
    public boolean borrarTemasCurso(int id_temas){
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta = "DELETE FROM temas_curso WHERE id_temas = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, id_temas);

            if (pst.executeUpdate() == 1){
                flag = true;
            }

        }catch (Exception ex){
            System.out.println(ex.getMessage());
            }finally {
            try {
                if (getConection() !=null)getConection().close();
                if (pst !=null)pst.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return flag;
    }

    }

