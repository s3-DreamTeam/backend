package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class machine_template {

    @JsonProperty("Machine's Image")
    @JsonAlias({"machineImage_machine"})
    public String machineImage_machine;

    @JsonProperty("Manufacturer")
    @JsonAlias({"manufacturer_machine"})
    public String manufacturer_machine;

    @JsonProperty("Model")
    @JsonAlias({"model_machine"})
    public String model_machine;

    @JsonProperty("Climate")
    @JsonAlias({"climate_machine"})
    public String climate_machine;

    @JsonProperty("Has serial numbers")
    @JsonAlias({"hasSerialNumbers_machine"})
    public boolean hasSerialNumbers_machine;

    @JsonProperty("Color varies")
    @JsonAlias({"colorVaries_machine"})
    public boolean colorVaries_machine;

    @JsonProperty("See through window")
    @JsonAlias({"seeThroughWindow_machine"})
    public boolean seeThroughWindow_machine;

    @JsonProperty("Row Count")
    @JsonAlias({"rowCount_machine"})
    public Integer rowCount_machine;

    @JsonProperty("Column Count")
    @JsonAlias({"columnCount_machine"})
    public Integer columnCount_machine;

    @JsonProperty("Quantity Per Slots")
    @JsonAlias({"quantityPerSlots_machine"})
    public Integer quantityPerSlots_machine;

    @JsonProperty("Has internet connection")
    @JsonAlias({"hasInternetConnection_machine"})
    public boolean hasInternetConnection_machine;

    @JsonProperty("Has Bluetooth")
    @JsonAlias({"hasBluetooth_machine"})
    public boolean hasBluetooth_machine;

    @JsonProperty("Has physical connection")
    @JsonAlias({"hasPhysicalConnection_machine"})
    public boolean hasPhysicalConnection_machine;

    @JsonProperty("Online store")
    @JsonAlias({"onlineStore_machine"})
    public boolean onlineStore_machine;

    @JsonProperty("Debit cards")
    @JsonAlias({"debitCards_machine"})
    public boolean debitCards_machine;

    @JsonProperty("Credit cards")
    @JsonAlias({"creditCards_machine"})
    public boolean creditCards_machine;

    @JsonProperty("Cash")
    @JsonAlias({"cash_machine"})
    public boolean cash_machine;
}
