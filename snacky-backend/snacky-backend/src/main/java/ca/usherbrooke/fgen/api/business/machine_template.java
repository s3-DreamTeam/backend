package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class machine_template {

    @JsonProperty("Image")
    @JsonAlias({"machineImage_produit"})
    public String machineImage_produit;

    @JsonProperty("Manufacturer")
    @JsonAlias({"manufacturer_produit"})
    public String manufacturer_produit;

    @JsonProperty("Model")
    @JsonAlias({"model_produit"})
    public String model_produit;

    @JsonProperty("Category")
    @JsonAlias({"climate_produit"})
    public String climate_produit;

    @JsonProperty("ColorVaries")
    @JsonAlias({"colorVaries_produit"})
    public boolean colorVaries_produit;

    @JsonProperty("SeeThroughWindow")
    @JsonAlias({"seeThroughWindow_produit"})
    public boolean seeThroughWindow_produit;

    @JsonProperty("HasSerialNumber")
    @JsonAlias({"hasSerialNumbers_produit"})
    public boolean hasSerialNumbers_produit;

    @JsonProperty("HasInternetConnection")
    @JsonAlias({"hasInternetConnection_produit"})
    public boolean hasInternetConnection_produit;

    @JsonProperty("HasBluetoothConnection")
    @JsonAlias({"hasBluetooth_produit"})
    public boolean hasBluetooth_produit;

    @JsonProperty("HasPhysicalConnection")
    @JsonAlias({"hasPhysicalConnection_produit"})
    public boolean hasPhysicalConnection_produit;

    @JsonProperty("HasOnlineStore")
    @JsonAlias({"onlineStore_produit"})
    public boolean onlineStore_produit;

    @JsonProperty("AcceptsDebit")
    @JsonAlias({"debitCards_produit"})
    public boolean debitCards_produit;

    @JsonProperty("AcceptsCredit")
    @JsonAlias({"creditCards_produit"})
    public boolean creditCards_produit;

    @JsonProperty("AcceptsCash")
    @JsonAlias({"cash_produit"})
    public boolean cash_produit;

    // Add any additional properties like Slots, isLoading, etc. if needed
}
