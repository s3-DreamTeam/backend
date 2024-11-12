package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Machine {
    @JsonProperty("Machine's Image")
    public String machineImage_produit;

    @JsonProperty("Name")
    public String name_produit;

    @JsonProperty("Location")
    public String location_produit;

    @JsonProperty("Serial ID")
    public String serialId_produit;

    @JsonProperty("Machine's Color")
    public String machineColor_produit;

    @JsonProperty("Activated")
    public boolean activated_produit;

    @JsonProperty("Min temperature")
    public Integer minTemperature_produit;

    @JsonProperty("Set temperature")
    public Integer setTemperature_produit;

    @JsonProperty("Max temperature")
    public Integer maxTemperature_produit;

    @JsonProperty("Network SSID")
    public String networkSSID_produit;

    @JsonProperty("Network Password")
    public String networkPassword_produit;

    @JsonProperty("Bluetooth SSID")
    public String bluetoothSSID_produit;

    @JsonProperty("Bluetooth Password")
    public String bluetoothPassword_produit;

    @JsonProperty("Physical Connector")
    public String physicalConnector_produit;

    @JsonProperty("Online Store URL")
    public String onlineStoreUrl_produit;

    @JsonProperty("Debit Providers")
    public String debitProviders_produit;

    @JsonProperty("Credit Providers")
    public String creditProviders_produit;

    @JsonProperty("Accepted Currencies")
    public String acceptedCurrencies_produit;

    @JsonProperty("TemplateID")
    public Integer templateId_produit;
}
