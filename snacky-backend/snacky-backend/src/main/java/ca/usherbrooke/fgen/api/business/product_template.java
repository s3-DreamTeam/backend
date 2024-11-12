package ca.usherbrooke.fgen.api.business;
import com.fasterxml.jackson.annotation.JsonProperty;
public class product_template {
    public Integer id_template_produit;

    @JsonProperty("Product's Image")
    public String productImage_produit;

    @JsonProperty("Manufacturer")
    public String manufacturer_produit;

    @JsonProperty("Model")
    public String model_produit;

    @JsonProperty("Consistency")
    public String consistency_produit;

    @JsonProperty("Climate")
    public String climate_produit;

    @JsonProperty("Edible")
    public boolean edible_produit;

    @JsonProperty("Fragile")
    public boolean fragile_produit;

    @JsonProperty("Color varies")
    public boolean colorVaries_produit;

    @JsonProperty("Has bar code")
    public boolean hasBarCode_produit;

    @JsonProperty("Flavor varies")
    public boolean flavorVaries_produit;

    @JsonProperty("Is packaged")
    public boolean isPackaged_produit;

    @JsonProperty("Can expire")
    public boolean canExpire_produit;

    @JsonProperty("Shape")
    public String shape_produit;

    @JsonProperty("Width")
    public Integer width_produit;

    @JsonProperty("Height")
    public Integer height_produit;

    @JsonProperty("Length")
    public Integer length_produit;

    @JsonProperty("Weight")
    public Integer weight_produit;

    @JsonProperty("TemplateID")
    public Integer templateId_produit;
}
