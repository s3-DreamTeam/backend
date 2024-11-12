package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class product_template_surface {

    @JsonProperty("Manufacturer")
    @JsonAlias({"manufacturer_produit"})
    public String manufacturer_produit;

    @JsonProperty("Model")
    @JsonAlias({"model_produit"})
    public String model_produit;

    @JsonProperty("id")
    @JsonAlias({"id_produit"})
    public Integer id_produit;
}
