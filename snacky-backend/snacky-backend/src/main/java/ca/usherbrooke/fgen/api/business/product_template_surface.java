package ca.usherbrooke.fgen.api.business;
import com.fasterxml.jackson.annotation.JsonProperty;
public class product_template_surface {
    @JsonProperty("Manufacturer")
    public String manufacturer_produit;

    @JsonProperty("Model")
    public String model_produit;

    @JsonProperty("id")
    public Integer id_produit;
}
