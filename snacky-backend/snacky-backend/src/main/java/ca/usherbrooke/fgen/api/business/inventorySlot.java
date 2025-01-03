package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class inventorySlot {

    @JsonProperty("id")
    @JsonAlias({"id_machine"})
    public Integer id_machine;

    @JsonProperty("Slot")
    @JsonAlias({"slot_inventaire"})
    public String slot_inventaire;

    @JsonProperty("ProductID")
    @JsonAlias({"id_produit"})
    public Integer id_produit;

    @JsonProperty("Quantity")
    @JsonAlias({"quantite_inventaire"})
    public Integer quantite_inventaire;

    @JsonProperty("Price")
    @JsonAlias({"prix_achat_produit"})
    public float prix_achat_produit;
}
