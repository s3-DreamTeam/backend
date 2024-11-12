package ca.usherbrooke.fgen.api.business;
import com.fasterxml.jackson.annotation.JsonProperty;
public class machine_template {
    @JsonProperty("Machine's image")
    public String machineImage_produit;

    @JsonProperty("Manufacturer")
    public String manufacturer_produit;

    @JsonProperty("Model")
    public String model_produit;

    @JsonProperty("Climate")
    public String climate_produit;

    @JsonProperty("Has serial numbers")
    public boolean hasSerialNumbers_produit;

    @JsonProperty("Color varies")
    public boolean colorVaries_produit;

    @JsonProperty("See through window")
    public boolean seeThroughWindow_produit;

    @JsonProperty("Has internet connection")
    public boolean hasInternetConnection_produit;

    @JsonProperty("Has Bluetooth")
    public boolean hasBluetooth_produit;

    @JsonProperty("Has physical connection")
    public boolean hasPhysicalConnection_produit;

    @JsonProperty("Online store")
    public boolean onlineStore_produit;

    @JsonProperty("Debit cards")
    public boolean debitCards_produit;

    @JsonProperty("Credit cards")
    public boolean creditCards_produit;

    @JsonProperty("Cash")
    public boolean cash_produit;
}
