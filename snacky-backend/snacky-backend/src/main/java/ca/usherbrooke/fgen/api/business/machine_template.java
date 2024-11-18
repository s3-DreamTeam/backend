package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.IgnoreProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class machine_template {
    public String id_usager;

    @JsonProperty("TemplateID")
    public Integer id_type_m;

    @JsonProperty("Machine's Image")
    @JsonAlias({"image_machine"})
    public String image_machine;

    @JsonProperty("Manufacturer")
    @JsonAlias({"manufacturier_type_m"})
    public String manufacturier_type_m;

    @JsonProperty("Model")
    @JsonAlias({"model_type_m"})
    public String model_type_m;

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
    @JsonAlias({"row_type_m"})
    public Integer row_type_m;

    @JsonProperty("Column Count")
    @JsonAlias({"column_type_m"})
    public Integer column_type_m;

    @JsonProperty("Quantity Per Slots")
    @JsonAlias({"quantity_type_m"})
    public Integer quantity_type_m;

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
