package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class product_inventory_surface {

    @JsonProperty("Variant")
    @JsonAlias({"variant_produit"})
    public String variant_produit;

    @JsonProperty("TemplateID")
    @JsonAlias({"templateId_produit"})
    public Integer templateId_produit;

    @JsonProperty("Quantity")
    @JsonAlias({"quantity_produit"})
    public Integer quantity_produit;

    @JsonProperty("id")
    @JsonAlias({"id_produit"})
    public Integer id_produit;
}
