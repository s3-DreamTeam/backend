package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class machine {
    public String id_usager;

    @JsonProperty("Machine's Image")
    @JsonAlias({"machineImage_machine"})
    public String machineImage_machine;

    @JsonProperty("Name")
    @JsonAlias({"name_machine"})
    public String name_machine;

    @JsonProperty("Location")
    @JsonAlias({"location_machine"})
    public String location_machine;

    @JsonProperty("Serial ID")
    @JsonAlias({"serialId_machine"})
    public String serialId_machine;

    @JsonProperty("Machine's Color")
    @JsonAlias({"machineColor_machine"})
    public String machineColor_machine;

    @JsonProperty("Activated")
    @JsonAlias({"activated_machine"})
    public boolean activated_machine;

    @JsonProperty("Min temperature")
    @JsonAlias({"minTemperature_machine"})
    public Integer minTemperature_machine;

    @JsonProperty("Set temperature")
    @JsonAlias({"setTemperature_machine"})
    public Integer setTemperature_machine;

    @JsonProperty("Max temperature")
    @JsonAlias({"maxTemperature_machine"})
    public Integer maxTemperature_machine;

    @JsonProperty("Network SSID")
    @JsonAlias({"networkSSID_machine"})
    public String networkSSID_machine;

    @JsonProperty("Network Password")
    @JsonAlias({"networkPassword_machine"})
    public String networkPassword_machine;

    @JsonProperty("Bluetooth SSID")
    @JsonAlias({"bluetoothSSID_machine"})
    public String bluetoothSSID_machine;

    @JsonProperty("Bluetooth Password")
    @JsonAlias({"bluetoothPassword_machine"})
    public String bluetoothPassword_machine;

    @JsonProperty("Physical Connector")
    @JsonAlias({"physicalConnector_machine"})
    public String physicalConnector_machine;

    @JsonProperty("Online Store URL")
    @JsonAlias({"onlineStoreUrl_machine"})
    public String onlineStoreUrl_machine;

    @JsonProperty("Debit Providers")
    @JsonAlias({"debitProviders_machine"})
    public String debitProviders_machine;

    @JsonProperty("Credit Providers")
    @JsonAlias({"creditProviders_machine"})
    public String creditProviders_machine;

    @JsonProperty("Accepted Currencies")
    @JsonAlias({"acceptedCurrencies_machine"})
    public String acceptedCurrencies_machine;

    @JsonProperty("TemplateID")
    @JsonAlias({"templateId_machine"})
    public Integer templateId_machine;
}

