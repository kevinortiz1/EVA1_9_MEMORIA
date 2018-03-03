/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Ortiz
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Principal pObj = new Principal();
        //PARA DESHACERSE DE LA MEMORIA DE UN OBJETO
        pObj = null;//LIBERAMOS LA MEMORIA CREADA PARA EL OBJETO
        //TODO OBJETOQUE NO ES REFERENCIADO POR ALGUNA VARIABLE EN EL
        //PROGRAMA, ES ELIMINADA POR EL GARBAGE COLLECTOR
        Principal pObj2= new Principal();
        Principal pCopia = pObj2; //no duplicamos el objeto, duplicamos la direccion
        pObj2 = null; // NO SE ELIMINA EL OBJETO,PORQUE COPIA SIGUE APUNTANDO
        pCopia= null; //AHOA SI, EL OBJETO SE ELIMINA, NO QUEDAN MAS REFERENCIAS AL OBJETO
    }
    
}
