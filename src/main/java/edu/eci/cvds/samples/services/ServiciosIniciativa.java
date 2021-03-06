package edu.eci.cvds.samples.services;

import edu.eci.cvds.sampleprj.dao.PersistenceException;
import edu.eci.cvds.samples.entities.Comentario;
import edu.eci.cvds.samples.entities.Iniciativa;
import edu.eci.cvds.samples.entities.Usuario;

import java.util.Date;
import java.util.List;

public interface ServiciosIniciativa {

    /**
     * Metodo que permite consular los comentarios por iniciativa
     * @param idIniciativa id de la iniciativa de la cual se quieren conocer los comentarios
     * @return Lista de comentarios
     */
    public List<Comentario> consultarComentariosPorIniciativa(int idIniciativa) throws ExcepcionServiciosBancoProyectos ;

    /**
     * Metodo que permite registrar un comentario a una iniciativa
     * @param comentario comentario a registrar a la iniciativa
     * @param idIniciativa id de la iniciativa sobre la cual se realiza el comentario
     */
    public void agregarComentarioAIniciativa(Comentario comentario , int idIniciativa) throws ExcepcionServiciosBancoProyectos ;

    /**
     * Metodo que permite consultar las iniciativas ordenadas por una columna
     * @param columna Columna por la cual se quieren ordenar las iniciativas
     * @return Lista de iniciativas
     */
    public List<Iniciativa> consultarIniciativasOrdenadasPorColumna(String columna)throws ExcepcionServiciosBancoProyectos;

    /**
     * Metodo que permite consultar iniciativas que contengan una de ciertas palabras clave
     * @param palabras palabras clave que deben contener las iniciativas
     * @return Lista de iniciativas
     */
    public List<Iniciativa> consultarIniciativasPorPalabrasClaves(List<String> palabras) throws ExcepcionServiciosBancoProyectos;

    /**
     * Permite insertar una iniciativa
     * @param iniciativa Iniciativa a insertar
     * @param palabras palabras clave de la iniciativa
     * @throws ExcepcionServiciosBancoProyectos
     * @throws PersistenceException
     */

    public void  insertarIniciativa(Iniciativa iniciativa , List<String> palabras) throws ExcepcionServiciosBancoProyectos, PersistenceException;
    /**
     * Permite agregar palabras clave a una iniciativa
     * @param iniciativa Iniciativa a la cual se le van a asignar las palabras clave
     * @param palabras palabras clave de la iniciativa
     * @throws ExcepcionServiciosBancoProyectos
     * @throws PersistenceException
     */
    public void agregarPalabrasClaveAIniciativa(Iniciativa iniciativa , List<String> palabras) throws ExcepcionServiciosBancoProyectos;

    /**
     * Permite consultar todas las iniciativas
     * @return Lista con las iniciativas del sistema
     * @throws ExcepcionServiciosBancoProyectos
     */
    public abstract List<Iniciativa> consultarIniciativas() throws ExcepcionServiciosBancoProyectos;

    /**
     * Permite consultar una iniciativa por su id
     * @param  id id de la iniciativa a consultar
     * @return Iniciativa que coincida con el id ingresado como parametro
     * @throws ExcepcionServiciosBancoProyectos
     */
    public abstract Iniciativa consultarIniciativasPorId(int id) throws ExcepcionServiciosBancoProyectos;

    /**
     * Permite cambiar el estado de una iniciativa
     * @param  estado de la iniciativa a asignar
     * @param  iniciativa a la cual se le va asignar el nuevo estado
     * @throws ExcepcionServiciosBancoProyectos
     */
    public abstract void cambiarEstadoAiniciativa(String estado, Iniciativa iniciativa) throws  ExcepcionServiciosBancoProyectos;

    /**
     * Permite conocer el numero de iniciativas que tiene un area
     * @param area Finanzas, Proyectos, Ventas, Innovacion
     * @return Numero de iniciativas del area
     * @throws ExcepcionServiciosBancoProyectos
     */
    public abstract int consultarNumeroDeIniciativasPorArea(String area) throws ExcepcionServiciosBancoProyectos;

    /**
     * Permite conocer las iniciativas de un area
     * @param area finanzas, ventas, proyectos, innovacion
     * @return iniciativas del area
     * @throws ExcepcionServiciosBancoProyectos
     */
    public abstract List<Iniciativa> consultarIniciativasPorArea(String area) throws ExcepcionServiciosBancoProyectos;

    /**
     * Permite relacionar una iniciativa a otra
     * @param idIni id de iniciativa A
     * @param idIniRelacionada id de iniciativa B
     * @throws ExcepcionServiciosBancoProyectos
     */
    public abstract void agregarIniciativaRelacionadaAIniciativa(int idIni, int idIniRelacionada) throws  ExcepcionServiciosBancoProyectos;

    /**
     * Listado de las iniciativas de un proponente
     * @param email email del proponente
     * @return lista de iniciativas del proponente
     */
    public abstract List<Iniciativa> consultarIniciativasDelProponente(String email) throws ExcepcionServiciosBancoProyectos;

    /**
     * Permite modificar una iniciativa del proponente
     * @param nombre nuevo nombre de la inicitiva
     * @param iniciativa iniciativa que se va a modificar
     */
    public abstract void modificarIniciativa(String nombre, Iniciativa iniciativa) throws ExcepcionServiciosBancoProyectos;

    /**
     * Permite modificar la descripcion de la iniciativa
     * @param descripcion nueva descripcion de la iniciativa
     * @throws ExcepcionServiciosBancoProyectos
     */
    public abstract void modificarDescripcion(String descripcion, Iniciativa iniciativa) throws  ExcepcionServiciosBancoProyectos;

    /**
     * Elimina las palabras clave
     * @param id id de la palabra que se desea eliminar
     */
    public abstract void deletePalabraClave(int id) throws ExcepcionServiciosBancoProyectos;

    /**
     * Permite conocer el numero de iniciativas en el estado
     * @param estado estado de la iniciativa
     * @return numero de iniciativas con ese estado
     */
    public abstract int consultarNumeroDeIniciativasPorEstado(String estado) throws ExcepcionServiciosBancoProyectos;

    /**
     * Permite eliminar las palabras clave de una iniciativa
     * @param iniciativa la iniciativa en donde se borraran las palabras clave
     * @throws ExcepcionServiciosBancoProyectos
     */
    public abstract void eliminarPalabrasClaveDeUnaIniciativa(Iniciativa iniciativa) throws ExcepcionServiciosBancoProyectos;

    /**
     *
     * @param usuario
     * @param iniciativa
     * @throws ExcepcionServiciosBancoProyectos
     */
    public abstract void agregarVoto(Usuario usuario, Iniciativa iniciativa) throws ExcepcionServiciosBancoProyectos;

    /**
     *
     * @param usuario
     * @param iniciativa
     * @throws ExcepcionServiciosBancoProyectos
     */
    public abstract int confirmarSiYaVoto(Usuario usuario, Iniciativa iniciativa) throws ExcepcionServiciosBancoProyectos;


    /**
     *
     * @param id
     * @throws ExcepcionServiciosBancoProyectos
     */
    public abstract void deleteVoto(int id) throws ExcepcionServiciosBancoProyectos;

    /**
     *
     * @param usuario
     * @param iniciativa
     * @return
     * @throws ExcepcionServiciosBancoProyectos
     */
    public abstract int consultarIdDeVotacion(Usuario usuario, Iniciativa iniciativa) throws ExcepcionServiciosBancoProyectos;

    public abstract int numeroDeVotosIniciativa(Iniciativa iniciativa) throws ExcepcionServiciosBancoProyectos;
}
