package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class machine_inventory_surface {

    @JsonProperty("Name")
    @JsonAlias({"name_produit"})
    public String name_produit;

    @JsonProperty("Location")
    @JsonAlias({"location_produit"})
    public String location_produit;

    @JsonProperty("Lowest product count")
    @JsonAlias({"lowestProductCount_produit"})
    public Integer lowestProductCount_produit;

    @JsonProperty("TemplateID")
    @JsonAlias({"templateId_produit"})
    public Integer templateId_produit;

    @JsonProperty("id")
    @JsonAlias({"id_produit"})
    public Integer id_produit;
}
