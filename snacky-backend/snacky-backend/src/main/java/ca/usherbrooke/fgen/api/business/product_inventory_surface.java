package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class product_inventory_surface {

    @JsonProperty("Variant")
    @JsonAlias({"nom_produit"})
    public String nom_produit;

    @JsonProperty("TemplateID")
    @JsonAlias({"id_type_p"})
    public Integer id_type_p;

    @JsonProperty("Quantity")
    @JsonAlias({"quantite_produit"})
    public Integer quantite_produit;

    @JsonProperty("id")
    @JsonAlias({"id_produit"})
    public Integer id_produit;
}
