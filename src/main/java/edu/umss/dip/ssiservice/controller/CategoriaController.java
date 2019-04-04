package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.CategoriaDto;
import edu.umss.dip.ssiservice.model.Categoria;
import edu.umss.dip.ssiservice.service.CategoriaService;
import edu.umss.dip.ssiservice.service.GenericService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/categorias")
@Produces(MediaType.APPLICATION_JSON)
public class CategoriaController extends GenericController<Categoria, CategoriaDto> {
    private CategoriaService service;

    public CategoriaController(CategoriaService service) {
        this.service = service;
    }

    @Override
    @GET
    public List<CategoriaDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}


