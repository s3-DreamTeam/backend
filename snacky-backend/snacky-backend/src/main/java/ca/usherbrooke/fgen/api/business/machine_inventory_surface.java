package ca.usherbrooke.fgen.api.business;
import com.fasterxml.jackson.annotation.JsonProperty;

public class machine_inventory_surface {
    @JsonProperty("Name")
    public String name_produit;

    @JsonProperty("Location")
    public String location_produit;

    @JsonProperty("Lowest product count")
    public Integer lowestProductCount_produit;

    @JsonProperty("TemplateID")
    public Integer templateId_produit;

    @JsonProperty("id")
    public Integer id_produit;
}
