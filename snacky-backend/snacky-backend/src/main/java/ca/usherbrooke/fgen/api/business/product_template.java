package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class product_template {
    public String id_usager;

    @JsonProperty("id")
    @JsonAlias({"id_type_p"})
    public Integer id_type_p;

    @JsonProperty("Product's Image")
    @JsonAlias({"image_type_p"})
    public String image_type_p;

    @JsonProperty("Manufacturer")
    @JsonAlias({"manufacturer_type_p"})
    public String manufacturer_type_p;

    @JsonProperty("Model")
    @JsonAlias({"model_type_p"})
    public String model_type_p;

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
    @JsonAlias({"est_emballe_dimension"})
    public boolean est_emballe_dimension;

    @JsonProperty("Can expire")
    @JsonAlias({"canExpire_produit"})
    public boolean canExpire_produit;

    @JsonProperty("Shape")
    @JsonAlias({"forme_dimension"})
    public String forme_dimension;

    @JsonProperty("Width")
    @JsonAlias({"largeur_dimension"})
    public Integer largeur_dimension;

    @JsonProperty("Height")
    @JsonAlias({"hauteur_dimension"})
    public Integer hauteur_dimension;

    @JsonProperty("Length")
    @JsonAlias({"longueur_dimension"})
    public Integer longueur_dimension;

    @JsonProperty("Weight")
    @JsonAlias({"weight_produit"})
    public Integer weight_produit;
}
