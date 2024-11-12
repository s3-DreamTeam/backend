package ca.usherbrooke.fgen.api.business;
import com.fasterxml.jackson.annotation.JsonProperty;
public class product_inventory_surface {
    @JsonProperty("Variant")
    public String variant_produit;

    @JsonProperty("TemplateID")
    public Integer templateId_produit;

    @JsonProperty("Quantity")
    public Integer quantity_produit;

    @JsonProperty("id")
    public Integer id_produit;
}
