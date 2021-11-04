/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servicios;

import com.modelo.Cabin;
import com.repositorio.RepositorioCabin;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Janis Cifuentes
 * Universidad Sergio Arboleda
 */

@Service
public class ServiciosCabin {

	@Autowired
	private RepositorioCabin metodosCrud;
	
	public List<Cabin> getAll(){
	        return metodosCrud.getAll();
	    }
	
	public Optional<Cabin> getCabin(int cabinId) {
	        return metodosCrud.getCabin(cabinId);
	    }
	
	public Cabin save(Cabin cabin){
	    if(cabin.getId()==null){
	       return metodosCrud.save(cabin);
	    }else{
	       Optional<Cabin> respid=metodosCrud.getCabin(cabin.getId());
	       if(respid.isEmpty()){
	           return metodosCrud.save(cabin);
	       }else{
	           return cabin;
	          }
	       }
	    }
            
            
    public Cabin update(Cabin cabin){
	    if(cabin.getId()!=null){
	       Optional<Cabin> resp=metodosCrud.getCabin(cabin.getId());

               if(!resp.isEmpty()){
                        
               if(cabin.getBrand()!=null){
                    resp.get().setBrand(cabin.getBrand());
               }
                    
               if(cabin.getRooms()!=null){
                    resp.get().setRooms(cabin.getRooms());
               }
                    
               if(cabin.getName()!=null){
                    resp.get().setName(cabin.getName());
               }
			   if (cabin.getDescription() != null) {
					resp.get().setDescription(cabin.getDescription());
			   }
			   if(cabin.getCategory()!=null){
					resp.get().setCategory(cabin.getCategory());
			   }

               metodosCrud.save(resp.get());
                    return resp.get();
               }else{
                     return cabin;
               }
        }else{
            return cabin;
        }
    }

	public boolean deleteCabin(int cabinId){
		Boolean aBoolean = getCabin(cabinId).map(cabin -> {
			metodosCrud.delete(cabin);
			return true;
		}).orElse(false);
		return aBoolean;
	}

}
