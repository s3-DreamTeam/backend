package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class entrepot_ajout {
    public String id_usager;

    @JsonProperty("Gained Quantity")
    @JsonAlias({"gainedQuantity_product"})
    public String gainedQuantity;

    @JsonProperty("Paid Price")
    @JsonAlias({"paidPrice_product"})
    public String paidPrice;

    @JsonProperty("id")
    @JsonAlias({"id_produit"})
    public int id_produit;
}
