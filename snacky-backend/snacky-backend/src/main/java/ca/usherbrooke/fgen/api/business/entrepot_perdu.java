package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class entrepot_perdu {
    public String id_usager;

    @JsonProperty("Lost Quantity")
    @JsonAlias({"lostQuantity_product"})
    public Integer lostQuantity_product;

    @JsonProperty("Reason")
    @JsonAlias({"reason_product"})
    public String reason_product;

    @JsonProperty("id")
    @JsonAlias({"id_produit"})
    public Integer id_produit;
}
