package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class inventorySlot {

    public Integer ID;

    @JsonProperty("Slot")
    @JsonAlias({"slot_inventaire"})
    public String slot_inventaire;

    @JsonProperty("ProductID")
    @JsonAlias({"id_produit"})
    public Integer id_produit;

    @JsonProperty("Quantity")
    @JsonAlias({"quantite_produit"})
    public Integer quantite_produit;

    @JsonProperty("Price")
    @JsonAlias({"prix_achat_produit"})
    public float prix_achat_produit;
}
