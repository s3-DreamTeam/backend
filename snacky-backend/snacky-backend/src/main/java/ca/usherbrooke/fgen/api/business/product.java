package ca.usherbrooke.fgen.api.business;
import com.fasterxml.jackson.annotation.JsonProperty;
public class product {
    public Integer id_produit;
    @JsonProperty("Product's Image")
    public String productImage_produit;

    @JsonProperty("Variant")
    public String variant_produit;

    @JsonProperty("Profit Margin")
    public Integer profitMargin_produit;

    @JsonProperty("Color")
    public String color_produit;

    @JsonProperty("Flavor")
    public String flavor_produit;

    @JsonProperty("Shelf Life")
    public Integer shelfLife_produit;

    @JsonProperty("Bar code")
    public String barCode_produit;

    @JsonProperty("Min temperature")
    public Integer minTemperature_produit;

    @JsonProperty("Prefered")
    public Integer preferredTemperature_produit;

    @JsonProperty("Max temperature")
    public Integer maxTemperature_produit;

    @JsonProperty("Allergies")
    public String allergies_produit;

    @JsonProperty("Calories")
    public Integer calories_produit;

    @JsonProperty("Ingredients")
    public String ingredients_produit;

    @JsonProperty("TemplateID")
    public Integer templateId_produit;
}
