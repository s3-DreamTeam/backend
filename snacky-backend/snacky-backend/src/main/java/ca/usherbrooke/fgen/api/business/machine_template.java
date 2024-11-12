package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class machine_template {

    @JsonProperty("Machine's image")
    @JsonAlias({"machineImage_produit"})
    public String machineImage_produit;

    @JsonProperty("Manufacturer")
    @JsonAlias({"manufacturer_produit"})
    public String manufacturer_produit;

    @JsonProperty("Model")
    @JsonAlias({"model_produit"})
    public String model_produit;

    @JsonProperty("Climate")
    @JsonAlias({"climate_produit"})
    public String climate_produit;

    @JsonProperty("Has serial numbers")
    @JsonAlias({"hasSerialNumbers_produit"})
    public boolean hasSerialNumbers_produit;

    @JsonProperty("Color varies")
    @JsonAlias({"colorVaries_produit"})
    public boolean colorVaries_produit;

    @JsonProperty("See through window")
    @JsonAlias({"seeThroughWindow_produit"})
    public boolean seeThroughWindow_produit;

    @JsonProperty("Has internet connection")
    @JsonAlias({"hasInternetConnection_produit"})
    public boolean hasInternetConnection_produit;

    @JsonProperty("Has Bluetooth")
    @JsonAlias({"hasBluetooth_produit"})
    public boolean hasBluetooth_produit;

    @JsonProperty("Has physical connection")
    @JsonAlias({"hasPhysicalConnection_produit"})
    public boolean hasPhysicalConnection_produit;

    @JsonProperty("Online store")
    @JsonAlias({"onlineStore_produit"})
    public boolean onlineStore_produit;

    @JsonProperty("Debit cards")
    @JsonAlias({"debitCards_produit"})
    public boolean debitCards_produit;

    @JsonProperty("Credit cards")
    @JsonAlias({"creditCards_produit"})
    public boolean creditCards_produit;

    @JsonProperty("Cash")
    @JsonAlias({"cash_produit"})
    public boolean cash_produit;
}
