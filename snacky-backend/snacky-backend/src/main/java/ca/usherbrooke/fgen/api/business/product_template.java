package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class product_template {

    @JsonProperty("id")
    @JsonAlias({"id_template_produit"})
    public Integer id_template_produit;

    @JsonProperty("Product's Image")
    @JsonAlias({"productImage_produit"})
    public String productImage_produit;

    @JsonProperty("Manufacturer")
    @JsonAlias({"manufacturer_produit"})
    public String manufacturer_produit;

    @JsonProperty("Model")
    @JsonAlias({"model_produit"})
    public String model_produit;

    @JsonProperty("Consistency")
    @JsonAlias({"consistency_produit"})
    public String consistency_produit;

    @JsonProperty("Climate")
    @JsonAlias({"climate_produit"})
    public String climate_produit;

    @JsonProperty("Edible")
    @JsonAlias({"edible_produit"})
    public boolean edible_produit;

    @JsonProperty("Fragile")
    @JsonAlias({"fragile_produit"})
    public boolean fragile_produit;

    @JsonProperty("Color varies")
    @JsonAlias({"colorVaries_produit"})
    public boolean colorVaries_produit;

    @JsonProperty("Has bar code")
    @JsonAlias({"hasBarCode_produit"})
    public boolean hasBarCode_produit;

    @JsonProperty("Flavor varies")
    @JsonAlias({"flavorVaries_produit"})
    public boolean flavorVaries_produit;

    @JsonProperty("Is packaged")
    @JsonAlias({"isPackaged_produit"})
    public boolean isPackaged_produit;

    @JsonProperty("Can expire")
    @JsonAlias({"canExpire_produit"})
    public boolean canExpire_produit;

    @JsonProperty("Shape")
    @JsonAlias({"shape_produit"})
    public String shape_produit;

    @JsonProperty("Width")
    @JsonAlias({"width_produit"})
    public Integer width_produit;

    @JsonProperty("Height")
    @JsonAlias({"height_produit"})
    public Integer height_produit;

    @JsonProperty("Length")
    @JsonAlias({"length_produit"})
    public Integer length_produit;

    @JsonProperty("Weight")
    @JsonAlias({"weight_produit"})
    public Integer weight_produit;

    @JsonProperty("TemplateID")
    @JsonAlias({"templateId_produit"})
    public Integer templateId_produit;
}
