/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.emniapp.rest.services;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import utn.frd.emniapp.entities.Banco;
import utn.frd.emniapp.entities.BancoFacade;


@Path("/banco")
public class BancoRest {
    @EJB
    private BancoFacade ejbBancoFacade;
    
    //obtener todas las entidades
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Banco> findAll(){
        return ejbBancoFacade.findAll();
    }
    
    //crear entidades
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Banco banco){
        ejbBancoFacade.create(banco);
    }
    
    //actualizar entidades
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("/{id}")
    public void edit(@PathParam("id")int id, Banco banco){
        ejbBancoFacade.edit(banco);
    }
    
    //eliminar entidades
    @DELETE
    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
    @Path("/{id}")
    public void remove(@PathParam("id")int id){
        ejbBancoFacade.remove( ejbBancoFacade.find(id) );
    }
    
    //obtener una entidad por id
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Banco findById(@PathParam("id")int id){
        return ejbBancoFacade.find(id);
    }
}
