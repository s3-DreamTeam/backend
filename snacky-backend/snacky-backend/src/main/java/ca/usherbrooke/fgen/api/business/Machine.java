package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Machine {
    @JsonProperty("Machine's Image")
    @JsonAlias({"machineImage_produit"})
    public String machineImage_produit;

    @JsonProperty("Name")
    @JsonAlias({"name_produit"})
    public String name_produit;

    @JsonProperty("Location")
    @JsonAlias({"location_produit"})
    public String location_produit;

    @JsonProperty("Serial ID")
    @JsonAlias({"serialId_produit"})
    public String serialId_produit;

    @JsonProperty("Machine's Color")
    @JsonAlias({"machineColor_produit"})
    public String machineColor_produit;

    @JsonProperty("Activated")
    @JsonAlias({"activated_produit"})
    public boolean activated_produit;

    @JsonProperty("Min temperature")
    @JsonAlias({"minTemperature_produit"})
    public Integer minTemperature_produit;

    @JsonProperty("Set temperature")
    @JsonAlias({"setTemperature_produit"})
    public Integer setTemperature_produit;

    @JsonProperty("Max temperature")
    @JsonAlias({"maxTemperature_produit"})
    public Integer maxTemperature_produit;

    @JsonProperty("Network SSID")
    @JsonAlias({"networkSSID_produit"})
    public String networkSSID_produit;

    @JsonProperty("Network Password")
    @JsonAlias({"networkPassword_produit"})
    public String networkPassword_produit;

    @JsonProperty("Bluetooth SSID")
    @JsonAlias({"bluetoothSSID_produit"})
    public String bluetoothSSID_produit;

    @JsonProperty("Bluetooth Password")
    @JsonAlias({"bluetoothPassword_produit"})
    public String bluetoothPassword_produit;

    @JsonProperty("Physical Connector")
    @JsonAlias({"physicalConnector_produit"})
    public String physicalConnector_produit;

    @JsonProperty("Online Store URL")
    @JsonAlias({"onlineStoreUrl_produit"})
    public String onlineStoreUrl_produit;

    @JsonProperty("Debit Providers")
    @JsonAlias({"debitProviders_produit"})
    public String debitProviders_produit;

    @JsonProperty("Credit Providers")
    @JsonAlias({"creditProviders_produit"})
    public String creditProviders_produit;

    @JsonProperty("Accepted Currencies")
    @JsonAlias({"acceptedCurrencies_produit"})
    public String acceptedCurrencies_produit;

    @JsonProperty("TemplateID")
    @JsonAlias({"templateId_produit"})
    public Integer templateId_produit;
}
