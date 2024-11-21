package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class entrepot_perdu {
    public String id_usager;

    @JsonProperty("Lost Quantity")
    @JsonAlias({"lostQuantity_product"})
    public String lostQuantity;

    @JsonProperty("Reason")
    @JsonAlias({"reason_product"})
    public String reason;

    @JsonProperty("id")
    @JsonAlias({"id_produit"})
    public int id_produit;
}
