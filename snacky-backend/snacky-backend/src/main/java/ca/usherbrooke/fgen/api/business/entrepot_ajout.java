package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class entrepot_ajout {
    public String id_usager;

    @JsonProperty("Gained Quantity")
    @JsonAlias({"gainedQuantity_product"})
    public Integer gainedQuantity_product;

    @JsonProperty("Paid Price")
    @JsonAlias({"paidPrice_product"})
    public float paidPrice;

    @JsonProperty("id")
    @JsonAlias({"id_produit"})
    public Integer id_produit;
}
