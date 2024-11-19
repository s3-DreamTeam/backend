package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class product {
    public String id_usager;

    @JsonProperty("id")
    @JsonAlias({"id_produit"})
    public Integer id_produit;

    @JsonProperty("Product's Image")
    @JsonAlias({"image_produit"})
    public String image_produit;

    @JsonProperty("Variant")
    @JsonAlias({"nom_produit"})
    public String nom_produit;

    @JsonProperty("Profit Margin")
    @JsonAlias({"profitMargin_produit"})
    public Integer profitMargin_produit;

    @JsonProperty("Color")
    @JsonAlias({"color_produit"})
    public String color_produit;

    @JsonProperty("Flavor")
    @JsonAlias({"flavor_produit"})
    public String flavor_produit;

    @JsonProperty("Shelf Life")
    @JsonAlias({"shelfLife_produit"})
    public Integer shelfLife_produit;

    @JsonProperty("Bar code")
    @JsonAlias({"barCode_produit"})
    public String barCode_produit;

    @JsonProperty("Min temperature")
    @JsonAlias({"minTemperature_produit"})
    public Integer minTemperature_produit;

    @JsonProperty("Prefered")
    @JsonAlias({"preferredTemperature_produit"})
    public Integer preferredTemperature_produit;

    @JsonProperty("Max temperature")
    @JsonAlias({"maxTemperature_produit"})
    public Integer maxTemperature_produit;

    @JsonProperty("Allergies")
    @JsonAlias({"allergies_produit"})
    public String allergies_produit;

    @JsonProperty("Calories")
    @JsonAlias({"calories_produit"})
    public Integer calories_produit;

    @JsonProperty("Ingredients")
    @JsonAlias({"ingredients_produit"})
    public String ingredients_produit;

    @JsonProperty("TemplateID")
    @JsonAlias({"id_type_p"})
    public Integer id_type_p;

    @JsonProperty("Quantity")
    @JsonAlias({"quantite_produit"})
    public Integer quantite_produit;
}
