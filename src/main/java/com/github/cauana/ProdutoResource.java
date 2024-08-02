package com.github.cauana;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/produto")
public class ProdutoResource {

    @GET
    @Path("/nome")
    public String getNomeProduto(){
        return "Notebook";
    }
}
